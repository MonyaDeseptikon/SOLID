package homework;

public class AndroidUser  extends  User implements Printer{
        public AndroidUser(String name) {
        super(name);
    }

    @Override
    public void printName() {
        TerminalPrint.printName(this.getName());
    }

    @Override
    public void report() {
        ReportUser.report(this.getName());
    }

    @Override
    public void save() {
        PersisterUser.save(this);
    }




}
