import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SerializeTest{ 
	@Test
    public void longToBytesTest(){
		SerializeDeserialize sd = new SerializeDeserialize();
		byte tempBuffer[]=new byte[500];
		long l=5;
		for (int i = 7; i >= 0; i--) {
            tempBuffer[i] = (byte)(l & 0xFF);
            l >>= 8;
        }
		byte buffer[]=new byte[500];
		buffer=sd.longToBytes(5,buffer);
		long number1=sd.bytesToLong(buffer);
		long number2=sd.bytesToLong(tempBuffer);
		assertEquals(number1,number2);        
    }
}