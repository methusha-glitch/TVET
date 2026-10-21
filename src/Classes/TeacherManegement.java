
package Classes;


public class TeacherManegement {
    
    private int id;
    private String teacher_id;
    private String teacher_name;
    private String nic;
    private String center_name;

    public TeacherManegement(int id, String teacherid, String teachername, String teachernic, String centername) {
        this.id = id;
        this.teacher_id = teacherid;
        this.teacher_name = teachername;
        this.nic = teachernic;
        this.center_name = centername;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacherid) {
        this.teacher_id = teacherid;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teachername) {
        this.teacher_name = teachername;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String teachernic) {
        this.nic = teachernic;
    }

    public String getCenter_name() {
        return center_name;
    }

    public void setCenter_name(String centername) {
        this.center_name = centername;
    }
    
    
    
}
