/**
*File : Titik.java
*Penulis : Husna Nasyifa
*Deskripsi :kelas yang berisi program utama yang memanfaatkan kelas Titik
*/

import static java.lang.Math.PI;

class Titik{
	private double absis;
	private double ordinat;
	//static int counterTitik;
	
	public Titik(double absis, double ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
	}
	public Titik(){
		this(0,0);
	}
	public void setAbsis(double absis){
		return this.absis;
	}
	
	void setOrdinat(double ordinat){
		return this.ordinat;
	}

	public double getAbsis(){
		this.absis = absis;
	}
	public double getOrdinat(){
		this.ordinat = ordinat;
	}
	public double getJarakPusat(){
		this.ordinat = ordinat;
	}
}