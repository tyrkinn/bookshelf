(ns com.tyrkinn.bookshelf.schema)

(def schema
  {:user/id :uuid
   :user [:map {:closed true}
          [:xt/id                     :user/id]
          [:user/email                :string]
          [:user/joined-at            inst?]
          [:user/foo {:optional true} :string]
          [:user/bar {:optional true} :string]]

   :msg/id :uuid
   :msg [:map {:closed true}
         [:xt/id       :msg/id]
         [:msg/user    :user/id]
         [:msg/text    :string]
         [:msg/sent-at inst?]]

   :book/id :uuid
   :book [:map
          [:xt/id       :book/id]
          [:book/title  :string]
          [:book/author :string]
          [:book/isbn   :string]
          [:book/price  {:optional true} :integer]
          [:book/link   {:optional true} :string]]})

(def module
  {:schema schema})
