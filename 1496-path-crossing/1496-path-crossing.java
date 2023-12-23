class Solution {
    public boolean isPathCrossing(String path) {
        
        int x = 0, y =0;
        Set <String> visited = new HashSet<>();
        visited.add("0,0");

        for(char dirction: path.toCharArray()){
            if(dirction == 'E'){
                x++;
            }
            else if(dirction == 'W'){
                x--;
            }
            else if(dirction == 'N'){
                y++;
            }
            else if(dirction == 'S'){
                y--;
            }

            String currentPos = x + ","+y;
            if(visited.contains(currentPos)){
                return true;
            }
            visited.add(currentPos);

        }
        return false;
        
    }
}