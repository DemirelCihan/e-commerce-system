package firstLayeredApp.dataAccess.concretes;

import firstLayeredApp.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final List<User> users = new ArrayList<>(List.of(
     new User("cihan", "demirel","dcihand@hotmail.com","abc565"),
    new User("furkan", "yılmaz","furkanyılmaz@hotmail.com","4567884561"),
    new User ("kaan","karaoğlan", "kaaan@gmail.com.tr","45sdf78t")

           ) );

public static List<User> getUsers(){
    return users;
}

}
