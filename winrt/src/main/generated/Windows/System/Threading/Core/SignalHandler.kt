package Windows.System.Threading.Core

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
import java.lang.foreign.ValueLayout.JAVA_BOOLEAN
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface SignalHandlerBody {
  public operator fun invoke(signalNotifier: SignalNotifier?, timedOut: Boolean): Unit
}

@ABIMarker(SignalHandler.ABI::class)
@Signature("delegate({923c402e-4721-440e-9dda-55b6f2e07710})")
@WinRTByReference(brClass = SignalHandler.ByReference::class)
public class SignalHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(signalNotifier: SignalNotifier?, timedOut: Boolean): Unit {
    val timedOut_Native: Byte = if(timedOut) 1 else 0 
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,signalNotifier, timedOut_Native))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(SignalHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      SignalHandlerBody::class.java, MemoryAddress::class.java, MemoryAddress::class.java,
          Byte::class.java, )
    )


    public operator fun invoke(fn: SignalHandlerBody): SignalHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, JAVA_BOOLEAN),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = SignalHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: SignalHandlerBody,
      thisObj: MemoryAddress,
      signalNotifier: MemoryAddress,
      timedOut: Byte
    ): Int {
      try {
        val signalNotifier_Managed = SignalNotifier.ABI.fromNative(signalNotifier) as SignalNotifier
        val timedOut_Managed = timedOut != 0.toByte()
        fn(signalNotifier_Managed, timedOut_Managed)
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
      signalNotifier: SignalNotifier?,
      timedOut: Byte
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SignalHandler>
      {
    public override fun getValue(): SignalHandler = SignalHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: SignalHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<SignalHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("923c402e4721440e9dda55b6f2e07710")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): SignalHandler {
      val address = segment.toRawLongValue()
      return SignalHandler(Pointer(address))
    }

    public override fun toNative(obj: SignalHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
