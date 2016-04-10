# Project-3
A Simple Java Program to Create Bank Statements

Develop a Java program to implement the solution of the problem described in Project 1. In addition to the requirements described in Project #1, your Java program should also:

include a comment at the beginning of the source code that indicates your name as the author and the date it was written.
have the first output to the screen be an appropriate assignment title and your name.
have a minimum of five methods in the second (non-driver) class. The appMain methods does count towards the minimum. Use the pseudocode solution as a guide if you are having trouble meeting the minimum.

Problem Description:

The Metro Auraria Student Credit Union (MASCU) provides monthly statements for customers. Customer transactions are tracked for the month and a monthly statement is sent to the customer. There is an old free checking, low balance account that needs an improved monthly statement. This account type is for customers with balances under $5,000 and fewer than a dozen customer credits and/or debits a month. Credits (trans type of C) are usually deposits and are added to the balance. Debits (trans type of D) include checks, withdrawals, and overdraft penalties and are subtracted from the balance. 

MASCU needs a report which represents the monthly statement for these customers. The report will show all the months transactions on the customer's account. This report must first display the customer account number, beginning balance, the end of month date and the per transaction penalty amount for overdrafts (each displayed only this one time).  Next the report must display a line for each transaction showing the transaction number, type, amount, the running balance, and any applicable overdraft penalty amount. After all transactions are displayed a report summary is required to display the customer's ending balance, total credit amount, total debit amount, total overdraft amount, and average credit amount. Finally the summary must identify the "transaction with the smallest debit amount" by displaying the transaction amount and transaction number of the debit transaction with the smallest transaction amount.  In the event of multiple instances of the smallest only the first instance should be reported.
The running balance is the beginning balance updated by each customer transaction and applicable overdraft penalties.
The column identifying the per transaction penalty amount for overdrafts should be blank when the running balance is 0 or more, otherwise it should show the per transaction penalty amount (which was input). The customer is "not penalized for each day" their balance is negative, rather they are penalized for each "transaction that results in a negative balance". 
The summary values for total credits and total debits are monetary amounts. 

The summary average credit amount is determined by dividing the total credit amount by the number of credit transactions. 
All monetary amounts including the summary totals, average and the low should be displayed with a decimal point to indicate dollars and cents. 
A customer transaction log is currently accumulated and entered as a single batch of data at the end of the month already organized and sorted by transaction number. Because MAP is concerned about implementing the solution they are first going to test it on a small number of customers. So for those customers MAP is willing to enter the data which consists of the customer account number, beginning balance, the end of month date and the per transaction penalty amount for overdrafts and for each transaction the transaction type, number, and amount.

A 0 (zero) value for transaction number indicates the end of transaction entries for the customer.
A subset of data for a typical customer is given below for you to test your models.
