package jc.sw.dev.virtualclassroom.resources;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Program {

    private final String id;
    private final String name;
    private final String description;
    private final List<String> tags;
    private final List<String> courses;
    private final List<String> students;

}
