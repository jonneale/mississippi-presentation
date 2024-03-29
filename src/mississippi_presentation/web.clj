(ns mississippi-presentation.web
  (:require [mississippi-presentation.slides :as slides]
            [compojure.route                 :as route])
  (:use  compojure.core
         ring.adapter.jetty
         ring.util.response)
  (:gen-class))

(defroutes app
  (GET "/"
       []
       (slides/html))
  
  (route/resources "/")
  (route/not-found 
   "<h1>Page not found</h1>"))

(defn -main [port]
  (run-jetty app {:port (Integer. port)}))