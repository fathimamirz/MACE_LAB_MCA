yr=int(input("Enter future year:"))
lp=[l for l in range(2022,yr) if(l%400==0)or(l%100 and l%4==0)]
print(lp)