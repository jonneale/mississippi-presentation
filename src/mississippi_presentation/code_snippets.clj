(ns mississippi-presentation.code-snippets)


(def custom
  "(defn should-be-of-length
  [length & {when-fn :when}]
  [#(= (count (str %)) length)	  
   :msg (str \"length must be \" length) 
   :when when-fn)])")

(def subject
  "(def subject {:a nil :b \"value\"})")

(def validations
  "(def validations {:a [(required)]
                  :b [(required)]})")

(def validate
  "(validate subject validations)")

(def call-function
  "((required) nil)
((required) \"value\")")

(def require-mississippi
  "(use '[mississippi.core])")

(def what-is-mississippi
  "(validate {:a nil :b \"value\"} 
          {:a [(required)] 
           :b [(required)]})")

(def define-validations
  "{:GAS_PAYMENT_AMOUNT 
  [(m/required
    :when direct-debit?
    :msg \"Direct Debit amount
           must be specified\")]}")


(def required
  "(defn required
  [& {msg :msg when-fn :when}]
  [(comp not nil?)
   :msg (or msg \"required\")
   :when when-fn])")

(def errors
  "
{:errors {:a (\"required\")},
 :a nil,
 :b \"value\"}")

(def multiple-validations
  "(def validations
  {:year-of-birth
   [(required) (numeric)]})")

(def multiple-subjects
  "def subjects
  [{:name \"alice\"
    :year-of-birth nil}
   {:name \"bob\"
    :year-of-birth \"last year\"}
   {:name \"charlie\"
    :year-of-birth 1976}])")

(def apply-multiple-validations
  "(map
    #(validate % validations)
    subjects)")

(def multiple-errors
  "({:name \"alice\",
  :year-of-birth nil,
  :errors {:year-of-birth
          (\"required\"
           \"not a number\")}}
 {:name \"bob\",
  :year-of-birth \"last year\",
  :errors {:year-of-birth
          (\"not a number\")}}
 {:name \"charlie\",
  :year-of-birth 1976,
  :errors {}})")

(def gas-direct-debit
  "{:GAS_PAYMENT_AMOUNT
  [(v/length :max 10)
   (v/should-not-be-blank
    :when #(and (gas-switch? %)
                (direct-debit? %))
   (v/should-be-blank
    :when
      #(or
         (not (gas-switch? %))
         (not (direct-debit? %)))))]}")