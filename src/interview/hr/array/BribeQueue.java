package interview.hr.array;

public class BribeQueue {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	
    	for(int i=0;i<q.length;i++){
            if((q[i] - (i+1)) > 2){
                System.out.println("Too chaotic");
                return; 
            }
        }
         
        int swaps=0;
        for(int i=0;i< q.length;i++){
            for(int j=i+1;j<q.length;j++){
                if(q[i] > q[j]){ 
                    int tmp=q[j];
                    q[j]=q[i];
                    q[i]=tmp;
                    swaps++;
                }
            }
        }
        
        System.out.println(swaps);
    
    }


    public static void main(String[] args) {
    		
    	int[] q = {2, 1, 5, 3, 4};
    	BribeQueue.minimumBribes(q);

   }
}