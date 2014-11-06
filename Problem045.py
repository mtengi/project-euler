tnum=pnum=hnum=0
tint=pint=hint=1

def nexttri():
	global tnum ,tint
	tnum+=tint
	tint+=1
	return tnum

def nextpent():
	global pnum, pint
	pnum+=pint
	pint+=3
	return pnum

def nexthex():
	global hnum, hint
	hnum+=hint
	hint+=4
	return hnum

nexttri()
while not (tnum==pnum==hnum and tnum!=40755):
	nexttri()
	if tnum>pnum:
		nextpent()
	if tnum>hnum:
		nexthex()
print tnum