pipeline {
    agent any
    environment{
          Micro_var = 'tcx_38'
          python_exe_path = "c:\\Python27\\python.exe"
    }
    stages {
        stage('Build') {
            steps {
                echo "Branch_env_var is ${env.Micro_var}"
                echo "Python_exe path is ${env.python_exe_path}"
                sh 'printenv'
            }
        }
    }
}
