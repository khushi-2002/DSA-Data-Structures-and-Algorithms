

public class Encapsulation_revision {
    public static void main(String[] args) {
        Khushi k = new Khushi();
        k.setKhushi(101);
        k.setAshish(100);
        k.getAshish();
        k.getKhushi();
    }
}

class Khushi{
    private int ashish=90;
    private int khushi=89;

    public void getAshish(){
        System.out.println(ashish);
    }

    public void getKhushi(){
        System.out.println(khushi);
    }

    public void setKhushi(int khushi){
        this.khushi = khushi;
    }

    public void setAshish(int ashish){
        this.ashish =  ashish;
    }

}