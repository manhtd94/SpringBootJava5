package fpt.java5.assignment.service.user;

import java.text.Normalizer;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class CreateNewUserImp implements CreateNewUser {

    @Override
    public String removeAccent(String name) {
        String temp = Normalizer.normalize(name, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").toLowerCase().replaceAll("đ", "d");
    }

    @Override
    public String createNewUser(String userName, int id) {
        String[] tmp = userName.split("\\s+");

        String lastName = tmp[tmp.length - 1];
        lastName = removeAccent(lastName);

        for (int i = 0; i < tmp.length - 1; i++) {
            tmp[i] = removeAccent(tmp[i]);
            lastName = lastName + tmp[i].charAt(0);
        }
        return lastName + id;
    }

}
