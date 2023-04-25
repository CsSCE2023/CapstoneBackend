import os

from django.contrib.auth.management.commands import createsuperuser
from django.contrib.auth.models import User

username = os.environ.get("DJ_SU_USER")
mail = os.environ.get("DJ_SU_MAIL")
password = os.environ.get("DJ_SU_PASS")


class Command(createsuperuser.Command):
    def handle(self, *args, **options):
        username = os.environ.get("DJ_SU_USER")
        mail = os.environ.get("DJ_SU_MAIL")
        password = os.environ.get("DJ_SU_PASS")

        if User.objects.filter(username=username).count() == 0:
            admin = User.objects.create_superuser(
                email=mail, username=username, password=password
            )
            admin.is_active = True
            admin.is_admin = True
            admin.save()
            print("Superuser created.")
        else:
            print("Superuser creation skipped.")
