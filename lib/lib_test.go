package nrg

import (
	"testing"
)

func TestAdd(t *testing.T) {
	result := Add(13, 15)
	expected := 28
	if result != expected {
		t.Errorf("Unexpected result. Got: %d, Expected: %d", result, expected)
	}
}

func TestMyFunction(t *testing.T) {
	result := MyFunction()
	expected := "Hello from MyFunction!"
	if result != expected {
		t.Errorf("Unexpected result. Got: %s, Expected: %s", result, expected)
	}
}
