d2=dict(((1,'aakash'),(2,'anandu'),(4,'Hari')))
print({x:d2[x] for x in sorted(d2)})
print({x:d2[x] for x in sorted (d2,reverse=True)})
