package com.murdermys.murdermystery.domain.common.event;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

@Component // (1)
public class AuthenticationEventListeners {

    private static final Logger logger =
            LoggerFactory.getLogger(AuthenticationEventListeners.class);

    @EventListener(AuthenticationFailureBadCredentialsEvent.class) // (2)
    public void handleBadCredentials(
        AuthenticationFailureBadCredentialsEvent event) { // (3)
        logger.info("Bad credentials is detected. username : {}", event.getAuthentication().getName());
        // omitted
    }
}
