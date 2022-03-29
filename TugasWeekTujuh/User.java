public class User{

    public Opsi opsi;  //compositions using opsi (this is the key)
    private String username;

    public User(String name){
        this.opsi = new Train(); //defaultnya adalah pake kereta
        this.username = name;
    }
    
    
    public double Calculate(double x, double y){

        return opsi.Calculate(x,y); //calculate jarak
    }

    public void setBehavior(Opsi opsi){

        this.opsi = opsi; //set behavior di main class 
    }

    public String Name(){

        return this.username; //return nama dari user 
    }

    public String getBehavior(){

        return opsi.GetName(); //return nama dari concrete strategy
    }

    public void display(double x, double y){

        System.out.println("Nama user: "+ this.Name());
        System.out.println("Behavior: "+ getBehavior());
        System.out.println("Jarak tempuh: "+ this.Calculate(x,y)+" Km");
        System.out.println("\n\n");
    }
}