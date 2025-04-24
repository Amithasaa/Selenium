package tutorial.testng;

import org.testng.annotations.Test;

public class CartTests {
			@Test
			public void testAddProductCart() {
				System.out.println("Validate that user is able to add the product in the cart");
			}
			
			@Test
			public void testIncreaseProductCart() {
				System.out.println("Validate that user is able to increase the product in the cart");
			}
			
			@Test
			public void testDecreaseProductCart() {
				System.out.println("Validate that user is able to decrease the product in the cart");
			}
			
			@Test
			public void testTRemoveProductCart() {
				System.out.println("Validate that user is able to remove the product from the cart");
			}
			
			@Test
			public void testRetainProductCart() {
				System.out.println("Validate that cart retains its last state");
			}
			
			@Test
			public void testCartTotal() {
				System.out.println("Validate that cart displays the correct total");
			}
			
			@Test
			public void testProductWishlistCarte() {
				System.out.println("Validate that user is able to move the product to save to later section");
			}

}
