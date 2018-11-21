/**
 *
 */
package model;

import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.hraccess.openhr.HRSessionFactory;
import com.hraccess.openhr.IHRDataSection;
import com.hraccess.openhr.IHRDataStructure;
import com.hraccess.openhr.IHRDictionary;
import com.hraccess.openhr.IHRSession;
import com.hraccess.openhr.IHRUser;
import com.hraccess.openhr.exception.AuthenticationException;
import com.hraccess.openhr.exception.SessionBuildException;
import com.hraccess.openhr.exception.SessionConnectionException;
import com.hraccess.openhr.exception.UserConnectionException;

/**
 * @author owenn.pantry
 *
 */
public class Server {
	private static Logger log = Logger.getLogger("Serveur");

	IHRSession session;
	IHRUser user;

	public static Server getInstance() {
		return null;

	}

	private Server(String login, String password, String ip_server,
			String port_server, String role) throws ConfigurationException, SessionBuildException,
	SessionConnectionException, AuthenticationException, UserConnectionException, IllegalStateException {
		log.debug("Lecture de la configuration");
		// System.setProperty("file.encoding", "8859_1");
		PropertiesConfiguration configuration = new PropertiesConfiguration("connexion.properties");

		login = configuration.getString("Login");
		password = configuration.getString("Password");
		ip_server = configuration.getString("IP_SERVER");
		port_server = configuration.getString("PORT_SERVER");
		role = configuration.getString("Role");

		log.debug("Ecriture des propriétés openhr");
		PropertiesConfiguration openhr_properties = new PropertiesConfiguration();
		openhr_properties.setProperty("session.language", "f");
		openhr_properties.setProperty("session.process_list", "FS001,JA901,REPZE,AS906,FS901"); // TODO liste des
		// processus
		openhr_properties.setProperty("session.work_directory", "work/work" + "REC001"); // TODO dossier
		openhr_properties.setProperty("openhr_server.server", ip_server);
		openhr_properties.setProperty("shared_configuration.port", port_server);
		openhr_properties.setProperty("normal_message_sender.security", "disabled");
		openhr_properties.setProperty("normal_message_sender.use_configuration_with_prefix", "shared_configuration");
		openhr_properties.setProperty("sensitive_message_sender.security", "disabled");
		openhr_properties.setProperty("sensitive_message_sender.use_configuration_with_prefix", "shared_configuration");
		openhr_properties.setProperty("privilegied_message_sender.security", "disabled");
		openhr_properties.setProperty("privilegied_message_sender.use_configuration_with_prefix",
				"shared_configuration");

		log.debug("Création de la session");
		session = HRSessionFactory.getFactory().createSession(openhr_properties);
		log.debug("Connexion");
		user = session.connectUser(login, password);
	}

	public List<IHRDataSection> loadDictionnary(String table) {
		List<IHRDataSection> ret = null;
		// Retrieving the dictionary from an existing session
		IHRDictionary dictionary = session.getDictionary();

		if (dictionary.hasDataStructure(table)) {
			// Retrieving a named data structure
			IHRDataStructure dataStructure = dictionary.getDataStructureByName(table);
			ret = dataStructure.getDataSections();
		}

		return ret;
	}

	public void refreshDictionary() {
		IHRDictionary dictionary = session.getDictionary();
		dictionary.refresh();
	}
}

