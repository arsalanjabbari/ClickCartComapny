﻿***System Analysis and Design Project - Arsalan Jabbari, Milad Nooraei![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.001.png)***

***Online Shop Development System***

***Fall-2023\_Winter-2024***

**Outline**

- [***About Our Project***](#_page0_x72.00_y347.28)
- [***Phase 1 - DFD Level 0 & 1***](#_page5_x72.00_y593.02)
- [***Phase 2 - Vision and Use-Case***](#_page7_x72.00_y373.22)
- [***Phase 3 - Domain Model and SSD***](#_page16_x72.00_y438.24)
- [***Phase 4 - Operation Contract***](#_page30_x72.00_y600.67)
- [***Phase 5 - Method Retrivation and Class Diagram***](#_page38_x72.00_y592.29)
- [***Phase 6 - Sequence Diagram and Communication Diagram***](#_page40_x72.00_y418.68)
- [***Glossary***](#_page62_x72.00_y656.10)

<a name="_page0_x72.00_y347.28"></a>**About Our Project**

- **Name**

***ClickCart Company***

- **Collaboration Approach**

We approached our project with a commitment to collaboration. Our partnership contributed ***equally to every aspect of the project***. Throughout the project's development, we fostered an environment of open communication and joint decision-making, ensuring that both voices were valued in every phase.

- **Requirements**

**Functional Requirements**

1. User Authentication and Authorization:
1. Differentiate access levels for Customer, Admin, and Super-Admin.![ref1]
1. Authenticate and authorize users based on roles and permissions.
2. Customer Management:
   1. Registration and login functionality for Customers.
   1. Allow customers to view and edit their profiles.
2. Product Management:
   1. Add, edit, delete products from the Products-Info database.
   1. Assign products to relevant categories.
2. Order Processing:
   1. Enable Customers to place orders.
   1. Allow Customers to view order history and status.
   1. Admins should be able to manage and update order statuses.
2. Admin and Super-Admin Controls:
   1. Admins manage product listings, categories, and customer orders.
   1. Super-Admin oversees the system, managing admins and system settings.
2. Category Management:
   1. Ability to create, update, and delete product categories in the Categories-Info database.
2. Comments and Feedback:
   1. Allow Customers to leave comments and feedback on products.
   1. Admins should be able to moderate and manage comments.
2. Payment and Delivery Integration:
1. Integration with Payment-System for secure payment processing.
1. Integration with Delivery-System for order shipment and tracking.
9. Inventory Management:![ref1]

a. Connect Products-Info with Inventory-System to manage stock levels and availability.

**Non-Functional Requirement**

1. Security:
   1. Implement secure encryption methods for user data and transactions.
   1. Regular data backups to prevent data loss.
1. Scalability and Performance:
   1. Ensure the system can handle increasing numbers of users and transactions.
   1. Optimize system performance to provide a seamless shopping experience.
1. User Interface and Experience:
   1. Design an intuitive and user-friendly interface for easy navigation.
   1. Ensure compatibility across various devices and browsers.
1. Reliability:
   1. Minimize system downtime and ensure high availability.
1. Compliance:

a. Ensure compliance with relevant data protection and privacy regulations.

These requirements should serve as a foundation for the development of your online shop system, focusing on the functionalities needed to manage data, users, and external systems effectively while delivering a seamless shopping experience for customers. Tailor and expand upon these requirements based on your specific project needs and goals.

- **Capabilities**
1. User Management:
1. Registration and login for Customers, Admins, and Super-Admins.
2. Password management and security features like password reset and![ref1] account recovery.
2. Role-Based Access Control:
   1. Differentiate between Customer, Admin, and Super-Admin roles with varying access levels and permissions.
   1. Super-Admin privileges for system-wide management and oversight.
2. Product Catalog Management:
   1. Ability to add, edit, and delete products from the Products-Info database.
   1. Categorize products into distinct categories from Categories-Info.
2. Order Processing Capabilities:
   1. Allow Customers to add items to their carts, place orders, and proceed to checkout.
   1. Enable Admins to manage and update order statuses, view order details, and track deliveries.
2. Comment and Feedback Management:
   1. Enable Customers to leave comments and ratings on products.
   1. Admins can moderate, respond to, or remove comments as needed.
2. Integration Capabilities:
   1. Seamless integration with external systems such as Payment-System, Delivery-System, and Inventory-System.
   1. Real-time synchronization of inventory levels with the Inventory-System.
2. Reporting and Analytics:
   1. Generate reports on sales, customer behavior, popular products, and inventory levels for Admins and Super-Admins.
   1. Provide insights and analytics to aid in decision-making and business growth strategies.
2. Payment and Checkout Capabilities:
1. Secure payment processing through Payment-System integration.
2. Multiple payment options (credit/debit cards, digital wallets, etc.) for Customers.![ref1]
9. Inventory Management:

a. Track and manage product inventory levels, update stock availability, and notify when items are out of stock.

10\.Security and Compliance:

1. Implement encryption measures to protect user data and transactions.
1. Ensure compliance with relevant data protection regulations (GDPR, etc.).

11\.Scalability and Performance:

a. Ability to handle increasing user traffic and transaction volumes without compromising system performance.

- **Applicabilities**
1. E-commerce Operations:
   1. The system is applicable for businesses aiming to establish an online presence and conduct e-commerce operations.
   1. Suitable for retail businesses looking to sell products online to a wide customer base.
1. Multiple User Roles and Access Levels:
   1. Applicable for systems requiring distinct user roles like Customers, Admins, and Super-Admins, each with specific access levels and permissions.
   1. Ideal for platforms necessitating controlled access to different functionalities based on user roles.
1. Product-Centric Businesses:
1. Suitable for businesses heavily reliant on product catalog management, allowing easy addition, editing, and categorization of products.
1. Applicable for businesses dealing with various product categories and inventory management needs.
4. Order Processing and Fulfillment:![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.003.png)
   1. Applicable for businesses requiring a streamlined order processing system, enabling Customers to place orders and Admins to manage and fulfill them.
   1. Ideal for businesses seeking efficient order tracking and status updates.
4. Interfacing with External Systems:
   1. Suitable for businesses needing integration with external systems such as Payment-System, Delivery-System, and Inventory-System.
   1. Applicable for platforms aiming to synchronize inventory levels, manage payments securely, and facilitate order deliveries.
4. Feedback and Review Management:
   1. Relevant for businesses wanting to collect and manage customer feedback, ratings, and comments on products.
   1. Ideal for platforms aiming to engage customers through reviews and interactions.
4. Compliance and Security Requirements:
   1. Applicable for businesses requiring adherence to data protection regulations and implementing secure measures for user data and transactions.
   1. Suitable for platforms prioritizing user privacy and data security.
4. Scalability and Performance Demands:
1. Suitable for businesses anticipating growth and requiring a scalable system capable of handling increasing user traffic and transaction volumes.
1. Ideal for platforms seeking high performance and reliability even during peak usage periods.

<a name="_page5_x72.00_y593.02"></a>**Phase 1 - DFD Level 0 & 1**

***DFD Level 0***

***DFD Level 1![ref1]![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.004.jpeg)***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.005.jpeg)

<a name="_page7_x72.00_y373.22"></a>**Phase 2 - Vision and Use-Case![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.006.png)**

- **Vision**
  - ***Problem Statement***

    The absence of a comprehensive, user-centric online shopping platform bothers customers' access to a seamless shopping experience and helps businesses from efficiently managing their e-commerce operations.

- ***Stakeholder Description***

**Primary Stakeholders**

1. Business Owners/Entrepreneurs
1. Operations Managers
1. Marketing and Sales Teams
1. Customers

**Secondary Stakeholders**

1. IT Support Team
2. External Suppliers and Vendors![ref1]
2. Payment Gateway Providers
- ***Key High-Level Goals***
1. Enhanced User Experience: Develop an intuitive interface for Customers and streamlined management tools for Admins and Super-Admins.
1. Scalable and Secure Platform: Ensure scalability to accommodate increased user traffic and implement robust security measures to protect user data.
1. Seamless Integration: Establish seamless integration with external systems (Payment, Delivery, and Inventory) for efficient operations.
1. Comprehensive Functionality: Provide comprehensive functionalities for product management, order processing, feedback management, and reporting.
1. Performance and Reliability: Optimize performance for responsiveness and reliability, minimizing system downtime and ensuring high availability.
- ***Functional Features***
1. User authentication and role-based access control.
1. Product catalog management with category organization.
1. Order placement, tracking, and status updates for Customers and Admins.
1. Comments and feedback management for product reviews.
1. Integration with external systems: Payment, Delivery, and Inventory.
- ***Non-functional Features***
1. Scalability and Performance:
1. Fast Response Times: Ensures swift loading and processing of pages and transactions, reducing user wait times.![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.007.png)
1. Scalability: Capable of handling increased user traffic and transaction volumes without compromising performance.
1. Resource Optimization: Efficiently utilizes system resources to maintain optimal performance even during peak loads.
2. Security and Compliance:
   1. Access Control: Implements robust role-based access controls, ensuring appropriate permissions and limiting unauthorized access.
   1. Data Protection: Utilizes encryption and secure data storage methods to safeguard sensitive information, preventing breaches or unauthorized access.
   1. Regular Security Checks: Conducts routine security checks and updates to ensure ongoing protection.
2. Reliability:
   1. High Uptime: Operates consistently with minimal downtime, ensuring the system is available for users' needs.
   1. Backup and Recovery: Regularly backs up data and maintains mechanisms for swift recovery in case of unforeseen system failures or data loss.
2. Usability and User Experience:
1. User-Friendly Interface: Offers an intuitive and easily navigable interface for users, enhancing their experience while interacting with the platform.
1. Mobile Compatibility: Ensures the platform's functionality and responsiveness on various devices, including smartphones, enabling seamless access and use across different screens.
- **Use-Cases Scenario**
1. ***Authentication![ref1]***
1. User chooses “Log-In” between “Log-In” and “Register” in the first page.
1. User enters their username, password, and selects their role in the multiple choice (Customer, Admin, Super-Admin).
1. System checks if entered information exists in users’ information based on the entered role.
1. System displays a success message.
1. System leads the user to their first page (based on their role).
- **Alternative Flow**

**b.1. User’s username or password is wrong.**

**b.1.1. The system asks the user to enter their information again or go to the registration page.**

2. ***Customer Registration***
1. User chooses “Register” between “Log-In” and “Register” in the first page.
1. User enters their username, password, fullname, e-mail, phone, address, zip-code.
1. System sends a verification e-mail to their entered e-mail.
1. System verifies the customer after receiving the verification.
1. System creates a cart for new customer and assign it to them.
1. System leads the user to the customer's first page.
- **Alternative Flow**

**b.1. They enters a reserved username as their username.**

**b.1.1. System asks the customer to change their username.**

**b.2. They enters a reserved e-mail address as their e-mail.**

**b.2.1. System asks the customer to change their e-mail.**

**b.3. The customer doesn't fill all the fields and submit the form.**

**b.3.1. System asks the customer to fill all fields.**

**d.1. System doesn’t get verification from the customer's email![ref1]**

**after 2 minutes.**

**d.1.1. System tells the customer that you don’t**

**verified and**

**fill the form again.**

3. ***Search Product***
1. Customer search for their desired product.
1. System finds and displays the entered product.
- **Alternative Flow**

**b.1. System doesn’t find the product.**

**b.1.1. System displays the-not-found-message.**

4. ***Browse Category***
1. Customer selects their desired category.
1. System displays the selected category.
5. ***Write Comment***

a. Customer comments for displayed product and submits.

6. ***Add Product to Cart***

a. Customer adds the displayed product to his cart.

- **Alternative Flow**

**a.1. Selected product is not available.**

**a.1.1. System doesn’t add it to cart and show appropriate**

**message.**

7. ***Check Cart***

a. Customer request leading to the pending cart’s page.

8. ***Change Amount in Cart***

a. Customer changes the amount of selected products incrementally or decrementally in the cart's page.

- **Alternative Flow**

**a.1. Unavailability of a product after incrementing its amount.![ref1]**

9. ***Delete Cart (Cancel Cart)***
1. Customer decides to cancel their purchase/delete the pending cart.
1. System deletes the customer’s cart’s content.
10. ***Pay Cart (Finalize Cart)***
1. Customer decides to pay their pending cart/finalize their cart.
1. System calculates the overall cost and displays it and asks the customer to confirm the bill.
1. System leads the customer to the Payment-System.
1. System gets success from the payment system.
1. System registers the related order and cleans the customer’s cart.
1. System asks the delivery system for a paid order and displays its details.
- **Alternative Flow**

a.1. The cart is empty.

a.1.1. System displays appropriate messages.

b.1. Customer doesn’t confirm the bill.

c.1.1. System redirects the customer to the cart page. d.1. The payment was not successful.

e.1.1. System displays appropriate message.

11. ***Update Delivery Status***
1. System asks the delivery system to update orders’ delivery status and informs the system every six hours.
1. System updates delivery statuses in orders of system based on delivery system reports.
12. ***Add Product***
1. User (Admin or Super-Admin) enters a new product detail to define it in the system.
1. System registers the new product and displays the appropriate message.
- **Alternative Flow**

b.1. System finds the entered details of the product not unique.

b.1.1. Displays appropriate error message and let user![ref1] try

again.

13. ***Edit Product***
1. User (Admin or Super-Admin) enters a product’s details to find it in the system.
1. User (Admin or Super-Admin) enters the product’s new details to save its new version in the system.
1. System registers the new version of the product and displays the appropriate message.
- **Alternative Flow**

b.1. System finds the entered details of the product not unique.

b.1.1. Displays appropriate error message and let

user try

again.

14. ***Delete Product***
1. User (Admin or Super-Admin) enters a product’s details to delete it in the system.
1. System deletes the product and displays the appropriate message.
- **Alternative Flow**

b.1. System doesn’t find the entered details of the product.

b.1.1. Displays appropriate error message and let

user try

again.

15. ***Add Category***
1. User (Admin or Super-Admin) enters a new category detail to define it in the system.
1. System registers the new category and displays the appropriate message.
- **Alternative Flow**

b.1. System finds the entered details of the category not unique.

b.1.1. Displays appropriate error message and let

user try

again.

16. ***Edit Category![ref1]***
1. User (Admin or Super-Admin) enters a category’s details to find it in the system.
1. User (Admin or Super-Admin) enters the category’s new details to save its new version in the system.
1. System registers the new version of the product and displays the appropriate message.
- **Alternative Flow**

b.1. System finds the entered details of the product not unique.

b.1.1. Displays appropriate error message and let

user try

again.

17. ***Delete Category***
1. User (Admin or Super-Admin) enters a category’s details to delete it in the system.
1. System deletes the category and displays the appropriate message.
- **Alternative Flow**

b.1. System doesn’t find the entered details of the category.

b.1.1. Displays appropriate error message and let

user try

again.

18. ***Reply Comment***
1. User (Admin or Super-Admin) enters a comment’s details to reply.
1. User (Admin or Super-Admin) write the reply comment.
1. System inserts the reply comment and displays the appropriate message.
- **Alternative Flow**

c.1. System doesn’t find the entered details of the comment.

c.1.1. Displays appropriate error message and let

user try

again.

19. ***Delete Comment***
1. User (Admin or Super-Admin) enters a comment’s details to delete it in the system.
2. System deletes the comment and displays the appropriate message.![ref1]
- **Alternative Flow**

b.1. System doesn’t find the entered details of the comment.

b.1.1. Displays appropriate error message and let

user try

again.

20. ***Add Customer***
1. User (Super-Admin) enters a new customer detail to define it in the system.
1. System registers the new customer and displays the appropriate message.
- **Alternative Flow**

b.1. System finds the entered details of the customer not unique.

b.1.1. Displays appropriate error message and let

user try

again.

21. ***Edit Customer***
1. User (Super-Admin) enters a customer’s details to find it in the system.
1. User (Super-Admin) enters the customer’s new details to save its new version in the system.
1. System registers the new version of the customer and displays the appropriate message.
- **Alternative Flow**

b.1. System finds the entered details of the customer not unique.

b.1.1. Displays appropriate error message and let

user try

again.

22. ***Delete Customer***
1. User (Super-Admin) enters a customer’s details to delete it in the system.
1. System deletes the customer and displays the appropriate message.
- **Alternative Flow![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.008.png)**

b.1. System doesn’t find the entered details of the customer.

b.1.1. Displays appropriate error message and let

user try

again.

23. ***Manage Admin***
1. User (Super-Admin) enters a customer’s details to promote it or enters an admin’s details to demote it in the system.
1. System changes the customer or admin’s role and displays the appropriate message.
- **Alternative Flow**

b.1. System doesn’t find the entered details.

b.1.1. Displays appropriate error message and let user try

again.

24. ***Update Availability***
1. System asks the inventory system to update products’ availability and informs the system every six hours.
1. System updates availability in products of the system based on inventory system reports.

<a name="_page16_x72.00_y438.24"></a>**Phase 3 - Domain Model and SSD**

1. **Domain Model**

   (Done after 4 iterations.)

2. **SSD![ref1]![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.009.jpeg)**
1. ***Authentication![ref1]![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.010.jpeg)***
2. ***Customer Registration![ref1]![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.011.jpeg)![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.012.jpeg)***
3. ***Search Product![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.013.jpeg)

4. ***Browse Category***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.014.jpeg)

5. ***Write Comment![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.015.jpeg)

6. ***Add Product to Cart***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.016.jpeg)

7. ***Check Cart![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.017.png)

8. ***Change Amount in Cart***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.018.jpeg)

9. ***Delete Cart (Cancel Cart)![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.019.jpeg)

10. ***Pay Cart (Finalize Cart)***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.020.jpeg)

11. ***Update Delivery Status![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.021.png)

12. ***Add Product***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.022.jpeg)

13. ***Edit Product![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.023.jpeg)

14. ***Delete Product***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.024.jpeg)

15. ***Add Category![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.025.jpeg)

16. ***Edit Category***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.026.jpeg)

