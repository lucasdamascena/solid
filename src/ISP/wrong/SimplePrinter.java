package ISP.wrong;

/**
 * The SimplePrinter class does not support the scan() and fax() methods, but it is forced to implement them,
 * resulting in runtime exceptions.
 * This goes against the ISP, as the class is not utilizing all the methods of the interface.
 */
class SimplePrinter implements Machine {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scanning not supported!");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Faxing not supported!");
    }
}