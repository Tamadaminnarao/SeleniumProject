package programs;

 abstract class sample {
	 abstract void print();
	 
 }
 
abstract public class AbstractSample extends sample {
	
	AbstractSample(){
		
	}
    abstract void run();  
    void print() {
    	System.out.println("hey");
    }
public static void main(String[] args) {
	
	AbstractSample.print();
}

}


  class Honda4 extends AbstractSample{

	@Override
	void run() {
		// TODO Auto-generated method stub
		Honda4 obj = new Honda4();
		obj.run();
		
		
	}  
//  void run(){System.out.println("running safely");}  
//  public static void main(String args[]){  
//   Bike obj = new Honda4();  
//   obj.run();  
//  }  
  }  
