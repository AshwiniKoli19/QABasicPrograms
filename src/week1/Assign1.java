package week1;

public class Assign1 {

	/* Question 3
	 * public static<T> void print(T[] a) { for (T t:a) { System.out.printf("%s",t);
	 * } }
	 */
	
	
	/* Question 7
	 * static void demo(int ... v) { for (int i :v) { System.out.print(i+" "); } }
	 */
	
	public static void main(String[] args)
	{
		/* Question 3
		 * Integer[] a= {1,2,3,4,5}; print(a);
		 */
		/* Question 7
		 * demo(1,2,3); demo(); // demo("a");
		 */	
	
		Demo<Integer> i = new Demo<Integer>(5);
		System.out.println(i.DemoMeth());
		
		Demo<Double> d = new Demo<Double>(14.6);
		System.out.println(d.DemoMeth());
	
	}

}


class Demo<T>
{
	T t;
	
	Demo(T t)
	{
		this.t = t;
	}
	
	public T DemoMeth()
	{
		return this.t;		
	}
	
}
