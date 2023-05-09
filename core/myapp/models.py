# Create your models here.

from django.db import models


class Product(models.Model):
    name = models.CharField(max_length=255)
    category = models.CharField(max_length=255)
    price = models.DecimalField(max_digits=10, decimal_places=2)

    #slug=models.SlugField(max_length=225, unique=True)
    #subcategory=models.ForeignKey('SubCategory', related_name='prosubcat', on_delete=models.CASCADE, blank=True, null=True)
    #discount = models.IntegerField(default=None)
    #description = models.TextField()
    #overview = models.TextField(null=True)
    #image= models.ImageField(blank=True)
    #tags = TaggableManager()
    #created_at = models.DateTimeField(auto_now_add=True)
    #updated_at = models.DateTimeField(auto_now=True)


    def __str__(self):
        return self.name
