import csv

from myapp.models import Product


def run():
    with open("core/myapp/edeka.csv") as file:
        reader = csv.reader(file)
        next(reader)  # Advance past the header
        # Product.objects.all().delete()  # for zeroing the database. Remove after real database is here
        for row in reader:
            prod, _ = Product.objects.get_or_create(
                name=row[0], category=row[2], price=row[1]
            )  # Creates if the entry is not dup
            # prod = Product(name=row[0], category=row[2], price=row[1])                         # Creates anyway
            prod.save()

    print("Populating the database: Done")
