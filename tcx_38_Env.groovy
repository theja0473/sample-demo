#!/usr/bin/env groovy
environment{
  Micro = 'tcx_38'
  python_exe_path = "c:\\Python27\\python.exe"
}
def print_vars(){
  println "Micro: ${env.Micro}"
  println "Python_Path: ${env.python_exe_path}"
}

return this
