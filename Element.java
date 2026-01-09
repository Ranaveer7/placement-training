class Element{
    public static void main(String[]args){
        int[]arr={1,2,7,9,6,5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }System.out.println("the max elements is"+max);
    }
}