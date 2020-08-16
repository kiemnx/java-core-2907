package vn.plusplus.javacore.lesson6;


public class StudentExample {
    public static void main(String[] args) {

        String[] name = {"Sinh vien A", "Sinh vien B", "Sinh vien C"};
        int[] age = {20, 21, 19};
        float[] gpa = {2.5f, 3.0f, 2.8f};
//        String[] email;


        // Sinh vien C -- 19 -- 2.8f
        // Sinh vien A -- 20 -- 2.5f
        // Sinh vien B -- 21 -- 3.0f

        int temp;
        String tempName;
        for(int i=0;i< age.length; i++){
            for(int j = i+1; j<age.length; j++){
                if(age[i] > age[j]){
                    // Doi cho tuoi
                    temp = age[j];
                    age[j] = age[i];
                    age[i] = temp;
                    // Doi cho ten
                    tempName = name[j];
                    name[j] = name[i];
                    name[i] = tempName;
                    // Doi cho diem

                }
            }
        }

        for(int i : age){
            System.out.println(i);
        }


        Student[] students = new Student[3];
        students[0] = new Student("Sinh vien A", 20, 2.5f);
        students[1] = new Student("Sinh vien B", 21, 3.0f);
        students[2] = new Student("Sinh vien C", 19, 2.8f);


        Student tempSt;
        for(int i=0;i< students.length; i++){
            for(int j = i+1; j<students.length; j++){
                if(students[i].age > students[j].age){
                    // Doi cho sinh vien
                    tempSt = students[j];
                    students[j] = students[i];
                    students[i] = tempSt;
                }
            }
        }

        for(Student st : students){
            System.out.println(st.getName() +"--" + st.getAge() +"--" + st.getGpa());
        }

    }
}
