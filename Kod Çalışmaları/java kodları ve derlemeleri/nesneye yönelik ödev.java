import java.util.*;

public class Ogrenci{ //Öğrenci için bir sınıf oluşturduk ve bu sınıfta istediğimiz bilgileri tanımladık.
    int numara;
    String isim;
    double vize; // vize ve final  kesirli sayı ile çarpılacağı için double türünde tanımladık.
    double _final;
    double ortalama;// aynı şekilde ortalama da kesirli çıkabileceği için double türünde tanımladık.
    
    public Ogrenci(int numara, String isim, double vize, double _final) {
        this.numara = numara ; // burda this'i metodun içinde isim çakışmalarını önlemek ve  nesne değişkenlerine değil, parametre değişkenlerine erişmek için kullandık.
        this.isim = isim ;
        this.vize = vize ;
        this._final = _final ;
        this.ortalama = (vize * 0.4) + (_final * 0.6 );
    }
    public String toString() { // bu metodda ''toString'' ifadesi ile nesnenin metin temsilini oluşturup, nesnenin içeriğini okunabilir bir şekilde görmemizi sağlar.
        return "Numara: " + numara + ", İsim: " + isim + ", Vize: " + vize + ", Final: " + _final + ", Ortalama: " + ortalama; // return ifadesi ile ifade döndürülür.
    }
}//Burda artık öğrenci sınıfından çıkıyoruz.
    public class OgrencilerinNotlari{// notlar ile ilgili sınıfa girdik.

        public static void main(String[] args){//Main metodunun içinde kullanıcıdan öğrenci sayısını scanner ile alıyoruz.
            Scanner scanner = new Scanner(System.in);//aldığımız bu sayı ile bir öğrenci listesi oluşturuyoruz
            List<Ogrenci> ogrenciler = new ArrayList<>();
            System.out.println("Öğrenci sayisini girin: ");
            int ogrenciSayisi = scanner.nextInt();
            for (int i = 0; i < ogrenciSayisi; i++) {
                ogrenciler.add(ogrenciBilgisiAl(scanner));// for döngüsü ile girilen sayı kadar listeye ekleme yapıyoruz.
            }
            int secim;
            do { 
                secim = menu(scanner);
                switch (secim) {// burda switch case yapısı ile menü işlemlerini gerçekleştirmek ve seçime göre işlemleri yapmak  için kullanıyoruz.
                    case 1:
                        ogrenciBilgileriniGoster(ogrenciler);
                        break;
                    case 2:
                        sinavSonucOrtalamasi(ogrenciler);
                        break;
                    case 3:
                        altmisinAltindakiNotlar(ogrenciler);
                        break;
                    case 4:
                        ortalamaninUstundekiNotlar(ogrenciler);
                        break;
                    case 5:
                        altmisinAltindakiNotSayisi(ogrenciler);
                        break;
                    case 6:
                        enYuksekNot(ogrenciler);
                        break;
                    case 7:
                        enDusukNot(ogrenciler);
                        break;
                    case 8:
                        sinavSonuclariniSirala(ogrenciler);
                        break;
                    case 0:
                        System.out.println("Programdan çikiş!");// 0 a basarsak programdan çıkar
                        break;
                    default:
                        System.out.println("Geçersiz seçim!");// yukardaki numaralar harici girişte geçersiz kılacaktır.
                }
            }   while (secim != 0);
    
                scanner.close();
        }
        public static Ogrenci ogrenciBilgisiAl(Scanner scanner) {//bu metodda kullancıdan alınan bilgilere göre Ogrenci nesnesini oluşturuyoruz.
            System.out.print("Öğrenci numarasini girin: ");
            int numara = scanner.nextInt();
            System.out.print("Öğrenci ismini girin: ");  // bu satırlar kullanıcıdan değerleri alarak ilgili değişkenlere atar
            String isim = scanner.nextLine();
            System.out.print("Vize notunu girin: ");
            double vize = scanner.nextDouble();
            System.out.print("Final notunu girin: ");
            double _final = scanner.nextDouble();
            return new Ogrenci(numara, isim, vize, _final);//Bu satır, Ogrenci sınıfından yeni bir nesne oluşturur ve bu nesneyi döndürür.

        }
        public static void ogrenciBilgileriniGoster(List<Ogrenci> ogrenciler) {//Bu metodda listedeki öğrencilerin bilgileri yazdırılır
            System.out.println("\nÖğrenci Bilgileri:");
            for (Ogrenci ogrenci : ogrenciler) {
                System.out.println(ogrenci);
            }
        }
    
        public static void sinavSonucOrtalamasi(List<Ogrenci> ogrenciler) {//Bu metodda listedeki öğrencilerin ortalamaları ekrana yazdırılır.
            System.out.println("\nSinav Sonuç Ortalamalari:");
            for (Ogrenci ogrenci : ogrenciler) {//ogrenciler adlı öğrenci listesindeki her bir öğrenci için bir döngü başlatıyoruz.
                System.out.println(ogrenci.isim + ": " + ogrenci.ortalama);
            }
        }
    
        public static void altmisinAltindakiNotlar(List<Ogrenci> ogrenciler) {//Bu metodda listedeki öğrencilerden 60 ın altındaki ort sahip olanlar if ile bulunup yazdırılır.
            System.out.println("\n60'in Altindaki Notlar:");
            for (Ogrenci ogrenci : ogrenciler) {
                if (ogrenci.ortalama < 60) {
                    System.out.println("Numara: " + ogrenci.numara + ", İsim: " + ogrenci.isim + ", Ortalama: " + ogrenci.ortalama);
                }
            }
        }
    
        public static void ortalamaninUstundekiNotlar(List<Ogrenci> ogrenciler) {//öğrencilerin ortalama notlarını hesaplar, genel ortalamayı bulur ve genel ortalamanın üzerinde not alan öğrencilerin bilgilerini ekrana yazdırır. 
            double genelOrtalama = ogrenciler.stream().mapToDouble(ogrenci -> ogrenci.ortalama).average().orElse(0);//Bu kısım, akış içindeki her öğrencinin ortalama notunu double türünde bir akışa dönüştürür.
            System.out.println("\nOrtalamanin Üstündeki Notlar (Genel Ortalama: " + genelOrtalama + "):");
            for (Ogrenci ogrenci : ogrenciler) {
                if (ogrenci.ortalama > genelOrtalama) {
                    System.out.println("Numara: " + ogrenci.numara + ", İsim: " + ogrenci.isim + ", Ortalama: " + ogrenci.ortalama);
                }
            }
        }
    
        public static void altmisinAltindakiNotSayisi(List<Ogrenci> ogrenciler) {//Bu metodda altmışın altında notu olanlar aranıp sayac değişkenine aktarılır ve ekrana yazdırılır.
            long sayac = ogrenciler.stream().filter(ogrenci -> ogrenci.ortalama < 60).count();
            System.out.println("\n60'in Altindaki Not Sayisi: " + sayac);
        }
    
        public static void enYuksekNot(List<Ogrenci> ogrenciler) { // bu metod öğrenci listesindeki en yüksek notlu kişiyi bulur ve yazdırır.
            Ogrenci enYuksek = ogrenciler.stream().max(Comparator.comparingDouble(ogrenci -> ogrenci.ortalama)).orElse(null);//max() metodu, bu karşılaştırıcıyı kullanarak akış içindeki en yüksek ortalama nota sahip öğrenciyi bulur.
            if (enYuksek != null) { //comparingDouble() metodu, alınan ortalama notlarına göre öğrencileri karşılaştırır ve sıralar.
                System.out.println("\nEn Yüksek Not: " + enYuksek.ortalama + " (Numara: " + enYuksek.numara + ", İsim: " + enYuksek.isim + ")");
            } else {
                System.out.println("\nÖğrenci bulunamadi.");// eğer öğrenci bulunmazsa bunuda ekrana yazdırır.
            }
        }
    
        public static void enDusukNot(List<Ogrenci> ogrenciler) {//bu metod öğrenci listesindeki en düşük notlu kişiyi bulur ve yazdırır.
            Ogrenci enDusuk = ogrenciler.stream().min(Comparator.comparingDouble(ogrenci -> ogrenci.ortalama)).orElse(null);// stream akış haline getirir.
            if (enDusuk != null) {                   //öğrencileri ortalama notlarına göre karşılaştıran bir "karşılaştırıcı" (comparator) oluşturur.
                System.out.println("\nEn Düşük Not: " + enDusuk.ortalama + " (Numara: " + enDusuk.numara + ", İsim: " + enDusuk.isim + ")");
            } else {
                System.out.println("\nÖğrenci bulunamadi.");// eğer öğrenci bulunmazsa bunuda ekrana yazdırır.
            }
        }
    
        public static void sinavSonuclariniSirala(List<Ogrenci> ogrenciler) {//bu metod öğrenci listesini ortalama notlarına göre sıralar ve sıralanmış öğrenci bilgilerini ekrana yazdırır.
            ogrenciler.sort(Comparator.comparingDouble(ogrenci -> ogrenci.ortalama));//öğrenci listesini  öğrencilerin ortalama notlarına göre sıralamak için kullanılır.
            System.out.println("\nSinav Sonuçlarina Göre Siralanmiş Öğrenci Bilgileri:");
            for (Ogrenci ogrenci : ogrenciler) {// bu for döngüsü her öğrenci için çalışır ve ekrana yazdırır.
                System.out.println(ogrenci);
            }
        }
    
        public static int menu(Scanner scanner) {//öğrenci not sistemi için kullanıcıya bir menü sunar ve kullanıcının seçimine göre farklı işlemleri gerçekleştirir.
            System.out.println("\nMenü:");
            System.out.println("1. Öğrenci Bilgilerini Göster:");//Kaydedilen tüm öğrencilerin bilgilerini (numara, isim, vize, final, ortalama) ekrana yazdırır.
            System.out.println("2. Sinav Sonuç Ortalamasi:");//Her öğrencinin sınav sonuç ortalamasını ekrana yazdırır.
            System.out.println("3. 60'in Altindaki Notlar:");//Sınav sonuç ortalaması 60'ın altında olan öğrencilerin bilgilerini ekrana yazdırır.
            System.out.println("4. Ortalamanin Üstündeki Notlar:");//Sınav sonuç ortalaması, tüm öğrencilerin ortalamasının üzerinde olan öğrencilerin bilgilerini ekrana yazdırır.
            System.out.println("5. 60'in Altindaki Not Sayisi:");//Sınav sonuç ortalaması 60'ın altında olan öğrenci sayısını ekrana yazdırır.
            System.out.println("6. En Yüksek Not:");// En yüksek sınav sonuç ortalamasına sahip öğrencinin bilgilerini ekrana yazdırır.
            System.out.println("7. En Düşük Not:");//En düşük sınav sonuç ortalamasına sahip öğrencinin bilgilerini ekrana yazdırır.
            System.out.println("8. Sinav Sonuçlarini Sirala:");//Öğrencileri sınav sonuç ortalamalarına göre sıralayarak ekrana yazdırır.
            System.out.println("0. Çikiş:");//Programdan çıkış yapar.
            System.out.print("Seçiminiz: ");
            return scanner.nextInt();
        }
    }
 
