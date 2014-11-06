def pent(n):
	num=0
	interval=1
	sub=0
	while sub<n:
		num += interval
		interval +=3
		sub+=1
		yield num

print list(pent(10))