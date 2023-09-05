public class Mountain {

    /** @param array an array of positive integer values
     * @param stop the last index to check
     * Precondition: 0 <= stop < array.length
     * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
     *         false otherwise
     */

    public static boolean isIncreasing(int[] array, int stop) {
        for(int j=0; j<stop; j++){
            if(array[j]>=array[j+1]) return false;
        }
        return true;
    }

    /** @param array an array of positive integer values
     * @param start the first index to check
     * Precondition: 0 <= start < array.length - 1
     * @return true if for each j such that start <= j < array.length - 1,
     * array[j] > array[j + 1];
     *         false otherwise
     */

    public static boolean isDecreasing(int[] array, int start) {
        // To be implemented.
        for(int j=start; j<array.length - 1; j++){
            if(array[j]<=array[j+1]) return false;
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        // To be implemented.
        for(int j=1; j<array.length-1; j++){
            if(array[j-1]<array[j] && array[j+1]<array[j]) return j;
        }
        return -1;
    }

    public static boolean isMountain(int[] array) {
        if(getPeakIndex(array)==-1){
            return false;
        }
        int i = getPeakIndex(array);
        if(isIncreasing(array, i) && isDecreasing(array, i+1)){
            return true;
        }
        return false;
    }
}