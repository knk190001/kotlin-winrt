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

@ABIMarker(INavigationViewStatics.ABI::class)
@Signature("{dcd04caf-1904-564b-b0de-babaff9962f5}")
@Guid("dcd04caf1904564bb0debabaff9962f5")
@WinRTInterface("dcd04caf1904564bb0debabaff9962f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewStatics.ByReference::class)
public interface INavigationViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPaneOpenProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CompactModeThresholdWidthProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ExpandedModeThresholdWidthProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FooterMenuItemsProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FooterMenuItemsSourceProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_PaneFooterProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_DisplayModeProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_IsSettingsVisibleProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_IsPaneToggleButtonVisibleProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_AlwaysShowHeaderProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_CompactPaneLengthProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_OpenPaneLengthProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_PaneToggleButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_MenuItemsProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_MenuItemsSourceProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_SelectedItemProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_SettingsItemProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_AutoSuggestBoxProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_MenuItemTemplateProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_MenuItemTemplateSelectorProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_MenuItemContainerStyleProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_MenuItemContainerStyleSelectorProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_IsTitleBarAutoPaddingEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewStatics> {
    public override fun getValue() = ABI.makeINavigationViewStatics(pointer.getPointer(0))

    public fun setValue(value: INavigationViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewStatics {
    public val __1087551301_Ptr: Pointer?

    public val _1087551301_VtblPtr: Pointer?
      get() = __1087551301_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPaneOpenProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CompactModeThresholdWidthProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExpandedModeThresholdWidthProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FooterMenuItemsProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FooterMenuItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PaneFooterProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_DisplayModeProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_IsSettingsVisibleProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IsPaneToggleButtonVisibleProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_AlwaysShowHeaderProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_CompactPaneLengthProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_OpenPaneLengthProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_PaneToggleButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_MenuItemsProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_MenuItemsSourceProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_SelectedItemProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_SettingsItemProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_AutoSuggestBoxProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_MenuItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_MenuItemTemplateSelectorProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_MenuItemContainerStyleProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_MenuItemContainerStyleSelectorProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_IsTitleBarAutoPaddingEnabledProperty(): DependencyProperty? {
      val fnPtr = _1087551301_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1087551301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1087551301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dcd04caf1904564bb0debabaff9962f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewStatics(ptr: Pointer?): WithDefault =
        INavigationViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewStatics {
      val address = segment.toRawLongValue()
      return makeINavigationViewStatics(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1087551301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewStatics): Array<INavigationViewStatics?> =
        (elements as
        Array<INavigationViewStatics?>).castToImpl<INavigationViewStatics,INavigationViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewStatics?> =
        arrayOfNulls<INavigationViewStatics_Impl>(size) as Array<INavigationViewStatics?>
  }
}
