# hazelcast-platform-operator
Simple project with Hazelcast platform operator



# 1 Add the Hazelcast Helm Charts repository
```console
helm repo add hazelcast https://hazelcast-charts.s3.amazonaws.com/
helm repo update
```

# 2 deploy the Hazelcast Platform Operator
```console
helm install operator hazelcast/hazelcast-platform-operator --version=5.10.0 \
    --set=installCRDs=true
```

# 3 Operator logs
```console
k logs deployment.apps/operator-hazelcast-platform-operator
```

# 4 Start hazelcast
```console
k apply -f hazelcast-smart.yaml
```

# 5 Map configs
```console
k apply -f map-sample.yaml
```

# 6 Check hazel cast is running
```console
k get hazelcast
```

# 6 Deploy management center
```console
k apply -f management-center.yaml
```
