import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DeserializeTest{ 
	@Test
    public void bytesToLongTest(){
		SerializeDeserialize sd = new SerializeDeserialize();
		byte tempBuffer[]=new byte[500];
		long l=5;
		for (int i = 7; i >= 0; i--) {
            tempBuffer[i] = (byte)(l & 0xFF);
            l >>= 8;
        }
		long num = sd.bytesToLong(tempBuffer);
			
		assertEquals(5,num);        
    }
}