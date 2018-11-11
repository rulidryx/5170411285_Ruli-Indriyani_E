package Program;

public class MAHASISWA {
    String nim;
    String nama;
    float ipk;
    
    public  MAHASISWA (String nim, String nama,float ipk)
    {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk; 
    }
    public void setnim(String nim)
    {
        this.nim = nim;
    }
    public void setnama(String nama)
    {
        this.nama = nama;
    }
    public void setipk(float ipk)
    {
        this.ipk = ipk;   
    }
    public String getnim()
    {
        return nim;
    }
    public String getnama()
    {
        return nama;
    }
    public float getipk()
    {
        return ipk;
    }
    @Override
    public String toString()
    {
        return " Mahasiswa {" +"nim="+nim+",nama="+nama+",ipk"+ipk+'}';
    }
    
}
