pipeline {
    agent any

    environment {
        def job_var = evaluate(new File("tcx_38_Env.groovy"));
    }

    stages {
        stage('Build') {
            steps {
                echo "Branch_env_var is ${job_var.Micro}"
                echo "Python_exe path is ${job_var.Micro}"
                sh 'printenv'
            }
        }
    }
}
