public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "10";
         String taxRate = "0.5";
        String gibberish = "ANDNQKJOWP";
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
         int price = Integer.parseInt(shirtPrice);
         double tax = Double.parseDouble(taxRate);
           double totaltax = tax * price;

        System.out.println("Total tax: "  + totaltax);
        
        //Try to parse taxRate as an int
       int parse = Integer.parseInt(taxRate);
        System.out.println(parse);
        //Try to parse gibberish as an int
        int gib = Integer.parseInt(gibberish);
        System.out.println(gib);
    }
    
}
