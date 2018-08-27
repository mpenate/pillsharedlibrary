#!/usr/bin/env groovy
package org.qacdo

class GlobalVars {
   static String foo = "QA CDO Rules!"

   // refer to this in a pipeline using:   
   // import org.qacdo.GlovalVars
   // println GlobalVars.foo
}