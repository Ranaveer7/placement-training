class Binarysearch{
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6,7,8};
        int key=8;
        int low=0;
        int high=arr.length-1;
        boolean found=false;
        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]==key){
                System.out.println("element found at index"+arr[mid]);
                found=true;
            }
            else if(arr[mid]<key){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }if(!found){
            System.out.println("not found");
        }
    }
}