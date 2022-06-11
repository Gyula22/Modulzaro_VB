package hu.progmatic;

public class Games {
    private int year;
    private String stage;
    private String date;
    private String TeamA;
    private String TeamB;
    private int goalsA;
    private int goalsB;
    private int penalityA;
    private int penalityB;

    public Games() {
    }

    public Games (String csvLine) {
        String [] data = csvLine.split(";");
        if ( data.length > 7) {
        this.year = Integer.parseInt(data[0]);
        this.stage = data[1];
        this.date = data[2];
        this.TeamA = data[3];
        this.TeamB = data[4];
        this.goalsA = Integer.parseInt(data[5]);
        this.goalsB = Integer.parseInt(data[6]);
        this.penalityA = Integer.parseInt(data[7]);
        this.penalityB = Integer.parseInt(data[8]);
        } else {
            this.year = Integer.parseInt(data[0]);
            this.stage = data[1];
            this.date = data[2];
            this.TeamA = data[3];
            this.TeamB = data[4];
            this.goalsA = Integer.parseInt(data[5]);
            this.goalsB = Integer.parseInt(data[6]);
            this.penalityA = 0;
            this.penalityB = 0;

        }


    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamA() {
        return TeamA;
    }

    public void setTeamA(String teamA) {
        TeamA = teamA;
    }

    public String getTeamB() {
        return TeamB;
    }

    public void setTeamB(String teamB) {
        TeamB = teamB;
    }

    public int getGoalsA() {
        return goalsA;
    }

    public void setGoalsA(int goalsA) {
        this.goalsA = goalsA;
    }

    public int getGoalsB() {
        return goalsB;
    }

    public void setGoalsB(int goalsB) {
        this.goalsB = goalsB;
    }

    public int getPenalityA() {
        return penalityA;
    }

    public void setPenalityA(int penalityA) {
        this.penalityA = penalityA;
    }

    public int getPenalityB() {
        return penalityB;
    }

    public void setPenalityB(int penalityB) {
        this.penalityB = penalityB;
    }
}