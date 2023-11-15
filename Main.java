public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");
        
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
        CPU.Harddisk myHarddisk = myKomputer.new Harddisk(1000, "Western Digital");
        CPU.VGACard myVGACard = myKomputer.new VGACard("NVIDIA GTX 3080", "MSI");
        CPU.Motherboard myMotherboard = myKomputer.new Motherboard("XYZ Model", "ASUS");
        CPU.PowerSupply myPowerSupply = myKomputer.new PowerSupply("ABC Model", "Corsair");

        myHarddisk.getHarddiskInfo();
        myVGACard.getVGACardInfo();
        myMotherboard.getMotherboardInfo();
        myPowerSupply.getPowerSupplyInfo();
    }
}