@echo off

path %systemdrive%\App\VSCode;%path%

set "插件目录=.vscode\extensions"
set "用户数据目录=.vscode\PY"

code --user-data-dir %用户数据目录%

exit

