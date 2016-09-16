#!/bin/sh
# m.sh - tst gitacp.sh =  Quick Add, Commit, Push  script

if [ -z "$1" ]; then
  echo "will do:  git commit -m \"Misc\" "
else
  echo "Will do:  git commit -m : "
  echo "$@"
fi
