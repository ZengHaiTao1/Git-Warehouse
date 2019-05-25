package my_java_web;

public class Student {
	private String name;
    private String time;
    private String banji;
    private String sex;
    public String getBanji() {
        return banji;
    }
    public void setBanji(String banji) {
        this.banji = banji;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
