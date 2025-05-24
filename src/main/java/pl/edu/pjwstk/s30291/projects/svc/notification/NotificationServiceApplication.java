package pl.edu.pjwstk.s30291.projects.svc.notification;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl.SMSNotificationParameters;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	
		SMSNotificationParameters params = new SMSNotificationParameters("53342124");
		
		Gson gson = new Gson();
		
		Notification notif = new Notification("Testowa wiadomosc!", List.of(gson.toJson(params)));
	
		log.info(gson.toJson(notif));
	}

}
