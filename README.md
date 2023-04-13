# User Management Module

This module is intended to serve as a manager of user data, authentication tasks and as an API gateway for the
rest of microservices.

## Configuration

To establish [pre-commit](https://git-scm.com/book/en/v2/Customizing-Git-Git-Hooks#:~:text=The%20pre%2Dcommit%20hook%20is,to%20inspect%20in%20the%20code.)
hook and install dependencies, run the following commands:

```commandline
make install
make pre-commit-install
```

## To run the project

Use `.env` to specify environment configuration. You can use `.env.example` as a template.

To run outside of docker, you need to have python 3.10 and poetry installed + postgres running,
and then run the following commands:

```commandline
poetry install
poetry run python3 core/manage.py runserver
```

To run inside of docker, which is recommended, use this

```commandline
docker compose build 
docker compose up
```
