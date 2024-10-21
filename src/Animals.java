public class Animals {
    String name;//імя
    String species; //вид
    public Animals(String name,String species){
        this.name = name;
        this.species = species;

    }
    public String speak(){
        return "The animal makes a sound ";

    }
    public String info(){
        return name + "is a " + species + ".";

    }




}
