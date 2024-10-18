class College{

    private String CollegeName;

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }
}

class Cs extends College{
    private String course_code;

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    void getInfo(){
        System.out.println(getCollegeName());
        System.out.println(getCourse_code());
    }
    void setInfo(){
        setCollegeName("College Name");
        setCourse_code("CS-305");
    }
}

class Aiml extends College{
    private String course_code;

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }
    
    void setInfo(){
        setCourse_code("AIML-306");
        setCollegeName("College Name");
    }
    void getInfo(){
        System.out.println(getCollegeName());
        System.out.println(getCourse_code());
    }

public class Hierarchical {

    public static void main(String[] args) {

        Cs obj = new Cs();
        obj.showInfo();
        obj.disp();

        Aiml obj1 = new Aiml();

        obj1.showInfo();
        obj1.disp();

    }
}







