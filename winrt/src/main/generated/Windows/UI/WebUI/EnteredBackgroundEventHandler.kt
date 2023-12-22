package Windows.UI.WebUI

import Windows.ApplicationModel.IEnteredBackgroundEventArgs
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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

public fun interface EnteredBackgroundEventHandlerBody {
  public operator fun invoke(sender: IUnknown?, e: IEnteredBackgroundEventArgs?): Unit
}

@ABIMarker(EnteredBackgroundEventHandler.ABI::class)
@Signature("delegate({2b09a173-b68e-4def-88c1-8de84e5aab2f})")
@WinRTByReference(brClass = EnteredBackgroundEventHandler.ByReference::class)
public class EnteredBackgroundEventHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(sender: IUnknown?, e: IEnteredBackgroundEventArgs?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,sender, e?.toNative() as Pointer))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(EnteredBackgroundEventHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      EnteredBackgroundEventHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: EnteredBackgroundEventHandlerBody):
        EnteredBackgroundEventHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = EnteredBackgroundEventHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: EnteredBackgroundEventHandlerBody,
      thisObj: MemoryAddress,
      sender: MemoryAddress,
      e: MemoryAddress
    ): Int {
      try {
        val sender_Managed = IUnknown.ABI.fromNative(sender) as IUnknown
        val e_Managed = IEnteredBackgroundEventArgs.ABI.fromNative(e) as IEnteredBackgroundEventArgs
        fn(sender_Managed, e_Managed)
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
      sender: IUnknown?,
      e: Pointer
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnteredBackgroundEventHandler> {
    public override fun getValue(): EnteredBackgroundEventHandler =
        EnteredBackgroundEventHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: EnteredBackgroundEventHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<EnteredBackgroundEventHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("2b09a173b68e4def88c18de84e5aab2f")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): EnteredBackgroundEventHandler {
      val address = segment.toRawLongValue()
      return EnteredBackgroundEventHandler(Pointer(address))
    }

    public override fun toNative(obj: EnteredBackgroundEventHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