17. ***Delete Category![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.027.jpeg)

18. ***Reply Comment***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.028.jpeg)

19. ***Delete Comment![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.029.jpeg)

20. ***Add Customer***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.030.jpeg)

21. ***Edit Customer![ref1]***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.031.jpeg)

22. ***Delete Customer***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.032.jpeg)

23. ***Manage Admin![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.033.png)***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.034.jpeg)

24. ***Update Availability***

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.035.png)

<a name="_page30_x72.00_y600.67"></a>**Phase 4 - Operation Contract**

1. **Authentication**

***a. Pre-Condition***

*U of User, S of System![ref1]*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: User U with System S*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Checking entered username, password and role.*

2. **Customer Registration**
1. ***Pre-Condition***

*System S*

2. ***Post-Condition***
1. *New-Object: U of User, CT of Cart*
1. *Delete-Object: X*
1. *New-Association: User U with System S, Cart CT with User U*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Email verification.*

*Save new user’s data in role-related stores.*

3. **Search Product**
1. ***Pre-Condition***

*ProductDescription PD*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Retrieve similar product description with searched token.*

4. **Browse Category**
1. ***Pre-Condition** Category C*
1. ***Post-Condition***


1. *New-Object: X![ref1]*
1. *Delete-Object: X*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility** Nothing*
5. **Write Comment**
1. ***Pre-Condition***

