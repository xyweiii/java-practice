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
git push -u origin master