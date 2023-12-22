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

@ABIMarker(IPasswordBoxStatics.ABI::class)
@Signature("{90e6559c-5f74-5cd1-87b6-c0514085ab42}")
@Guid("90e6559c5f745cd187b6c0514085ab42")
@WinRTInterface("90e6559c5f745cd187b6c0514085ab42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBoxStatics.ByReference::class)
public interface IPasswordBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PasswordProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PasswordCharProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsPasswordRevealButtonEnabledProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_MaxLengthProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_PlaceholderTextProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_SelectionHighlightColorProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_PasswordRevealModeProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_TextReadingOrderProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_InputScopeProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_CanPasteClipboardContentProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_SelectionFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_DescriptionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPasswordBoxStatics> {
    public override fun getValue() = ABI.makeIPasswordBoxStatics(pointer.getPointer(0))

    public fun setValue(value: IPasswordBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBoxStatics {
    public val __315692420_Ptr: Pointer?

    public val _315692420_VtblPtr: Pointer?
      get() = __315692420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PasswordProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PasswordCharProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPasswordRevealButtonEnabledProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MaxLengthProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PlaceholderTextProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SelectionHighlightColorProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty():
        DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PasswordRevealModeProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_TextReadingOrderProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_InputScopeProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_CanPasteClipboardContentProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_SelectionFlyoutProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _315692420_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__315692420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPasswordBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __315692420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90e6559c5f745cd187b6c0514085ab42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBoxStatics(ptr: Pointer?): WithDefault = IPasswordBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBoxStatics {
      val address = segment.toRawLongValue()
      return makeIPasswordBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__315692420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBoxStatics): Array<IPasswordBoxStatics?> =
        (elements as
        Array<IPasswordBoxStatics?>).castToImpl<IPasswordBoxStatics,IPasswordBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBoxStatics?> =
        arrayOfNulls<IPasswordBoxStatics_Impl>(size) as Array<IPasswordBoxStatics?>
  }
}