*ProductDescription PD, User U*

2. ***Post-Condition***
1. *New-Object: Comment CM*
1. *Delete-Object: X*
1. *New-Association: Comment CM with ProductDescription PD, Comment CM with User U*
1. *Delete-Association: X*
1. *Change-Attribute: New comment attributes*
3. ***Sub-Responsibility***

*Nothing*

6. **Add Product to Cart**
1. ***Pre-Condition***

*Cart CT, Product P*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: Product P with Cart CT*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Nothing*

7. **Check Cart**
1. ***Pre-Condition***

*Cart CT*

2. ***Post-Condition***
1. *New-Object: X*
2. *Delete-Object: X![ref1]*
2. *New-Association: X*
2. *Delete-Association: X*
2. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Calculate and report total price.*

*Ask users to choose between pay and cancel.*

8. **Change Amount in Cart**
1. ***Pre-Condition***

*Cart CT, Product P*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: Product P and Cart CT*
1. *Delete-Association: Product P and Cart CT*
1. *Change-Attribute: Price, Products*
3. ***Sub-Responsibility***

*Recalculating the price and amount of each product in the cart.*

9. **Delete Cart (Cancel Cart)**
1. ***Pre-Condition***

*Cart CT*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: X*
1. *Delete-Association: Product P and Cart CT*
1. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Nothing*

