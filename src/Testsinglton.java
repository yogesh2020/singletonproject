
public class Testsinglton
{
	 Singltonclass obj1 = Singltonclass.getclassobj(); 
	/* Singltonclass obj7 = new Singltonclass(); */

	public static void main(String[] args) 
	{
		/* Singltonclass obj5 = new Singltonclass(); */
		
		  Singltonclass obj2 = Singltonclass.getclassobj();
        System.out.println(obj2);       
        
      Singltonclass obj3 = Singltonclass.getclassobj();
      System.out.println(obj3);
	}

}
