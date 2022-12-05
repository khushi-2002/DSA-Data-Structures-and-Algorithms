

class Innerclass_example{
  public static void main(String[] args) {
    fluid f = new fluid();
    fluid.milk m = f.new milk();
    m.fun1();
    fluid.water w = new fluid.water();
    w.fun2();

  }
   }


   class fluid {
   int a;
    class milk{
        public milk(){
            a=90;
        }
        void fun1(){
            System.out.println("I am milk");
        }
    }

    static class water{
        public water(){
            System.out.println("Water");
        }
        public void fun2(){
            System.out.println("I am water!");
        }
    }
   }




