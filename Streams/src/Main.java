import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        List<StudentEntry> studentlist =new ArrayList<StudentEntry>();
        StudentEntry student=new StudentEntry(20,"Dikshant");
        studentlist.add(student);

        student=new StudentEntry(21,"Anil");
        studentlist.add(student);
        student=new StudentEntry(19,"raman");
        studentlist.add(student);


        student=new StudentEntry(5,"naman");
        studentlist.add(student);

        for(StudentEntry s: studentlist){
            System.out.println(s);

        }


        Collections.sort(studentlist, new SortByName());

        System.out.println("\nSorted by name");
        for (int i = 0; i < studentlist.size(); i++)
            System.out.println(studentlist.get(i));


    }
}