10. **Pay Cart (Finalize Cart)**
1. ***Pre-Condition***

*Cart CT, User U, System S*

2. ***Post-Condition***
1. *New-Object: PY of Payment, O of Order, D of Delivery*
1. *Delete-Object: X*
3. *New-Association: Order O with User U and Order O with Payment PY and with Delivery D![ref1]*
3. *Delete-Association: Product P with Cart CT*
3. *Change-Attribute: Pay-Status to Paid everywhere, Delivery-Status initialize everywhere*
3. ***Sub-Responsibility***

*Calculate and pass the total price to the payment system.*

*Pass details to the delivery system.*

11. **Update Delivery Status**
1. ***Pre-Condition***

*System S, Delivery D, Order O*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: Update Delivery Status*
3. ***Sub-Responsibility***

*Update new delivery statuses in the order datastore.*

12. **Add Product**
1. ***Pre-Condition***

*System S, User U*

2. ***Post-Condition***
1. *New-Object: ProductDescription PD*
1. *Delete-Object: X*
1. *New-Association: ProductDescription PD with System S*
1. *Delete-Association: X*
1. *Change-Attribute: ProductDescription attributes*
3. ***Sub-Responsibility***

*Nothing*

13. **Edit Product**
1. ***Pre-Condition***

*User U, ProductDescription PD, System S*

