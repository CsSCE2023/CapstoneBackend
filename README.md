# User Management Module

This module is intended to serve as a manager of user data, authentication tasks and as an API gateway for the
rest of microservices.

## To run the project

Use .env to specify environment configuration. You can use .env.example as a template.

To run outside of docker, you need to have python 3.10 and poetry installed + postgres running,
and then run the following commands:

```commandline
poetry install
poetry run python3 manage.py runserver
```

To run inside of docker, which is recommended, use this

```commandline
docker compose build 
docker compose up
```
