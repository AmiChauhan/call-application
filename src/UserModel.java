public class UserModel {
    private int number;
    private String name;
    private boolean pic;
    private String date;
    private int incoming;
    private int outgoing;
    private int misscall;

    public UserModel() {
    }


    public UserModel(int number, String name, boolean pic, String date, int incoming, int outgoing, int misscall) {
        this.number = number;
        this.name = name;
        this.pic = pic;
        this.date = date;
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.misscall = misscall;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPic()
    {
        return pic;
    }

    public void setPic(boolean pic) {
        this.pic = pic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIncoming() {
        return incoming;
    }

    public void setIncoming(int incoming) {
        this.incoming = incoming;
    }

    public int getOutgoing() {
        return outgoing;
    }

    public void setOutgoing(int outgoing) {
        this.outgoing = outgoing;
    }

    public int getMisscall() {
        return misscall;
    }

    public void setMisscall(int misscall) {
        this.misscall = misscall;
    }

}

