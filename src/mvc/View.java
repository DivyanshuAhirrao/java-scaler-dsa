package mvc;

public class View {
    public static void main(String[] args) {
        Controller con = new Controller();
//        con.addLatestModel();
        con.deleteStudent();
        con.updateStudent();
        System.out.println("Database Updated !! ");
    }
}
