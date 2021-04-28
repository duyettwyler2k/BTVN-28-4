import java.io.*;
import java.util.*;

public class StudenMaganet {
    List<Student> studentList = new ArrayList<>();

    //them sinh vien
    public void addStudent() {
        Student student = new Student();
        student.inputInFoStudent();
        studentList.add(student);
        writeToFile();
    }



    //hien thi sinh vien
    public void showStudent() {
        for (Student student : studentList) {
            student.showInFoStudent();
        }
    }

    //sua 1 sinh vien khi biet id
    public void repairInfoStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id sinh vien muon cap nhat");
        int id = scanner.nextInt();
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.inputInFoStudent();
            }
        }
        writeToFile();
    }

    //xoa sinh vien biet id
    public void removeInfoStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id sinh vien muon xoa");
        int id = scanner.nextInt();
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
            }
            break;
        }
        writeToFile();
    }

    //sap xep theo diem tang dan
    public void sortStudentByScore() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(j).getScore() > studentList.get(j - 1).getScore()) {
                    Collections.swap(studentList, j, j - 1);
                }
            }
        }
        writeToFile();
    }

    //tim kiem sinh vien diem cao
    public void findMaxScore() {
        double max = 0;
        for (Student student : studentList) {
            if (student.getScore() > max) {
                max = student.getScore();
            }
        }
        for (Student student : studentList) {
            if (student.getScore() == max) {
                student.showInFoStudent();
            }
        }
    }

    //sap xeo id
    public void sortIDStudent() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(j).getId() > studentList.get(j - 1).getId()) {
                    Collections.swap(studentList, j, j - 1);
                }
            }
        }
    }
    //tim kiem nhi phan
    public void findId(){
        sortIDStudent();
        System.out.println("Nhap id sinh vien can tim");
        Scanner scanner=new Scanner(System.in);
        int id=scanner.nextInt();
        int low=0;
        int high=studentList.size()-1;
        int mid;
        while (low<=high){
            mid=(low+high)/2;
            if (studentList.get(mid).getId()==id){
                studentList.get(mid).showInFoStudent();
                break;
            } if (studentList.get(mid).getId()>id){
                high=mid-1;
            } if (studentList.get(mid).getId()<id){
                low=mid+1;
            }
        }
    }

    //ghi danh sach tu file
    public void writeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Pham Duyet\\Desktop\\New folder\\test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //doc danh sach tu file
    public void readToFile(){
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\Pham Duyet\\Desktop\\New folder\\test.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            studentList=(List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Student student:studentList){
            student.showInFoStudent();
        }

    }
    //hashmap tim ra so sinh vien trong lop
    public void statiscial(){
        Map<String,Integer> map=new HashMap<String,Integer>();
        for (int i = 0; i <studentList.size() ; i++) {
            map.put(studentList.get(i).getClasz(),0);
        }
        for (int i = 0; i <studentList.size() ; i++) {
            if (map.containsKey((studentList.get(i).getClasz()))){
                map.replace(studentList.get(i).getClasz(),map.get(studentList.get(i).getClasz())+1);
            }
        }
        System.out.println(map);
    }
    
}
