/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "add.h"

int *
add_1_svc(numbers *argp, struct svc_req *rqstp)
{
	static int  result;

	result  = argp->a + argp->b;

	return &result;
}
