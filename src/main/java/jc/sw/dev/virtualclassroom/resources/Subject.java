package jc.sw.dev.virtualclassroom.resources;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
public class Subject {

    private final String id;
    private final String name;
    private final String description;
    private final List<Resource> resources;
    private final LocalDateTime expiration;
    private final Integer maxFiles;
    private final Integer maxSize;
    private final Float score;
    private final String type;

}
