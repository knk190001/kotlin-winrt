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

@ABIMarker(ISelectableWordsSegmenter.ABI::class)
@Signature("{f6dc31e7-4b13-45c5-8897-7d71269e085d}")
@Guid("f6dc31e74b1345c588977d71269e085d")
@WinRTInterface("f6dc31e74b1345c588977d71269e085d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectableWordsSegmenter.ByReference::class)
public interface ISelectableWordsSegmenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResolvedLanguage(): String?

  @InterfaceMethod(1)
  public fun GetTokenAt(text: String?, startIndex: WinDef.UINT): SelectableWordSegment?

  @InterfaceMethod(2)
  public fun GetTokens(text: String?): IVectorView<SelectableWordSegment?>?

  @InterfaceMethod(3)
  public fun Tokenize(
    text: String?,
    startIndex: WinDef.UINT,
    handler: SelectableWordSegmentsTokenizingHandler?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectableWordsSegmenter> {
    public override fun getValue() = ABI.makeISelectableWordsSegmenter(pointer.getPointer(0))

    public fun setValue(value: ISelectableWordsSegmenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectableWordsSegmenter {
    public val __657830544_Ptr: Pointer?

    public val _657830544_VtblPtr: Pointer?
      get() = __657830544_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResolvedLanguage(): String? {
      val fnPtr = _657830544_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__657830544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTokenAt(text: String?, startIndex: WinDef.UINT): SelectableWordSegment? {
      val fnPtr = _657830544_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectableWordSegment>()
      val hr = fn.invokeHR(arrayOf(__657830544_Ptr, marshalToNative(text), startIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectableWordSegment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetTokens(text: String?): IVectorView<SelectableWordSegment?>? {
      val fnPtr = _657830544_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SelectableWordSegment?>>()
      val hr = fn.invokeHR(arrayOf(__657830544_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<SelectableWordSegment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Tokenize(
      text: String?,
      startIndex: WinDef.UINT,
      handler: SelectableWordSegmentsTokenizingHandler?
    ): Unit {
      val fnPtr = _657830544_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__657830544_Ptr, marshalToNative(text), startIndex,
          marshalToNative(handler),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISelectableWordsSegmenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __657830544_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectableWordsSegmenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6dc31e74b1345c588977d71269e085d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectableWordsSegmenter(ptr: Pointer?): WithDefault =
        ISelectableWordsSegmenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectableWordsSegmenter {
      val address = segment.toRawLongValue()
      return makeISelectableWordsSegmenter(Pointer(address))
    }

    public override fun toNative(obj: ISelectableWordsSegmenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__657830544_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectableWordsSegmenter):
        Array<ISelectableWordsSegmenter?> = (elements as
        Array<ISelectableWordsSegmenter?>).castToImpl<ISelectableWordsSegmenter,ISelectableWordsSegmenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectableWordsSegmenter?> =
        arrayOfNulls<ISelectableWordsSegmenter_Impl>(size) as Array<ISelectableWordsSegmenter?>
  }
}
