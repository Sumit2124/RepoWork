package debug;

public class Players
{
    private String name;
    private int age;
    private String team;

    public String getName() {
        return name;
    }

    public Players(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                '}';
    }
}
