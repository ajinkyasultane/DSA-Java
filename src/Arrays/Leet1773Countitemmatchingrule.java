package Arrays;

import java.util.List;

public class Leet1773Countitemmatchingrule {
    public static void main(String[] args)
    {

        String[][] items = {{"phone","blue","pixel"}
                ,{"computer","silver","lenovo"},
                {"phone","gold","iphone"}};
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(countmatches(items, ruleKey, ruleValue));
    }
    static int countmatches(String[][] items, String ruleKey, String ruleValue)
    {
        int index = 0;
        if(ruleKey.equals("type"))
        {
            index = 1;
        }
        else if(ruleKey.equals("name"))
        {
            index = 2;
        }
        int count = 0;

        for (String[] it : items)
        {
            if (it[index].equals(ruleValue))
            {
                count++;
            }

        }
        return count;
    }
}
