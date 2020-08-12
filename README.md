# spell-command
Bash script to check the spelling of any command. If no typo then it will execute the command.

# Installation
1. Install aspell http://aspell.net/
2. Copy sc to /usr/local/bin (or any other suitable to globally execute your binary)

# Usage
1. sc < your command with options >
2. If no typo, will execute your command
3. If typos are found, will block your command and show the typo words.