import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList antrian = new SingleLinkedList();

        while (true) {
            System.out.println("\n===== MENU ANTRIAN RESTORAN =====");
            System.out.println("1. Tambah Pelanggan ke Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = input.nextInt();
            input.nextLine(); // Buang newline dari input angka

            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    Customer customer = new Customer(nama); // Deklarasi & inisialisasi dalam blok
                    antrian.push(customer);
                    antrian.display();
                    break;
                }

                case 2:
                    antrian.pop();
                    antrian.display();
                    break;

                case 3:
                    antrian.display();
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
            }
        }
    }
}
