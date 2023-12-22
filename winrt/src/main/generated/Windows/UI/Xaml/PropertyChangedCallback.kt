package Windows.UI.Xaml

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

public fun interface PropertyChangedCallbackBody {
  public operator fun invoke(d: DependencyObject?, e: DependencyPropertyChangedEventArgs?): Unit
}

@ABIMarker(PropertyChangedCallback.ABI::class)
@Signature("delegate({5a9f8a25-d142-44a4-8231-fd676724f29b})")
@WinRTByReference(brClass = PropertyChangedCallback.ByReference::class)
public class PropertyChangedCallback(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(d: DependencyObject?, e: DependencyPropertyChangedEventArgs?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,d, e))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(PropertyChangedCallback::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      PropertyChangedCallbackBody::class.java, MemoryAddress::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: PropertyChangedCallbackBody): PropertyChangedCallback {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = PropertyChangedCallback(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: PropertyChangedCallbackBody,
      thisObj: MemoryAddress,
      d: MemoryAddress,
      e: MemoryAddress
    ): Int {
      try {
        val d_Managed = DependencyObject.ABI.fromNative(d) as DependencyObject
        val e_Managed = DependencyPropertyChangedEventArgs.ABI.fromNative(e) as
            DependencyPropertyChangedEventArgs
        fn(d_Managed, e_Managed)
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
      d: DependencyObject?,
      e: DependencyPropertyChangedEventArgs?
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PropertyChangedCallback> {
    public override fun getValue(): PropertyChangedCallback =
        PropertyChangedCallback(pointer.getPointer(0))

    public fun setValue(`delegate`: PropertyChangedCallback): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<PropertyChangedCallback, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("5a9f8a25d14244a48231fd676724f29b")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): PropertyChangedCallback {
      val address = segment.toRawLongValue()
      return PropertyChangedCallback(Pointer(address))
    }

    public override fun toNative(obj: PropertyChangedCallback): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
