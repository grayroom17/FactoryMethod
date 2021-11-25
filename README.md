# FactoryMethod
In this app presented my realization of FactoryMethod. There we have coffee shop chain with nationality styled coffee shops. So all of them make the same types of coffee, but in different ways(Of course you should keep in mind, because i didn't realize it in programm. Just think that they are made in different ways.) using different recepies.

For example: AmaricanCoffeeShop class realise inface of CoffeeShop abstract class and contains a composition of AmericanFactory. In this abstract class we have abstract method "factory method" which is named "createCoffee" and which is return some abstract coffee. This method is override in AmericanFactory and creates concrete realizations of all types of coffee made according to american recepies.
