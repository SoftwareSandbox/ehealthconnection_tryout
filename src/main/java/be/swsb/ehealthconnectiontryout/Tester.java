package be.swsb.ehealthconnectiontryout;

import be.ehealth.technicalconnector.config.ConfigFactory;
import be.ehealth.technicalconnector.exception.TechnicalConnectorException;
import be.ehealth.technicalconnector.session.Session;
import be.ehealth.technicalconnector.session.SessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class Tester {

    public void tryConnect() throws TechnicalConnectorException {
        final String randomPassword = "password";
        ConfigFactory.setConfigLocation("classpath:ehealth-default.properties");
        SessionManager sessionManager = Session.getInstance();

        if (!sessionManager.hasValidSession()) {
            sessionManager.createFallbackSession(randomPassword, randomPassword, randomPassword);
        } else {
            sessionManager.unloadSession();
            sessionManager.createFallbackSession(randomPassword, randomPassword, randomPassword);
        }
    }
}
