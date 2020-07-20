pipeline {
    agent any

    environment {
        def workspace = pwd() 
        def job_var = evaluate(new File("${workspace}@script/tcx_38_Env.groovy"));
    }

    stages {
        stage('Build') {
            steps {
                echo "WOrkspace Path is ${workspace}"
                echo "Branch_env_var is ${job_var.Micro}"
                echo "Python_exe path is ${job_var.python_exe_path}"
                sh 'printenv'
            }
        }
    }
}
