(ns mississippi-presentation.slides
  (:require [hiccup.core                             :as hiccup]
            [hiccup.page                             :as page]
            [mississippi-presentation.code-snippets  :as code]))

(defn html
  []
  (hiccup/html (page/doctype :html5)
               [:html
                [:head
                 [:title "Mississippi - simple map validations"]
                 [:link {:href "/stylesheets/reveal.css" :media "screen" :rel "stylesheet" :type "text/css"}]
                 [:link {:href "/stylesheets/theme/default.css" :media "screen" :rel "stylesheet" :type "text/css" :id "theme"}]
                 [:link {:href "/syntaxhighlighter/styles/shCore.css" :media "screen" :rel "stylesheet" :type "text/css"}]
                 [:link {:href "/syntaxhighlighter/styles/shThemeDefault.css" :media "screen" :rel "stylesheet" :type "text/css"}]]
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
                    [:h1 "Simple Map Validation"]
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/require-mississippi]]]
                   [:section
                    [:br]
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/what-is-mississippi]]
                    [:br]
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/errors]]]
                   [:section
                    [:br]
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/mississippi-validate]]
                    [:br]
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/validation-errors]]]
                   [:section
                    [:h1 "How?"]]                  
                   [:section
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/validations]]
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/subject]]
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/validate]]
                    [:div.fragment
                     [:pre {:class "brush: clojure" } 
                      code/call-function]]]
                   [:section
                    [:h1 "Required"]
                    [:div.fragment
                     [:pre {:class "brush: clojure" }
                      code/required]]]
                   [:section
                    [:h1 "Built in validators"]
                    [:ul
                     [:li [:code "required"]]
                     [:li [:code "numeric"]]
                     [:li [:code "member-of"]]
                     [:li [:code "in-range"]]
                     [:li [:code "subset-of"]]
                     [:li [:code "matches"]]
                     [:li [:code "matches-email"]]]]
                   [:section
                    [:h1 "Custom Validators"]]
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
                    [:h1 "Our Validations"]
                    [:br]
                    [:br]
                    [:pre {:class "brush: clojure" }
                     code/define-validations]]
                   [:section
                    [:h1 "Our (actual) Validations"]]
                   [:section
                    [:pre {:class "brush: clojure gutter: false;" }
                     code/gas-direct-debit]]
                   [:section
                    [:h1 "Mississippi"]
                    [:img {:src "/images/small-logo.png"}]
                    [:p [:a {:href "https://github.com/mikejones/mississippi"} "https://github.com/mikejones/mississippi"]]]
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
                     [:a {:href "http://twitter.com/jon_neale"} "@jon_neale"]]
                    [:p 
                     "Slides are available at: "[:a {:href "http://skillsmatter-mississippi.heroku.com"} "http://skillsmatter-mississippi.heroku.com"]]]
                   ]]
                 [:script {:src "/syntaxhighlighter/scripts/shCore.js"}]
                 [:script {:src "/js/jquery-1.8.2.min.js"}]
                 [:script {:src "/clojure/shBrushClojure.js"}]
                 [:script {:src "/lib/js/head.min.js"}]
                 [:script {:src "/js/reveal.min.js"}]
                 [:script {:type "text/javascript"}
                  "$(document).ready(SyntaxHighlighter.all());
                   Reveal.initialize({ controls: true, progress: true, history: true,

				theme: Reveal.getQueryHash().theme, // available themes are in /css/theme
				transition: Reveal.getQueryHash().transition || 'default', // default/cube/page/concave/zoom/linear/none

				// Optional libraries used to extend on reveal.js
				dependencies: [
					{ src: 'lib/js/classList.js', condition: function() { return !document.body.classList; } },
					{ src: 'plugin/zoom-js/zoom.js', async: true, condition: function() { return !!document.body.classList; } }]
			});
"]]]))