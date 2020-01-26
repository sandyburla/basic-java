package Practise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateClass {

	public static void main(String[] args) {
		SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
		Long max =0L;
        Long min =100000000000L;
		Random rnd = new Random();
		Long randomLong=(rnd.nextLong() % (max - min)) + min;
        Date dt =new Date(randomLong);		
        System.out.println(spf.format(dt));
	}

}
