package jc.sw.dev.virtualclassroom.resources;

import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class Instructor extends User{

    private final List<CourseInfo> courses;
    private final Boolean available;
    private final List<String> knowledge;

    @Data
    public static class CourseInfo{
        private String id;
        private String name;
        private Integer age;
    }

}
