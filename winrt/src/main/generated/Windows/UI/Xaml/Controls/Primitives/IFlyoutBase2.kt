package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Controls.LightDismissOverlayMode
import Windows.UI.Xaml.ElementSoundMode
import Windows.UI.Xaml.FrameworkElement
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFlyoutBase2.ABI::class)
@Signature("{f82b435e-65b3-41c6-a9e2-77b67bc4c00c}")
@Guid("f82b435e65b341c6a9e277b67bc4c00c")
@WinRTInterface("f82b435e65b341c6a9e277b67bc4c00c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBase2.ByReference::class)
public interface IFlyoutBase2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Target(): FrameworkElement?

  @InterfaceMethod(1)
  public fun get_AllowFocusOnInteraction(): Boolean

  @InterfaceMethod(2)
  public fun put_AllowFocusOnInteraction(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(4)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  @InterfaceMethod(5)
  public fun get_AllowFocusWhenDisabled(): Boolean

  @InterfaceMethod(6)
  public fun put_AllowFocusWhenDisabled(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_ElementSoundMode(): ElementSoundMode?

  @InterfaceMethod(8)
  public fun put_ElementSoundMode(value: ElementSoundMode?): Unit

  @InterfaceMethod(9)
  public fun add_Closing(handler: TypedEventHandler<FlyoutBase?, FlyoutBaseClosingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlyoutBase2> {
    public override fun getValue() = ABI.makeIFlyoutBase2(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBase2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBase2 {
    public val __1324150294_Ptr: Pointer?

    public val _1324150294_VtblPtr: Pointer?
      get() = __1324150294_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Target(): FrameworkElement? {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameworkElement>()
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameworkElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllowFocusOnInteraction(): Boolean {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AllowFocusOnInteraction(value: Boolean): Unit {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_AllowFocusWhenDisabled(): Boolean {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_AllowFocusWhenDisabled(value: Boolean): Unit {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_ElementSoundMode(): ElementSoundMode? {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementSoundMode>()
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementSoundMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_ElementSoundMode(value: ElementSoundMode?): Unit {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_Closing(handler: TypedEventHandler<FlyoutBase?,
        FlyoutBaseClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1324150294_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150294_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBase2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1324150294_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBase2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f82b435e65b341c6a9e277b67bc4c00c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBase2(ptr: Pointer?): WithDefault = IFlyoutBase2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBase2 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBase2(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBase2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1324150294_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBase2): Array<IFlyoutBase2?> = (elements as
        Array<IFlyoutBase2?>).castToImpl<IFlyoutBase2,IFlyoutBase2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBase2?> =
        arrayOfNulls<IFlyoutBase2_Impl>(size) as Array<IFlyoutBase2?>
  }
}
