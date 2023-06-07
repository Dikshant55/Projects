import java.util.Comparator;

public class SortByName implements Comparator<StudentEntry> {


    @Override
    public int compare(StudentEntry a, StudentEntry b) {
        return a.name.compareTo(b.name);
    }
}
