/**
* File : MPoligon.java 3/11/2024
* Penulis : Husna Nasyifa
* Deskripsi : driver class untuk poligon dan persegi panjang
*/
package org.main;
import org.bangundatar.*;

public class MPoligon
{
    public static void main(String[] args) {
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
	}
}