2. ***Post-Condition***
1. *New-Object: X*
2. *Delete-Object: X![ref1]*
2. *New-Association: X*
2. *Delete-Association: X*
2. *Change-Attribute: Edited atts. in ProductDescription*
3. ***Sub-Responsibility***

*Nothing*

14. **Delete Product**
1. ***Pre-Condition***

*User U, ProductDescription PD, System S*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: PD of ProductDescription*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Nothing*

15. **Add Category**
1. ***Pre-Condition***

*System S, User U*

2. ***Post-Condition***
1. *New-Object: Category CG*
1. *Delete-Object: X*
1. *New-Association: Category CG with System S*
1. *Delete-Association: X*
1. *Change-Attribute: Category attributes*
3. ***Sub-Responsibility***

*Nothing*

16. **Edit Category**
1. ***Pre-Condition***

*Category CG, User U*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: X*
1. *Delete-Association: X*
5. *Change-Attribute: Category edited attributes![ref1]*
3. ***Sub-Responsibility***

*Nothing*

17. **Delete Category**
1. ***Pre-Condition***

*User U, Category CG*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: Category CG*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Nothing*

18. **Reply Comment**
1. ***Pre-Condition***

*CM1 Comment*

2. ***Post-Condition***
1. *New-Object: CM of Comment*
1. *Delete-Object: X*
1. *New-Association: CM of Comment and CM1 of Comment*
1. *Delete-Association: X*
1. *Change-Attribute: CM1 replies attribute appended*
3. ***Sub-Responsibility***

