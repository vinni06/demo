variable "key_name" {
  default = "ramyanv"
}

variable "pvt_key" {
  default = "/root/.ssh/rkey.pem"
}

variable "us-east-zones" {
  default = ["us-east-1a", "us-east-1b"]
}

variable "sg-id" {
  default = "sg-0e562e3675625df04"
}
