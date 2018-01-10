public class Project{
    private String name; 
    private String description; 
    private double initialCost = 0;

    public Project(){
        this.name = "Project Name"; 
        this.description = "Project Description"; 
    }

    public Project(String name){
        this.name = name; 
        this.description = "Project Description";
    }

    public Project(String name, String description){
        this.name = name; 
        this.description = description;
    }

    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description; 
        this.initialCost = initialCost;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setinitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    public double getinitialCost(){
        return this.initialCost;
    }

    public String elevatorPitch(){
        return "The project name is " + this.name + " " + "The project description is " +  this.description + " " + "The cost for this will be " + this.initialCost;
    }

}