*Match entered comment id to reply.*

19. **Delete Comment**
1. ***Pre-Condition***

*CM Comment*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: CM of Comment*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility ![ref1]**Nothing*
20. **Add Customer**
1. ***Pre-Condition***

*System S, User U*

2. ***Post-Condition***
1. *New-Object: User C*
1. *Delete-Object: X*
1. *New-Association: User C with System S*
1. *Delete-Association: X*
1. *Change-Attribute: Customer attributes*
3. ***Sub-Responsibility***

*Nothing*

21. **Edit Customer**
1. ***Pre-Condition***

*User U, User C, System S*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: Customer edited attributes*
3. ***Sub-Responsibility***

*Nothing*

22. **Delete Customer**
1. ***Pre-Condition***

*User U, User C, System S*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: User C*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: X*
3. ***Sub-Responsibility***

*Nothing*

23. **Manage Admin![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.036.png)**
1. ***Pre-Condition***

*SA User, C User/A User*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: Role in User based on promotion/demotion.*
3. ***Sub-Responsibility***

*Control changes in user abilities.*

24. **Update Availability**
1. ***Pre-Condition***

*Product P*

2. ***Post-Condition***
1. *New-Object: X*
1. *Delete-Object: X*
1. *New-Association: X*
1. *Delete-Association: X*
1. *Change-Attribute: Update Availability Status in products-relateds*
3. ***Sub-Responsibility***

