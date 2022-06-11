package hu.progmatic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {

        try {
            List<Games> games = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader("matches_all.csv"));
                String line;
                reader.readLine();

                while ((line = reader.readLine()) != null) {
                    Games game = new Games(line);
                    games.add(game);


                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Number of matches: " + games.size());

            System.out.println(" Year of Worldcup: ");
            Scanner scanner = new Scanner(System.in);
            int year = Integer.parseInt(scanner.nextLine());

            int max = Integer.MIN_VALUE;

            for (Games goldif : games) {
                int sum = 0;
                if (goldif.getYear() == year) {
                    sum = Math.abs(goldif.getGoalsA() - goldif.getGoalsB());
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println("2 : Maximum goal difference : " + max);

            int sum = 0;

            for (Games bets : games) {
                if (bets.getYear() == year){
                    if (bets.getGoalsA() > bets.getGoalsB()){
                        sum++;
                }

            }
        }
            System.out.println("3 : The player has won "+ sum + " bets");

            try (PrintWriter writer = new PrintWriter("selected.csv")) {
                writer.println("stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties_b");
                for (Games matchesAll : games) {
                    if (matchesAll.getYear() == (year)){
                        writer.write( matchesAll.getStage() + ";" +
                                matchesAll.getDate() + ";" + matchesAll.getTeamA() + ";"
                                + matchesAll.getTeamB() + ";" +matchesAll.getGoalsA() + ";" + matchesAll.getGoalsB() +
                                "," + matchesAll.getPenalityA() + ";" +matchesAll.getPenalityB() +"\n");
                    }
                }
            }

            Map<String, Integer> golasByStage = new TreeMap<>();
            System.out.println("4 :  Goals by stage: ");

            for ( Games gamesResults : games) {
                if (gamesResults.getYear() == year) {
                    int count = golasByStage.getOrDefault(gamesResults.getStage(),0);
                    golasByStage.put(gamesResults.getStage(), count + (gamesResults.getGoalsA() + gamesResults.getGoalsB()));

                }
            }
            for (String stage : golasByStage.keySet()) {
                System.out.println(stage + " : " + golasByStage.get(stage));
            }


                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

