public class HumansTest{
    public static void main(String[] args){

    Humans kapiolani = new Humans("Kapiolani");
    Humans ryan = new Humans("Ryan");

    ryan.attack(kapiolani);
    System.out.println("The health of Kapiolani is " + kapiolani.getHealth());
    }
}