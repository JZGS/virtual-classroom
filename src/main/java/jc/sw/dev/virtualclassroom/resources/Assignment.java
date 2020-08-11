package jc.sw.dev.virtualclassroom.resources;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
public class Assignment {

    private final String id;
    private final String userId;
    private final String subjectId;
    private final List<Resource> resources;
    private final LocalDateTime createdDate;
    private final Float grade;
    private final List<Comment> comments;

    @Data
    public static class Comment{
        private final String userId;
        private final String comment;
    }

}
