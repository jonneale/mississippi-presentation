(ns mississippi-presentation.code-snippets)


(def custom
  "(defn should-be-of-length
  [length & {when-fn :when}]
  [(fn [subject] (= (count (str subject)) length)	  
                      :msg (str \"length must be \" length) 
                      :when when-fn)])")

(def subject
  "(def subject     {:a nil :b \"value\"})")

(def validations
  "(def validations {:a [(required)] :b [(required)]})")

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
  "<span class='fragment'>{:GAS_PAYMENT_AMOUNT </span>
  <span class='fragment'> [(m/required </span>
  <span class='fragment'>  :when direct-debit? </span>
  <span class='fragment'>  :msg \"Direct Debit amount must be specified\")]} <span>")


(def required
  "(defn required
  [& {msg :msg when-fn :when}]
  [(comp not nil?)
   :msg (or msg \"required\")
   :when when-fn])")

(def errors
  "{:errors {:a (\"required\")}, :a nil, :b \"value\"}")

(def multiple-validations
  "(def validations {:year-of-birth [(required) (numeric)]})")

(def multiple-subjects
  "def subjects [{:name \"alice\"   :year-of-birth nil}
              {:name \"bob\"     :year-of-birth \"last year\"}
              {:name \"charlie\" :year-of-birth 1976}])")

(def apply-multiple-validations
  "(map (fn[s] (validate s validations)) subjects)")

(def multiple-errors
  "({:name \"alice\",
  <span style='color:#3387CC'>:year-of-birth</span> nil,
  :errors {<span style='color:#3387CC'>:year-of-birth</span> (\"required\" \"not a number\")}}
 {:name \"bob\",
  <span style='color:#3387CC'>:year-of-birth</span> \"last year\",
  :errors {<span style='color:#3387CC'>:year-of-birth</span> (\"not a number\")}}
 {:name \"charlie\",
  :<span style='color:#3387CC'>:year-of-birth</span> 1976,
  :errors {}})")

(def gas-direct-debit
  "{:GAS_PAYMENT_AMOUNT
   [(v/should-not-be-blank
     :when (fn[s] (and (gas-switch? s)
                       (direct-debit? s)))
     (v/length :max 10)
     (v/should-be-blank
      :when (fn[s] (or (not (gas-switch? s))
                       (not (direct-debit? s))))))]}")