public class Lt2011 {
    public static void main(String[] args) {
        String[] operations={"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int res=0;

        for(int i=0; i< operations.length; i++){
            if(operations[i].charAt(1)== '+'){
                res++;
            }else {
                res--;
            }
        }

        return res;
    }
}
