
## How to run

The scripts are used for automated tasks. 
To run them inside docker with django service named "backend", start the docker services and run: 

```commandline
docker compose exec backend poetry run python core/manage.py runscript <script_name>
```
