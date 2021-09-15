# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: employee.proto for package 'helloworld'

require 'grpc'
require 'employee_pb'

module Helloworld
  module Employee
    # The greeting service definition.
    class Service

      include ::GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'helloworld.Employee'

      # get employeeId
      rpc :get_employee, ::Helloworld::EmployeeReq, ::Helloworld::EmployeeRes
    end

    Stub = Service.rpc_stub_class
  end
end
