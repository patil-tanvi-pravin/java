public class class1 {
    public static class Student{
       int rollno;
       String name;
       float fee;
       Student(int r,String n,float f){
       rollno=r;
       name=n;
       fee=f;
       }
       } 
       public static class Marks{
        float m1 =98.99f;
       }
       public static void main(String[] args){
        Student st = new Student(23,"Radha",500);
        System.out.println(st.rollno +" "+st.name +" "+st.fee);
        Marks m1 = new Marks();
        System.out.println("Marks are " +m1.m1);
    }
}
