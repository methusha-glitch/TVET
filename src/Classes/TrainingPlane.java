package Classes;

public class TrainingPlane {
    private int id;
    private String center_Name;
    private String course_Name;
    private String year;
    private String start_Month;
    private String capacity;

    public TrainingPlane(int id, String center_Name, String course_Name, String year, String start_Month, String capacity) {
        this.id = id;
        this.center_Name = center_Name;
        this.course_Name = course_Name;
        this.year = year;
        this.start_Month = start_Month;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCenter_Name() {
        return center_Name;
    }

    public void setCenter_Name(String center_Name) {
        this.center_Name = center_Name;
    }

    public String getCourse_Name() {
        return course_Name;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStart_Month() {
        return start_Month;
    }

    public void setStart_Month(String start_Month) {
        this.start_Month = start_Month;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
