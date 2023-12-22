package Windows.Graphics.Printing3D

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

public fun interface Print3DTaskSourceRequestedHandlerBody {
  public operator fun invoke(args: Print3DTaskSourceRequestedArgs?): Unit
}

@ABIMarker(Print3DTaskSourceRequestedHandler.ABI::class)
@Signature("delegate({e9175e70-c917-46de-bb51-d9a94db3711f})")
@WinRTByReference(brClass = Print3DTaskSourceRequestedHandler.ByReference::class)
public class Print3DTaskSourceRequestedHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(args: Print3DTaskSourceRequestedArgs?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,args))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(Print3DTaskSourceRequestedHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      Print3DTaskSourceRequestedHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: Print3DTaskSourceRequestedHandlerBody):
        Print3DTaskSourceRequestedHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = Print3DTaskSourceRequestedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: Print3DTaskSourceRequestedHandlerBody,
      thisObj: MemoryAddress,
      args: MemoryAddress
    ): Int {
      try {
        val args_Managed = Print3DTaskSourceRequestedArgs.ABI.fromNative(args) as
            Print3DTaskSourceRequestedArgs
        fn(args_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(thisPtr: Pointer, args: Print3DTaskSourceRequestedArgs?): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Print3DTaskSourceRequestedHandler> {
    public override fun getValue(): Print3DTaskSourceRequestedHandler =
        Print3DTaskSourceRequestedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: Print3DTaskSourceRequestedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<Print3DTaskSourceRequestedHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("e9175e70c91746debb51d9a94db3711f")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DTaskSourceRequestedHandler {
      val address = segment.toRawLongValue()
      return Print3DTaskSourceRequestedHandler(Pointer(address))
    }

    public override fun toNative(obj: Print3DTaskSourceRequestedHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
