package Karnataka;

public class Festival {
	
	public String fesName; 
	String fesMonthFixed; //DEMO - Default or Package Scope. Not visible in Kerala Package 
	protected int fes_no_of_days; 
	private boolean stateFes; 
	
	public String display() { 
		
	  return "Festival Name is "+fesName+".Its celebration month is "+fesMonthFixed+
			  ".Its "+stateFes+" that its a State Festival. Its usually celebrated for "+fes_no_of_days+" days"; }
	
	public int getfes_no_of_days() { return fes_no_of_days; }
	
	public void setfes_no_of_days (int fndays){ fes_no_of_days = fndays; }
	
    public String getfesMonthFixed() { return fesMonthFixed; }
	
	public void setfesMonthFixed (String fmonthfixed){ fesMonthFixed = fmonthfixed; }
	
    public boolean getsateFes() { return stateFes; }
	
	public void setstateFes (boolean fstate){ stateFes = fstate; }

	
}//end class Festival 