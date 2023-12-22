package Microsoft.UI.Xaml.Controls

import Windows.Foundation.IAsyncOperation
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
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface ListViewKeyToItemHandlerBody {
  public operator fun invoke(key: String?): IAsyncOperation<IUnknown?>
}

@ABIMarker(ListViewKeyToItemHandler.ABI::class)
@Signature("delegate({46c8e78e-b948-5ef3-b845-b278b5918ba9})")
@WinRTByReference(brClass = ListViewKeyToItemHandler.ByReference::class)
public class ListViewKeyToItemHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(key: String?): IAsyncOperation<IUnknown?> {
    val result = Windows.Foundation.IAsyncOperation.ByReference<IUnknown?>()
    val key_Native = key!!.toHandle()
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,key_Native, result))
    checkHR(hr)
    val resultValue = result.getValue()
    return resultValue
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(ListViewKeyToItemHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      ListViewKeyToItemHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: ListViewKeyToItemHandlerBody): ListViewKeyToItemHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = ListViewKeyToItemHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: ListViewKeyToItemHandlerBody,
      thisObj: MemoryAddress,
      key: MemoryAddress,
      returnValue: MemorySegment
    ): Int {
      try {
        val key_Managed = String.ABI.fromNative(key) as String
        val result = fn(key_Managed)
        val returnAddress = Pointer(returnValue[ADDRESS, 0].toRawLongValue())
        val returnByValue = Windows.Foundation.IAsyncOperation.ByReference<IUnknown?>()
        returnByValue.setPointer(returnAddress)
        returnByValue.setValue(result)
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
      key: WinNT.HANDLE,
      retVal: Windows.Foundation.IAsyncOperation.ByReference<IUnknown?>
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewKeyToItemHandler> {
    public override fun getValue(): ListViewKeyToItemHandler =
        ListViewKeyToItemHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: ListViewKeyToItemHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<ListViewKeyToItemHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("46c8e78eb9485ef3b845b278b5918ba9")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): ListViewKeyToItemHandler {
      val address = segment.toRawLongValue()
      return ListViewKeyToItemHandler(Pointer(address))
    }

    public override fun toNative(obj: ListViewKeyToItemHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
