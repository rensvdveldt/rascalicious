package test_project;


public class Cars {

    public String brand = null;
    public String model = null;
    public String color = null;
    

    public Cars() {
    	HelloWorld h = new HelloWorld();
    	h.count("thest");
    	time += System.currentTimeMillis();
        System.out.println( "  Test time: " + time + " ms");
        st.execute("drop procedure sp_"+tableName);
        st.close();
        pr.close();
    }
    
    public void main() {
        int a = 11;
        int b = 6;
        int c = 4;

        
     }

    public Cars(String theBrand, String theModel, String theColor) {
        this.brand = theBrand;
        this.model = theModel;
        this.color = theColor;
    }
    
    public class HelloWorld {
    	
    	public String s = "Test";
    	
    	public void count(String arg) {
        	int counter = 0;
        	int size = arg.length();
        	
        	for(int i = 0; i < size; i++)
        	{
        		counter ++;
        		time += System.currentTimeMillis();
                System.out.println( "  Test time: " + time + " ms");
                st.execute("drop procedure sp_"+tableName);
                st.close();
                pr.close();
        	}
        	
        	// TEST MOOI
        	
        	System.out.println(counter);
        }  
        
    	public int minFunction(int n1, int n2) {
    	   int min = 1;
    	   if (n1 > n2)
    	      min = n2;    	   
    	   if (n1 > n2)
     	      min = n2;
    	   if (n1 > n2)
      	      min = n2;
    	   if (n1 > n2)
      	      min = n2;
   
    	   return min; 
    	}
    }

}