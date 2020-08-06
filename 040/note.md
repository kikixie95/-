# note

组合，这和之前一个求组合sum的题类似，不一样的是这题不能重复用一个数；那么就加一个判断条件即可；if(i>idx && nums[i-1] == nums[i] ) continue;