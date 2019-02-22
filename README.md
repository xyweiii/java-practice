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






**scp 本地文件----> 远程文件**
scp命令的实际应用概述： 

从本地服务器复制到远程服务器：

* 本地 ---> 远程*
 scp  /opt/soft/   root@192.168.120.204:/opt/soft/nginx-0.5.38.tar.gz


**scp 远程文件----> 本地文件**

scp root@192.168.120.204:/opt/soft/nginx-0.5.38.tar.gz /opt/soft/


**nohup后台启动**

nohup  java  -jar  xxxxx.jar   &



**jar 解压文件**

解压jar文件
jar  -xvf  xxxx.jar

**@RabbitListener**

rabbitmq只监听queue
@RabbitListener(queuesToDeclare = @Queue("myQueue"))

rabbitmq自动创建change和queue
@RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))



**查看端口情况**
netstat -tunlp|grep 9080

lsof -i:9080
