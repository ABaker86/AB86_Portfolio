<#
.Synopsis
   Simple file search
.DESCRIPTION
   searches a specific Path for 
   file(s) with extension
   .doc,.docx,.xls, and .xlsx
   Outputs results to C:\File_Summary.txt
   containing file names, sizes, cumulitive
   files and sizes by extension
#>
# Sets the path to search
$Paths = Read-Host "--Enter Path for Search--"
# Sets the variable $x to file name and size ending with specific extensions
$x = gci -include *.docx, *.doc, *.xls, *.xlsx  $Paths -R | select name,@{Name="Size";Expression={$_.Length / 1Kb}}|
    Sort-Object extension|Format-Table -AutoSize *
# Sets variable $fileOutput to total size for each extension
$fileOutput = for($i = 1; $i -le 4; $i++) {
#switch statment for determining the order of displaying total size by extension
        switch ($i){
            1 {$Extension = ".docx"}
            2{$Extension = ".doc"}
            3{$Extension = ".xls"}
            4{$Extension = ".xlsx"}}
# Sets variable colItems to the cumulitive size per extension(s)
$colItems = (gci $Paths | where {$_.Extension -eq $Extension}|measure -property length -sum)
# Sets variable $ttlItems to the items with specific extension(s)
$ttlItems = (gci $Paths -R| where {$_.Extension -eq $Extension} )
            "Total Size "+$Extension +" "+"{0:N2}" -f ($colItems.sum / 1MB) + " MB" 
            "Total # of "+$Extension+ $ttlItems.Count+"`r`n"}
#print information out to File_Summary.txt
$x| Out-File C:\File_Summary.txt
$fileOutput | Out-File C:\File_Summary.txt -Append