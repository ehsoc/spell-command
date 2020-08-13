# spell-command
Bash script to check the spelling of any command. If no typo is present, then the command will be executed.

## Installation

1. Install aspell http://aspell.net/
2. Copy sc to `/usr/local/bin` (or any other suitable folder to globally execute this script.)

## Usage

1. In your terminal type:
```bash
sc <your command with options>
```
2. If no typo is present, then your command will be executed.
3. If typos are found, this function will block your command and show the words with typos.

### Example: 

```bash
sc git commit -m 'my fyrst commut'
```
Will output:
```bash
Blocking your command. Typos were found:
fyrst commut
```