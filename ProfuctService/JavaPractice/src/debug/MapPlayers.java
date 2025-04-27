package debug;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class MapPlayers
{
    public static void main(String[] args)
    {
        List<Players>players=fetchTeamWiseList();
        Map<String, List<Players>> teamWisePlayers =fetchTeamWisePlayers(players);
        Map<String, Double> teamWiseAverage = fetchTeamAverageMap(players);
        printPlayersToReport(teamWisePlayers,teamWiseAverage);
    }

    public  static void printPlayersToReport(Map<String, List<Players>> teamWisePlayers, Map<String, Double> teamWiseAverage) {

    }

    private static Map<String,Double> fetchTeamAverageMap(List<Players>players)
    {

        Map<String, Double> averageAgeByTeam = players.stream()
                .collect(Collectors.groupingBy(
                        Players::getTeam,
                        Collectors.averagingInt(Players::getAge)
                ));
        return averageAgeByTeam;
    }

    public static List<Players> fetchTeamWiseList()
    {
        List<Players>players=new ArrayList<>();
        String teams[]={"Team India","Team SA","Team EN"};
        Random random=new Random();
        char ch='A';
        for(int i=1;i<=20;i++)
        {
            int age = 20 + random.nextInt(11); //
            int teamSelection=random.nextInt(3);
            players.add(new Players(" " +ch,age,teams[teamSelection]));
            ch++;
        }
       return players;
    }
    public static Map<String,List<Players>>fetchTeamWisePlayers(List<Players> players)
    {
        Map<String, List<Players>> collect = players.stream().collect(Collectors.groupingBy(pl -> pl.getTeam()));
        return collect;
    }
}
