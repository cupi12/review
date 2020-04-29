package stream;
/*
 * ___Stream == byte단위로 읽음
 * ___Reader == char단위로 읽음
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {
	public static void main(String[] args) throws IOException {
		// bufferTest();
		// DataType filter(보조스트림)
//		dataInput();
//		dataOutput();

//		writerTest();
//		readTest();
	
		textFileCopy();
		streamFileCopy();
	}
	public static void streamFileCopy() throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(new File("Koala.jpg")));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(new File("국화2.jpg")));
		int size;
		byte[] b = new byte[1000];
		while((size =fis.read(b))!=-1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}
	
	public static void textFileCopy() throws IOException {
		FileReader fr = new FileReader(new File("memo.test")); //char단위로 넣음
		BufferedReader br = new BufferedReader(fr); 
		
		FileWriter fw = new FileWriter(new File("memo_copy.test")); //char단위로 넣음
		BufferedWriter bw = new BufferedWriter(fw);
		String s1;
		while( (s1 = br.readLine()) != null) {
			bw.write(s1);
		}		
		br.close();
		bw.close();
		System.out.println(s1);
	}//end of textFileCopy()
	
	public static void writerTest() throws IOException {
		FileWriter fw = new FileWriter(new File("memo.test")); //char단위로 넣음
		BufferedWriter bw = new BufferedWriter(fw); //속도
		fw.write("hello");
		fw.write(" everybody");
		fw.write("\n집에 가고싶다");
		bw.close();
	}
	
	public static void readTest() throws IOException {
		FileReader fr = new FileReader(new File("memo.test")); //char단위로 넣음
		BufferedReader br = new BufferedReader(fr); //속도
		String s1;
		while( (s1 = br.readLine()) != null) {
			System.out.println(s1);
		}		
		br.close();
		System.out.println(s1);
	}


	public static void dataOutput() throws IOException {
		// 123 -> 1 2 3 (byte단위로 분리) -> 바이트 값을 File에다가 써줌
		DataOutputStream fos = new DataOutputStream(new FileOutputStream(new File("b.txt")));// fos에는 byte밖에 못옴
		fos.writeInt(100);
		fos.writeDouble(95.5);
		fos.close();
	}// end of dataOutput()

	public static void dataInput() throws IOException {
		// System.in : 키보드 입력 1byte 단위로 읽어줌
		DataInputStream dis = new DataInputStream(new FileInputStream(new File("b.txt")));
		int score = dis.readInt();
		double avg = dis.readDouble();

		System.out.println("성적 : " + score + ", 평균 : " + avg);
	}// end of dataTypeInput()

	public static void bufferTest() throws IOException {
		BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
		// Stream에 Reader를 끼워서 필터해줌 (System.in)1byte -> 2byte로 바뀐다 (inputStreamreader)
		// 2byte -> String으로 변환, (BufferedReader)
		String a = isr.readLine();
		System.out.println(a);
	}

}