*Update new availability statuses in the product datastore.*

<a name="_page38_x72.00_y592.29"></a>**Phase 5 - Method Retrivation and Class Diagram**

- **Method Retrivation**
  - *Login(username, password, role)*
  - *Registration(username, password, fullname, email, phone, address, zipcode)*
- *SendVerificationEmail(email)![ref1]*
- *CreateAssignCart(username)*
- *SearchProduct(product\_name)*
- *SelectProduct(product\_id)*
- *BrowseCategory(category\_name)*
- *SelectCategory(category\_id)*
- *WriteComment(username, product\_id, comment\_text)*
- *Add2Cart(cart\_id, product\_id)*
- *CheckCart(cart\_id)*
- *IncrementBuyAmount(cart\_id, product\_id)*
- *DecrementBuyAmount(cart\_id, product\_id)*
- *CancelCart(cart\_id)*
- *ConfirmCart(cart\_id)*
- *PaymentRequest(order\_id)*
- *CalculatePrice(cart\_id)*
- *ConfirmationRequest(cart\_id)*
- *RegisterOrder(username, date, time, order\_id, total\_price, description, delivery\_st, pay\_st)*
- *RegisterDelivery(order\_id)*
- *ClearCart(cart\_id)*
- *UpdateDeliveries()*
- *UpdateAvailabilities()*
- *ManageProduct(cmd)*
- *AddProduct(id, name, price, description, availability, category)*
- *EditProduct(id, name, price, description, availability, category)*
- *DeleteProduct(id)*
- *ManageCustomer(cmd)*
- *AddCustomer(username, password, email, phone, address, fullname, zipcode)*
- *EditCustomer(username, password, email, phone, address, fullname, zipcode)*
- *DeleteCustomer(username)*
- *ManageCategory(cmd)*
- *AddCategory(id, name)*
- *EditCategory(id, name)*
- *DeleteCategory(id)*
- *PromoteCustomer(username)*
- *DemoteAdmin(username)*
- *ReplyComment(alpha\_cm\_id, content)*
- *DeleteComment(id)*
- **Class Diagram (Methods displayed without their parameters in case of![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.037.png)**

  **abstraction)**

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.038.jpeg)

<a name="_page40_x72.00_y418.68"></a>**Phase 6 - Sequence Diagram and Communication Diagram**

- **Sequence Diagram**

  # There may be a longer way to reach the goal-use-case, but in this phase we are choosing the shortest path.

