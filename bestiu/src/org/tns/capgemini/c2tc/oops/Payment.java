package org.tns.capgemini.c2tc.oops;

	
		import java.util.Scanner;

		class TicketBooking {
		    private String eventName;
		    private double ticketPrice;
		    private String customerName;
		    private String paymentMethod;
		    private double amountPaid;

		    // Constructor
		    public TicketBooking(String eventName, double ticketPrice) {
		        this.eventName = eventName;
		        this.ticketPrice = ticketPrice;
		    }

		    // Method to book a ticket
		    public void bookTicket() {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter customer name: ");
		        customerName = scanner.nextLine();

		        System.out.printf("Ticket price is %.2f. Enter amount to pay: ", ticketPrice);
		        amountPaid = scanner.nextDouble();
		        
		        while (amountPaid < ticketPrice) {
		            System.out.println("Amount must be at least the ticket price.");
		            System.out.printf("Enter amount to pay: ");
		            amountPaid = scanner.nextDouble();
		        }

		        System.out.println("\nSelect payment method:");
		        System.out.println("1. Cash");
		        System.out.println("2. Online Wallet");
		        System.out.println("3. Credit Card");
		        
		        System.out.print("Enter choice (1/2/3): ");
		        int choice = scanner.nextInt();
		        scanner.nextLine();  // Consume newline left-over

		        switch (choice) {
		            case 1:
		                makePaymentCash(amountPaid);
		                break;
		            case 2:
		                System.out.print("Enter wallet name: ");
		                String walletName = scanner.nextLine();
		                System.out.print("Enter wallet ID: ");
		                String walletId = scanner.nextLine();
		                makePaymentWallet(walletName, walletId, amountPaid);
		                break;
		            case 3:
		                System.out.print("Enter credit card number: ");
		                String cardNumber = scanner.nextLine();
		                System.out.print("Enter expiry date (MM/YY): ");
		                String expiryDate = scanner.nextLine();
		                makePaymentCard(cardNumber, expiryDate, amountPaid);
		                break;
		            default:
		                System.out.println("Invalid choice!");
		                break;
		        }

		        printReceipt();
		        scanner.close();
		    }

		    // Overloaded payment methods
		    private void makePaymentCash(double amount) {
		        paymentMethod = "Cash";
		        System.out.printf("Payment of %.2f made using Cash.\n", amount);
		    }

		    private void makePaymentWallet(String walletName, String walletId, double amount) {
		        paymentMethod = "Online Wallet: " + walletName + " (ID: " + walletId + ")";
		        System.out.printf("Payment of %.2f made using Online Wallet.\n", amount);
		    }

		    private void makePaymentCard(String cardNumber, String expiryDate, double amount) {
		        paymentMethod = "Credit Card: " + cardNumber + " (Expiry: " + expiryDate + ")";
		        System.out.printf("Payment of %.2f made using Credit Card.\n", amount);
		    }

		    // Method to print receipt
		    private void printReceipt() {
		        System.out.println("\n--- Receipt ---");
		        System.out.println("Event: " + eventName);
		        System.out.println("Customer Name: " + customerName);
		        System.out.println("Payment Method: " + paymentMethod);
		        System.out.printf("Amount Paid: %.2f\n", amountPaid);
		        System.out.println("----------------");
		    }

		    // Main method to run the application
		    public static void main(String[] args) {
		        String event = "Stage Show";
		        double price = 100.0;
		        TicketBooking booking = new TicketBooking(event, price);
		        booking.bookTicket();
		    }
		


	}


