public class getter {
    public static class Student{
         private int rno; //Private members are only accessile in that class not outside class.
         String name;
          
         public int getRno(){ //getter method to access private member outside the class.
            return rno;

         }
         public void setRno(int r){
            rno = r;
         }


    }
    public static void main(String[] args){
     Student s1 = new Student();
    s1.name = "Radha";
    //s1.getRno();
    s1.setRno(15);
    System.out.println("Name is: " +s1.name);
     System.out.println("Rollno is: " +s1.getRno());
    
    }
}
