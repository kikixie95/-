# note

用hashmap将count和domain mapping
取count 和 domain的方法：for循环，一但遇到空格，（0，i)是数字，substring（i+1）是domain
取每个subdomain的方法：遍历domain字符串，遇到"."就将substring（i+1）作为一个新的domain存进map