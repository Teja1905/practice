package abstract2;

abstract public class Object {
abstract public void comein();
static public  Object getObject(int option) {
	
	Object obj =null;
	
	if (option==1) {
		obj = new Person();
		}
		
		else if(option==2) {
			obj = new Dog();
		}
	
 return obj();
}
private static Object obj() {
	// TODO Auto-generated method stub
	return null;
}

}


