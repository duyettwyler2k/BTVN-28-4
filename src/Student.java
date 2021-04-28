import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private int id;
    private String name;
    private String adress;
    private String clasz;
    private double score;

    public Student() {
    }

    public Student(int id, String name, String adress, String clasz, double score) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.clasz = clasz;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getClasz() {
        return clasz;
    }

    public void setClasz(String clasz) {
        this.clasz = clasz;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void inputInFoStudent(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        this.id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ho va ten");
        this.name=scanner.nextLine();
        System.out.println("Nhap dia chi :");
        this.adress=scanner.nextLine();
        System.out.println("Nhap ten lop :");
        this.clasz=scanner.nextLine();
        System.out.println("Nhap diem :");
        this.score=scanner.nextDouble();
    }
    public void showInFoStudent(){
        System.out.printf("Ma sinh vien la: %s ,Ho ten la: %s, Dia chi la:%s, Ten lop la:%s, Diem so la:%s \n",id,name,adress,clasz,score);
    }
}
