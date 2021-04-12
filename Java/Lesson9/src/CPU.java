
public class CPU {

	private double price;

	public class Processor {
		private int coreAmount;
		private String manufacturer;

		public Processor(int coreAmount, String manufacturer) {
			super();
			this.coreAmount = coreAmount;
			this.manufacturer = manufacturer;
		}

		public double getCache() {
			return 4.3;
		}

		@Override
		public String toString() {
			return "Processor [coreAmount=" + coreAmount + ", manufacturer=" + manufacturer + "]";
		}

	}

	public class Ram {
		private int memory;
		private String manufacturer;

		public Ram(int memory, String manufacturer) {
			super();
			this.memory = memory;
			this.manufacturer = manufacturer;
		}

		public double getClockSpeed() {
			return 5.5;
		}

		@Override
		public String toString() {
			return "Ram [memory=" + memory + ", manufacturer=" + manufacturer + "]";
		}

	}
}
