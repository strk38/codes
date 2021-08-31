public class StringAlly {
    public boolean EndsWith(char[]s1,char[]s2) {
        if (s1.length == 0) {
            return false;
        } else if (s2.length > s1.length) {
            return false;
        } else {
            for(int i=s2.length-1;i>2;i--){
                if(s1[i]!=s2[i]){
                    return false;
                }
            }

            return true;
        }
    }
}
