import java.util.*;

/**
 * Islemler sınıfı içindeki 3 metodun yazılması istenmektedir
 * GenericStack sınıfını kullanınız.
 */
public class Islemler {

    // Helper metot: GenericStack'in tip bilgisini almak için kullanılır 
    private static <T extends Comparable> Class<T> getDataType(GenericStack<T> s) {// yığının tipini alıyoruz.
         return (Class<T>) s.values.getClass().getComponentType();// yığının tipini döndürüyoruz.
    }
    
    // Helper metotlar (isNumeric ve isOperator) aynı kalır...
    private static boolean isNumeric(String str) {// sayısal mı diye bakıyoruz.
        try {
            Integer.parseInt(str);// sayısal ise true döndürüyoruz.
            return true;
        } catch(NumberFormatException e){// sayısal değilse false döndürüyoruz.
            return false;
        }
    }
    
    private static boolean isOperator(String str) {// operatör mü diye bakıyoruz.
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");// dört işlem operatörlerimi kontrol ediyoruz.
    }


    /**
     * 1. tersCevir()
     * Yığıtın elemanlarının sırasını tersine çeviriyoruz. Orijinal yığıt bozulmaz.
     * @param s Tersine çevrilecek yığıt
     * @return Tersine çevrilmiş yeni yığıt
     */
    public static <T extends Comparable> GenericStack<T> tersCevir(GenericStack<T> s) throws Exception {
        
        int size = s.Size();
        
        // Gerekli yardımcı yığınları oluşturuyoruz...
        Class<T> tip = getDataType(s);
        GenericStack<T> gecici = new GenericStack<>(tip, size);
        GenericStack<T> ters = new GenericStack<>(tip, size);

        // Adım 1: Elemanları s'ten gecici'ye aktarıyoruz (ters sırada).
        while (!s.isEmpty()) {
            gecici.push(s.pop()); 
        }

        // Adım 2: gecici'den hem s'ye  hem de ters yığıta aktarım yapıyoruz.
        while (!gecici.isEmpty()) {
            T val = gecici.pop();
            s.push(val); // Orijinal yığını geri yüklüyoruz.(Şimdi s, eski haline döndü)
            ters.push(val); // Ters yığıta ekliyoruz.
        }

        // Adım 3: Ters yığını tekrar pop/push yaparak tamamen tersine çeviriyoruz.
        // son ters yığını oluşturmak için ters yığını tekrar tersine çeviriyoruz.
        GenericStack<T> sonTers = new GenericStack<>(tip, size);
        while (!ters.isEmpty()) {
             sonTers.push(ters.pop()); 
        }

        return sonTers; // yığıtı döndürüyoruz.
    }


    /**
     * 2. esit()
     * İki yığıtın içeriklerinin sıra ve değer olarak eşit olup olmadığını kontrol eder.
     * Yığıtların içerikleri değişmemelidir (bozulmamalıdır).
     * @param s1 Birinci yığıt
     * @param s2 İkinci yığıt
     * @return İki yığıtın eşit olma durumu (true/false)
     */
    public static <T extends Comparable> boolean esit(GenericStack<T> s1, GenericStack<T> s2) throws Exception {

        // Eleman sayısı farklıysa direk false döndürüyoruz.
        if (s1.Size() != s2.Size()) {// burda kontrol yapıyoruz.
            return false;  
        }

        Class<T> tip = getDataType(s1);// yığının tipini alıyoruz.
        GenericStack<T> gecici1 = new GenericStack<>(tip, s1.Size());// geçici yığın 1 oluşturuyoruz.
        GenericStack<T> gecici2 = new GenericStack<>(tip, s2.Size());// geçici yığın 2 oluşturuyoruz.
        boolean esitMi = true; // Başlangıçta eşit kabul ediliyoruz

        // Elemanları pop ederek sırayla karşılaştırıyoruz
        while (!s1.isEmpty()) {
            T val1 = s1.pop();// pop işlemlerini yapıyoruz.
            T val2 = s2.pop(); // pop işlemlerini yapıyoruz.

            // Elemanları geçici yığınlara(1-2) atıyoruz.
            gecici1.push(val1);// geçici yığıt 1'e atıyoruz.
            gecici2.push(val2);// geçici yığıt 2'ye atıyoruz.

            // Değer kontrolü: Eşit değilse (compareTo 0 değilse) durumu false yapıyoruz.
            if (val1.compareTo(val2) != 0) {
                esitMi = false;
                // Geri yükleme zorunlu olduğu için döngü devam ettirmek zorundayız.
            }
        }

        // Geri yükleme: Orijinal yığınları eski haline getiriyoruz.

        // s1'i geri yüklüyoruz
        while (!gecici1.isEmpty()) {// geçici yığıt 1 boşalana kadar döngüye devam ediyoruz
            s1.push(gecici1.pop());
        }
        // s2'yi geri yüklüyoruz
        while (!gecici2.isEmpty()) {// geçici yığıt 2 boşalana kadar döngüye devam ediyoruz
            s2.push(gecici2.pop());
        }

        return esitMi;// eşitlik durumunu döndürüyoruz.
    }

