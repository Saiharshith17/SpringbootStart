package Springboot.project.bean;

//bean is a templete used without creating the instances for each time

public class UserConfig {
    private String name;
    private String className;
    public void setName(final String name){
        this.name=name;
    }
    public void setClassName(final String className){
        this.className=className;
    }
}
