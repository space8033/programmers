public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skillTree : skill_trees) {
            String st = skillTree;

            for(int i = 0; i < skillTree.length(); i++) {
                String s = skillTree.substring(i, i+1);
                if(!skill.contains(s)) {
                    st = st.replace(s, "");
                }
            }

            if(skill.indexOf(st) == 0) {
                answer++;
            }
        }

        return answer;
    }
}
