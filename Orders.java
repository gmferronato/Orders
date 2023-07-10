/*
Based on a method that gives you the balance of a product if you give it the date (FORECAST(date)),
implement a Java function that uses that function and tells you how much of a product to order.
The product must be ordered only if the balance is less than a THRESHOLD amount, and one can order only multiplies
of a certain BATCH_SIZE of the product'.
*/


public class Orders {

  public static void main (String[] args) {

    // Variable declarations:

    int threshold = 1000; // amount below which the order is triggered
    int batch_size = 35; // orders can only be done using multiples of the batch size.
    String date = "2023-08-06";

    int balance = forecast(date);

    int quantity = quantity_to_order(balance, threshold, batch_size);

  }

  // Implement a forecast(date) function

  public static int forecast(String date){
    return 411;
  }

  // Implement the quantity_to_order() function

  public static int quantity_to_order(int balance, int threshold, int batch_size){
    int quantity_to_order; //initialize the Variable


    // If the balance is less than the threshold...
    if (balance < threshold) {
      // ...the quantity_to_order order is equal to the threshold minus the balance.
      quantity_to_order = threshold - balance;
      // If the remainder of quantity_to_order divided by the batch_size is not 0 (so, if the quantity_to_order is not a multiple of the batch size)
      if (quantity_to_order % batch_size != 0) {

        int remainder = quantity_to_order % batch_size;
        // ... the quantity_to_order is equal to itself plus the batch_size, minus the remainder. (And thus, it becomes a multiple of the batch_size)
        quantity_to_order += batch_size - remainder;
        //return quantity_to_order;
      }
      // Calculate how many batches to order.
      int units = quantity_to_order / batch_size;

      System.out.println("You now have only " + balance + " pieces left");
      System.out.println("You have to order " + quantity_to_order + " pieces");
      System.out.println("Which means " + units + " units of the batch size");
      System.out.println("With the new order your balance will be of " + (balance + quantity_to_order) + " units");
    }
    else {
      quantity_to_order = 0;
      System.out.println("No need to order anything.");
    }
    return quantity_to_order;
  }

}
