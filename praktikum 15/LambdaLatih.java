import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* 
 * File: LambdaLatih.java
 * Deskripsi : Implementasi latihan praktikum lambda
*/
public class LambdaLatih{
    public static void main(String[] args){
        Map<String, String> mahasiswaList = new HashMap<>();
        mahasiswaList.put("01","Adi");
        mahasiswaList.put("02","Bambang");
        mahasiswaList.put("03","Cici");
        mahasiswaList.put("04","Didi");

        mahasiswaList.forEach((nim, nama) -> System.out.println("NIM :" + nim +", Nama :"+nama));
    }
}