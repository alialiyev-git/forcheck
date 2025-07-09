public class MyRunnable2 implements Runnable{
    @Override
    public void run(){
        for (int i =0;i<100;i++) {
                FileUtility.writeTextByBuffer("sag ol \n", "threadcommon.txt");
            if(i==99){
                FileUtility.writeTextByBuffer(Long.toString(System.nanoTime()), "threadcommon.txt");
            }
           // FileUtility.writeTextToFile("sag ol", "threadcommon.txt");
        }
    }
}
