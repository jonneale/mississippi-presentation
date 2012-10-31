(ns mississippi-presentation.code-snippets)

(def code
  {:what-is-mississippi
   "(use '[mississippi.core])
(validate {:a nil :b \"value\"} 
          {:a [(required)] 
           :b [(required)]})
{:errors {:a (\"required\")}, :a nil, :b \"value\"}"
   :define-validations
"{:GAS_PAYMENT_AMOUNT 
  [(m/required 
    :when direct-debit?)]}"
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