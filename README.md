# User Management Module

This module is intended to serve as a manager of user data, authentication tasks and as an API gateway for the
rest of microservices.

## Configuration

To begin using the dockerized version, you need to install [Docker](https://docs.docker.com/get-docker/). The Docker engine is enough, although the desktop version is easier to work with. 

For local running, You need to install Python V3.10, [Poetry](https://python-poetry.org/docs/) as well as pre-commit. To install pre-commit, run:
```commandline
pip install pre-commit
```
Also, you need a postgres server running on your machine with the database already created.

To establish [pre-commit](https://git-scm.com/book/en/v2/Customizing-Git-Git-Hooks#:~:text=The%20pre%2Dcommit%20hook%20is,to%20inspect%20in%20the%20code.)
hook and install dependencies, run the following commands:

```commandline
make install
make pre-commit-install
poetry install
```

## To run the project

Use `.env` to specify environment configuration. You can use `.env.example` as a template.



To run outside of docker, run the following commands:

```commandline
poetry run python3 core/manage.py runserver
```

For the dockerized version, inside the Backend folder, you need to run the dockerfile twice. First run:
```commandline
docker compose build 
docker compose up
```
In the first run, wait a few seconds for Postgres to initialize the database and then cancel with ctrl+c, then stop the containers and run them agian:
```commandline
docker compose down
docker compose up
```
