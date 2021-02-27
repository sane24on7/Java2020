package java2.hw5;

import java.util.Arrays;

public class TestArray {
    private static final int size = 10000000;
    private static final int h= size/2;
    private  Float[] myArray = new Float[size];


    public TestArray() {
        Arrays.fill(myArray, 1f);
    }

    public Float[] doCalculations (){
        for (int i=0; i< myArray.length; i++){
              myArray[i]=(float)(myArray[i]*Math.sin(0.2f+ i / 5f)*Math.cos(0.2f+i / 5f)*Math.cos(0.4f+i / 2f));
        }
        return myArray;
    }

    public  Float[] doThreadCalculations (){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                firstThreadCalculations();
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                secondThreadCalculations();
            }
        });
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myArray;
    }

    public Float[] doThreadCalculationsOpt (){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                firstThreadCalculationsOpt();
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                secondThreadCalculationsOpt();
            }
        });
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myArray;
    }


    private   void firstThreadCalculations (){
                Float[] firstPart= new Float[h];
                System.arraycopy(myArray,0, firstPart, 0, h);
                for (int i=0; i< firstPart.length; i++){
                    firstPart[i]=(float)(firstPart[i]*Math.sin(0.2f+ i / 5f)*Math.cos(0.2f+i / 5f)*Math.cos(0.4f+i / 2f));
                }
                System.arraycopy(firstPart,0, myArray, 0, h);
    }

    private  void secondThreadCalculations (){
                Float[] secondPart= new Float[h];
                System.arraycopy(myArray,h, secondPart, 0, h);
                for (int i=0; i< secondPart.length; i++){
                    secondPart[i]=(float)(secondPart[i]*Math.sin(0.2f+ i / 5f)*Math.cos(0.2f+i / 5f)*Math.cos(0.4f+i / 2f));
                }
                System.arraycopy(secondPart,0, myArray, h, h);
    }


    private  void firstThreadCalculationsOpt (){
  //              float[] firstPart= new float[h];
  //              System.arraycopy(myArray,0, firstPart, 0, h);
                for (int i=0; i< myArray.length/2; i++){
                    myArray[i]=(float)(myArray[i]*Math.sin(0.2f+ i / 5f)*Math.cos(0.2f+i / 5f)*Math.cos(0.4f+i / 2f));
                }
  //              System.arraycopy(firstPart,0, myArray, 0, h);
    }

    private  void secondThreadCalculationsOpt (){
//                float[] secondPart= new float[h];
//                System.arraycopy(myArray,h, secondPart, 0, h);
                for (int i=myArray.length/2; i< myArray.length; i++){
                    myArray[i]=(float)(myArray[i]*Math.sin(0.2f+ i / 5f)*Math.cos(0.2f+i / 5f)*Math.cos(0.4f+i / 2f));
                }
//                System.arraycopy(secondPart,0, myArray, h, h);
    }

}
