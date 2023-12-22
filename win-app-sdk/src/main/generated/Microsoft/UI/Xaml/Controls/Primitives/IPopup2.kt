package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.FrameworkElement
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IPopup2.ABI::class)
@Signature("{ea9c4f43-a937-53d5-b665-6640ad7ec2f4}")
@Guid("ea9c4f43a93753d5b6656640ad7ec2f4")
@WinRTInterface("ea9c4f43a93753d5b6656640ad7ec2f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopup2.ByReference::class)
public interface IPopup2 : NativeMapped, IWinRTInterface {
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopup2> {
    public override fun getValue() = ABI.makeIPopup2(pointer.getPointer(0))

    public fun setValue(value: IPopup2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopup2 {
    public val __253127529_Ptr: Pointer?

    public val _253127529_VtblPtr: Pointer?
      get() = __253127529_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlacementTarget(): FrameworkElement? {
      val fnPtr = _253127529_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameworkElement>()
      val hr = fn.invokeHR(arrayOf(__253127529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameworkElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PlacementTarget(value: FrameworkElement?): Unit {
      val fnPtr = _253127529_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__253127529_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DesiredPlacement(): PopupPlacementMode? {
      val fnPtr = _253127529_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PopupPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__253127529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PopupPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DesiredPlacement(value: PopupPlacementMode?): Unit {
      val fnPtr = _253127529_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__253127529_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ActualPlacement(): PopupPlacementMode? {
      val fnPtr = _253127529_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PopupPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__253127529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PopupPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_ActualPlacementChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _253127529_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__253127529_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ActualPlacementChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _253127529_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__253127529_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPopup2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __253127529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopup2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea9c4f43a93753d5b6656640ad7ec2f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopup2(ptr: Pointer?): WithDefault = IPopup2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopup2 {
      val address = segment.toRawLongValue()
      return makeIPopup2(Pointer(address))
    }

    public override fun toNative(obj: IPopup2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__253127529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopup2): Array<IPopup2?> = (elements as
        Array<IPopup2?>).castToImpl<IPopup2,IPopup2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopup2?> = arrayOfNulls<IPopup2_Impl>(size) as
        Array<IPopup2?>
  }
}
