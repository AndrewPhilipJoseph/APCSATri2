package FRQ4;

public class Host {

}


class Invitation
{
    private String hostName;
    private String address;

    public Invitation(String n, String a)
    {
        hostName = n;
        address = a;
    }

    public String getHostName() {
        return hostName;
    }

    public void updateAddress(String change) {
        address = change;
    }


    public void formalInvite(String invitee) {
        System.out.println("Dear " + invitee + ", please attend my event at " + address + ".");
        System.out.println("See you then, " + hostName + ".");
    }


    public Invitation(String address)
    {
        this.address = address;
        hostName = "Host";
    }


    public static void main(String[] args) {
        Invitation invite = new Invitation("Karen", " 1234 Walnut Street");
        invite.formalInvite("Cheryl");

    }

}