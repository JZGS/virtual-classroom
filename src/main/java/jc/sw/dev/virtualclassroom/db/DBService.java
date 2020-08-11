package jc.sw.dev.virtualclassroom.db;

import jc.sw.dev.virtualclassroom.resources.*;

public interface DBService {

    User createUser(User user);
    User readUser(String userId);
    User updateUser(User user);
    User deleteUser(String userId);

    Program createProgram(Program program);
    Program readProgram(String programId);
    Program updateProgram(Program program);
    Program deleteProgram(String programId);

    Course createCourse(Course course);
    Course readCourse(String courseId);
    Course updateCourse(Course course);
    Course deleteCourse(String courseId);

    Subject createSubject(Subject subject);
    Subject readSubject(String subjectId);
    Subject updateSubject(Subject subject);
    Subject deleteSubject(String subjectId);

    Assignment createAssignment(Assignment assignment);
    Assignment readAssignment(String assignmentId);
    Assignment updateAssignment(Assignment assignment);
    Assignment deleteAssignment(String assignmentId);

    Resource createResource(Resource resource);
    Resource readResource(String resourceId);
    Resource updateResource(Resource resource);
    Resource deleteResource(String resourceId);

}
