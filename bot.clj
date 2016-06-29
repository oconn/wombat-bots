(require '[clojure.string :as string])

(defn get-arena-dimensions
  "returns the dimensions of a given arena (NOTE: Not 0 based)"
  [arena]
  (let [x ((comp count first) arena)
        y (count arena)]
    [x y]))

(defn pprint-arena
  "Pretty Print for a given arena"
  [arena]
  (let [[x-len _] (get-arena-dimensions arena)
        x-indices (range x-len)]
    (println " " (string/join " " (map #(format "%2d" %) x-indices)))
    (print
     (string/join "\n" (map-indexed (fn [idx row]
                                      (print
                                       (format "%2d" idx)
                                       (string/join "  " (map :display row))
                                       "\n")) arena)))))

(defn run
  [{:keys [arena saved-state bot-id energy spawn-bot?] :as step-details}]
  (let [counter (or (:step-counter saved-state) 0)]
    (println "Bot Counter: " counter)
    {:commands [{:cmd "MOVE"
                 :metadata {:direction (rand-nth [0 1 2 3 4])}}
                {:cmd "SET_STATE"
                 :metadata {:step-counter (inc counter)}}]}))
