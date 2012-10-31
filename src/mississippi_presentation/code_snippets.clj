(ns mississippi-presentation.code-snippets)

(def code
  {:custom "(defn should-be-of-length
  [length & {when-fn :when}]
  [(fn [subject] (when subject 
                      (= (count (str subject)) length))	  
                      :msg (str \"length must be \" length) 
                      :when when-fn)])"

   :subject "(def subject     {:a nil :b \"value\"})"
   :validations "(def validations {:a [(required)] :b [(required)]})"
   :call-function "((required) nil)
((required) \"value\")"
   :require-mississippi "(use '[mississippi.core])"
   :what-is-mississippi
   "(validate {:a nil :b \"value\"} 
          {:a [(required)] 
           :b [(required)]})"
   :errors "{:errors {:a (\"required\")}, :a nil, :b \"value\"}"
   :define-validations
"<span class='fragment'>{:GAS_PAYMENT_AMOUNT </span>
  <span class='fragment'> [(m/required </span>
  <span class='fragment'>  :when direct-debit? </span>
  <span class='fragment'>  :msg \"Direct Debit amount must be specified\")]} <span>"
   :syntax "
(def subject {:a nil :b \"value\"})
(def validations {:a [(required)]
                  :b [(required)]})
(validate subject validations)
{:a nil, :b \"value\", :errors {:a (\"required\")}}"
  :required "(defn required
  [& {msg :msg when-fn :when}]
  [(comp not nil?)
   :msg (or msg \"required\")
   :when when-fn])"})