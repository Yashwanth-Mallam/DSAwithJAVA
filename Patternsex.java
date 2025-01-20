public class Patternsex {

    public static void main(String[] args) {
        //1
        System.out.println("1st pattern");

            // printing the patterns giiven below
            //******
            //******
            //******
            //******
            //******
        for(int i=1; i<=5; i++){
            System.out.print("*");
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }            
            System.out.println("");
        }
        //2
        System.out.println("2nnd pattern");
        // printing the patterns giiven below
        //*
        //**
        //***
        //****
        //*****

        for(int i=1; i<=5; i++){
            System.out.print("*");
            for(int j=2; j<=i;j++){
                System.out.print("*");
                
            }            
            System.out.println("");
        }

        //3
        System.out.println("3nd pattern");

        // printing the patterns giiven below
        //*****
        //****
        //***
        //**
        //*
        for(int i=1; i<=5; i++){
            System.out.print("*");
            for(int j=4; j>=i; j--){
                System.out.print("*");
                
            }            
            System.out.println("");
        }

        //4
        System.out.println("4th pattern");

        // printing the patterns giiven below
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        for (int i = 0; i < 5; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<5-i-1; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<5-i-1; j++)
        {
            System.out.print(" ");
        }

        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
}
}

