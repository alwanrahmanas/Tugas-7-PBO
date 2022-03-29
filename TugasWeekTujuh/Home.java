public class Home{

    public static void main(String[] args){

        User u1 = new User("Alwan");
        u1.setBehavior(new Car()); //defalut = kereta
        u1.display(5,6); 
        
        //argument sebagai jarak antar titik dimulai dari 0 dengan satuan kilometer
        //domain argument dari batas bawah data type double hingga batas atas data type double  
        //perhitungan titik 0 adalah titk 0 kota Jakarta
        //asumsi pengguna kereta dalam kota hanya warga Jabodetabek
        
        User u2 = new User("Alwin");
        u2.display(-129,100);

        User u3 = new User("Al");
        u3.setBehavior(new Motor());
        u3.display(-23,1.3);

    
    }
}