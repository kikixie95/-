# note

num模7的余数是以7为底的数的最低位；

res  = num%7+res;
num = num/7;

**0是特殊情况**， 若num == 0 return ”0“