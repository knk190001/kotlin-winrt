package Windows.UI.Xaml.Controls

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
import com.github.knk190001.winrtbinding.runtime.interop.StringByReference
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

public fun interface ListViewItemToKeyHandlerBody {
  public operator fun invoke(item: IUnknown?): String
}

@ABIMarker(ListViewItemToKeyHandler.ABI::class)
@Signature("delegate({6af5da76-7e8b-4a91-9a56-460cb47d523f})")
@WinRTByReference(brClass = ListViewItemToKeyHandler.ByReference::class)
public class ListViewItemToKeyHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(item: IUnknown?): String {
    val result = StringByReference()
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,item, result))
    checkHR(hr)
    val resultValue = result.getValue()
    val resultValue_Managed = resultValue.handleToString()
    return resultValue_Managed
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(ListViewItemToKeyHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      ListViewItemToKeyHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: ListViewItemToKeyHandlerBody): ListViewItemToKeyHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = ListViewItemToKeyHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: ListViewItemToKeyHandlerBody,
      thisObj: MemoryAddress,
      item: MemoryAddress,
      returnValue: MemorySegment
    ): Int {
      try {
        val item_Managed = IUnknown.ABI.fromNative(item) as IUnknown
        val result = fn(item_Managed)
        val result_Native = result!!.toHandle()
        val returnAddress = Pointer(returnValue[ADDRESS, 0].toRawLongValue())
        val returnByValue = StringByReference()
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
      item: IUnknown?,
      retVal: StringByReference
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListViewItemToKeyHandler> {
    public override fun getValue(): ListViewItemToKeyHandler =
        ListViewItemToKeyHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: ListViewItemToKeyHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<ListViewItemToKeyHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("6af5da767e8b4a919a56460cb47d523f")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): ListViewItemToKeyHandler {
      val address = segment.toRawLongValue()
      return ListViewItemToKeyHandler(Pointer(address))
    }

    public override fun toNative(obj: ListViewItemToKeyHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
