class fizzbuzz_ {
    public static void main(String[] args) {
        String fizz = new String("fizz");
        String buzz = new String("buzz");
        System.out.println(0);
        for (int i = 1; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(fizz);
                System.out.println(buzz);
            }
            else if ( i % 3 == 0){
                System.out.println(fizz);
            } 
            else if (i % 5 == 0){
                System.out.println(buzz);
            }
            else {
                System.out.println(i);
            }
            
        }
        System.out.println(buzz.length());
    }
}
