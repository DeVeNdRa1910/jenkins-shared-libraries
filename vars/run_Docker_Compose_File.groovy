def call() {
    echo "Executing Docker Compose file"
    sh "docker compose down && docker compose up -d"
    echo "Docker Compose file executed successfully"
}
