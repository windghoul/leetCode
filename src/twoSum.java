import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by b5263 on 2017/7/11.
 */
public class twoSum {
    public void twoSum(){
        Scanner scanner = new Scanner(System.in);
        String numString = scanner.nextLine();
        String[] c = numString.split("\\D+");
//        System.out.println(Arrays.toString(c));
//        for (int i = 0; i < c.length; i++)
//            System.out.println(c[i]);
        System.out.println(c.length);
        int[] nums = new int[c.length-2] ;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(c[i+1]);
        }
//        System.out.println(Arrays.toString(nums));

        int[] arryNum = new int[2];
        int array = scanner.nextInt();
        for (int i = 0; i < nums.length; i++) {
            int k = Arrays.binarySearch(nums, (array - nums[i]));
            if (k >= 0)
            {
                arryNum[0] = i;
                arryNum[1] = k;
                System.out.println( Arrays.toString(arryNum));

                break;
            }
            else {
//                System.out.println("error");
//                break;
                continue;
            }
        }

    }
    public int[] twoSum(int[] nums, int target) {
        int[] middleNum = new int[2];
        int tar = 0;
        int[] arrayNum = new int[2];
        int[] beforeNums = new int[nums.length];
        int array = target;
        System.arraycopy(nums,0,beforeNums,0,nums.length);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int k = Arrays.binarySearch(nums, (array - nums[i]));
            if (k >= 0 && i != k)
            {
                middleNum[0] = nums[i];
                middleNum[1] = nums[k];
                break;
            }
            else {
                continue;
            }
        }
        for (int i = 0; i <beforeNums.length ; i++) {
            if (beforeNums[i] == middleNum[0] || beforeNums[i] == middleNum[1])
                arrayNum[tar++] = i;

        }

        return arrayNum;

    }
}
