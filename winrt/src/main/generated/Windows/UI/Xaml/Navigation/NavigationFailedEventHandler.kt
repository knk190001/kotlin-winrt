package Windows.UI.Xaml.Navigation

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

public fun interface NavigationFailedEventHandlerBody {
  public operator fun invoke(sender: IUnknown?, e: NavigationFailedEventArgs?): Unit
}

@ABIMarker(NavigationFailedEventHandler.ABI::class)
@Signature("delegate({4dab4671-12b2-43c7-b892-9be2dcd3e88d})")
@WinRTByReference(brClass = NavigationFailedEventHandler.ByReference::class)
public class NavigationFailedEventHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(sender: IUnknown?, e: NavigationFailedEventArgs?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,sender, e))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(NavigationFailedEventHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      NavigationFailedEventHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: NavigationFailedEventHandlerBody): NavigationFailedEventHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = NavigationFailedEventHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: NavigationFailedEventHandlerBody,
      thisObj: MemoryAddress,
      sender: MemoryAddress,
      e: MemoryAddress
    ): Int {
      try {
        val sender_Managed = IUnknown.ABI.fromNative(sender) as IUnknown
        val e_Managed = NavigationFailedEventArgs.ABI.fromNative(e) as NavigationFailedEventArgs
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
      e: NavigationFailedEventArgs?
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationFailedEventHandler> {
    public override fun getValue(): NavigationFailedEventHandler =
        NavigationFailedEventHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: NavigationFailedEventHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<NavigationFailedEventHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("4dab467112b243c7b8929be2dcd3e88d")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): NavigationFailedEventHandler {
      val address = segment.toRawLongValue()
      return NavigationFailedEventHandler(Pointer(address))
    }

    public override fun toNative(obj: NavigationFailedEventHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
