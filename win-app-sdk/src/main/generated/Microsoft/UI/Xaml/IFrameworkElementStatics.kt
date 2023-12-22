package Microsoft.UI.Xaml

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

@ABIMarker(IFrameworkElementStatics.ABI::class)
@Signature("{894e2704-14e7-569a-b21e-afc7df7145a1}")
@Guid("894e270414e7569ab21eafc7df7145a1")
@WinRTInterface("894e270414e7569ab21eafc7df7145a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementStatics.ByReference::class)
public interface IFrameworkElementStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TagProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_LanguageProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ActualWidthProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ActualHeightProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_WidthProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_HeightProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_MinWidthProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_MaxWidthProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_MinHeightProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_MaxHeightProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_HorizontalAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_VerticalAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_MarginProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_NameProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_DataContextProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_AllowFocusOnInteractionProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_FocusVisualMarginProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_FocusVisualSecondaryThicknessProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_FocusVisualPrimaryThicknessProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_FocusVisualSecondaryBrushProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_FocusVisualPrimaryBrushProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_AllowFocusWhenDisabledProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_StyleProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_FlowDirectionProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_RequestedThemeProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun get_ActualThemeProperty(): DependencyProperty?

  @InterfaceMethod(26)
  public fun DeferTree(element: DependencyObject?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementStatics> {
    public override fun getValue() = ABI.makeIFrameworkElementStatics(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementStatics {
    public val __519096672_Ptr: Pointer?

    public val _519096672_VtblPtr: Pointer?
      get() = __519096672_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TagProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LanguageProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ActualWidthProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ActualHeightProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_WidthProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HeightProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MinWidthProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MaxWidthProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_MinHeightProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_MaxHeightProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_HorizontalAlignmentProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_VerticalAlignmentProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_MarginProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_NameProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_DataContextProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_AllowFocusOnInteractionProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_FocusVisualMarginProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_FocusVisualSecondaryThicknessProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_FocusVisualPrimaryThicknessProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_FocusVisualSecondaryBrushProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_FocusVisualPrimaryBrushProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_AllowFocusWhenDisabledProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_StyleProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_FlowDirectionProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_RequestedThemeProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_ActualThemeProperty(): DependencyProperty? {
      val fnPtr = _519096672_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun DeferTree(element: DependencyObject?): Unit {
      val fnPtr = _519096672_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__519096672_Ptr, marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkElementStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __519096672_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("894e270414e7569ab21eafc7df7145a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementStatics(ptr: Pointer?): WithDefault =
        IFrameworkElementStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementStatics {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementStatics(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__519096672_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementStatics):
        Array<IFrameworkElementStatics?> = (elements as
        Array<IFrameworkElementStatics?>).castToImpl<IFrameworkElementStatics,IFrameworkElementStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementStatics?> =
        arrayOfNulls<IFrameworkElementStatics_Impl>(size) as Array<IFrameworkElementStatics?>
  }
}
