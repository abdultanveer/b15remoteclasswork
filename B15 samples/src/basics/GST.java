package basics;

public class GST extends IncomeTax {
	
	@Override
	public void calculateIT(int income) {
		// TODO Auto-generated method stub
		//super.calculateIT(income);
		int tax = 0;
		if(income<1000000) {
			tax = income/10;
		}
	}
	
	/**
	 * this method will calculate gst
	 */
	public void calculateGst() {}
	
	

}
