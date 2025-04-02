package object.extend;

public class Dog extends Animal{
    public String name = "子类中的name";

//    @Override
//    public String getName() {
//        return Name;
//    }

    public void bark(){
        // this.name访问子类的属性
        System.out.println( this.name + "汪汪汪");
        //super.name访问父类的属性
        System.out.println(super.name + "汪汪汪" );
    }
}
