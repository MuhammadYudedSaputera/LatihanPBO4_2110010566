
package penilaian;

public class NilaiAkhir {
    private int uts, uas, tugas;

    public NilaiAkhir(String Nama, String npm, int uts, int uas, int tugas) {
        super.nama = nama;
        super.npm = npm;
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    
    @override
    public void setNpm(String npm) {
        super.setNpm (npm)
    }
    
    @override
    public String getNpm() {
        return super.getNpm();
    }
    
    
    public int hitungNilaiAkhir(){
        return (int) (0.3*uts + 0.3*uas + 0.4*tugas)
        
 }
}
