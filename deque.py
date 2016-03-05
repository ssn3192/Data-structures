class Deque:
    def __init__(self):
        self.items = []
    
    def isEmpty(self):
        return self.items == []
    
    def size(self):
        return len(self.items)
    
    def addRear(self,item):
        self.items.append(item)
        
    def addFront(self,item):
        self.items.insert(0,item)
        
    def removeRear(self):
        return self.items.pop()
    
    def removeFront(self):
        return self.items.pop(0)
    
    def getElements(self):
        return self.items
    
    
dq = Deque()
dq.addRear(12)
dq.addRear("shivani")
dq.addRear(1223)
dq.addFront(22)
print(dq.size())
dq.removeFront()
dq.removeRear()
dq.addRear("true")
dq.removeRear()
print(dq.isEmpty())
print(dq.size())
print(dq.getElements())


    
        