    /**
     * 3. postfixDegerlendir()
     * Postfix ifadeyi değerlendirir. İşlemler tamsayılar üzerinde gerçekleşir.
     * @param girdi Girdi ifadesi
     * @return İfadenin sonucu (Hata durumunda -1)
     */
    public static int postfixDegerlendir(String girdi) throws Exception { // Hata durumunda -1 döndürülecek.

        GenericStack<Integer> operandStack = new GenericStack<>(Integer.class, girdi.length());// yığın oluşturuluyoruz.

        String[] tokens = splitToTokens(girdi);// ifadeyi tokenlara ayırıyoruz.
        
        for (String token : tokens) {// her token için döngüye giriyoruz.
            // Token sayısal mı yoksa operatör mü?
            if (isNumeric(token)) {// sayısal ise yığına atıyoruz.
                operandStack.push(Integer.parseInt(token)); 
            } 
            else if (isOperator(token)) {// operatör ise işlemi yapıyoruz.
                
                // Hata Kontrolü: Yeterli operand var mı? (Operand 2)
                if (operandStack.isEmpty()) {// yığın boşsa hata veriyoruz.
                    System.out.println("Hata: Yetersiz operand (Operand 2 eksik).");
                    return -1;// -1 döndürüyoruz.
                }
                int operand2 = operandStack.pop(); // ikinci operandı alıyoruz.
                
                // Hata Kontrolü: Yeterli operand var mı? (Operand 1)
                if (operandStack.isEmpty()) {// yığın boşsa hata veriyoruz.
                    System.out.println("Hata: Yetersiz operand (Operand 1 eksik).");
                    return -1;// -1 döndürüyoruz.
                }
                int operand1 = operandStack.pop(); // birinci operandı alıyoruz.

                int sonuc = 0;
                
                // İşlemi gerçekleştiriyoruz (if-else yapısı ile)
                if (token.equals("+")) {// toplama işlemi
                    sonuc = operand1 + operand2;
                } else if (token.equals("-")) {// çıkarma işlemi
                    sonuc = operand1 - operand2;
                } else if (token.equals("*")) {// çarpma işlemi
                    sonuc = operand1 * operand2;
                } else if (token.equals("/")) {// bölme işlemi
                    // Kritik Hata Kontrolü: Sıfıra bölme
                    if (operand2 == 0) {
                         System.out.println("Hata: sıfıra bölme girişimi.");
                         return -1;// -1 döndürüyoruz.
                    }
                    sonuc = operand1 / operand2; 
                }
                
                operandStack.push(sonuc);// sonucu yığına atıyoruz.
            }
        }
        
        // Hata Kontrolü: İşlem sonunda yığında tek bir eleman kalmalı
        // Size 1 ise top = 0'dır (0'dan başladığı için).
        if (operandStack.isEmpty() || operandStack.top != 0) {// yığın boşsa veya birden fazla eleman varsa hata veriyoruz.
            System.out.println("Hata: Geçersiz ifade formati. İşlem sonunda tek sonuç yok.");// hata mesajı veriyoruz.
            return -1;
        }
        
        return operandStack.pop();// Sonucu döndürüyoruz.
    }
    // Yardımcı metot: Girdi ifadesini tokenlara ayırıyoruz.

    private static String[] splitToTokens(String girdi)// boşluklara göre ayırıyoruz.
    {
        StringTokenizer t = new StringTokenizer(girdi, "+-*/^() ", true); // operatörleri ve parantezleri de token olarak alıyoruz.
        List<String> tokenList = new ArrayList<>();
        while (t.hasMoreTokens()) { // boşlukları atıyoruz.
            String s = t.nextToken().trim();
            if(!s.equals(""))// boşluk değilse ekliyoruz.
                tokenList.add(s);
        }
        String [] tl = new String[tokenList.size()];// dizi oluşturuyoruz.
        tokenList.toArray(tl); // listeyi diziye çeviriyoruz.
        return tl;
    }
}
