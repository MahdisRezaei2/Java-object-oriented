
public class Class1 {
	protected InnerClass1 ic;
	
	public Class1() {
		ic = new InnerClass1 ();
		
	}
	public void displayStrings() {
		System.out.println(ic.getString() + ".");
		System.out.println(ic.getAnotherString() + ".");
	}
	
    static public void main (String[] args) {
    	Class1 c1 = new Class1();
    	c1.displayStrings();
    }
    protected class InnerClass1{
    	public String getString() {
    		return "InnerClass1: getString invoked";
    	}
    	
    	public String getAnotherString() {
    		return "InnerClass1: getAnotherString invoked";
    	}
    }
   static public class Class2 extends Class1{
    	protected InnerClass2 ic2;
    	protected class InnerClass2 extends InnerClass1{

			@Override
			public String getAnotherString() {
				
				return "InnerClass2 version of getAnotherString invoked";
			}
    		
      }
	     public Class2() {
			ic= new InnerClass2();
		}
		public static void main(String[]args) {
			Class2 c2 = new Class2();
			c2.displayStrings();
			
		}
    	
    }
}
