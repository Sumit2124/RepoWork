import java.util.ArrayList;
import java.util.List;

public class Voter {
    List<String> voters = new ArrayList<>();

    public static void main(String[] args)
    {
        Voter voter = new Voter();
        voter.voters.add("v1");
        voter.voters.add("v2");
        voter.voters.add("v3");
        voter.voters.add("v4");
        voter.voters.add("v5");
        System.out.println(voter.voters);
    }


}
