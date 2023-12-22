package Windows.Data.Text

import Windows.Foundation.Collections.IIterable
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

public fun interface SelectableWordSegmentsTokenizingHandlerBody {
  public operator fun invoke(precedingWords: IIterable<SelectableWordSegment?>?,
      words: IIterable<SelectableWordSegment?>?): Unit
}

@ABIMarker(SelectableWordSegmentsTokenizingHandler.ABI::class)
@Signature("delegate({3a3dfc9c-aede-4dc7-9e6c-41c044bd3592})")
@WinRTByReference(brClass = SelectableWordSegmentsTokenizingHandler.ByReference::class)
public class SelectableWordSegmentsTokenizingHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(precedingWords: IIterable<SelectableWordSegment?>?,
      words: IIterable<SelectableWordSegment?>?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,precedingWords?.toNative() as Pointer,
        words?.toNative() as Pointer))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(SelectableWordSegmentsTokenizingHandler::class.java,
        "nativeFn",
      MethodType.methodType(Int::class.java, 
      SelectableWordSegmentsTokenizingHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: SelectableWordSegmentsTokenizingHandlerBody):
        SelectableWordSegmentsTokenizingHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = SelectableWordSegmentsTokenizingHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: SelectableWordSegmentsTokenizingHandlerBody,
      thisObj: MemoryAddress,
      precedingWords: MemoryAddress,
      words: MemoryAddress
    ): Int {
      try {
        val precedingWords_Managed =
            IIterable.ABI.fromNative(typeOf<IIterable<SelectableWordSegment?>>(), precedingWords) as
            IIterable<SelectableWordSegment?>
        val words_Managed = IIterable.ABI.fromNative(typeOf<IIterable<SelectableWordSegment?>>(),
            words) as IIterable<SelectableWordSegment?>
        fn(precedingWords_Managed, words_Managed)
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
      precedingWords: Pointer,
      words: Pointer
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SelectableWordSegmentsTokenizingHandler> {
    public override fun getValue(): SelectableWordSegmentsTokenizingHandler =
        SelectableWordSegmentsTokenizingHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: SelectableWordSegmentsTokenizingHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<SelectableWordSegmentsTokenizingHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("3a3dfc9caede4dc79e6c41c044bd3592")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SelectableWordSegmentsTokenizingHandler {
      val address = segment.toRawLongValue()
      return SelectableWordSegmentsTokenizingHandler(Pointer(address))
    }

    public override fun toNative(obj: SelectableWordSegmentsTokenizingHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
