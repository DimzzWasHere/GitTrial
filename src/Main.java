import java.util.Scanner;
public class Main {
    public static double luasPersegiPanjang(double panjang, double lebar){
        double luas;
        luas = panjang * lebar;
        return luas;
    }
    public static double luasSegitiga(double tinggi, double lebar){
        double luas;
        luas = (tinggi * lebar) / 2;
        return luas;
    }
    public static void tampilkanOutputPers(String namaObjek, double panjang, double lebar, double luas){
        String str="";
        str = str + "Luas "+ namaObjek;
        str = str + " dengan panjang " + panjang + " cm";
        str = str + " dan lebar " + lebar + " cm";
        str = str + " adalah " + luas + " cm";
        System.out.println(str);
    }
    public static void tampilkanOutputSegt(String namaObjek, double tinggi, double lebar, double luas){
        String str="";
        str = str + "Luas "+ namaObjek;
        str = str + " dengan panjang " + tinggi + " cm";
        str = str + " dan lebar " + lebar + " cm";
        str = str + " adalah " + luas + " cm";
        System.out.println(str);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM PENGHITUNG LUAS BANGUN DATAR");
        System.out.println("Pilih bangun datar yang ingin dihitung: ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        int pilihan = scanner.nextInt();

        
        if (pilihan == 1){
            System.out.println("Masukkan nilai panjang: ");
            double pPers = scanner.nextInt();
            System.out.println("Masukkan nilai lebar: ");
            double lPers = scanner.nextInt();
                
            double luasPers = luasPersegiPanjang(pPers, lPers); 
            tampilkanOutputPers("Persegi Panjang", pPers, lPers, luasPers);
            }

        else if (pilihan == 2){
            System.out.println("Masukkan nilai tinggi: ");
            double tSegt = scanner.nextInt();
            System.out.println("Masukkan nilai lebar: ");
            double lSegt = scanner.nextInt();
            
            double luasSegt = luasSegitiga(tSegt, lSegt);
            tampilkanOutputSegt("Segitiga", tSegt, lSegt , luasSegt);
        }
        scanner.close();
    } 
}