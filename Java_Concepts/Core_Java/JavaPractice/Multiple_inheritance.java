

public class Multiple_inheritance {
    public static void main(String[] args) {
        Meraghar m = new Meraghar();
        m.anything();
        m.mother();
        m.father();
    }
}

interface parents{
    void father();
    default void mother(){
      System.out.println("I am your mother okay?");
    }
}

interface family{
    default void mother(){
        System.out.println("I am your mother in this family");
    }
}

class Meraghar implements parents, family{
   public void father(){
    System.out.println("I am your father ");
   }

   public void mother(){
    family.super.mother();
   }

   public void anything(){
    parents.super.mother();
   }
}
