public class Printer {

    private int tonerLevel ;
    private int pagesPrinted = 0 ;
    private boolean duplex ;

    public Printer(int tonerLevel, boolean duplex) {

        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1 ;
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {

        if (tonerAmount > 0 && tonerAmount <= 100  ) {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount ;
                return tonerLevel ;
            }
        }
        else return -1  ;

    }

    public int printPages (int pages) {

        int pagesToPrint = pages ;

        if (duplex)  {
            System.out.println("This is Duplex Printer");
            pagesToPrint = pages / 2  +  pages % 2;
            pagesPrinted +=  pagesToPrint ;
            return pagesToPrint;
        } else {
            pagesPrinted += pagesToPrint ;
            return pagesToPrint ;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}

class Main {

    public static void main(String[] args) {

//        Printer printer = new Printer( 20 , true);
//
//        System.out.println(printer.addToner(15));
//        System.out.println(printer.printPages(7));
//
//        System.out.printf("Pages to print = %d , Total Pages Printed = %d %n", printer.printPages(5),
//                printer.getPagesPrinted());
//
//        System.out.printf("Pages to print = %d , Total Pages Printed = %d %n" , printer.printPages(10),
//                printer.getPagesPrinted());
//
//        printer.setDuplex(false);
//
//        System.out.printf("Pages to print = %d , Total Pages Printed = %d %n" , printer.printPages(10),
//                printer.getPagesPrinted());

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

    }
}
