public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.branch=branch;
    }
    void print(){
        System.out.println("Adı: "+name);
        System.out.println("Telefon Numarası: "+phoneNumber);
        System.out.println("Branşı: "+branch);
    }
}
