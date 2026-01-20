package leetcode;

public class MaxSumOfMatrix {
	public static void main(String[] args) {
		int[][]mat= {
				{1,-1},
				{-1,1}
		};
		maxMatrixSum(mat);
	}
	public static long maxMatrixSum(int[][] matrix) {
        int large=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<0 ){
                    large=Math.min(large, matrix[i][j]);
                }
                sum+=matrix[i][j];
            }
        }
        if(large==Integer.MAX_VALUE) {
        	return sum;
        }
       return sum;
    }
}
