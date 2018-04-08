package latihan3;

public class sepedamotorAksi {
     public static void main(String[] args){
        sepedamotor I = new sepedamotor();    
           
        I.setMerk("juviter");
        I.setWarna("BIru");
        I.setHarga(14000000);
        
        I.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(I.getmerk());
        System.out.print("Warnanya \t: ");
        System.out.println(I.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(I.getHarga());
        
     }
