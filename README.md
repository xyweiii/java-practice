_**`git相关的问题总结`**_


**远程仓库新建项目**

echo "# java-practice" >> README.md
git init

git add README.md

git commit -m "first commit"

git remote add origin https://github.com/iterxywei/java-practice.git

git push -u origin master

**本地项目关联远程仓库**

git remote add origin https://github.com/iterxywei/java-practice.git

如果出现fatal: refusing to merge unrelated histories,则用以下命令
git pull origin master  --allow-unrelated-histories

git push -u origin master

**git log 一行显示提交信息**

git log  --pretty=oneline

**git reset 回退提交**

git checkout -- readme.txt

A->B->C
当前commit版本是C，想要回退到B

git  reset  --hard  HEAD^   回退到上一个版本的commit

git  reset  --hard  HEAD^^  回退到上上版本

git reset --hard commit_id

git  reflog  查看所有的变更记录



**git 变更远程仓库**


【git remote rm origin】 删除现有远程仓库 
【git remote add origin url】添加新远程仓库




**git pull忽略提交历史**

git pull --allow-unrelated-histories    (忽略版本不同造成的影响)



**scp命令**
scp命令的实际应用概述： 

从本地服务器复制到远程服务器：

* 本地 ---> 远程*
 scp  xxxx  root@xxxxx:/data


命令格式： 

scp local_file remote_username@remote_ip:remote_folder 

或者 

scp local_file remote_username@remote_ip:remote_file 

或者 

scp local_file remote_ip:remote_folder 

或者 

scp local_file remote_ip:remote_file 

第1,2个指定了用户名，命令执行后需要输入用户密码，第1个仅指定了远程的目录，文件名字不变，第2个指定了文件名 

第3,4个没有指定用户名，命令执行后需要输入用户名和密码，第3个仅指定了远程的目录，文件名字不变，第4个指定了文件名  


