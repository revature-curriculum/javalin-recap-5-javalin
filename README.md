## Javalin Recap 5
---
### Description
In this exercise, you will create a mini banking application that uses a form to deposit/withdraw money from account.

---
### Steps

1. In src -> main -> java -> objects -> Account.java
   1. Create an owner field and an amount field. 
   2. Create a constructor to set the owner and amount. 
   3. Create 2 methods, 
      1. One to deposit money in the account
      2. Another to withdraw money from the account. 
   4. Create getters for the fields.
2. In src -> main -> java -> Main.java, create an Account object with any values you want for the owner and amount fields.
3. Edit the main route to include sending over the account object.
4. In src -> main -> jte -> index.jte, create an element that states the owner and amount in the account. 
5. In the same folder, in accountForm.jte
   1. Create a header asking the user what action they would like to do. 
   2. Create a form with 3 input elements
      1. One for amount.
      2. One for if it's a deposit/withdrawal.
      3. One submit button.
6. Going back to the Main.java, outside of the main method
   1. Create a handler that will take in the values from the form.
      1. If it's a deposit, it will use the deposit method. 
      2. If it's a withdrawal, it will use the withdraw method. 
   2. Add a condition checking if the current amount of the account is negative. 
      1. If negative, set the account's amount back to its original amount before the deposit/withdrawal and send the user to the accountError.jte. 
      2. Otherwise, send the user to the accountSuccess.jte.
7. Create the appropriate routes.
   1. One for using the handler created in step 6 (Remember to use a post method).
   2. One for rendering accountError.jte.
   3. One for rendering accountSuccess.jte.
   4. One for sending users to the form.
8. Add a link in index.jte to the accountForm.jte route.
9.  Going back to the jte folder, in accountError.jte
   1.  Create an element that states the deposit/withdrawal for the account can't be done. 
   2.  Create a link that takes them back to the index.jte.
10. In the same folder, in accountSuccess.jte, create an element that states the owner made a successful deposit/witdrawal to the account. 
    1.  Create a link that takes them back to the index.jte.


---
### Sample Output

Jake made a successful deposit of $100 to the account.
```java
"Back to the Main Page"
---
