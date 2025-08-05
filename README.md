# Kubernatives DevOps Nagarro Assignment

This repository contains a Spring Boot microservice application for managing employee records, designed for deployment on Kubernetes. The project demonstrates DevOps practices including containerization, orchestration, and persistent data management.

---

## 📦 Code Repository

- **GitHub Repository:** [kubernatives-devops-nagarro-assignment](https://github.com/pushkarkhosla379/kubernatives-devops-nagarro-assignment)

---

## 🐳 Docker Image

- **Docker Hub URL:** [https://hub.docker.com/r/pushkarkhosla379/kubernatives-devops-nagarro-assignment](https://hub.docker.com/r/pushkarkhosla379/kubernatives-devops-nagarro-assignment)

---

## 🌐 Service API Tier

- **API Endpoint to View Records:**  
  [http://34.58.153.8.nip.io/employee](http://34.58.153.8.nip.io/employee)  
  *(Replace with your actual external IP if different)*

---

## 🎬 Screen Recording Video

- **Video Demonstration:**  
  [Google Drive - Kubernetes Demo Video](https://drive.google.com/file/d/your-demo-video-id/view?usp=sharing)  
  *(Replace with your actual video link)*

### What’s shown in the video:
1. **All Kubernetes Objects Deployed and Running:**  
   - Deployments, Services, Ingress, ConfigMaps, Secrets, PersistentVolumeClaims for both API and database tiers.
2. **API Call Retrieving Records from Database:**  
   - Using `/employee` endpoint to fetch employee records stored in PostgreSQL.
3. **Kill API Microservice Pod and Show Regeneration:**  
   - Demonstrates self-healing by deleting the API pod and showing Kubernetes automatically recreates it.
4. **Kill Database Pod and Show Regeneration with Persistent Data:**  
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
  `GET http://34.58.153.8.nip.io/employee`

- **Create sample data:**  
  `GET http://34.58.153.8.nip.io/employee/createSampleData`

---

## 📂 Project Structure

- `src/main/java/` – Spring Boot source code
- `k8s/app/` – Kubernetes manifests for API tier
- `k8s/db/` – Kubernetes manifests for PostgreSQL database
- `Dockerfile` – Container build instructions

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

## 📝 Notes

- Ensure your Kubernetes cluster supports Ingress and Persistent Volumes.
- Update external URLs and video links as needed for your environment.

---

## 👤 Author

pushkarkhosla
