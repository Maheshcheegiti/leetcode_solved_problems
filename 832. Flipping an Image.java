class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i =0; i<image.length;i++){
            int f = 0;
            if(image[i].length%2==1) f=1;
            for(int j = 0; j<(image[i].length/2)+f;j++){
                int t = image[i][j];
                System.out.println(i+" "+j+" "+(image[i].length-j-1));
                image[i][j] = image[i][image[i].length-j-1]^1;
                image[i][image[i].length-j-1] = t^1;
            }
        }
        return image;
    }
}
