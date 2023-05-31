package preparation3;

import java.io.IOException;

public class ThrowMain{
    static void wakeupexception() throws IOException{
        throw new IOException();
    }
    public static void main(String [] args){
        try{
        	wakeupexception();
        }catch(IOException e){
            //発生させたエラー処理
        	e.printStackTrace();
        }
    } 
}