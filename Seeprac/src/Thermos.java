
public class Thermos {

		int avail_vol_in_ltrs;
		String Brand,Liquid;
		
	


Thermos(String Brand, String Liquid, int avail_vol_in_ltrs){
	
	this.Brand=Brand;
	this.Liquid=Liquid;
	this.avail_vol_in_ltrs=avail_vol_in_ltrs;
}

public void add_Liquid(String Liquidaddd) {
	 Liquid += " "+Liquidaddd;
	
}

void display_thermos() {
	
	System.out.println("The thermos contains Liquid: "+Liquid+"\n"+"Brand: "+Brand+"\n"+"Avail vol in liters: "+avail_vol_in_ltrs);

}

void Pour_Liquid() {
	
	System.out.println("Pouring :"+ Liquid);
}

public static void main (String args[]) {
	Thermos t1 = new Thermos("TWARM", "Orange juice", 1);
	t1.add_Liquid("Pineapple juice");
	t1.display_thermos();
	t1.Pour_Liquid();
	
}
}