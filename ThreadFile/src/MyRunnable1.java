public class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            FileUtility.writeTextByBuffer("salam \n", "threadcommon.txt");
            if(i==99){
                FileUtility.writeTextByBuffer(Long.toString(System.nanoTime()), "threadcommon.txt");
            }
            //FileUtility.writeTextToFile("salam", "threadcommon.txt");
        }

    }
}
