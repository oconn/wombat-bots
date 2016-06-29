(defn pprint-arena
  "Pretty Print for a given arena"
  [arena]
  (let [[x-len _] (get-arena-dimensions arena)
        x-indices (range x-len)]
    (println " " (string/join " " (vec x-indices)))
    (print
     (string/join "\n" (map-indexed (fn [idx row]
                                      (print
                                       idx
                                       (string/join " " (map :display row))
                                       "\n")) arena)))))

(defn run
  [{:keys [arena state bot_id energy spawn-bot?] :as step-details}]
  (pprint-arena arena)
  {:commands [{:cmd "MOVE"
               :metadata {:direction (rand-nth [0 1 2 3 4])}}
              {:cmd "SET_STATE"
               :metadata {:foo "bar"}}]})
