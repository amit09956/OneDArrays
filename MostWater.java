//package OneDArray;



public class MostWater {
    public static  int maxArea(int[] height) {// Two pointer aproach
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left<right){
            int w=right-left;
            int h=Math.min(height[left],height[right]);
            int area=w*h;
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}

