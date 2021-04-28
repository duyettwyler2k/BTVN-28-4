import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudenMaganet studenMaganet = new StudenMaganet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban");
        int choice;
do {
menu();
choice=scanner.nextInt();

switch (choice){
    case 1:{
        studenMaganet.addStudent();

        break;
    }
    case 2:{
        studenMaganet.showStudent();
        break;
    }
    case 3:{
        studenMaganet.repairInfoStudent();

        break;
    }
    case 4:{
        studenMaganet.removeInfoStudent();

        break;
    }
    case 5:{
         studenMaganet.sortStudentByScore();
         studenMaganet.showStudent();
         break;
    }
    case 6:{
        studenMaganet.findMaxScore();
        break;
    }
    case 7:{
        studenMaganet.findId();
        break;
    }
    case 8:{
        studenMaganet.statiscial();
        break;
    }
    case 9:{
        studenMaganet.readToFile();
        break;
    }

}
} while (choice!=0);

    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin thi sinh");
        System.out.println("2. Hiển thị thông tin thi sinh");
        System.out.println("3. sua thông tin 1 thi sinh");
        System.out.println("4 .Xoa thong tin sinh vien");
        System.out.println("5 .sap xep sinh vien theo diem tang dan");
        System.out.println("6. hien thi sinh vien co diem cao nhat");
        System.out.println("7. tim kiem thong tin sinh bang ma nhi phan ");
        System.out.println("8. Hien thi sinh vien o cac lop");
        System.out.println("9. doc tu file");

    }
}
