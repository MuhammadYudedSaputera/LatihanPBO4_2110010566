
package penilaian;

public class NilaiAkhir {
    private int uts, uas, tugas;

    public NilaiAkhir(int uts, int uas, int tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    
    public NilaiAkhir(){
        return (int) (0.3*uts + 0.3*uas + 0.4*tugas)
        
 }
}
