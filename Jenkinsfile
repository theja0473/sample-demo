pipeline {
    agent any
    environment(readFile("${workspace}/tcx_38_Env.groovy").split('/n') as List)
    
    stages {
        stage('Build') {
            steps {
                echo "Branch_env_var is ${env.Micro}"
                echo "Python_exe path is ${env.python_exe_path}"
                sh 'printenv'
            }
        }
    }
}
