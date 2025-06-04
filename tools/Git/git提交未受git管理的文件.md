## 操作步骤

1. **初始化本地Git仓库**

   ```
   git init
   ```

2. **添加远程仓库**

   ```
   git remote add origin 远程仓库名
   ```

3. **获取远程仓库内容**

   ```
   git fetch origin
   ```

4. **创建并切换到新分支（推荐）**

   ```
   git checkout -b 新的分支名
   ```

5. **重置工作区到远程仓库状态**

   ```
   git reset --hard origin/master
   ```