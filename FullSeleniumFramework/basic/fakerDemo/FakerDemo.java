/* 
 * This class is showing about Faker library to create test data from library
 * Every run it will bring a different set of data
 */

package fakerDemo;

import com.github.javafaker.Faker;

public class FakerDemo {

	public static void main(String[] args) {
		Faker fake = new Faker();
		String city = fake.address().city();
		
		System.out.println(city);
		
		String currency = fake.country().currency();

		System.out.println(currency);
	}

}
