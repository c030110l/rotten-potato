public class Q5
{
     public static void main (String[] args){
       int[][] ratings = { {4,6,2,5},{7,9,4,8},{6,9,3,7} };
    worstMovie2018(ratings);
    }
   public static int worstMovie2018(int[][] ratings){
     int worstMovie=0; // default
     double lowestAvg=10;
     //loop through the reviewers to get the average rating and compare
     for(int j=0;j<ratings[0].length;j++){
         // this part gets you a particular review's average rating
      int total=0;   
        for(int i=0; i<ratings.length;i++){
        total+=ratings[i][worstMovie];   
    }
     double avg=total/ratings.length;     
   //if the calculated average is lower than the currently stored lowest the currently stored lowest average, we find a harder reviewer
if(avg<lowestAvg){
    lowestAvg=avg;
    worstMovie=j;
}
}
return worstMovie;
}
}