1. *Authentication![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.039.jpeg)

2. *Customer Registration*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.040.jpeg)

3. *Search Product![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.041.jpeg)

4. *Browse Category*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.042.jpeg)

5. *Write Comment![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.043.jpeg)

6. *Add Product to Cart*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.044.jpeg)

7. *Check Cart![ref1]![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.045.png)*
8. *Change Amount in Cart![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.046.png)

9. *Cancel Cart*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.047.png)

10. *Pay Cart![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.048.jpeg)

11. *Update Delivery Status*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.049.png)

12. *Add Product![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.050.jpeg)

13. *Edit Product*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.051.jpeg)

14. *Delete Product![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.052.png)

15. *Add Category*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.053.png)

16. *Edit Category![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.054.png)

17. *Delete Category*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.055.png)

18. *Reply Comment![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.056.jpeg)

19. *Delete Comment*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.057.jpeg)

20. *Add Customer![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.058.jpeg)

21. *Edit Customer*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.059.jpeg)

22. *Delete Customer![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.060.jpeg)

23. *Manage Admin*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.061.png)

24. *Update Availability![ref1]![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.062.png)![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.063.png)*
- **Communication Diagram![ref1]**
- *Authentication*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.064.png)

- *Customer Registration*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.065.png)

- *Search Product*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.066.png)

- *Browse Category*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.067.png)

- *Write Comment![ref1]![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.068.jpeg)*
- *Add Product to Cart![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.069.jpeg)

- *Check Cart*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.070.png)

- *Change Amount in Cart![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.071.png)

- *Cancel Cart*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.072.png)

- *Pay Cart![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.073.jpeg)

- *Update Delivery Status*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.074.png)

- *Add Product*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.075.png)

- *Edit Product![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.076.png)

- *Delete Product*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.077.png)

- *Add Category*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.078.png)

- *Edit Category*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.079.png)

- *Delete Category*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.080.png)

- *Reply Comment![ref1]![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.081.jpeg)*
- *Delete Comment![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.082.jpeg)

- *Add Customer*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.083.png)

- *Edit Customer*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.084.png)

- *Delete Customer![ref1]*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.085.png)

- *Manage Admin*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.086.png)

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.087.png)

- *Update Availability*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.088.png)

- *Startup Use Case Collaboration Diagram*

![](Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.089.jpeg)

<a name="_page62_x72.00_y656.10"></a>**Glossary**

***SuperAdmin:*** A privileged user with the highest level of access and authority within a system, often possessing rights to manage and oversee various administrative functions and settings.![ref1]

***PromoteCustomer:*** The action of elevating a regular customer account to a higher level within the system, granting additional privileges or access rights typically associated with an administrative role.

***DemoteAdmin:*** The process of lowering the authority or privileges of an administrator, often reverting their account to a standard user or reducing their administrative access levels.

***CreateAssignCart:*** The functionality allows the system to generate and allocate a shopping cart to a specific user, enabling them to add items and manage their selections before checkout.

***CheckCart:*** The action of reviewing the contents of a shopping cart, including the items selected for purchase, quantities, and total costs.

***Add2Cart:*** The process of adding a selected item or product to the shopping cart within the online shopping system, allowing users to accumulate items for potential purchase.

***InventorySystem:*** A system designed to manage and track the availability, quantity, and status of products or goods within a store or business, ensuring accurate stock information.

***DeliverySystem:*** A logistical system or process responsible for managing and executing the delivery or shipping of ordered products to customers, including tracking and handling of shipments.

***OrderLine:*** A specific item or product line included within an order, detailing information such as product name, quantity, price, and any additional attributes related to the purchase.

***Product Serial-number:*** A unique identifier assigned to individual products, allowing for the differentiation and tracking of specific items within the inventory or sales system. Serial numbers are often used for product identification, warranties, and traceability.

[ref1]: Aspose.Words.1816cf2d-6f2b-477e-921d-0f4de917076c.002.png