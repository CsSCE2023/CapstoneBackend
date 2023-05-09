## Purpose

There are going to be tests to insure that chnages in the code does not change properties of the website. Although there are pre-commit tests in-place, they do not test for the purpose of the code. We will test URLs, Models and Views(maybe) of the project to have the desired outcome. 

To run the tests for "myapp" in the service "backend":
```commandline
docker compose exec backend poetry run python core/manage.py test myapp
```

Note that the tests are still in developement and auto-testing is turned off. To turn them on as pre-commit tests, go to the ".pre-commit-config.yaml" file and uncomment the last section.

* This folder will be moved outside of any app to contain all the necessary tests in one place.
