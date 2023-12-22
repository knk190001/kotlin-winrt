package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IBackgroundActivatedEventArgs
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

public fun interface BackgroundActivatedEventHandlerBody {
  public operator fun invoke(sender: IUnknown?, eventArgs: IBackgroundActivatedEventArgs?): Unit
}

@ABIMarker(BackgroundActivatedEventHandler.ABI::class)
@Signature("delegate({edb19fbb-0761-47cc-9a77-24d7072965ca})")
@WinRTByReference(brClass = BackgroundActivatedEventHandler.ByReference::class)
public class BackgroundActivatedEventHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(sender: IUnknown?, eventArgs: IBackgroundActivatedEventArgs?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,sender, eventArgs?.toNative() as Pointer))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(BackgroundActivatedEventHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      BackgroundActivatedEventHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: BackgroundActivatedEventHandlerBody):
        BackgroundActivatedEventHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = BackgroundActivatedEventHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: BackgroundActivatedEventHandlerBody,
      thisObj: MemoryAddress,
      sender: MemoryAddress,
      eventArgs: MemoryAddress
    ): Int {
      try {
        val sender_Managed = IUnknown.ABI.fromNative(sender) as IUnknown
        val eventArgs_Managed = IBackgroundActivatedEventArgs.ABI.fromNative(eventArgs) as
            IBackgroundActivatedEventArgs
        fn(sender_Managed, eventArgs_Managed)
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
      eventArgs: Pointer
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundActivatedEventHandler> {
    public override fun getValue(): BackgroundActivatedEventHandler =
        BackgroundActivatedEventHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: BackgroundActivatedEventHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<BackgroundActivatedEventHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("edb19fbb076147cc9a7724d7072965ca")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): BackgroundActivatedEventHandler {
      val address = segment.toRawLongValue()
      return BackgroundActivatedEventHandler(Pointer(address))
    }

    public override fun toNative(obj: BackgroundActivatedEventHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
