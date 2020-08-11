package jc.sw.dev.virtualclassroom.security;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.Set;
import static jc.sw.dev.virtualclassroom.security.Permission.*;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Role {

    STUDENT(Set.of(READ_PRIVATE_STUDENT, READ_COURSE_DATA, READ_INSTRUCTOR, WRITE_STUDENT, WRITE_COURSE)),
    INSTRUCTOR(Set.of(READ_PRIVATE_INSTRUCTOR, READ_STUDENT, READ_COURSE_DATA, WRITE_INSTRUCTOR, WRITE_COURSE)),
    ADMIN(Set.of(READ_PRIVATE_INSTRUCTOR, READ_STUDENT, READ_COURSE_DATA, WRITE_COURSE)),
    STUDENT_CONTROL(Set.of(READ_PRIVATE_STUDENT, READ_INSTRUCTOR, READ_COURSE_INFO));

    private final Set<Permission> permissions;

}
