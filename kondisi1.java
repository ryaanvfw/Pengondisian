public class kondisi1 {

    public static void main(String[] args) {
        int usia = 22;
        double totalBelanja = 149000;

        if (usia < 18) {
            System.out.println(x: "Akses dibatasi: dibawah 18 tahun.");
        } else if (totalBelanja >= 150000) {
            System.out.println(x: "Akses diberikan + Diskon 15%");
        } else {
            System.out.println(x: "Akses diberikan, tanpa diskon.");
        }
    }
}