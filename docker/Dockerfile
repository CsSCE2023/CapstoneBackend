FROM python:3.10-bullseye

ENV PYTHONUNBUFFERED=1
ENV POETRY_HOME=/etc/poetry
ENV PATH="$POETRY_HOME/bin:$VENV_PATH/bin:$PATH"

RUN curl -sSL https://install.python-poetry.org |  python3 -

WORKDIR /app
COPY pyproject.toml poetry.lock ./

RUN poetry config virtualenvs.in-project false && \
    poetry install --no-dev

COPY . .

CMD poetry run python3 core/manage.py runserver