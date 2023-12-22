package Windows.Data.Text

import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWordsSegmenter.ABI::class)
@Signature("{86b4d4d1-b2fe-4e34-a81d-66640300454f}")
@Guid("86b4d4d1b2fe4e34a81d66640300454f")
@WinRTInterface("86b4d4d1b2fe4e34a81d66640300454f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWordsSegmenter.ByReference::class)
public interface IWordsSegmenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResolvedLanguage(): String?

  @InterfaceMethod(1)
  public fun GetTokenAt(text: String?, startIndex: WinDef.UINT): WordSegment?

  @InterfaceMethod(2)
  public fun GetTokens(text: String?): IVectorView<WordSegment?>?

  @InterfaceMethod(3)
  public fun Tokenize(
    text: String?,
    startIndex: WinDef.UINT,
    handler: WordSegmentsTokenizingHandler?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWordsSegmenter> {
    public override fun getValue() = ABI.makeIWordsSegmenter(pointer.getPointer(0))

    public fun setValue(value: IWordsSegmenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWordsSegmenter {
    public val __1702380742_Ptr: Pointer?

    public val _1702380742_VtblPtr: Pointer?
      get() = __1702380742_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResolvedLanguage(): String? {
      val fnPtr = _1702380742_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1702380742_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTokenAt(text: String?, startIndex: WinDef.UINT): WordSegment? {
      val fnPtr = _1702380742_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WordSegment>()
      val hr = fn.invokeHR(arrayOf(__1702380742_Ptr, marshalToNative(text), startIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WordSegment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetTokens(text: String?): IVectorView<WordSegment?>? {
      val fnPtr = _1702380742_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WordSegment?>>()
      val hr = fn.invokeHR(arrayOf(__1702380742_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WordSegment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Tokenize(
      text: String?,
      startIndex: WinDef.UINT,
      handler: WordSegmentsTokenizingHandler?
    ): Unit {
      val fnPtr = _1702380742_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702380742_Ptr, marshalToNative(text), startIndex,
          marshalToNative(handler),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWordsSegmenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1702380742_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWordsSegmenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86b4d4d1b2fe4e34a81d66640300454f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWordsSegmenter(ptr: Pointer?): WithDefault = IWordsSegmenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWordsSegmenter {
      val address = segment.toRawLongValue()
      return makeIWordsSegmenter(Pointer(address))
    }

    public override fun toNative(obj: IWordsSegmenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1702380742_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWordsSegmenter): Array<IWordsSegmenter?> = (elements as
        Array<IWordsSegmenter?>).castToImpl<IWordsSegmenter,IWordsSegmenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWordsSegmenter?> =
        arrayOfNulls<IWordsSegmenter_Impl>(size) as Array<IWordsSegmenter?>
  }
}
