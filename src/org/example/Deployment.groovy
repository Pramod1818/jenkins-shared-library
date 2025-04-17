package org.example

class Deployment implements Serializable {
    def steps

    Deployment(steps) {
        this.steps = steps
    }

    def deployApp(String environment) {
        steps.echo "Deploying to ${environment}..."
        steps.sh "echo 'Deploy to ${environment}'"
    }
}
