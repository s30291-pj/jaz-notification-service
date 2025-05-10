package pl.edu.pjwstk.s30291.projects.svc.notification.endpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pl.edu.pjwstk.s30291.projects.svc.notification.Notification;
import pl.edu.pjwstk.s30291.projects.svc.notification.service.NotificationService;

@RestController
public class NotificationEndpoint {

	private NotificationService service;
	
	public NotificationEndpoint(NotificationService service) {
		this.service = service;
	}
	
	@PostMapping("/send")
	public ResponseEntity<Void> send(@RequestBody Notification notification) {
		service.send(notification);
		
		return ResponseEntity.ok().build();
	}
	
}
