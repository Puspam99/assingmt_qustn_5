public class assingment_Q2 {
    public static int countCompleteRows(int n) {
        int rowCount = 0;
        int sum = 0;
        
        while (sum <= n) {
            rowCount++;
            sum += rowCount;
        }
        
        return rowCount - 1;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = countCompleteRows(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
