#!/bin/bash

py client.py 10.21.72.3 1234 put test.txt &
py client.py 10.21.72.3 1234 put test.txt &
py client.py 10.21.72.3 1234 put test.txt &
py client.py 10.21.72.3 1234 get test.txt &
py client.py 10.21.72.3 1234 get test.txt &
py client.py 10.21.72.3 1234 get test.txt &
py client.py 10.21.72.3 1234 del test.txt &
py client.py 10.21.72.3 1234 del test.txt &
py client.py 10.21.72.3 1234 del test.txt 