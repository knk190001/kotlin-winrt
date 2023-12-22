package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.FrameworkElement
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPopup4.ABI::class)
@Signature("{1870b836-df2f-5fc6-a5f2-748ed6ce7321}")
@Guid("1870b836df2f5fc6a5f2748ed6ce7321")
@WinRTInterface("1870b836df2f5fc6a5f2748ed6ce7321")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopup4.ByReference::class)
public interface IPopup4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlacementTarget(): FrameworkElement?

  @InterfaceMethod(1)
  public fun put_PlacementTarget(value: FrameworkElement?): Unit

  @InterfaceMethod(2)
  public fun get_DesiredPlacement(): PopupPlacementMode?

  @InterfaceMethod(3)
  public fun put_DesiredPlacement(value: PopupPlacementMode?): Unit

  @InterfaceMethod(4)
  public fun get_ActualPlacement(): PopupPlacementMode?

  @InterfaceMethod(5)
  public fun add_ActualPlacementChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ActualPlacementChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopup4> {
    public override fun getValue() = ABI.makeIPopup4(pointer.getPointer(0))

    public fun setValue(value: IPopup4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopup4 {
    public val __1185883420_Ptr: Pointer?

    public val _1185883420_VtblPtr: Pointer?
      get() = __1185883420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlacementTarget(): FrameworkElement? {
      val fnPtr = _1185883420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameworkElement>()
      val hr = fn.invokeHR(arrayOf(__1185883420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameworkElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PlacementTarget(value: FrameworkElement?): Unit {
      val fnPtr = _1185883420_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1185883420_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DesiredPlacement(): PopupPlacementMode? {
      val fnPtr = _1185883420_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PopupPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__1185883420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PopupPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DesiredPlacement(value: PopupPlacementMode?): Unit {
      val fnPtr = _1185883420_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1185883420_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ActualPlacement(): PopupPlacementMode? {
      val fnPtr = _1185883420_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PopupPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__1185883420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PopupPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_ActualPlacementChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1185883420_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1185883420_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ActualPlacementChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1185883420_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1185883420_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPopup4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1185883420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopup4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1870b836df2f5fc6a5f2748ed6ce7321")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopup4(ptr: Pointer?): WithDefault = IPopup4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopup4 {
      val address = segment.toRawLongValue()
      return makeIPopup4(Pointer(address))
    }

    public override fun toNative(obj: IPopup4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1185883420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopup4): Array<IPopup4?> = (elements as
        Array<IPopup4?>).castToImpl<IPopup4,IPopup4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopup4?> = arrayOfNulls<IPopup4_Impl>(size) as
        Array<IPopup4?>
  }
}
