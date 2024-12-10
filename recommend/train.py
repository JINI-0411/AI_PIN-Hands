#!/usr/bin/env python
# coding: utf-8

# In[41]:


import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from tensorflow import keras
import os.path
import sys
import tensorflow as tf
tf.compat.v1.logging.set_verbosity(tf.compat.v1.logging.ERROR)
import warnings as wa
wa.filterwarnings("ignore")
import os
os.environ['TF_CPP_MIN_LOG_LEVEL'] = '2'



# In[44]:


# data_url = "http://localhost:3000/api/dl/data" # 이주소는 바뀔수 있음
data_url = sys.argv[1]
df = pd.read_json(data_url)
# df.head()

items = df[['item1', 'item2', 'item3', 'item4', 'item5', 'item6', 'item7', 'item8', 'item9', 'item10']].to_numpy()
targets = df['result'].to_numpy()


# In[22]:


# print(targets[:10])  # 카드갯수


# In[23]:


# 훈련세트, 테스트 세트 분리
train_input, test_input, train_target, test_target = train_test_split(items, targets)


# In[25]:


# 데이터 전처리 - 표준 점수 변환
ss = StandardScaler()
ss.fit(items)
train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)


# In[29]:


# print(train_scaled[:5])

# 모델 생성 함수
def create_model():
    model = keras.Sequential()
    model.add(keras.layers.Input(shape=(10,)))
    model.add(keras.layers.Dense(7, activation='relu'))
    model.add(keras.layers.Dropout(0.3))
    model.add(keras.layers.Dense(5, activation='softmax'))

    return model


# In[30]:


# 모델 생성 - 기 학습 모델 데이터가 있으면 기존 파일에서 불러오고 없으면 새로 생성
if os.path.isfile("best-model.keras"):
    model = keras.models.load_model("best-model.keras")
else:
    model = create_model()


# In[31]:


# model.summary()


# In[32]:


# 컴파일 - 옵티마이저, 손실함수, 측정 지표 설정
model.compile(optimizer='adam', loss='sparse_categorical_crossentropy', metrics=['accuracy'])


# In[39]:


checkpoint_cb = keras.callbacks.ModelCheckpoint("best-model.keras", save_best_only=True)
early_stopping_cb = keras.callbacks.EarlyStopping(patience=2, restore_best_weights=True)

model.fit(train_scaled, train_target, epochs=20, verbose=0,
          validation_data=(test_scaled, test_target), 
          callbacks=[checkpoint_cb, early_stopping_cb])


# In[40]:


# model.evaluate(test_scaled, test_target)


# In[ ]:





# In[ ]:




