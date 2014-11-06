i=0
def permute(left, sub):
	global i
	if len(sub)==1:
		i+=1
		if i==1000000:
			print left+sub
			exit()
	for x in xrange(len(sub)):
		permute(left+sub[x], sub[:x]+sub[x+1:])

if __name__=="__main__":
	permute('', '0123456789')