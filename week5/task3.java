import java.uitl.*;
class task3{
    public static List<Integer> maxSubarray(List<Integer> arr) {
    int maxCont = arr.get(0);
    int curr = arr.get(0);
    int maxNonCont = 0;
    int maxElement = arr.get(0);

    for (int i = 0; i < arr.size(); i++) {
        int val = arr.get(i);
        
        // Non-contiguous
        if (val > 0) maxNonCont += val;
        
        maxElement = Math.max(maxElement, val);
        
        // Kadane
        if (i > 0) {
            curr = Math.max(val, curr + val);
            maxCont = Math.max(maxCont, curr);
        }
    }

    if (maxNonCont == 0) maxNonCont = maxElement;

    return Arrays.asList(maxCont, maxNonCont);
}
}