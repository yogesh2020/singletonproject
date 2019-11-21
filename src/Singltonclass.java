
// final class he phir bhi access ho raha he bcz same package me he
/*final*/ public class Singltonclass   //final or private constructor same he dono..
{
	/* private static volatile Singleton sc; */  // right he
		static Singltonclass sc = null;
	
	private Singltonclass() {

	}
	//here we use setter getter method not package.bcz private ko pahle hmne use kr liya he here..
	public static Singltonclass getclassobj()
	{		
		if(sc == null)
		{
	sc	= new Singltonclass();
		return sc;
		}
		
		else {
			return sc;
		}
	}	
}

 