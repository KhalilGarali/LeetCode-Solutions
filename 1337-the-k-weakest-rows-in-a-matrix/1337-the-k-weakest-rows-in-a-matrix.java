class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> list = new ArrayList<>();
        int[] weakestRows = new int[k];
        int soldiers=0;
        for(int i=0;i<mat.length;i++){
            soldiers =0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1) soldiers++;
            }
             list.add(soldiers);
        }
        for(int i=0;i<k;i++){
            int min = list.indexOf(Collections.min(list));
            list.set(min, Integer.MAX_VALUE);
            weakestRows[i]=min;
        }
        return weakestRows;
    }
}