

public class Singlotonclass2 {
static Singlotonclass2 ys;
  private  Singlotonclass2() {
}
  static Singlotonclass2 getobjofsinglton()
  {
	  if(ys== null)
	  {
		  synchronized (Singleton.class) {
			if(ys==null)
			{
		ys	=new Singleton();
			}
		}
	  }  
		
	  
	  return ys;
  }
  
}
