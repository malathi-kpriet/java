public class Method{
	int a=10;
	static void MyMethod(){	
		System.out.println("This is my method");
	
}
public static void main(String[] args){
	Method MyObj=new Method();   //Oject creation
	System.out.println(MyObj.a);  // accessing value of a using object
	MyObj.MyMethod();    //to call the method/funtion
}
}



