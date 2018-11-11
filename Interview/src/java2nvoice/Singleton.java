package java2nvoice;

class Singleton { 
	private volatile static Singleton _instance; 
	private Singleton() { // preventing Singleton object instantiation from outside 
		} 
	
public static Singleton getInstance() {
	if (_instance == null)
	{
		_instance = new Singleton();
		}
	return _instance; 
	}


public static synchronized Singleton getInstanceTS(){
	if (_instance == null) 	{
		_instance = new Singleton();
		}
	return _instance; 
	}



public static Singleton getInstanceDC() {
	if (_instance == null) { 
		synchronized (Singleton.class) 		{
			if (_instance == null) {
				_instance = new Singleton();
				} 
			} 
		} 
	return _instance; 
	}
}

				

