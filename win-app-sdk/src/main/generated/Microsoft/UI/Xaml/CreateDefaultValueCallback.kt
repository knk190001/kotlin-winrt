package Microsoft.UI.Xaml

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
import com.github.knk190001.winrtbinding.runtime.interop.IUnknownByReference
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
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface CreateDefaultValueCallbackBody {
  public operator fun invoke(): IUnknown
}

@ABIMarker(CreateDefaultValueCallback.ABI::class)
@Signature("delegate({7f808c05-2ac4-5ad9-ac8a-26890333d81e})")
@WinRTByReference(brClass = CreateDefaultValueCallback.ByReference::class)
public class CreateDefaultValueCallback(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(): IUnknown {
    val result = IUnknownByReference()
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,result))
    checkHR(hr)
    val resultValue = result.getValue()
    return resultValue
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(CreateDefaultValueCallback::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      CreateDefaultValueCallbackBody::class.java, MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: CreateDefaultValueCallbackBody): CreateDefaultValueCallback {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = CreateDefaultValueCallback(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: CreateDefaultValueCallbackBody,
      thisObj: MemoryAddress,
      returnValue: MemorySegment
    ): Int {
      try {
        val result = fn()
        val returnAddress = Pointer(returnValue[ADDRESS, 0].toRawLongValue())
        val returnByValue = IUnknownByReference()
        returnByValue.setPointer(returnAddress)
        returnByValue.setValue(result.castToImpl())
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(thisPtr: Pointer, retVal: IUnknownByReference): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CreateDefaultValueCallback> {
    public override fun getValue(): CreateDefaultValueCallback =
        CreateDefaultValueCallback(pointer.getPointer(0))

    public fun setValue(`delegate`: CreateDefaultValueCallback): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<CreateDefaultValueCallback, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("7f808c052ac45ad9ac8a26890333d81e")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): CreateDefaultValueCallback {
      val address = segment.toRawLongValue()
      return CreateDefaultValueCallback(Pointer(address))
    }

    public override fun toNative(obj: CreateDefaultValueCallback): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
