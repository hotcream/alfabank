package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    private static final Faker faker = new Faker(new Locale("en-US"));
    public String searchText = getSearchText(),
            randomLogin = getRandomLogin(),
            randomPassword = getRandomPassword();

    public String getSearchText() {
        return "Кредит";
    }

    public String getRandomLogin() {
        return faker.lorem().characters(10);
    }

    public String getRandomPassword() {
        return faker.number().digits(10);
    }

}