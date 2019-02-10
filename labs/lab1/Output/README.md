My code makes following assumptions while implementing gumball machine.

1.For gumball typical:

Initialize the Gumball machine with initial amount of gumballs and machine number.
It takes the input and performs the operations based on the following criteria:

Machine 1 : accepts 25 cents and cost of gumball is 25

Machine 2 : accepts 25 cents and cost of gumball is 50

Machine 3 : accepts all coins and cost of gumball is 50

2. For gumball pattern:

Initialize the Gumball machine with initial amount of gumballs and machine number.
It takes the input and performs the operations based on the above criteria using state behaviour analysis.

State : 
        HasQuarterState - Means it has enough money to eject gumball
        NoQuarterState - Means it does not have enough money to eject gumball
	SoldState - Means that the gumball is ejected.
	SoldOutState - Means that machine is out of gumboils
