#---------------------Queue Implementation-------------------------
class Queue:
    def __init__(self):
         self.items = []
    
    def isEmpty(self):
        return self.items == []
    
    def sizeofqueue(self):
        return len(self.items)
    
    def enqueue(self,item):
        self.items.insert(0, item)
        
    def dequeue(self):
        return self.items.pop()


q= Queue()
q.enqueue("shivani")
q.enqueue("1")
q.enqueue("True")
print (q.sizeofqueue())
q.dequeue()
q.dequeue()
q.enqueue("narang")
print (q.isEmpty())
q.dequeue()
q.dequeue()
print(q.isEmpty())            
