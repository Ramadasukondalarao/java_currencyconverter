package projects;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new  Scanner(System.in);
		 System.out.println("Currency Converter");
		 System.out.println("1. USD (US Dollar)");
		 System.out.println("2. EUR (Euro)");
		 System.out.println("3. GBP (British Pound)");
		 System.out.println("4. JPY (Japanese Yen)");
		 System.out.println("5. INR (Indian Rupee)");
		 System.out.print("Enter the source currency (1-5): ");
		 int sourceCurrency = scanner.nextInt();
		 System.out.print("Enter the amount to convert: ");
		 double amount = scanner.nextDouble();
		 System.out.print("Enter the target currency (1-5): ");
		 int targetCurrency = scanner.nextInt();
		 double result = convertCurrency(sourceCurrency,targetCurrency, amount);
		 System.out.println(amount + " in currency " + sourceCurrency+ " is equal to " + result + " in currency " + targetCurrency);
		 }
		 // Method to convert currency
		 public static double convertCurrency(int sourceCurrency, int targetCurrency, double amount) {
		 double sourceRate = getExchangeRate(sourceCurrency);
		 double targetRate = getExchangeRate(targetCurrency);
		 // Convert the amount to USD first, then to the target currency
		 double amountInUSD = amount / sourceRate;
		 double result = amountInUSD * targetRate;
		 return result;
		 }
		 // Method to get exchange rate
		 public static double getExchangeRate(int currencyCode) {
		 switch (currencyCode) {
		 case 1: // USD
		 return 1.0;
		 case 2: // EUR
		 return 0.85;
		 case 3: // GBP
		 return 0.73;
		 case 4: // JPY
		 return 112.26;
		 case 5: // INR
		 return 74.39;
		 default:
		 throw new IllegalArgumentException("Invalid currencycode");
      }
   }
}


	
