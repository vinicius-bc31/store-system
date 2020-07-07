package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int x;

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.println("1.PENDING_PAYMENT");
		System.out.println("2.PROCESSING");
		System.out.println("3.SHIPPED");
		System.out.println("4.DELIVERED");
		System.out.print("Status: ");

		do {

			x = sc.nextInt();

			switch (x) {
			case 1:
				OrderStatus status = OrderStatus.PENDING_PAYMENT;
				Order order = new Order(new Date(), status, client);
				System.out.print("How many items to this order? ");
				int n = sc.nextInt();

				for (int i = 1; i <= n; i++) {
					System.out.println("Enter #" + i + " item data:");
					System.out.print("Product name: ");
					sc.nextLine();
					String productName = sc.nextLine();
					System.out.print("Product price: ");
					double productPrice = sc.nextDouble();

					Product product = new Product(productName, productPrice);

					System.out.print("Quantity: ");
					int quantity = sc.nextInt();

					OrderItem orderItem = new OrderItem(quantity, productPrice, product);

					order.addItem(orderItem);

				}

				System.out.println();
				System.out.println("ORDER SUMMARY: ");
				System.out.println("-------------------------------------------------------");
				System.out.println(order);
				System.out.println("-------------------------------------------------------");

				break;
			case 2:
				status = OrderStatus.PROCESSING;
				order = new Order(new Date(), status, client);
				System.out.print("How many items to this order? ");
				n = sc.nextInt();

				for (int i = 1; i <= n; i++) {
					System.out.println("Enter #" + i + " item data:");
					System.out.print("Product name: ");
					sc.nextLine();
					String productName = sc.nextLine();
					System.out.print("Product price: ");
					double productPrice = sc.nextDouble();

					Product product = new Product(productName, productPrice);

					System.out.print("Quantity: ");
					int quantity = sc.nextInt();

					OrderItem orderItem = new OrderItem(quantity, productPrice, product);

					order.addItem(orderItem);

				}

				System.out.println();
				System.out.println("ORDER SUMMARY: ");
				System.out.println("-------------------------------------------------------");
				System.out.println(order);
				System.out.println("-------------------------------------------------------");

				break;
			case 3:
				status = OrderStatus.SHIPPED;
				order = new Order(new Date(), status, client);
				System.out.print("How many items to this order? ");
				n = sc.nextInt();

				for (int i = 1; i <= n; i++) {
					System.out.println("Enter #" + i + " item data:");
					System.out.print("Product name: ");
					sc.nextLine();
					String productName = sc.nextLine();
					System.out.print("Product price: ");
					double productPrice = sc.nextDouble();

					Product product = new Product(productName, productPrice);

					System.out.print("Quantity: ");
					int quantity = sc.nextInt();

					OrderItem orderItem = new OrderItem(quantity, productPrice, product);

					order.addItem(orderItem);

				}

				System.out.println();
				System.out.println("ORDER SUMMARY: ");
				System.out.println("-------------------------------------------------------");
				System.out.println(order);
				System.out.println("-------------------------------------------------------");

				break;
			case 4:
				status = OrderStatus.DELIVERED;
				order = new Order(new Date(), status, client);
				System.out.print("How many items to this order? ");
				n = sc.nextInt();

				for (int i = 1; i <= n; i++) {
					System.out.println("Enter #" + i + " item data:");
					System.out.print("Product name: ");
					sc.nextLine();
					String productName = sc.nextLine();
					System.out.print("Product price: ");
					double productPrice = sc.nextDouble();

					Product product = new Product(productName, productPrice);

					System.out.print("Quantity: ");
					int quantity = sc.nextInt();

					OrderItem orderItem = new OrderItem(quantity, productPrice, product);

					order.addItem(orderItem);

				}

				System.out.println();
				System.out.println("ORDER SUMMARY: ");
				System.out.println("-------------------------------------------------------");
				System.out.println(order);
				System.out.println("-------------------------------------------------------");

				break;
			default:
				System.out.println("-------------------------------------------------------");
				System.out.println("COMANDO INVALIDO!");
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter order data: ");
				System.out.println("1.PENDING_PAYMENT");
				System.out.println("2.PROCESSING");
				System.out.println("3.SHIPPED");
				System.out.println("4.DELIVERED");
				System.out.print("Status: ");
				break;
			}

		} while (x != 1 && x != 2 && x != 3 && x != 4);

		sc.close();
	}

}
