package hello.toy.domain;

import lombok.Data;

@Data
public class User {
    private String id;
    private String password;
    private String name;
    private int age;
    private boolean gender;
    private String birth;
    private String phone;
}
