/**
*File : Garis.java
*Penulis : Husna Nasyifa
*Deskripsi :kelas yang berisi program utama yang memanfaatkan kelas Garis
*/

import static java.lang.Math.PI;

public class Garis{
	private Titik titikAwal;
	private Titik titikAkhir;
	
	public Garis(Titik titikAwal, Titik titikAkhir){
		this.titikAwal = titikAwal;
        	this.titikAkhir = titikAkhir;
	}
	public Garis(){
		this(new Titik(), new Titik());
	}
	public void setTitikAwal(Titik titikAwal){
        	this.titikAwal = titikAwal;
    	}

    	public void setTitikAkhir(Titik titikAkhir){
        	this.titikAkhir = titikAkhir;
    	}
    
    	public Titik getTitikAwal(){
        	return this.titikAwal;
    	}

    	public Titik getTitikAkhir() {
        	return this.titikAkhir;
    	}
}