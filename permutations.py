def permute(left, sub):
	if len(sub)==1:
		print left + sub
	for x in xrange(len(sub)):
		permute(left+sub[x], sub[:x]+sub[x+1:])

if __name__=="__main__":
	permute('', 'perm')
