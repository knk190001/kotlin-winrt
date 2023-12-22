package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.GridLength
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITwoPaneView.ABI::class)
@Signature("{8d2e56d9-c333-5f15-81d1-b8b27e076522}")
@Guid("8d2e56d9c3335f1581d1b8b27e076522")
@WinRTInterface("8d2e56d9c3335f1581d1b8b27e076522")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITwoPaneView.ByReference::class)
public interface ITwoPaneView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Pane1(): UIElement?

  @InterfaceMethod(1)
  public fun put_Pane1(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_Pane2(): UIElement?

  @InterfaceMethod(3)
  public fun put_Pane2(value: UIElement?): Unit

  @InterfaceMethod(4)
  public fun get_Pane1Length(): GridLength?

  @InterfaceMethod(5)
  public fun put_Pane1Length(value: GridLength?): Unit

  @InterfaceMethod(6)
  public fun get_Pane2Length(): GridLength?

  @InterfaceMethod(7)
  public fun put_Pane2Length(value: GridLength?): Unit

  @InterfaceMethod(8)
  public fun get_PanePriority(): TwoPaneViewPriority?

  @InterfaceMethod(9)
  public fun put_PanePriority(value: TwoPaneViewPriority?): Unit

  @InterfaceMethod(10)
  public fun get_Mode(): TwoPaneViewMode?

  @InterfaceMethod(11)
  public fun get_WideModeConfiguration(): TwoPaneViewWideModeConfiguration?

  @InterfaceMethod(12)
  public fun put_WideModeConfiguration(value: TwoPaneViewWideModeConfiguration?): Unit

  @InterfaceMethod(13)
  public fun get_TallModeConfiguration(): TwoPaneViewTallModeConfiguration?

  @InterfaceMethod(14)
  public fun put_TallModeConfiguration(value: TwoPaneViewTallModeConfiguration?): Unit

  @InterfaceMethod(15)
  public fun get_MinWideModeWidth(): Double

  @InterfaceMethod(16)
  public fun put_MinWideModeWidth(value: Double): Unit

  @InterfaceMethod(17)
  public fun get_MinTallModeHeight(): Double

  @InterfaceMethod(18)
  public fun put_MinTallModeHeight(value: Double): Unit

  @InterfaceMethod(19)
  public fun add_ModeChanged(handler: TypedEventHandler<TwoPaneView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_ModeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITwoPaneView> {
    public override fun getValue() = ABI.makeITwoPaneView(pointer.getPointer(0))

    public fun setValue(value: ITwoPaneView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITwoPaneView {
    public val __894818418_Ptr: Pointer?

    public val _894818418_VtblPtr: Pointer?
      get() = __894818418_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Pane1(): UIElement? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Pane1(value: UIElement?): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Pane2(): UIElement? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Pane2(value: UIElement?): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Pane1Length(): GridLength? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Pane1Length(value: GridLength?): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Pane2Length(): GridLength? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Pane2Length(value: GridLength?): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PanePriority(): TwoPaneViewPriority? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TwoPaneViewPriority>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TwoPaneViewPriority>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PanePriority(value: TwoPaneViewPriority?): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Mode(): TwoPaneViewMode? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TwoPaneViewMode>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TwoPaneViewMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_WideModeConfiguration(): TwoPaneViewWideModeConfiguration? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TwoPaneViewWideModeConfiguration>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TwoPaneViewWideModeConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_WideModeConfiguration(value: TwoPaneViewWideModeConfiguration?): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_TallModeConfiguration(): TwoPaneViewTallModeConfiguration? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TwoPaneViewTallModeConfiguration>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TwoPaneViewTallModeConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_TallModeConfiguration(value: TwoPaneViewTallModeConfiguration?): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_MinWideModeWidth(): Double {
      val fnPtr = _894818418_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_MinWideModeWidth(value: Double): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_MinTallModeHeight(): Double {
      val fnPtr = _894818418_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_MinTallModeHeight(value: Double): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_ModeChanged(handler: TypedEventHandler<TwoPaneView?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _894818418_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_ModeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _894818418_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894818418_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITwoPaneView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __894818418_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITwoPaneView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d2e56d9c3335f1581d1b8b27e076522")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITwoPaneView(ptr: Pointer?): WithDefault = ITwoPaneView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITwoPaneView {
      val address = segment.toRawLongValue()
      return makeITwoPaneView(Pointer(address))
    }

    public override fun toNative(obj: ITwoPaneView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__894818418_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITwoPaneView): Array<ITwoPaneView?> = (elements as
        Array<ITwoPaneView?>).castToImpl<ITwoPaneView,ITwoPaneView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITwoPaneView?> =
        arrayOfNulls<ITwoPaneView_Impl>(size) as Array<ITwoPaneView?>
  }
}
