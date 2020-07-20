def env_vars;

pipeline {
    agent any
    env_vars = load "${workspace}/tcx_38_Env.groovy"
    stages {
        stage('Build') {
            steps {
                echo "Branch_env_var is ${env_vars.Micro_var}"
                echo "Python_exe path is ${env_vars.python_exe_path}"
                env_vars.print_vars();
                sh 'printenv'
            }
        }
    }
}
