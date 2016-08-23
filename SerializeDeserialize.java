/*
* This class is to record what user says add header to the packet.
* Serializing is also done here.
*/

import java.io.ByteArrayOutputStream;
import java.net.* ;

public class SerializeDeserialize extends Thread{
	
    //get the sequence number from the packet. deserialising
    public long bytesToLong(byte[] tempBuffer) {
		
        long value=0;
            for (int i = 0; i <8; i++)
            {
               value = (value << 8) + (tempBuffer[i] & 0xff);
            }
            return value;
    }
	
    //Serializing the array. add sequence number to first 8 bytes.(header)
    public byte[] longToBytes(long l,byte [] buffer) {
        for (int i = 7; i >= 0; i--) {
            buffer[i] = (byte)(l & 0xFF);
            l >>= 8;
        }
        return buffer;
    }

}