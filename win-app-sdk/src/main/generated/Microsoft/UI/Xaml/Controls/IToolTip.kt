package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.PlacementMode
import Microsoft.UI.Xaml.Controls.Primitives.ToolTipTemplateSettings
import Microsoft.UI.Xaml.RoutedEventHandler
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.Rect
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToolTip.ABI::class)
@Signature("{67e93d74-5e93-59a1-91bf-413efbeb904c}")
@Guid("67e93d745e9359a191bf413efbeb904c")
@WinRTInterface("67e93d745e9359a191bf413efbeb904c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToolTip.ByReference::class)
public interface IToolTip : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(1)
  public fun put_HorizontalOffset(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(3)
  public fun put_IsOpen(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_Placement(): PlacementMode?

  @InterfaceMethod(5)
  public fun put_Placement(value: PlacementMode?): Unit

  @InterfaceMethod(6)
  public fun get_PlacementTarget(): UIElement?

  @InterfaceMethod(7)
  public fun put_PlacementTarget(value: UIElement?): Unit

  @InterfaceMethod(8)
  public fun get_PlacementRect(): IReference<Rect?>?

  @InterfaceMethod(9)
  public fun put_PlacementRect(value: IReference<Rect?>?): Unit

  @InterfaceMethod(10)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(11)
  public fun put_VerticalOffset(value: Double): Unit

  @InterfaceMethod(12)
  public fun get_TemplateSettings(): ToolTipTemplateSettings?

  @InterfaceMethod(13)
  public fun add_Closed(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_Opened(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IToolTip> {
    public override fun getValue() = ABI.makeIToolTip(pointer.getPointer(0))

    public fun setValue(value: IToolTip_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToolTip {
    public val __1205652540_Ptr: Pointer?

    public val _1205652540_VtblPtr: Pointer?
      get() = __1205652540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalOffset(value: Double): Unit {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsOpen(value: Boolean): Unit {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Placement(): PlacementMode? {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlacementMode>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Placement(value: PlacementMode?): Unit {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PlacementTarget(): UIElement? {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PlacementTarget(value: UIElement?): Unit {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PlacementRect(): IReference<Rect?>? {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Rect?>>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Rect?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PlacementRect(value: IReference<Rect?>?): Unit {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_VerticalOffset(value: Double): Unit {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TemplateSettings(): ToolTipTemplateSettings? {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToolTipTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToolTipTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun add_Closed(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_Opened(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1205652540_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205652540_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToolTip_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1205652540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToolTip, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67e93d745e9359a191bf413efbeb904c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToolTip(ptr: Pointer?): WithDefault = IToolTip_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToolTip {
      val address = segment.toRawLongValue()
      return makeIToolTip(Pointer(address))
    }

    public override fun toNative(obj: IToolTip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1205652540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToolTip): Array<IToolTip?> = (elements as
        Array<IToolTip?>).castToImpl<IToolTip,IToolTip_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToolTip?> = arrayOfNulls<IToolTip_Impl>(size) as
        Array<IToolTip?>
  }
}
