package lt.ronaldas.tasks.test01;

import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;

public class JavaVersija {

	public static void main(String[] args) {

		Function<String, String> upper = str -> str.toUpperCase();
		
		double[] arr = {34.432, 234.2, 0.0 };
		
		System.out.println( StringUtils.join(arr, ':')) ;

	}

}
