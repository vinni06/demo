variable "key_name" {
  default = "vinninv"
}

variable "pvt_key" {
  default = "/root/.ssh/bkey.pem"
}

variable "us-east-zones" {
  default = ["us-east-1a", "us-east-1b"]
}

variable "sg-id" {
  default = "sg-07e09455c4f0722a9"
}
