public class Search {

    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 30, 40, 50 };

        System.out.println(binarySearch(arr1, 10));
        System.out.println(binarySearch(arr1, 50));
        System.out.println(binarySearch(arr1, 30));
        System.out.println(binarySearch(arr1, 18));
    }

    private static int binarySearch(int[] numbers, int target) {

        int min = 0;
        int max = numbers.length - 1;

        while (min <= max) {

            int middle = (min + max) / 2;
            int middleNumber = numbers[middle];

            if (target < middleNumber) {

                max = middle - 1;

            } else if (target > middleNumber) {
                min = middle + 1;
            } else {
                return middle;
            }

        }
        return -1;

    }

private static int linearSearch(int[]numbers,int target){

for();



    
}

}
