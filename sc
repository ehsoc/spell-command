#!/bin/sh
words=$(echo "$@" | aspell list)
if [ ! "$words" ]; then
    printf "%s\n" "No typos found. Proceeding with your command..."
    "$@"
    exit
fi
printf "%s\n" "Blocking your command. Typos were found:"
echo $words
printf "\n"