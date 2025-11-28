import java.util.Scanner;
public class StudentInformations { // Öğrenci bilgileri için  StudentInformations adında bir sınıf oluşturduk.
    static Scanner scanner = new Scanner(System.in);
    static String[] studentNumbers; //Öğrenci numaraları için string dizi oluşturduk.
    static String[] studentNames; //Öğrenci isimleri için string dizi oluşturduk.
    static double[] finalGrades; //final notları için double dizi oluşturduk.
    static double[] midtermGrades;// vizeler için double dizi oluşturduk.
    static double[] averages;// ortalama için double dizi oluşturduk.
    static int studentCount; // öğrenci sayısını tanımladık.
    
    public static void main(String[] args) {// bu main fonksiyonun içinde kaç adet öğrencinin bilgilerini görüntülemek istediklerini sorup bunu StudentCount sayisina atadık.
        System.out.print("Please enter the number of students: ");
        studentCount = scanner.nextInt();// işte burda studentCount sayısına atama yaptık.
        studentNumbers = new String[studentCount];//bu bölümde yeni diziler oluşturuyoruz ve  bu dizilere değişkenlerin değerleri kadar elemanlık bir boyut atar. 
        studentNames = new String[studentCount];
        midtermGrades = new double[studentCount];
        finalGrades = new double[studentCount];
        averages = new double[studentCount];

        while (true) {//Burda while döngüsü ile koşul doğru olduğu sürece menü görüntülenecek.
            displayMenu();
            int choice = scanner.nextInt();// burda choice değişkenini kullanıcıdan aldık , choice ile menüde istediği bölümü kullanıcı seçebilecek.
            switch (choice) {// choice değişkeni ile switch case yapısına giriş yaptık. (1-9) arası  girdiği sayıya göre kullanıcı ilgili metodumuza yönelecek.
                case 1: getStudentInfo(); // getStudentInfo ile öğrenci bigilerini alıyoruz.
                break;
                case 2: displayAllStudents(); // displayAllStudent ile tüm öğrenci bilgilerini ekranda göstericez.
                break;
                case 3: calculateAverages(); // calculateAvarages ile ortalama hesaplayıyoruz.
                break;
                case 4: displayFailingStudents();// displayFailingStudent ile kalan öğrencileri görüntülüyoruz.
                 break;
                case 5: displayAboveAverage(); //displayAboveAvarage ile geçen öğrencileri görüntülüyoruz.
                break;
                case 6: countFailingGrades(); //countFailingStudent ile kalan öğrenci sayısını gösteriyoruz.
                break;
                case 7: findHighestGrade(); //findHeightsGrade ile en yüksek notu buluyoruz.
                break;
                case 8: findLowestGrade(); //findLowestGrade ile en düşük notu buluyoruz.
                break;
                case 9: sortAndDisplay(); //sortAndDisplay ile notları sıralayıp gösteriyoruz.
                break;
                case 0: System.out.println("Exiting the menü...");// 0 a basınca menüden çıkılıyor.
                 return;
                default: System.out.println("Wrong choice,try again!");// bu sayılar dışında bir sayı girişinde sistem hata veriyor.
                // her seçim sonucu yer alan breaklerle seçimden sonra switch-case yapısından çıkış yapıyoruz.
            }
        }
    }

    public static void displayMenu() {// Bu metotda menü seçenekleri tek tek ekrana yazdırılır.
        System.out.println("-Student Informations-");
        System.out.println("1. Please enter student information:");
        System.out.println("2. Display all students:");
        System.out.println("3. Calculate averages:");
        System.out.println("4. Display failing students:");
        System.out.println("5. Display above average students:");
        System.out.println("6. Count failing grades:");
        System.out.println("7. Find highest grade:");
        System.out.println("8. Find lowest grade:");
        System.out.println("9. Sort and display by grades:");
        System.out.println("0. Exit!");
        System.out.println("Please Enter your choice: ");
    }

    public static void getStudentInfo() {// bu metotda öğrenci bilgileri alınır.
        for (int i = 0; i < studentCount; i++) {// for döngüsü girilen öğrenci sayısı kadar döner.
            System.out.println("Student " + (i + 1));//Bu satırla, ekrana "Student [öğrenci numarası]" şeklinde bir mesaj yazdırıyoruz.
            System.out.print("Enter student number: ");
            studentNumbers[i] = scanner.next();//Burda, kullanıcının girdiği öğrenci numarasını studentNumbers dizisinin i. elemanına kaydediyoruz.
            System.out.print("Enter student name: ");
            studentNames[i] = scanner.next();// burda kullanıcının girdiği ismi diziye kaydediyoruz.
            System.out.print("Enter midterm grade: ");
            midtermGrades[i] = scanner.nextDouble();// burda kullanıcının girdiği vize notlarını ilgili diziye kaydediyoruz.
            System.out.print("Enter final grade: ");
            finalGrades[i] = scanner.nextDouble();// burda kullanıcının girdiği final notlarını ilgili diziye kaydediyoruz.
        }
    }

