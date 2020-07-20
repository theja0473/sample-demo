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
        stage('Build') {
            steps {
                loadEnvironmentVariables("${workspace}/pic_env_vars.properties")
                echo "Branch_env_var is ${env.Micro_var}"
                echo "Python_exe path is ${env.python_exe_path}"
                echo "Branch_env_var is ${env.Micro_var_new}"
                echo "Python_exe path is ${env.python_exe_path_new}"
                println "JOB_NAME is ${env.JOB_NAME}"
                println "JOB_URL is ${env.JOB_URL}"
                println "BUILD_NUMBER is ${env.BUILD_NUMBER}"
                println "BUILD_TAG is ${env.BUILD_TAG}"
                println "BRANCH_NAME is ${env.BRANCH_NAME}"
                println "GIT_AUTHOR_NAME is ${env.GIT_AUTHOR_NAME}"
                println "NODE_NAME is ${env.NODE_NAME}"
                sh 'printenv'
            }
        }
    }
}
