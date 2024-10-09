public class SmallestNo {
    public static void main(String[] args) {
        int[] nos = {2, 4, 6, 8, 10, 12};
        int smallest = nos[0];
        for (int i=1; i<nos.length; i++){
            if(nos[i]>smallest){
                smallest=nos[i];
            }
        }
        System.out.println(" Largest is " + smallest);
    }
}
