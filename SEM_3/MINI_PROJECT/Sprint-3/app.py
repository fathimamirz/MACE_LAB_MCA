import joblib
from flask import Flask, render_template, request
import numpy as np

app = Flask(__name__)

# Load the trained model
model = joblib.load("model1.pkl")

@app.route('/')
@app.route('/home')
def home():
    return render_template('index.html')

@app.route('/examp')
def examp():
    return render_template('treatment.html')

# def show():
#     return render_template('treatment.html')

@app.route('/predict', methods=['POST'])
def predict():
    if request.method == 'POST':
        input_data = {
            'age': float(request.form['age']),
            'bp': float(request.form['bp']),
            'sg': float(request.form['sg']),
            'al': float(request.form['al']),
            'su': float(request.form['su']),
            'rbc': int(request.form['rbc']),
            'pc': int(request.form['pc']),
            'pcc': int(request.form['pcc']),
            'ba': int(request.form['ba']),
            'bgr': float(request.form['bgr']),
            'bu': float(request.form['bu']),
            'sc': float(request.form['sc']),
            'sod': float(request.form['sod']),
            'pot': float(request.form['pot']),
            'hemo': float(request.form['hemo']),
            'pcv': int(request.form['pcv']),
            'wc': int(request.form['wc']),
            'rc': float(request.form['rc']),
            'htn': int(request.form['htn']),
            'dm': int(request.form['dm']),
            'cad': int(request.form['cad']),
            'appet': int(request.form['appet']),
            'pe': int(request.form['pe']),
            'ane': int(request.form['ane'])
        }
# 'age', 'bp', 'sg', 'al', 'su', 'rbc', 'pc', 'pcc', 'ba', 'bgr', 'bu',
#        'sc', 'sod', 'pot', 'hemo', 'pcv', 'wc', 'rc', 'htn', 'dm', 'cad',
#        'appet', 'pe', 'ane'
        # Convert the input dictionary to a list
        input_list = [list(input_data.values())]

        # Make the prediction
        prediction = model.predict(input_list)

        if prediction == 0:
           
            result =  "You have Chronic Kidney Disease."
        else:
            result = "You don't have Chronic Kidney Disease."

        return render_template('result.html', prediction=result)

if __name__ == '__main__':
    app.run(debug=True)
