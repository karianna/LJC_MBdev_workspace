#!/bin/sh
# gitacp.sh - Quick Add, Commit, Push  script 

if [ -z "$1" ]; then 
  git commit -m "Misc"
else
  git commit -m "$@"
fi

git add -A

git push origin master
