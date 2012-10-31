(ns mississippi-presentation.slides
  (:require [hiccup.core                :as hiccup]
            [hiccup.page                :as page])
  (:use     [mississippi-presentation.code-snippets]))

(defn html
  []
  (hiccup/html (page/doctype :html5)
               [:html
                [:head
                 [:title "Mississippi - simple map validations"]
                 [:link {:href "/stylesheets/reveal.css" :media "screen" :rel "stylesheet" :type "text/css"}]
                 [:link {:href "/stylesheets/theme/default.css" :media "screen" :rel "stylesheet" :type "text/css" :id "theme"}]
                 [:link {:href "/lib/css/zenburn.css" :media "screen" :rel "stylesheet" :type "text/css"}]]
                [:body 
                 [:div.reveal
                  [:div.slides
                   [:section
                    [:h1 "Mississippi"]
                    [:img {:src "/images/small-logo.png"}]
                    [:h2 "https://github.com/mikejones/mississippi"]
                    [:h3 "@jon_neale"]]
                   [:section
                    [:h1 "What is Mississippi?"]]
                   [:section
                    [:pre
                     [:code.clojure (code :what-is-mississippi)]]]
                   [:section
                    [:h1 "Why?"]]
                   [:section
                    [:img {:src "/images/homepage.png"}]]
                   [:section
                    [:img {:src "/images/process.png"}]]
                   [:section
                    [:img {:src "/images/suppliers.png"}]]
                   [:section
                    [:h1 "Gas Direct Debit Amount"]
                    [:ol
                     [:li [:strong "Valid Values: "] "N6"]
                     [:li [:strong "Mandatory?: "] "Mandatory if field 45 = MDD"]
                     [:li [:strong "Description: "] "Amount the customer would like to pay per month if paying by MDD. Estimated spend / 12 (minimum amount £10 pm and rounded to the nearest 50p)"]]]
                   [:section
                    [:h1 "Gas Direct Debit Amount"]
                    [:img {:src "/images/direct-debit-amount.png"}]]
                   [:section
                    [:h1 "Mississippi"]
                    [:img {:src "/images/small-logo.png"}]
                    [:h2 "https://github.com/mikejones/mississippi"]]
                   [:section
                    [:h1 "Syntax"]
                    [:pre
                     [:code (code :syntax)]]]
                   [:section
                    [:h1 "Define Validations"]
                    [:pre
                     [:code (code :define-validations)]]]
                   [:section
                    [:h1 "How?"]]
                   [:section
                    [:ol
                     [:li "Take every key in validations map"]
                     [:li "Get value for that key in subject"]
                     [:li "Apply validation value to subject value"]]]
                   [:section
                    [:pre
                     [:code (code :required)]]]
                   [:section
                    [:h1 "Built in validators"]
                    [:ul
                     [:li
                      [:code "numeric"]
                      [:code "require"]
                      [:code "member-of   ;; (member-of #{:a :b :c})"]
                      [:code "in-range    ;; (in-range 1 10)"]
                      [:code "subset-of   ;; (subset-of #{:a :b :c})"]
                      [:code "matches     ;; (matches #\"foo\")"]
                      [:code "matches-email"]]]]
                   [:section
                    [:h1 "Questions?"]]
                   ]]
                 [:script {:src "/lib/js/head.min.js"}]
                 [:script {:src "/js/reveal.min.js"}]
                 [:script {:type "text/javascript"}
                  "Reveal.initialize({
				controls: true,
				progress: true,
				history: true,

				theme: Reveal.getQueryHash().theme, // available themes are in /css/theme
				transition: Reveal.getQueryHash().transition || 'default', // default/cube/page/concave/zoom/linear/none

				// Optional libraries used to extend on reveal.js
				dependencies: [
					{ src: 'lib/js/classList.js', condition: function() { return !document.body.classList; } },
					{ src: 'plugin/highlight/highlight.js', async: true, callback: function() { hljs.initHighlightingOnLoad(); } },
					{ src: 'plugin/zoom-js/zoom.js', async: true, condition: function() { return !!document.body.classList; } }]
			});"]]]))