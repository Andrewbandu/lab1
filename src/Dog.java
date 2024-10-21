public class Dog extends Animals{
    private String breed;//порода

    public Dog(String name, String breed){
        super(name, "Dog");
        this.breed = breed;

    }
    @Override
    public String speak(){
        return "гав! ";
    }
    @Override
    public String info(){
        return name + " є " + breed ;
    }


}
