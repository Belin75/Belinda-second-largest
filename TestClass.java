class SecondLargest{
	public int findSecondLargest(int[] arr){
		for(int j = 0;j < 2;j++){
			for(int i = j + 1;i < arr.length;i++)		
			if(arr[j]>arr[i]){
			continue;
			}
			else{
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			}
			}
		    return arr[1];
			}
}
public class TestClass{
	public static void main(String args[]){
		int result = 0;
		int[] arr = new int[5];
		arr = new int[]{9, 3, 10, 1 ,7};
		SecondLargest obj = new SecondLargest();
		result = obj.findSecondLargest(arr);
		System.out.println("The secondLargest number in a array : " + result);
		}
}