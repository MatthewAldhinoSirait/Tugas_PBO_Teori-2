import java.text.NumberFormat;
import java.util.Locale;

public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    // inner class Harddisk
        public class Harddisk {
        int capacityGB;
        String manufacturer;

        Harddisk(int capacityGB, String manufacturer) {
            this.capacityGB = capacityGB;
            this.manufacturer = manufacturer;
        }

        public void getHarddiskInfo() {
            System.out.println("Harddisk Capacity: " + this.capacityGB + " GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class Motherboard
        public class Motherboard {
        String model;
        String manufacturer;

        Motherboard(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        public void getMotherboardInfo() {
            System.out.println("Motherboard Model: " + this.model);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class PowerSuply
        public class PowerSupply {
        String model;
        String manufacturer;

        PowerSupply(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Power Supply Model: " + this.model);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }
    // inner class VGACard
        public class VGACard {
        String model;
        String manufacturer;

        VGACard(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        public void getVGACardInfo() {
            System.out.println("VGA Card Model: " + this.model);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }
}