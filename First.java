class First{
    // Type 1
    // public static void main(String args[]){
    //     System.out.println("Args: ");
    //     for(int i = 0; i < args.length; i++){
    //         System.out.println(args[i]);
    //     }
    // }

    //Type 2
    // public static void main(String... args){
    //     System.out.println("Args: ");
    //     for(int i = 0; i < args.length; i++){
    //         System.out.println(args[i]);
    //     }
    // }

    // Type 3
    // public static void main(String[] args){
    //     System.out.println("Args: ");
    //     for(int i = 0; i < args.length; i++){
    //         System.out.println(args[i]);
    //     }
    // }

    // Type 4
    // final public static void main(final String[] args){
    //     System.out.println("Args: ");
    //     for(int i = 0; i < args.length; i++){
    //         System.out.println(args[i]);
    //     }
    // }

    // Type 5
    // public static final void main(final String args[]){
    //     System.out.println("Args: ");
    //     for(int i = 0; i < args.length; i++){
    //         System.out.println(args[i]);
    //     }
    // }

    // Type 6
    static public final void main(final String args[]){
        System.out.println("Args: ");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}