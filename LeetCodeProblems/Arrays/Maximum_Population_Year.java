package EasyProblems;

public class Maximum_Population_Year {
    public static void main(String[] args) {
        int[][] logs = {{1950, 1961},{1960, 1971},{1970, 1981}};
        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int[] years = new int[2050 - 1950 + 1];

        //filling population in each year
        for(int i = 0; i < logs.length; i++) {
            for(int j = logs[i][0]; j < logs[i][1]; j++) {
                years[j - 1950]++;
            }
        }
        int maxPopulation = 0;
        int earlyYear = 1950;
        //check which year is having maximum population by and by how much
        for(int i = 0 ; i < years.length; i++) {
            if(years[i] > maxPopulation) {
                maxPopulation = years[i];
                earlyYear = 1950 + i;
            }
        }

        return earlyYear;
    }
}
