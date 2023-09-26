class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int m=0;
         Arrays.sort(seats);
         Arrays.sort(students);
         for(int i=0;i<students.length;i++){
             m=m+Math.abs(seats[i]-students[i]);
         }
         return m;
    }
}
