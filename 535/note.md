# note

encode
用一个自增数字和longurl使用HashMap记录映射关系；
return http://tinyurl.com/+自增数字


decode
将 http://tinyurl.com/部分replace掉，得到自增数字，通过hashmap找到原url

