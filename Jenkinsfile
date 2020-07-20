#!/usr/bin/env groovy

def loadEnvironmentVariables(path){
    def props = readProperties  file: path
    keys= props.keySet()
    for(key in keys) {
        value = props["${key}"]
        env."${key}" = "${value}"
    }
}

pipeline {
    agent any
    environment{
          Micro_var = 'tcx_38'
          python_exe_path = "c:\\Python27\\python.exe"
    }
    stages {
        loadEnvironmentVariables("${workspace}/pic_env_vars.properties")
        stage('Build') {
            steps {
                echo "Branch_env_var is ${env.Micro_var}"
                echo "Python_exe path is ${env.python_exe_path}"
                echo "Branch_env_var is ${env.Micro_var_new}"
                echo "Python_exe path is ${env.python_exe_path_new}"
                sh 'printenv'
            }
        }
    }
}
