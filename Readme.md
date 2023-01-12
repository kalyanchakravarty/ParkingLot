DTO - Data transfer object
Models might have something that we don't want to expose.
That's why we make use of DTO to expose the details to the client

Good practise : We should never send model objects. in this case, we should send vehicledto, gatedto.

Method of a service should never be tied to the request, since it can be called from multiple controllers

We need to create all the controllers, services, repositories need to be created, then all the requests can start to be served.


Same object needs to be shared across the apps for above classes.
Graph : Topological sort is used to create the objects in topological order

We will create all objects, store them in object registry (Registry pattern) and then whenever we need a particular object we will get from the registry.
(Hash Map of string to an object)