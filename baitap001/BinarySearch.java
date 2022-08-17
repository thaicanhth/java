package baitap001;

public class BinarySearch {
    int BinarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l +(r - l) /2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return BinarySearch(arr,l, mid -1, x);
            return BinarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[]={1, 2, 3, 4, 5};
        int n =arr.length;
        int x = 4;
        int result = ob.BinarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("phần tử không tồn tại");
        else
            System.out.println("phần tử được tìm thấy ví trí: " +result);
    }
}
