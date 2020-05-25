
package javafinalodevi; // ödev de amaç temel sınıflandırmadan kategorili sınıflandırma yaparak yapıcılar ile üst sınıfdan miras aldığı özelliği(yapıcı) ekrana bastırmak
 class Hayvan //hayvan ismin de class oluşturuyorum 
    {
        
        public Hayvan() //hayvan sınıfının yapıcısını oluşturuyorum böylece alt sınıflar üst sınıflardan aldıkları özellikleri belirlemede yardımcı olucak
        {
            
            System.out.println("Hayvan Sınıfı yapıcısı");// hayvan sınıfının yapıcısını oluşturuyorum böylece alt sınıflar miras aldıkları özelliği nesne oluşturulunca ekrana yazdırılıcak
        }
    }
    class DortAyaklı extends Hayvan //Hayvan classından DortAyaklı oluşturuyorum böylece bir üst sınıftan miras alıyor
    {
        public DortAyaklı()//Hayvan sınıfından oluşturulan DortAyaklı sınıfının yapıcısı nesne oluşturulduğunda miras aldığı sınıfın özelliğini(yapıcı) göstericek
        {   
            System.out.println("dort ayaklı sınıfı yapıcısı"); //DortAyaklı sınıfının yapıcısını belirten ekrana yazdırma işlemini yapacak olan kod
        }
        
    }
    class Etcil extends DortAyaklı // DortAyaklılar sınıfından Etcil Sınıfını oluşturuyorum böylece üst sınıftan miras alıyor 
    {
        public Etcil() // Etcil sınıfının yapıcısı 
        {
            System.out.println("Etcil sınıfı yapıcısı");// Etcil sınıfının yapıcısını belirten ekrana yazdırma işlemini yapacak olan kod 
        }
    }
    
    class Otcul extends DortAyaklı //  DortAyaklılar sınıfından Etcil sınıfını oluşturuyorum böylece üst sınfıtan miras alıyor
    {
        public Otcul() // Otcul sınıfının yapıcısı 
        {
            System.out.println("Otcul sınıfı yapıcısı"); // Otcul sınıfının yapıcısını belirten ekrana yazdırma işlemini yapacak olan kod 
        }
    }

public class JAVAFİNALODEVİ {

    public static void main(String[] args) 
    {
        Otcul keci=new Otcul(); // Burada otcul sınıfını kullanarak keci adında nesne oluşturuyoruz nesneyi oluşturduğumuz da sınıfının sahip olduğu özellikleri(Yapıcıları) ekrana yazdırıcak
        
                
        
    }

}
