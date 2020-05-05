public class ProductApp {
    public static void main(String[] args) {
        Book nf001 = new Book();

        nf001.setCode("001");
        nf001.setPrice(4.99);
        nf001.setDescription("Origin of Species");
        nf001.setAuthor("Charles Darwin");
        nf001.setPages(507);

//        System.out.println("Product Code: "+nf001.getCode()+"\nDescription: "+nf001.getDescription()+" by "+nf001.getAuthor());
//        System.out.println("Pages: "+nf001.getPages()+"\n"+nf001.getFormattedPrice(nf001.getPrice()));



        Software sw002 = new Software();
        sw002.setCode("002");
        sw002.setPrice(99.99);
        sw002.setDescription("Calculator");
        sw002.setProgrammer("Microsoft");
        sw002.setOs("Windows");
        sw002.setPlatform("PC");

//        System.out.println("Product Code: "+sw002.getCode()+"\nDescription: "+sw002.getDescription()+" by "+sw002.getProgrammer());
//        System.out.println("OS: "+sw002.getOs()+"\t\tPlatform: "+sw002.getPlatform()+"\n"+sw002.getFormattedPrice(sw002.getPrice()));

        System.out.println(nf001.toString());
        System.out.println(sw002.toString());

        //equals() now returns true when false and vice versa
        System.out.println(nf001.equals(nf001));
    }
}
