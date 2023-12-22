package Windows.ApplicationModel.Payments

import com.github.knk190001.winrtbinding.runtime.ABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.arrayFromNative
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.booleanFromNative
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.guidFromNative
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.iUnknownIID
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.setValue
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.CallbackReference
import com.sun.jna.Function
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface PaymentRequestChangedHandlerBody {
  public operator fun invoke(paymentRequest: PaymentRequest?, args: PaymentRequestChangedArgs?):
      Unit
}

@ABIMarker(PaymentRequestChangedHandler.ABI::class)
@Signature("delegate({5078b9e1-f398-4f2c-a27e-94d371cf6c7d})")
@WinRTByReference(brClass = PaymentRequestChangedHandler.ByReference::class)
public class PaymentRequestChangedHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(paymentRequest: PaymentRequest?, args: PaymentRequestChangedArgs?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,paymentRequest, args))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(PaymentRequestChangedHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      PaymentRequestChangedHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: PaymentRequestChangedHandlerBody): PaymentRequestChangedHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = PaymentRequestChangedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: PaymentRequestChangedHandlerBody,
      thisObj: MemoryAddress,
      paymentRequest: MemoryAddress,
      args: MemoryAddress
    ): Int {
      try {
        val paymentRequest_Managed = PaymentRequest.ABI.fromNative(paymentRequest) as PaymentRequest
        val args_Managed = PaymentRequestChangedArgs.ABI.fromNative(args) as
            PaymentRequestChangedArgs
        fn(paymentRequest_Managed, args_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      paymentRequest: PaymentRequest?,
      args: PaymentRequestChangedArgs?
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentRequestChangedHandler> {
    public override fun getValue(): PaymentRequestChangedHandler =
        PaymentRequestChangedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: PaymentRequestChangedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<PaymentRequestChangedHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("5078b9e1f3984f2ca27e94d371cf6c7d")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): PaymentRequestChangedHandler {
      val address = segment.toRawLongValue()
      return PaymentRequestChangedHandler(Pointer(address))
    }

    public override fun toNative(obj: PaymentRequestChangedHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
