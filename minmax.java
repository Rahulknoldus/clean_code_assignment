public class minmax {
    
//class decleration
        static class C {
    
    private int min;//min=minimum value
    private int max;//max=maximum value 
    }
    //function decleration 
    static C sort(int arr[], int n) {
    C c = new C();
    int i;
    
    if (n == 1) {
    c.max = arr[0];
    c.min = arr[0];
    return c;
    }
    //camparing elements 
    if (arr[0] > arr[1]) {
    c.max = arr[0];
    c.min = arr[1];
    } else {
    c.max = arr[1];
    c.min = arr[0];
    }
    
    for (i = 2; i < n; i++) {
    if (arr[i] > c.max) {
    c.max = arr[i];
    } else if (arr[i] < c.min) {
    c.min = arr[i];
    }
    }
    
    return c;
    }
    // Main driver method
    public static void main(String args[]){
    // Custom input array
    int arr[] = {1000, 11, 445, 1, 330, 3000};
    //len=length
    int len = 6;
    // call function sort over to above array
            // by passing the array as an argument with length
    C c = sort(arr, len);
    //print minimum and maximum element in given array
    System.out.printf("\nmin is %d", c.min);
    System.out.printf("\nmax is %d", c.max);
    }
    }
