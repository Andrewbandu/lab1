public class Cat extends Animals{
    private String color;

    public Cat(String color,String name){
        super(name, "Cat");
        this.color = color;

    }
    @Override
    public String speak(){
        return "meow";

    }
    @Override
    public String info(){
        return name + " є кольору " + color ;
    }
}
