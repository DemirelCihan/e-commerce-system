import firstLayeredApp.business.abstracts.UserService;
import firstLayeredApp.business.concretes.UserManager;
import firstLayeredApp.entities.concretes.User;
import firstLayeredApp.presentation.abstracts.UserPresentation;
import firstLayeredApp.presentation.concretes.UserInterfaceManager;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserManager();
        User user = new User("cihan", "demirel", "dcihand@hotmail.com", "abc565");
        //User user1 = new User("furkan", "yılmaz", "dcihand@hotmail.com", "4567884561");
        //User user2 = new User("kaan", "karaoğlan", "kaaan@gmail.com.tr", "45sdf78t");

        userService.add(user);
        userService.checkEmail(user);
        userService.emailUsedBefore(user);
        userService.checkPassword(user);
        userService.verificationEmail(user);
        userService.verificationLink(user);

        UserPresentation userPresentation = new UserInterfaceManager();
        userPresentation.requiredField(user);


    }

}
