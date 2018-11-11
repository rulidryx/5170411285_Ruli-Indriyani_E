package Program;
import java.util.Comparator;
public class NIM implements Comparator<MAHASISWA> {
    @Override
    public int compare(MAHASISWA x, MAHASISWA y)
    {
        return x.getnim().compareToIgnoreCase(y.getnim());
    }
}
