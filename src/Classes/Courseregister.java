package Classes;

public class Courseregister {

    private int id;
    private String course_name;
    private String course_code;
    private String sector;
    private String entry_qualification;
    private String type;
    private String mode;
    private String language;
    private String duration;
    private String course_fee;

    public Courseregister(int id, String course_name, String course_code, String sector, String entry_qualification, String type, String mode, String language, String duration, String course_fee) {
        this.id = id;
        this.course_name = course_name;
        this.course_code = course_code;
        this.sector = sector;
        this.entry_qualification = entry_qualification;
        this.type = type;
        this.mode = mode;
        this.language = language;
        this.duration = duration;
        this.course_fee = course_fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getEntry_qualification() {
        return entry_qualification;
    }

    public void setEntry_qualification(String entry_qualification) {
        this.entry_qualification = entry_qualification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(String course_fee) {
        this.course_fee = course_fee;
    }
    
}
