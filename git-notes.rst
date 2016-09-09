git
===
git rm
------

  - *always* use "git rm --cached" otherwise the file will also be deleted from the local filesystem.

Branches
--------

  - git checkout -b <newbranch>
  - work on it
  - git commit -m "" --- committing to the local branch
  - git push origin <newbranch> -- pushing the branch to the remote repository only for the first time, next time only git push works
  - git checkout master - switch to master with which you want to merge
  - git pull - take the fresh changes
  - git merge --no-ff <newbranch> - merge
  - git push - push the changes to the repo
  - git branch -d <newbranch> - delete it

git diff
--------

- To get the diff with the remote version and the local version for a particular file: git diff <remote-branch> -- <file> e.g. git diff origin/linear -- src/main/java/components/Piece.java
