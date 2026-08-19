import org.w3c.dom.ls.LSOutput;

import javax.xml.namespace.QName;

class Student{
    int  id = 10;
    String name ="John";
   public void study() {
        System.out.println("The student was studying");
       System.out.println(id);

   }
    public  void eating() {
        System.out.println("The student was eating");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        s.eating();
    }
}