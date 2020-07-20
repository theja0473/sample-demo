pipeline {
    agent any

    environment {
        def workspace = pwd() 
        def job_var = evaluate(new File("${workspace}/tcx_38_Env.groovy"));
    }

    stages {
        stage('Build') {
            steps {
                echo "WOrkspace Path is ${workspace}"
                echo "Branch_env_var is ${env.Micro}"
                echo "Python_exe path is ${env.python_exe_path}"
                sh 'printenv'
            }
        }
    }
}
