package pl.edu.pjwstk.s30291.projects.svc.notification;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Notification {

	@Getter private String message;
	@Getter private List<String> parameters;
	
	
}
