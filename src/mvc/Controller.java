package mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    List<Model> modelList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public Controller() {
        modelList.add(new Model("Smith", 8, true,7979797,24999.95));
        modelList.add(new Model("David", 9, true,9876545,28999.95));
        modelList.add(new Model("Jenny", 7, false,4567887,21999.95));
    }

    public void addLatestModel() {
        System.out.println("Enter Student Name : ");
        String sname = sc.nextLine();
        System.out.println("Enter Your current STD : ");
        int std = sc.nextInt();
        System.out.println("Enter your Gender : ");
        boolean gender = sc.nextBoolean();
        System.out.println("Enter your number : ");
        int cno = sc.nextInt();
        System.out.println("Enter your Fees : ");
        double fees = sc.nextDouble();

        modelList.add(new Model(sname, std, gender,cno,fees));

        for (Object obj : modelList){
            System.out.println(obj+" modelList");
        }
    }

    void deleteStudent() {
        System.out.println("Enter Student Name");
        String sname = sc.nextLine();
        for (int i=0;i<modelList.size();i++){
            if (sname.toLowerCase().equals(modelList.get(i).getStud_name().toLowerCase())){
                modelList.remove(i);
                System.out.println(sname+" Removed for Database");
            }
        }
        System.out.println("Updated Database : ");

        for (Object obj : modelList){
            System.out.println(obj);
        }
    }
    void updateStudent() {
        System.out.println("Enter Student Name");
        String sname = sc.nextLine();
        System.out.println("Enter Student New Number");
        int newNo = sc.nextInt();
        for (int i=0;i<modelList.size();i++){
            if (sname.toLowerCase().equals(modelList.get(i).getStud_name().toLowerCase())) {
                modelList.get(i).setStud_cno(newNo);
            }
        }
        System.out.println("Updated Database : ");

        for (Object obj : modelList){
            System.out.println(obj);
        }
    }
}
