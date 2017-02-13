package zhongqiu.spring_springmvc_mybatis_demo.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.BeforeClass;

public class Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@org.junit.Test
	//服务器保存文件，文件名唯一
	public void test() {
		String newFileName = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		System.out.println(sdf);
		newFileName = sdf.format(new Date());
		System.out.println(newFileName);

		Random r = new Random();
		// for(int i=0;i<10;i++)
		// {
		// System.out.println(r.nextInt(10));
		// }
		for (int i = 0; i < 3; i++) {
			newFileName = newFileName + r.nextInt(10);
			System.out.println(newFileName);
		}
	}

}
