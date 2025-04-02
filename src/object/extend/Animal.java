package object.extend;

public class Animal {
    public String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name  + "正在吃" + food);
    }
    public void sleep(){
        System.out.println(name + "正在睡");
    }
}
