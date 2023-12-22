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

public fun interface WordSegmentsTokenizingHandlerBody {
  public operator fun invoke(precedingWords: IIterable<WordSegment?>?,
      words: IIterable<WordSegment?>?): Unit
}

@ABIMarker(WordSegmentsTokenizingHandler.ABI::class)
@Signature("delegate({a5dd6357-bf2a-4c4f-a31f-29e71c6f8b35})")
@WinRTByReference(brClass = WordSegmentsTokenizingHandler.ByReference::class)
public class WordSegmentsTokenizingHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(precedingWords: IIterable<WordSegment?>?, words: IIterable<WordSegment?>?):
      Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,precedingWords?.toNative() as Pointer,
        words?.toNative() as Pointer))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(WordSegmentsTokenizingHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      WordSegmentsTokenizingHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: WordSegmentsTokenizingHandlerBody):
        WordSegmentsTokenizingHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = WordSegmentsTokenizingHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: WordSegmentsTokenizingHandlerBody,
      thisObj: MemoryAddress,
      precedingWords: MemoryAddress,
      words: MemoryAddress
    ): Int {
      try {
        val precedingWords_Managed = IIterable.ABI.fromNative(typeOf<IIterable<WordSegment?>>(),
            precedingWords) as IIterable<WordSegment?>
        val words_Managed = IIterable.ABI.fromNative(typeOf<IIterable<WordSegment?>>(), words) as
            IIterable<WordSegment?>
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
      IByReference<WordSegmentsTokenizingHandler> {
    public override fun getValue(): WordSegmentsTokenizingHandler =
        WordSegmentsTokenizingHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: WordSegmentsTokenizingHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<WordSegmentsTokenizingHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("a5dd6357bf2a4c4fa31f29e71c6f8b35")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): WordSegmentsTokenizingHandler {
      val address = segment.toRawLongValue()
      return WordSegmentsTokenizingHandler(Pointer(address))
    }

    public override fun toNative(obj: WordSegmentsTokenizingHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
