class dog{
    String breed;
    String name;
    void bark(){
        System.out.println("Wuof Wuof");
    }
}

public class q2 {
    public static void main(String[] args) {
        dog d= new dog();
        d.breed = "Labrador";
        d.name = "sheru";

        System.out.println("Dog's breed is "+d.breed);
        System.out.println("Dog's name is "+d.name);
        d.bark();
    }
}
