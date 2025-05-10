package pl.edu.pjwstk.s30291.projects.svc.notification;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl.SMSNotificationParameters;

@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	
		SMSNotificationParameters params = new SMSNotificationParameters("53342124");
		
		Gson gson = new Gson();
		
		Notification notif = new Notification("Testowa wiadomosc!", TO LIST(gson.toJson(params)));
	}

}
