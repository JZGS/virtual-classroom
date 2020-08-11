package jc.sw.dev.virtualclassroom.resources;

import jc.sw.dev.virtualclassroom.security.Role;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class User {

    private final String id;
    private final Role role;
    private final String name;
    private final String email;
    private final Integer age;

}
