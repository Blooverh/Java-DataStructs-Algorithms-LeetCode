def reverse(str):
    
    if str != '':
        return str[-1]+ reverse(str[:-1])
    else:
        return str

print(reverse('hello'))