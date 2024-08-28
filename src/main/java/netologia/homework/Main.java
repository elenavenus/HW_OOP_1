package netologia.homework;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FormDate birthday = new FormDate();
        birthday.day = 28;
        birthday.month = 1;
        birthday.year = 1980;

        Post post = new Post();
        post.name = "Elena";
        post.passport = "4444 № 44444444";
        post.patronymic = "Викторовна";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Kolesnikova";
        post.subscription = false;
        post.birthday = birthday;

    }
}