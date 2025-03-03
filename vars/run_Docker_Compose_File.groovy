def call(){
  echo "Executing docker file"
  sh "docker-compose up -d"
  echo "Docker file Executed successfully"
}
