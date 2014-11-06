def findcycle(num):
	mult = n
	cycle=[]
	while True:
		x = int((mult/num)%10)
		cycle.append(x)
		if len(cycle)%2==0:
			if check(cycle):
				return len(cycle)/2
		mult*=10

def check(cycle):
	for x in xrange(len(cycle)/2):
		if cycle[x] != cycle[x+len(cycle)/2]:
			return False
	return True

n = 1000
largest = (0,0)
for x in xrange(5,n/2):
	if (2*x+1)%5==0 or 5%(2*x+1)==0:
		continue
	length=findcycle(2*x+1)
	if length>largest[1]: largest = ((2*x+1), length)

print largest