public class q4 {
    public static void main(String[] args) {
        int arr[] ={34,6,86,46,88};
        int target = 86;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("the element is at "+ i+" index.");
            }
        }
    }
}
