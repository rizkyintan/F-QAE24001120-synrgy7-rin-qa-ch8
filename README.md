# Welcome to my Quality Assurance Learning Repository! 🚀
### Chapter 8: Android UI Automation Testing with Appium 👆🏻💻

Hi folks! I am currently learning Software Quality Assurance at SYNRGY Batch 7. This repository serves as a dedicated space for storing code and resources related to my quality assurance learning and development journey. This repository is designed to provide a comprehensive overview of Chapter 8, focusing on Android UI automation testing with Appium. In this repository, I created test scripts for Android apps from SauceLabs which focused on 4 test cases:

* **Test 1: Login Successful**
* **Test 2: Login Failed with Wrong Password**
* **Test 3: Sorting Items from Low to High Prices**
* **Test 4: Checkout Process**

### Detailed Overview of Test Cases 📝

#### Test 1: Login Successful ✅
This test case ensures that a user can successfully log into the Android app with valid credentials.
- **Objective**: Verify that users with correct username and password can access their accounts and view available items.
- **Steps**:
  1. Launch the app.
  2. Enter valid username and password.
  3. Tap the login button.
  4. Assert that the homepage is displayed and items for sale are visible.

#### Test 2: Login Failed with Wrong Password ❌
This test case checks the app's response to login attempts with incorrect credentials.
- **Objective**: Ensure that the app handles invalid login attempts and displays an appropriate error message.
- **Steps**:
  1. Launch the app.
  2. Enter a valid username and an incorrect password.
  3. Tap the login button.
  4. Verify that the error message “Username and password do not match any user in this service” is displayed.

#### Test 3: Sorting Items from Low to High Prices 💲🔼
This test case tests the product sorting functionality on the homepage.
- **Objective**: Confirm that products are correctly sorted by price from lowest to highest.
- **Steps**:
  1. Log in with valid credentials.
  2. Navigate to the homepage with product listings.
  3. Select the sorting option to sort items from low to high price.
  4. Verify that the first item on the left has a lower price than the second item on the right.

#### Test 4: Checkout Process 🛒✅
This test case verifies that users can add items to the cart and complete the checkout process.
- **Objective**: Ensure that users can successfully add two different items to the cart and proceed to checkout.
- **Steps**:
  1. Log in with valid credentials.
  2. Add two items to the cart.
  3. Proceed to the checkout process.
  4. Complete the purchase by entering required details.
  5. Assert that the order success page is displayed with a confirmation image.

### Learning Objectives 🎯

Through these test scripts, the main objectives are:

1. **Understanding Appium Basics**: Learn how to set up Appium for Android UI automation and create test scripts for mobile apps.
2. **Implementing Page Object Model**: Utilize POM structure for efficient test case management and better code organization.
3. **Automating Mobile User Actions**: Gain experience in automating typical user actions on Android apps, such as login, product sorting, and checkout.
4. **Verifying Mobile UI Elements**: Learn techniques to verify mobile UI elements and their behavior using Appium.

### Repository Structure 📁

- **/src/test/java/test_cases**: Contains detailed descriptions and implementation of each test case for Android UI automation.
- **/src/main/java/page**: Includes page object model classes for organizing Android UI elements and their interactions.

### Getting Started 🚀

To get started with running the Android test scripts in this repository, follow these steps:

1. **Clone the repository**: `git clone [repository](https://github.com/rizkyintan/F-QAE24001120-synrgy7-rin-qa-ch8.git)`
2. **Install dependencies**: Ensure you have Java, Appium, and the necessary Android SDK set up on your machine.
3. **Run the test scripts**: Use your preferred IDE or command line to execute the test cases on an Android emulator or real device.
