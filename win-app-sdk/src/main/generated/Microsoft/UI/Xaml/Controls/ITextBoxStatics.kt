package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextBoxStatics.ABI::class)
@Signature("{a41cf38f-712a-5599-bbed-5a3d9b6bd46e}")
@Guid("a41cf38f712a5599bbed5a3d9b6bd46e")
@WinRTInterface("a41cf38f712a5599bbed5a3d9b6bd46e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxStatics.ByReference::class)
public interface ITextBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MaxLengthProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsReadOnlyProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_AcceptsReturnProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_TextAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_TextWrappingProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsSpellCheckEnabledProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_IsTextPredictionEnabledProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_InputScopeProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_PlaceholderTextProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_SelectionHighlightColorProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_IsColorFontEnabledProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_SelectionHighlightColorWhenNotFocusedProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_HorizontalTextAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_CharacterCasingProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_PlaceholderForegroundProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_CanPasteClipboardContentProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_CanUndoProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_CanRedoProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_SelectionFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_ProofingMenuFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_DescriptionProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun get_DesiredCandidateWindowAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(26)
  public fun get_TextReadingOrderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxStatics> {
    public override fun getValue() = ABI.makeITextBoxStatics(pointer.getPointer(0))

    public fun setValue(value: ITextBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxStatics {
    public val __1242628622_Ptr: Pointer?

    public val _1242628622_VtblPtr: Pointer?
      get() = __1242628622_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxLengthProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsReadOnlyProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AcceptsReturnProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TextAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TextWrappingProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsSpellCheckEnabledProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsTextPredictionEnabledProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_InputScopeProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_PlaceholderTextProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_SelectionHighlightColorProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty():
        DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_IsColorFontEnabledProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_SelectionHighlightColorWhenNotFocusedProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_HorizontalTextAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_CharacterCasingProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_PlaceholderForegroundProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_CanPasteClipboardContentProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_CanUndoProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_CanRedoProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_SelectionFlyoutProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_ProofingMenuFlyoutProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_DesiredCandidateWindowAlignmentProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_TextReadingOrderProperty(): DependencyProperty? {
      val fnPtr = _1242628622_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1242628622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1242628622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a41cf38f712a5599bbed5a3d9b6bd46e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxStatics(ptr: Pointer?): WithDefault = ITextBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxStatics {
      val address = segment.toRawLongValue()
      return makeITextBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1242628622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxStatics): Array<ITextBoxStatics?> = (elements as
        Array<ITextBoxStatics?>).castToImpl<ITextBoxStatics,ITextBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxStatics?> =
        arrayOfNulls<ITextBoxStatics_Impl>(size) as Array<ITextBoxStatics?>
  }
}
