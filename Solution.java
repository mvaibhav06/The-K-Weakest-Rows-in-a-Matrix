class Solution {
    // 3 1 4 2 0
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] temp = new int[mat.length];
        for(int i=0; i<mat.length; i++){
            int sum = 0;
            int j = 0;
            for(j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    sum++;
                }else{
                    temp[i] = sum;
                    break;
                }
            }
            if(j == mat[i].length){
                temp[i] = sum;
            }
        }

        int[][] matrix = new int[temp.length][2];
        for(int i=0; i<temp.length; i++){
            matrix[i][0] = temp[i];
            matrix[i][1] = i;
        }

        Arrays.sort(matrix, (a,b)-> Integer.compare(a[0],b[0]));
        int[] nums = new int[k];
        for(int i=0; i<k; i++){
            nums[i] = matrix[i][1];
        }
        return nums;
    }
}
