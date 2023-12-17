public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut", "+905300000000", "TRH");
        Teacher t2 = new Teacher("Graham Bell","0000","FZK");
        Teacher t3 = new Teacher("Külyutmaz","1111","BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course biyoloji = new Course("Biyoloji", "103", "BIO");

        Student std1 = new Student("İnek Şaban","2226","A Sınıfı",tarih,fizik,biyoloji);

        std1.addBulkExamNote(75,65,85);
        std1.isPass();

        Student std2 = new Student("Güdük Necmi","2230","A Sınıfı",tarih,fizik,biyoloji);

        std2.addBulkExamNote(85,90,74);
        std2.isPass();
    }
}