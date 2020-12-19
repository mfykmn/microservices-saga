# Manual
## docker-composeによる環境構築

```ShellSession
user@host: ~/workspace/microservice-sage $ docker-compose -f docker-compose.yml up
```

## Usage

- Mongo Expressを開く
    ```ShellSession
    user@host: ~ $ open http://0.0.0.0:8081
    ```
- Mongo CLIを利用する
    ```ShellSession
    user@host: ~/workspace/microservice-sage $ docker-compose exec db bash
    root@266dd6efb58d:/# mongo admin -u root -p
    ```