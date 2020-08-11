package jc.sw.dev.virtualclassroom.resources;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Course {

    private final String id;
    private final String name;
    private final String description;
    private final List<String> tags;
    private final String instructor;
    private final List<String> students;
    private final List<String> subjects;

}
