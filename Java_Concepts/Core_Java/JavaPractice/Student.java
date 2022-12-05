


public class Student {
    public static void main(String[] args) {
        Students [] stud = new Students[4];
        stud[0] = new Students();
        stud[0].id = 1;
        stud[0].name = "Khushi";
        stud[0].run();
    }
}

class Students{
    int id;
    String name;
  

    public Students(){
       id = 0;
       name = null;
    }
    void run(){
        System.out.println(id);
        System.out.println(name);
    }

}