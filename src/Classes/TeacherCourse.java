
package Classes;


public class TeacherCourse {
    private int id;
    private String teacherId;
    private String courseCode;

    public TeacherCourse(int id, String teacherId, String courseCode) {
        this.id = id;
        this.teacherId = teacherId;
        this.courseCode = courseCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    
}
