package firstLayeredApp.business.abstracts;

import firstLayeredApp.entities.concretes.User;



public interface UserService {
    void add(User user);

    void checkPassword(User user);

    void checkEmail(User user);

    void emailUsedBefore(User user);

    void verificationEmail(User user);

    void verificationLink(User user);



}
