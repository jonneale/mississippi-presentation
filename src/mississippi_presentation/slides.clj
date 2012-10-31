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
                 [:link {:href "/lib/css/sunburst.css" :media "screen" :rel "stylesheet" :type "text/css"}]]
                [:body 
                 [:div.reveal
                  [:div.slides
                   [:section
                    [:h1 "Mississippi"]
                    [:img {:src "/images/small-logo.png"}]
                    [:p [:a {:href "https://github.com/mikejones/mississippi"} "https://github.com/mikejones/mississippi"]]
                    [:h3 [:a {:href "http://twitter.com/jon_neale"} "@jon_neale"]]]
                   [:section
                    [:h1 "What is Mississippi?"]]
                   [:section
                    [:pre.fragment
                     [:code.clojure (code :require-mississippi)]]
                    [:br]
                    [:br]
                    [:pre.fragment
                     [:code.clojure (code :what-is-mississippi)]]
                    [:br]
                    [:br]
                    [:pre.fragment
                     [:code.clojure (code :errors)]]]
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
                     [:li.fragment [:strong "Valid Values: "] "N6"]
                     [:li.fragment [:strong "Mandatory?: "] "Mandatory if field 45 = MDD"]
                     [:li.fragment [:strong "Description: "] "Amount the customer would like to pay per month if paying by MDD. Estimated spend / 12 (minimum amount £10 pm and rounded to the nearest 50p)"]]]
                   [:section
                    [:h1 "Gas Direct Debit Amount"]
                    [:img {:src "/images/direct-debit-amount.png"}]]
                   [:section
                    [:h1 "Mississippi"]
                    [:img {:src "/images/small-logo.png"}]
                    [:p [:a {:href "https://github.com/mikejones/mississippi"} "https://github.com/mikejones/mississippi"]]]
                   [:section
                    [:h1 "Syntax"]
                    [:pre
                     [:code (code :syntax)]]]
                   [:section
                    [:h1 "Define Validations"]
                    [:br]
                    [:br]
                    [:pre
                     [:code (code :define-validations)]]]
                   [:section
                    [:h1 "How?"]]
                   [:section
                    [:br]
                    [:br]
                    [:ol
                     [:li.fragment "Take every key in validations map"]
                     [:li.fragment "Get value for that key in subject"]
                     [:li.fragment "Apply validation value to subject value"]]]
                   [:section
                    [:pre.fragment
                     [:code
                      (code :subject)]]
                    [:br]
                    [:pre.fragment
                     [:code
                      (code :validations)]]
                    [:br
                     [:pre.fragment
                      [:code
                       (code :call-function)]]]]
                   [:section
                    [:h1 "Required"]
                    [:pre
                     [:code (code :required)]]]
                   [:section
                    [:h1 "Built in validators"]
                    [:ul
                     [:li
                      [:code "numeric"]]
                     [:li [:code "require"]]
                     [:li [:code "member-of ;; (member-of #{:a :b :c})"]]
                     [:li [:code "in-range ;; (in-range 1 10)"]]
                     [:li [:code "subset-of ;; (subset-of #{:a :b :c})"]]
                     [:li [:code "matches ;; (matches #\"foo\")"]]
                     [:li [:code "matches-email"]]]]
                   [:section
                    [:h1 "Custom Validators"]
                    [:br]
                    [:pre
                     [:code.clojure (code :custom)]]]
                   [:section
                    [:h1 "Questions?"]]
                   [:section
                    [:h1 "Thanks!"]
                    [:img {:src "/images/small-logo.png"}]
                    [:p [:a {:href "https://github.com/mikejones/mississippi"} "https://github.com/mikejones/mississippi"]]
                    [:p 
                     [:a {:href "https://twitter.com/michael_jones"} "@michael_jones"] ", "
                     [:a {:href "https://twitter.com/ryangreenhall"} "@ryangreenhall"] ", "
                     "Paul Krause, "
                     [:a {:href "https://twitter.com/ryangreenhall"} "@gar3thjon3s"] ", "
                     [:a {:href "http://twitter.com/jon_neale"} "@jon_neale"]]]
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