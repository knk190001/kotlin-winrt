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

@ABIMarker(INumberBoxStatics.ABI::class)
@Signature("{251ec05c-a77c-5540-be39-6053f797cde7}")
@Guid("251ec05ca77c5540be396053f797cde7")
@WinRTInterface("251ec05ca77c5540be396053f797cde7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberBoxStatics.ByReference::class)
public interface INumberBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinimumProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MaximumProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ValueProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_SmallChangeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_LargeChangeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_TextProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_PlaceholderTextProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_SelectionFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_SelectionHighlightColorProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_TextReadingOrderProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_DescriptionProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_ValidationModeProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_SpinButtonPlacementModeProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_IsWrapEnabledProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_AcceptsExpressionProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_NumberFormatterProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumberBoxStatics> {
    public override fun getValue() = ABI.makeINumberBoxStatics(pointer.getPointer(0))

    public fun setValue(value: INumberBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberBoxStatics {
    public val __450912106_Ptr: Pointer?

    public val _450912106_VtblPtr: Pointer?
      get() = __450912106_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinimumProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaximumProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ValueProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SmallChangeProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_LargeChangeProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PlaceholderTextProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SelectionFlyoutProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SelectionHighlightColorProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_TextReadingOrderProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_PreventKeyboardDisplayOnProgrammaticFocusProperty():
        DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_ValidationModeProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_SpinButtonPlacementModeProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_IsWrapEnabledProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_AcceptsExpressionProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_NumberFormatterProperty(): DependencyProperty? {
      val fnPtr = _450912106_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__450912106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INumberBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __450912106_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("251ec05ca77c5540be396053f797cde7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberBoxStatics(ptr: Pointer?): WithDefault = INumberBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberBoxStatics {
      val address = segment.toRawLongValue()
      return makeINumberBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: INumberBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__450912106_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberBoxStatics): Array<INumberBoxStatics?> = (elements
        as Array<INumberBoxStatics?>).castToImpl<INumberBoxStatics,INumberBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberBoxStatics?> =
        arrayOfNulls<INumberBoxStatics_Impl>(size) as Array<INumberBoxStatics?>
  }
}
