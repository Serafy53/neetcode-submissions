class Solution {
    public int calPoints(String[] operations) {
        List<Integer> score = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int lastScore = score.get(score.size() - 1);
                int secondLastScore = score.get(score.size() - 2);
                int addition = lastScore + secondLastScore;
                score.add(addition);
            } else if (operations[i].equals("C")) {
                score.removeLast();
            } else if (operations[i].equals("D")) {
                int lastScore = score.get(score.size() - 1);
                int doubleNumber = lastScore * 2;
                score.add(doubleNumber);
            } else {
                score.add(Integer.parseInt(operations[i]));
            }
        }

        int total = 0;

        for (int i = 0; i < score.size(); i++) {
            total += score.get(i);
        }

        return total;
    }
}