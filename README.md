:rat: coding

- **pull docker image**

```
docker pull landoop/fast-data-dev
```

- **how to run docker image :**

```
sudo docker run --rm -p 2181:2181 -p 3030:3030 -p 8081-8083:8081-8083 -p 9581-9585:9581-9585 -p 9092:9092 -e ADV_HOST=localhost landoop/fast-data-dev:latest
```
:rat: coding

- **how to create new topic**

```
kafka-topics --create --topic papryk-topic --partitions 1 --replication-factor 1 --zookeeper 127.0.0.1:2181
```
:rat: coding
