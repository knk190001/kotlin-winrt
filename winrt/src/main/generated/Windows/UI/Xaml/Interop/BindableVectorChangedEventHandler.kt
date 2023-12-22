package Windows.UI.Xaml.Interop

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

public fun interface BindableVectorChangedEventHandlerBody {
  public operator fun invoke(vector: IBindableObservableVector?, e: IUnknown?): Unit
}

@ABIMarker(BindableVectorChangedEventHandler.ABI::class)
@Signature("delegate({624cd4e1-d007-43b1-9c03-af4d3e6258c4})")
@WinRTByReference(brClass = BindableVectorChangedEventHandler.ByReference::class)
public class BindableVectorChangedEventHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(vector: IBindableObservableVector?, e: IUnknown?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,vector?.toNative() as Pointer, e))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(BindableVectorChangedEventHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      BindableVectorChangedEventHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: BindableVectorChangedEventHandlerBody):
        BindableVectorChangedEventHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = BindableVectorChangedEventHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: BindableVectorChangedEventHandlerBody,
      thisObj: MemoryAddress,
      vector: MemoryAddress,
      e: MemoryAddress
    ): Int {
      try {
        val vector_Managed = IBindableObservableVector.ABI.fromNative(vector) as
            IBindableObservableVector
        val e_Managed = IUnknown.ABI.fromNative(e) as IUnknown
        fn(vector_Managed, e_Managed)
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
      vector: Pointer,
      e: IUnknown?
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BindableVectorChangedEventHandler> {
    public override fun getValue(): BindableVectorChangedEventHandler =
        BindableVectorChangedEventHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: BindableVectorChangedEventHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<BindableVectorChangedEventHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("624cd4e1d00743b19c03af4d3e6258c4")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): BindableVectorChangedEventHandler {
      val address = segment.toRawLongValue()
      return BindableVectorChangedEventHandler(Pointer(address))
    }

    public override fun toNative(obj: BindableVectorChangedEventHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
