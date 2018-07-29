**git 分之操作**
git check -b  xxx分之名    新建分之 并切换到xxx

git branch -d xxx分之名    删除本地分之

git merge xxx分之名    把xxx分之合并到当前所在的分之

记录每次merge

git merge --no-ff -m "merge with no-ff" dev

git branch -D  xxx分之名  强行删除分之


当前分之在远程仓库已经存在,本地新建与远程分之一样的分之

git checkout -b branch-name origin/branch-name

当前分之在本地有 但是没有关联到远程分之

git branch --set-upstream branch-name origin/branch-name

