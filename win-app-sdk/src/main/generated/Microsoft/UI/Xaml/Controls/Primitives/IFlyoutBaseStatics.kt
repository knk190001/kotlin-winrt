package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(IFlyoutBaseStatics.ABI::class)
@Signature("{63ee628e-d2e3-5515-aea4-e461088c0c4e}")
@Guid("63ee628ed2e35515aea4e461088c0c4e")
@WinRTInterface("63ee628ed2e35515aea4e461088c0c4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseStatics.ByReference::class)
public interface IFlyoutBaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PlacementProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_AllowFocusOnInteractionProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_AllowFocusWhenDisabledProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ShowModeProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_InputDevicePrefersPrimaryCommandsProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_AreOpenCloseAnimationsEnabledProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_ShouldConstrainToRootBoundsProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_ElementSoundModeProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_OverlayInputPassThroughElementProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_IsOpenProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_AttachedFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun GetAttachedFlyout(element: FrameworkElement?): FlyoutBase?

  @InterfaceMethod(14)
  public fun SetAttachedFlyout(element: FrameworkElement?, value: FlyoutBase?): Unit

  @InterfaceMethod(15)
  public fun ShowAttachedFlyout(flyoutOwner: FrameworkElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseStatics> {
    public override fun getValue() = ABI.makeIFlyoutBaseStatics(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseStatics {
    public val __48566920_Ptr: Pointer?

    public val _48566920_VtblPtr: Pointer?
      get() = __48566920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PlacementProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AllowFocusOnInteractionProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AllowFocusWhenDisabledProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ShowModeProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_InputDevicePrefersPrimaryCommandsProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AreOpenCloseAnimationsEnabledProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ShouldConstrainToRootBoundsProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ElementSoundModeProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_OverlayInputPassThroughElementProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IsOpenProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_AttachedFlyoutProperty(): DependencyProperty? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetAttachedFlyout(element: FrameworkElement?): FlyoutBase? {
      val fnPtr = _48566920_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SetAttachedFlyout(element: FrameworkElement?, value: FlyoutBase?): Unit {
      val fnPtr = _48566920_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun ShowAttachedFlyout(flyoutOwner: FrameworkElement?): Unit {
      val fnPtr = _48566920_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__48566920_Ptr, marshalToNative(flyoutOwner),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __48566920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63ee628ed2e35515aea4e461088c0c4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseStatics(ptr: Pointer?): WithDefault = IFlyoutBaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseStatics {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseStatics(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__48566920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseStatics): Array<IFlyoutBaseStatics?> =
        (elements as
        Array<IFlyoutBaseStatics?>).castToImpl<IFlyoutBaseStatics,IFlyoutBaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseStatics?> =
        arrayOfNulls<IFlyoutBaseStatics_Impl>(size) as Array<IFlyoutBaseStatics?>
  }
}
