public class Program1 {
	public static void main(String[] args) {
		CPU a = new CPU();
		CPU.Processor processor = a.new Processor(1, "son");
		CPU.Ram ram = a.new Ram(2, "sss");
		System.out.println(processor);
		System.out.println(ram);
	}
}
