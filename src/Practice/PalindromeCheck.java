package Practice;

public class PalindromeCheck {
        public static void main(String[] args) {
            int[] sortedArray = { 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 6 };

            int newSize = removeDuplicates(sortedArray);

            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < newSize; i++) {
                System.out.print(sortedArray[i] + " ");
            }
        }

        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            System.out.println("Git reference");

            int uniqueIndex = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[uniqueIndex]) {
                    uniqueIndex++;
                    nums[uniqueIndex] = nums[i];
                }
            }

            return uniqueIndex + 1;
        }


}
