set -ex
project=my-chart
helm install --set version=$GO_PIPELINE_LABEL $project ops/helm --values ops/helm/values.yaml
sleep 30
export POD_NAME=$(kubectl get pods --namespace default -l "app.kubernetes.io/name=bootcamp,app.kubernetes.io/instance=$project" -o jsonpath="{.items[0].metadata.name}")
kubectl --namespace default port-forward $POD_NAME 8000:80 &
