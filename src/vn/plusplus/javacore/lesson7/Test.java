package vn.plusplus.javacore.lesson7;

public class Test {
    public static void main(String[] args) {

        System.out.println("STUDENT INFO");
        Student st = new Student();
        st.setName("Nguyen Van A");
        st.setAge(18);
        st.setGpa(3.5f);
        st.setPhoneNumber("0987654321");
        st.printBasicInfo();


        System.out.println("TEACHER INFO");
        Teacher teacher = new Teacher();
        teacher.setName("Giao Vien B");
        teacher.setAge(30);
        teacher.printBasicInfo();

    }
}
