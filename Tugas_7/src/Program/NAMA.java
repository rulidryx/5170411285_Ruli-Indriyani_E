package Program;
import java.util.Comparator;
public class NAMA implements Comparator<MAHASISWA>{
@Override
    public int compare(MAHASISWA x, MAHASISWA y)
    {
        return x.getnama().compareToIgnoreCase(y.getnama());   
    }    
}
