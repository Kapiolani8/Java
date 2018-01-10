public class ProjectTest{
    public static void main(String[] args){

        Project project1 = new Project();
        Project project2 = new Project("name");
        Project project3 = new Project("New Project", "will make millions", 190.00);
        Project project4 = new Project("Million Dollar idea", "dresses... with pockets!", 100000.00);
        
        System.out.println(project1.getName());
        System.out.println(project3.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project4.elevatorPitch());
        

    }
}