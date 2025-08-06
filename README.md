# Kubernatives DevOps Nagarro Assignment

This is a Spring Boot microservice for managing employee records. It's built to run on Kubernetes and shows how to use DevOps practices like containerization, orchestration, and managing data that needs to be saved.

---

## 📦 Code Repository

- **GitHub Repository:** [kubernatives-devops-nagarro-assignment](https://github.com/KhoslaPushkar/kubernatives-devops-nagarro-assignment)

---

## 🐳 Docker Image

- **Docker Hub URL:** [https://hub.docker.com/r/pushkarkhosla379/kubernatives-devops-nagarro-assignment](https://hub.docker.com/r/pushkarkhosla379/kubernatives-devops-nagarro-assignment)

---

## 🌐 Service API Tier

- **API Endpoint to View Records:**  
  [http://34.69.2.223.nip.io/employee/](http://34.69.2.223.nip.io/employee/)

---

## 🎬 Screen Recording Video

- **Video Demonstration:**  
  [OneDrive – Access the Assignment Video Here](https://nagarro-my.sharepoint.com/:v:/p/pushkar_khosla/EU1maTUjDT1JvHTp7S3qfMwBA0WZqH9a2U4BtVP3CQge7g?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=y4iuWK)  

### What’s shown in the video:
   - All Kubernetes Objects Deployed and Running
   - Deployments, Services, Ingress, ConfigMaps, Secrets, PersistentVolumeClaims for both API and database tiers.
   - Using `/employee` endpoint to fetch employee records stored in PostgreSQL.
   - Demonstrates self-healing by deleting the API pod and showing Kubernetes automatically recreates it.
   - Deletes the PostgreSQL pod and shows it regenerates, with data preserved due to persistent volume claim.

---

## 🚀 Quick Start

### 1. Build & Push Docker Image

```sh
mvn clean package
docker build -t pushkarkhosla379/kubernatives-devops-nagarro-assignment:latest .
docker push pushkarkhosla379/kubernatives-devops-nagarro-assignment:latest
```

### 2. Deploy on Kubernetes

Apply manifests in the following order:

```sh
kubectl apply -f k8s/db/postgres-db-pvc.yaml
kubectl apply -f k8s/db/postgres-db-configmap.yaml
kubectl apply -f k8s/db/postgres-db-secret.yaml
kubectl apply -f k8s/db/postgres-db-deployment.yaml
kubectl apply -f k8s/db/postgres-db-service.yaml

kubectl apply -f k8s/app/springboot-deployment.yaml
kubectl apply -f k8s/app/springboot-service.yaml
kubectl apply -f k8s/app/ingress.yaml
```

### 3. Access the API

- **View all employees:**  
  `GET http://34.69.2.223.nip.io/employee/`

- **Create sample data:**  
  `GET http://34.69.2.223.nip.io/employee/createSampleData`

---

## 📂 Project Structure

- `src/main/java/` – Spring Boot source code
- `src/main/resources/application.properties` –  Contains configuration for database connection, connection pooling, JPA settings, and server port.  
- `src/main/resources/schema.sql` –  SQL script of the application's table, shared for reference to illustrate its structure.
- `pom.xml` –  Maven configuration file that specifies project dependencies, the Java version, and build-related configurations required for the service.
- `k8s/app/` – Kubernetes manifests for API tier
- `k8s/db/` – Kubernetes manifests for PostgreSQL database
- `Dockerfile` – Container build instructions
- `.github/workflows/` –  This folder contains GitHub Actions YAML **(docker-build-push.yaml)** file that automate the CI/CD process. It builds the Docker image from your source code and pushes it to Docker Hub automatically whenever any changes are made to the code.

---

## 🛠️ Kubernetes Objects

- **API Tier:**  
  - Deployment: 4 replicas, auto-healing
  - Service: ClusterIP
  - Ingress: External access via nip.io

- **Database Tier:**  
  - Deployment: PostgreSQL 14
  - Service: ClusterIP
  - PersistentVolumeClaim: Retains data across pod restarts
  - ConfigMap & Secret: DB credentials and configuration

---

## 👤 Author

- **Pushkar Khosla (pushkar.khosla@nagarro.com)**
