public class Q4
{
   public static void main (String[] args){
       int[][] ratings = { {4,6,2,5},{7,9,4,8},{6,9,3,7} };
    hardestRater2018(ratings);
    }
   public static int hardestRater2018(int[][] ratings){
     int hardestReviewer=0; // default
     double lowestAvg=10;
     //loop through the reviewers to get the average rating and compare
     for(int j=0;j<ratings.length;j++){
         // this part gets you a particular review's average rating
      int total=0;   
        for(int i=0; i<ratings[0].length;i++){
        total+=ratings[hardestReviewer][i];   
    }
     double avg=total/ratings[0].length;     
   //if the calculated average is lower than the currently stored lowest the currently stored lowest average, we find a harder reviewer
if(avg<lowestAvg){
    lowestAvg=avg;
    hardestReviewer=j;
}
}
return hardestReviewer;
}
}






