package laboratorium;

public class Main {
	public static void main(String[] args) {

		Processor myProcessor = new Processor("Intel", "i5-8400", 2666, 9);
		Mainboard myMainboard = new Mainboard("Asus", "H110MK");
		Memory myMemory = new Memory("Toshiba", 500);
		HardDrive myHardDrive = new HardDrive("Seagate", 2);

		Computer myComputer = new Computer("My computer", "MSI", myProcessor, myMainboard, myMemory, myHardDrive);

		System.out.println(myComputer);

	}
}
