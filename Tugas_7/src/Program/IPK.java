package Program;
import java.util.Comparator;
public class IPK implements Comparator<MAHASISWA>{
    @Override
    public int compare(MAHASISWA x, MAHASISWA y){
        return Float.compare(x.getipk(), y.getipk());
    }
}
