package firstLayeredApp.presentation.concretes;

import firstLayeredApp.entities.concretes.User;
import firstLayeredApp.presentation.abstracts.UserPresentation;

public class UserInterfaceManager implements UserPresentation {
    @Override
    public void requiredField(User user) {
        System.out.println("Sisteme tekrardan giriş için mail adresi ve şifre zorunludur.");
    }
}
