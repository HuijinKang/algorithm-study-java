package study;

public class BinarySearch {
    public static boolean BSearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < n) {
                left = mid + 1;
            }
            else if (arr[mid] > n) {
                right = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static boolean BSearchRecursive(int[] arr, int n, int left, int right) {
        if(left > right) return false;

        int mid = (left + right) / 2;

        if (arr[mid] < n)
            return BSearchRecursive(arr, n, mid +1, right);
        else if (arr[mid] > n)
            return BSearchRecursive(arr, n, left, mid - 1);
        else
            return true;

    }
}
