public class inheritance {
    public static void main(String args[]){
       cat shin =new cat(); 
       shin.eat();
       shin.walk();
       shin.legs();

    }
}
// hybrid inheritance
class Animal{
    void eat(){
        System.out.println("EAT");

    }
    void breath(){
        System.out.println("BREATHE");
    }
}
  class fish extends Animal{
    void swim(){
        System.out.println("SWIM IN WATER");
    }

  }
  class shark extends fish{
    void teeth(){
        System.out.println("sharp teeths");
    }

  }
  class  Bird extends Animal{
    void fly(){
        System.out.println("FLY IN AIR");
    }
  }
  class peacock extends Bird{
    void colorsfins(){
        System.out.println("red, green, blue etc");
    }

  }
  class Mammals extends Animal{
    void walk(){
        System.out.println("walk in land");
    }

  }
  class  cat extends Mammals{
    void legs(){
        System.out.println("4 legs");
    }

  }
  class human extends Mammals{
    void legs (){
        System.out.println("2 legs ");
    }

  }
