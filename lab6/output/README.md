In this problem , I have used strategy pattern to display the bill . In my solution PackingSlip and Receipt are the concrete classes
which implements the strategy interface created. Depending on the strategy chosen , the corresponding Display method would be invoked.

I have chosen this pattern because the executing algorithm of display would be changing based on the strategy chosen. In my problem,
sorting algorithm is invoked when packing slip is requested.

Sample Output of my design solution is shown below:

This is Receipt
------------------------------------

         FIVE GUYS     
     BURGER AND FRIES     
      STORE # CA-1294     
   5353 ALMADEN EXPY N60     
   SAN JOSE , CA 95118    
    (P) 408-264-9300     
Order Number: 45       
LLB             5.0
     {{{Bacon}}}
     Lettuce
     Tomato
     -->G Onion
     -->JALA Grilled
Sub-Total          5.0
Tax (9%)           0.45
Total             5.45
Cash             10$
Change             4.55
***************************************
Don't throw away your receipt 

This is PackingBill
------------------------------------- 
Order Number: 45       
     FIVE GUYS     
LLB      
     Lettuce
     Tomato
     -->G Onion
     -->JALA Grilled
     {{{Bacon}}}
Register:1      Train Seq No : 57845 
Cashier: Sakda*S .
