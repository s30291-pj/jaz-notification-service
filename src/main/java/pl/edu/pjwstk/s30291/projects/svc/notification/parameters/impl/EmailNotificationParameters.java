package pl.edu.pjwstk.s30291.projects.svc.notification.parameters.impl;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.edu.pjwstk.s30291.projects.svc.notification.parameters.NotificationParameters;

@AllArgsConstructor
@NoArgsConstructor
public class EmailNotificationParameters extends NotificationParameters {

	@Getter private String email;
	@Getter private String title;
}
