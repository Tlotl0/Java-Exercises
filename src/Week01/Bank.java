package Week01;

public class Bank {
	static class HDFC {
		protected String name = "HDFC";
		protected double rateOfInterest = 0.525;
		protected int numberOfBranches = 52;

		public HDFC() {
			name = name;
			rateOfInterest = rateOfInterest;
			numberOfBranches = numberOfBranches;
		}
		
		public String getName() {
			return name;
		}

		public double getRateOfInterest() {
			return rateOfInterest;
		}

		public int getNumberOfBranches() {
			return numberOfBranches;
		}
		
		public void getDetails() {
			System.out.println("Bank Name: " + getName() + "\n"
					+ "Prime Lending Rate of Interest: " + getRateOfInterest()
					+ "\n Number of Branches:" + getNumberOfBranches());
		}
		
	}
		
	public static class ICICI {
		protected String name = "ICICI";
		protected double rateOfInterest = 0.575;
		protected int numberOfBranches = 23;
		
		public ICICI() {
			name = name;
			rateOfInterest = rateOfInterest;
			numberOfBranches = numberOfBranches;
		}

		public String getName() {
			return name;
		}

		public double getRateOfInterest() {
			return rateOfInterest;
		}

		public int getNumberOfBranches() {
			return numberOfBranches;
		}

		public void getDetails() {
			System.out.println("Bank Name: " + getName() + "\n"
					+ "Prime Lending Rate of Interest: " + getRateOfInterest()
					+ "\n Number of Branches:" + getNumberOfBranches());
		}
		
	}

	public static class Axis {
		protected String name = "Axis";
		protected double rateOfInterest = 0.5;
		protected int numberOfBranches = 26;

		public Axis() {
			name = name;
			rateOfInterest = rateOfInterest;
			numberOfBranches = numberOfBranches;
		}
		
		public String getName() {
			return name;
		}

		public double getRateOfInterest() {
			return rateOfInterest;
		}

		public int getNumberOfBranches() {
			return numberOfBranches;
		}	
		
		public void getDetails() {
			System.out.println("Bank Name: " + getName() + "\n"
					+ "Prime Lending Rate of Interest: " + getRateOfInterest()
					+ "\n Number of Branches:" + getNumberOfBranches());
		}
		
	}
	
	
	static class CITI {
		protected String name = "CITI";
		protected double rateOfInterest = 0.55;
		protected int numberOfBranches = 28;

		public CITI() {
			name = name;
			rateOfInterest = rateOfInterest;
			numberOfBranches = numberOfBranches;
		}
		
		public String getName() {
			return name;
		}

		public double getRateOfInterest() {
			return rateOfInterest;
		}

		public int getNumberOfBranches() {
			return numberOfBranches;
		}	
		
		public void getDetails() {
			System.out.println("Bank Name: " + getName() + "\n"
					+ "Prime Lending Rate of Interest: " + getRateOfInterest()
					+ "\n Number of Branches:" + getNumberOfBranches());
		}
		
	}
}
