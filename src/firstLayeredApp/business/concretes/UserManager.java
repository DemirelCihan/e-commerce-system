package firstLayeredApp.business.concretes;

import firstLayeredApp.business.abstracts.UserService;

import firstLayeredApp.entities.concretes.User;



public class UserManager implements UserService {

    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    public void add(User user) {
        /*kullanıcıdan firstName,lastName,email,password bilgileri alınacaktır.
         * password en az 6 karakterden oluşmalıdır.*/
        if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("Girilen isim veya soyisim çok kısa");
        } else if (user.getFirstName().length() >= 2 || user.getLastName().length() >= 2) {
            System.out.println("Girilen isim ve soyisim formatı uygundur. girilen isim.\t" + user.getFirstName() + " " + "girilen soyism:\t" + user.getLastName());
        }
    }

    @Override
    public void checkPassword(User user) {
        //bu metot ile müşterinin şifresi kontrol edilecektir.
        if (user.getPassword().length() < 6) {
            System.out.println("girilen şifre çok kısa.Lütfen daha uzun bir şifre deneyiniz\t");

        } else if (user.getPassword().length() >= 6) {
            System.out.println("girilen şifre uygundur");
            System.out.println("müşteri şifresi oluşturuldu\t" + user.getPassword().replaceAll(".", "*"));

        }


    }

    @Override
    public void checkEmail(User user) {
        //bu metot ile girlen müşterinin girmiş olduğu mail adresi kontrol edilecektir.

        /*regex(regular expression) ile mail adresi kontrol etme işlemi yapılmaktadır.
         * ^ karakteri herhangi bir karakter türetmeden dizinin başlangıcını eşitler
         * [A-Za-z0-9-] karakteri ile verilen ifadede a dan z ye büyük ve küçük harfler ve 0 dan 9 a kadar rakamların kullanılacağını gösterir.
         * { } küme parantezi ile karakterlerin veya karakter gruplarının kaç kez tekrarlanması gerektiğini belirtiriz
         *  $ karakteri satır sonu ile match olur
         *  */

        if (!user.getEmail().matches(EMAIL_REGEX)) {


            System.out.println("girmiş olduğunuz mail adresi geçersizdir.");
        } else {
            System.out.println("Müşteri maili doğru formattadır");
            System.out.println("müşteri mail adresi eklendi\t" + user.getEmail());
        }

    }

    @Override
    public void emailUsedBefore(User user) {
        System.out.println("database de olan email adresleri ile girilen email adresleri karşılaştırılıyor..");
        System.out.println("Email adresi daha önce kullanılmadı.Email adresini kullanabilirsiniz.");
    }


    @Override
    public void verificationEmail(User user) {


        System.out.println("kullanıcıya doğrulama maili gönderildi.");

    }

    @Override
    public void verificationLink(User user) {
        System.out.println("doğrulama linki kullanılarak sisteme kaydınız başarı ile gerçekleşti. HOŞGELDİNİZ!!");

    }



}
