package hello.toy.domain;

import lombok.Data;

@Data
public class User {
    private String loginId;
    private String password;
    private String name;
    private int age;
    private String gender;
    private String phone;
}
