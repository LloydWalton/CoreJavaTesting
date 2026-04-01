package arrays;

public class ArrayObjectsMain {

	public static void main(String[] args) {
		ArrayObjects obj1=new ArrayObjects();
		obj1.name="Lloyd Walton";
		obj1.age =36;
		obj1.marks=66;
		
		ArrayObjects obj2=new ArrayObjects();
		obj2.name="Zack";
		obj2.age =35;
		obj2.marks=99;
		
		ArrayObjects obj3=new ArrayObjects();
		obj3.name="Vian Rayden";
		obj3.age =5;
		obj3.marks=100;

		ArrayObjects objects[]=new ArrayObjects[3];
		
		objects[0]=obj1;
		objects[1]=obj2;
		objects[2]=obj3;
		
		for (int i=0;i<objects.length;i++)
		{
			System.out.println(objects[i].name);
			System.out.println(objects[i].age);
			System.out.println(objects[i].marks);
			System.out.println("******************");
		}
		
		
		for (ArrayObjects n:objects)
		{
			System.out.println(n.name);
			System.out.println(n.age);
			System.out.println(n.marks);
		}
		
		
	}

}
