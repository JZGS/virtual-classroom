package jc.sw.dev.virtualclassroom.resources;

import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class Student extends User{

    private final List<ProgramProgress> programs;
    private final List<CourseProgress> courses;

    @Data
    public static class ProgramProgress{
        private final String id;
        private final String name;
        private final Integer progress;
    }

    @Data
    public static class CourseProgress{
        private final String id;
        private final String name;
        private final Float totalGrade;
        private final Integer progress;
        private final Boolean passed;
    }

}
