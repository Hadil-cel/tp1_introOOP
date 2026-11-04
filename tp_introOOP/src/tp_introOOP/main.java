package tp_introOOP;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 =new Student();
		student1.name ="ahmed";
		student1.id =20026001;
		student1.major ="artificial intelligent";
		
		
		Student student2 =new Student();
		student2.name ="sara";
		student2.id =20026002;
		student2.major ="cybersecurity";
		
		
		Student Student3 =new Student();
		Student3.name ="hadil";
		Student3.id =2006;
		Student3.major ="coputer enginnering";
		Student3.email="hadil@gmail.com";
		
		student1.displayInfo();
		student2.displayInfo();
		Student3.displayInfo();
		
		

	}

}
