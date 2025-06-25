import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Customer {
    private String nama;
    private int nomorAntrian;
    private LocalDateTime waktuKedatangan;
    private static int counterAntrian = 0;
    
    public Customer(String nama) {
        this.nama = nama;
        this.nomorAntrian = ++counterAntrian;
        this.waktuKedatangan = LocalDateTime.now();
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getNomorAntrian() {
        return nomorAntrian;
    }
    
    public LocalDateTime getWaktuKedatangan() {
        return waktuKedatangan;
    }
    
    public String getWaktuKedatanganFormatted() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return waktuKedatangan.format(formatter);
    }
    
    @Override
    public String toString() {
        return "Customer{" +
                "Nama='" + nama + '\'' +
                ", No.Antrian=" + nomorAntrian +
                ", Waktu=" + getWaktuKedatanganFormatted() +
                '}';
    }
    
    public static void resetCounter() {
        counterAntrian = 0;
    }
}