package Windows.System.RemoteDesktop.Input

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
import com.github.knk190001.winrtbinding.runtime.interop.BooleanByReference
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
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface RemoteTextConnectionDataHandlerBody {
  public operator fun invoke(pduData: Array<Byte>): Boolean
}

@ABIMarker(RemoteTextConnectionDataHandler.ABI::class)
@Signature("delegate({099ffbc8-8bcb-41b5-b056-57e77021bf1b})")
@WinRTByReference(brClass = RemoteTextConnectionDataHandler.ByReference::class)
public class RemoteTextConnectionDataHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(pduData: Array<Byte>): Boolean {
    val result = BooleanByReference()
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,pduData, result))
    checkHR(hr)
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue != 0.toByte()
    return resultValue_Managed
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(RemoteTextConnectionDataHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      RemoteTextConnectionDataHandlerBody::class.java, MemoryAddress::class.java, Int::class.java,
          MemorySegment::class.java, )
    )


    public operator fun invoke(fn: RemoteTextConnectionDataHandlerBody):
        RemoteTextConnectionDataHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , JAVA_INT, ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = RemoteTextConnectionDataHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: RemoteTextConnectionDataHandlerBody,
      thisObj: MemoryAddress,
      pduData_size: Int,
      pduData: MemorySegment,
      returnValue: MemorySegment
    ): Int {
      try {
        val pduData_Managed = arrayFromNative<Byte>(pduData_size, pduData)
        val result = fn(pduData_Managed)
        val result_Native: Byte = if(result) 1 else 0 
        val returnAddress = Pointer(returnValue[ADDRESS, 0].toRawLongValue())
        val returnByValue = BooleanByReference()
        returnByValue.setPointer(returnAddress)
        returnByValue.setValue(result_Native)
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
      pduData: Array<Byte>,
      retVal: BooleanByReference
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteTextConnectionDataHandler> {
    public override fun getValue(): RemoteTextConnectionDataHandler =
        RemoteTextConnectionDataHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: RemoteTextConnectionDataHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<RemoteTextConnectionDataHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("099ffbc88bcb41b5b05657e77021bf1b")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteTextConnectionDataHandler {
      val address = segment.toRawLongValue()
      return RemoteTextConnectionDataHandler(Pointer(address))
    }

    public override fun toNative(obj: RemoteTextConnectionDataHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
