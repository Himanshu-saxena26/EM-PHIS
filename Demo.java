Demo
The error you're seeing occurs
 because in PowerShell, the ls command is an
  alias for the Get-ChildItem cmdlet, but the -a
   option is not valid in PowerShell. 
In PowerShell, the correct option to show hidden files is -Force.


checked