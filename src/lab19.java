
public class lab19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	MyLinkedList mySpecialLinkedList = new MyLinkedList();
		mySpecialLinkedList.addAtEnd("A");
		mySpecialLinkedList.addAtEnd("B");
		mySpecialLinkedList.addAtEnd("C");
		System.out.println(mySpecialLinkedList.toString());
		mySpecialLinkedList.removeAt(1);
		System.out.println(mySpecialLinkedList.toString());
		System.out.println(mySpecialLinkedList.removeAt(1));
		System.out.println(mySpecialLinkedList.insertAt(0));
	*/	int array[] = {1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10}; 
        int array2[] = new int [10];
	
		int i = 0;
		int temp = 0;
        
        for(i = 0; i < array.length; i++){
            temp = array[i];
            array2[temp]++;
        }  
        
       // System.out.println(array2);
        
        for(i=1; i < array2.length; i++){

            if(array2[i] > 0 && array2[i] == 1){
             System.out.printf("%d occurs %d time\n",i, array2[i]);
             }
            else if(array2[i] >=2){
                System.out.printf("%d occurs %d times\n",i, array2[i]);
            }
        }
      //  System.out.println(frequency(a, n, x));
		//int a[] 
	}
	
}
