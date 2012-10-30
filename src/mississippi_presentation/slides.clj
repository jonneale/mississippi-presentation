(ns mississippi-presentation.slides
  (:require [hiccup.core                :as hiccup]
            [hiccup.page                :as page]))

(defn html
  []
  (hiccup/html (page/doctype :html5)
               [:html
                `[:head
                  [:title "Mississippi - simple map validations"]
]
                [:body 
                 [:header.main
                  [:h1
                   [:a {:href "/"} "Energy Switch Recon"]]]
                 [:nav.tabs
                  [:ul
                   [:li [:a {:href "/reports"} "Reports"]]
                   [:li [:a {:href "/uploads"} "Upload Statements"]]
                   ]]]]))