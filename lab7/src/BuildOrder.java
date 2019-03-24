  

public class BuildOrder {

    public static Component getOrder()
    {
    	Composite order = new Composite( "Order" ) ;
        

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jallepino Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //premiun cheese
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese"} ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        //Unlimited
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( pc ) ;
        //Premium Cheese
        
        // Sauce extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce"  } ;
        s.setOptions( so ) ;
        s.wrapDecorator( t ) ;
        // premium toping +1.50
        PremiumToppings p = new PremiumToppings( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( s ) ;
       // Bun Choice
        Bun bun = new Bun( "Bun Options" ) ;
        String[] buno = { "Ciabatta(Vegan)" } ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( p ) ;
        //Side Options
        Side side = new Side("Side Options" ) ;
        String[] sideo = { "ShoeString Fries" } ;
        side.setOptions( sideo ) ;
        side.wrapDecorator( bun ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;    
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;
        
        
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gauda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        //premiun cheese
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella"} ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;
        
        //Unlimited
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Habanero Salsa" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( pc2 ) ;
        //Premium Cheese
        
        // Sauce extra +.50
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Crushed Peanuts"  } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( t2 ) ;
        // premium toping +1.50
        PremiumToppings p2 = new PremiumToppings( "Premium Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( s2 ) ;
       // Bun Choice
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] buno2 = { "Gluten-Free Bun" } ;
        bun2.setOptions( buno2 ) ;
        bun2.wrapDecorator( p2 ) ;
        //Side Options
        Side side2 = new Side("Side Options" ) ;
        String[] sideo2 = { "ShoeString Fries" } ;
        side2.setOptions( sideo2 ) ;
        side2.wrapDecorator( bun2 ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( side2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( side2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild( customBurger2 );
        return order ;
    }


}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/