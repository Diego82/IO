package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;

public class ImputStreamBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "esto es una frase";
		StringBufferInputStream in1 = new StringBufferInputStream(frase);
		int c = in1.read();
		System.out.println(c);
		while ((c=in1.read())!= -1) {
			System.out.println(c+" "+(char)c);			
		}
		try {
			in1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//forma larga
		String frase2 = "esto";
		StringBufferInputStream in2 = new StringBufferInputStream(frase2);
		int c2;
		c2=in2.read(); System.out.println(c2+" "+(char)c2);
		c2=in2.read(); System.out.println(c2+" "+(char)c2);
		c2=in2.read(); System.out.println(c2+" "+(char)c2);
		c2=in2.read(); System.out.println(c2+" "+(char)c2);
		c2=in2.read(); System.out.println(c2+" "+(char)c2);
		
		String frase3 = "esto es una ñ";
		byte[] arrayBytes = frase3.getBytes();
		System.out.println(arrayBytes[0]+" "+(char) arrayBytes[0]);
		ByteArrayInputStream in3 = new ByteArrayInputStream(arrayBytes,2,10000);
		while ((c=in3.read())!= -1) {
			System.out.println(c+" "+(char)c);			
		}
		try {
			in1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