    public static void calculateAverages() {// bu metotda ortalamayı hesaplıyoruz.
        System.out.println("Students Averages:");
        for (int i = 0; i < studentCount; i++) {
            averages[i] = (midtermGrades[i] * 0.4) + (finalGrades[i] * 0.6);// bu kodda vize notunun %40 ile final notunun %60 nı toplar ve ortalama dizisindeki i  indisli elemana atar.
            System.out.printf("No: %s, Name: %s, Average: %f%n",studentNumbers[i], studentNames[i], averages[i]);
        
        }
    }
    public static void displayAllStudents() {// bu metotda tüm öğrencileri ekrana yazdırıyoruz.
        System.out.println("All Students:");
        for (int i = 0; i < studentCount; i++) {// for döngüsü öğrenci sayısı kadar döner.
            System.out.printf("No: %s, Name: %s, Midterm: %.2f, Final: %.2%n",studentNumbers[i], studentNames[i], midtermGrades[i], finalGrades[i]);
          // bu kodda öğrencinin numarası, ismi vize ve final notu dizilerin İ. elemanlarından okumayı yapıp ekrana yazdırıyoruz.
        }
    }


    public  static void displayAboveAverage() {// bu metotda ortalaması 60 nın yukarısında kalan öğrencileri görüntülüyoruz.
        double total = 0;// total adında değişken tanımlıyoruz.
        for (int i = 0; i < studentCount; i++) {
            total += averages[i];// bu total değişkenine ortalamadaki değerlerin toplamını atar.
        }
        double classAverage = total / studentCount;// sınıf ortalaması değişkene bulduğumuz total değeri öğrenci sayısına bölüp atıyoruz.
        
        System.out.println("Students Above Class Average ("+classAverage+"):");
        for (int i = 0; i < studentCount; i++) {
            if (averages[i] > classAverage) {//eğer i indisli değer sınıf ortalamasından büyükse öğrenci numarası ,ismş,ortalaması ekrana yazdırılır.
                System.out.println("No: %s, Name: %s, Average: %.2f%n",studentNumbers[i], studentNames[i], averages[i]);
            }
        }
    }
    public static void displayFailingStudents() {// bu metotta ortalaması 60 nın altında kalan öğrencileri gösteriyoruz.
        System.out.println("Failing Students:");
        for (int i = 0; i < studentCount; i++) {
            if (averages[i] < 60) {// ilgili i indisli dizinin elemanının ortalaması  60 ın yukarısında ise ekrana öğrenci numarasını ismini ve ortalamasını yazdırıyoruz.
                System.out.printf("No: %s, Name: %s, Average: %.2f%n",studentNumbers[i], studentNames[i], averages[i]);
            }
        }
    }
    public static void countFailingGrades() {// bu metotda kalan öğrenci sayısını görüntülüyoruz.
        int count = 0;// count adında değişken tanımladık.
        for (int i = 0; i < studentCount; i++) {
            if (averages[i] < 60) {// eğer i indisli ortalamamız 60 dan büyükse count değişkenini 1 artırıyoruz ve bu döngü öğrenci sayısı kadar döner.
                count++;
            }
        }
        System.out.println("Number of failing grades: " + count);
    }

    public static void findHighestGrade() {// bu metotda en yüksek notu buluyoruz.
        double max = averages[0];// dziinin ilk elemanını max değişkenine atıyoruz.
        int index = 0;
        for (int i = 1; i < studentCount; i++) {
            if (averages[i] > max) {// iç içe 2 for döngüsü ile dizinin her elemanını bu ilk max değeriyle karşılaştırıyoruz eğer büyükse o değeri ona atıyoruz.
                max = averages[i];
                index = i;
            }
        }
        System.out.println("Highest Grade: No: %s, Name: %s, Average: %.2f%n", studentNumbers[index], studentNames[index], max);
      // en yüksek notu ekrana öğrenci numarası ismi ve ortalamayla yazdırıyoruz.
    }

    public static void findLowestGrade() {// bu metotda en  düşük notu buluyoruz.
        double min = averages[0];// min adında bir değişken tanımlıyoruz ve dizinin ilk elemanını buna atıyoruz.
        int index = 0;
        for (int i = 1; i < studentCount; i++) {
            if (averages[i] < min) {// iç içe 2 for döngüsüyle dizinin her elemanı bu değişkenle karşılaştırıyoruz. ,ve eğer düşükse ona atıyoruz.
                min = averages[i];
                index = i;
            }
        }
        System.out.println("\nLowest Grade: No: %s, Name: %s, Average: %.2f%n",studentNumbers[index], studentNames[index], min);
        // en düşük notu ekrana öğrenci numarası ismi ve ortalamayla yazdırıyoruz.
    }

    }

    public static void sortAndDisplay() {// bu metotta bubble sort kullanarak  notları sıralayıp ekranda gösteriyoruz.
        for (int i = 0; i < studentCount - 1; i++) {//2 for döngüsüde öğrenci sayısının bir eksiği kadar döner.
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (averages[j] > averages[j + 1]) {
                    double tempAvg = averages[j];// bu döngüde yer değiştirme mantığını kullandık.
                    averages[j] = averages[j + 1];
                    averages[j + 1] = tempAvg;
                    String tempNum = studentNumbers[j];// bu kodda öğrenci numaraları yer değiştirir.
                    studentNumbers[j] = studentNumbers[j + 1];
                    studentNumbers[j + 1] = tempNum;
                    String tempName = studentNames[j];// bu kodda isimler yer değiştirir.
                    studentNames[j] = studentNames[j + 1];
                    studentNames[j + 1] = tempName;
                }
            }
        }
        System.out.println("Sorted by Grades:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("No: %s, Name: %s, Average: %.2f%n",studentNumbers[i], studentNames[i], averages[i]);
        }
    }
