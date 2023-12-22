package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.UIElement
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

@ABIMarker(IHandwritingView.ABI::class)
@Signature("{c44204a7-31e0-44bc-a38b-4bee64ecd99f}")
@Guid("c44204a731e044bca38b4bee64ecd99f")
@WinRTInterface("c44204a731e044bca38b4bee64ecd99f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandwritingView.ByReference::class)
public interface IHandwritingView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlacementTarget(): UIElement?

  @InterfaceMethod(1)
  public fun put_PlacementTarget(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_PlacementAlignment(): HandwritingPanelPlacementAlignment?

  @InterfaceMethod(3)
  public fun put_PlacementAlignment(value: HandwritingPanelPlacementAlignment?): Unit

  @InterfaceMethod(4)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(5)
  public fun get_AreCandidatesEnabled(): Boolean

  @InterfaceMethod(6)
  public fun put_AreCandidatesEnabled(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun add_Opened(handler: TypedEventHandler<HandwritingView?,
      HandwritingPanelOpenedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_Closed(handler: TypedEventHandler<HandwritingView?,
      HandwritingPanelClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun TryClose(): Boolean

  @InterfaceMethod(12)
  public fun TryOpen(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandwritingView> {
    public override fun getValue() = ABI.makeIHandwritingView(pointer.getPointer(0))

    public fun setValue(value: IHandwritingView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandwritingView {
    public val __1553648074_Ptr: Pointer?

    public val _1553648074_VtblPtr: Pointer?
      get() = __1553648074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlacementTarget(): UIElement? {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PlacementTarget(value: UIElement?): Unit {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PlacementAlignment(): HandwritingPanelPlacementAlignment? {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandwritingPanelPlacementAlignment>()
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandwritingPanelPlacementAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PlacementAlignment(value: HandwritingPanelPlacementAlignment?): Unit {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_AreCandidatesEnabled(): Boolean {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_AreCandidatesEnabled(value: Boolean): Unit {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_Opened(handler: TypedEventHandler<HandwritingView?,
        HandwritingPanelOpenedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_Closed(handler: TypedEventHandler<HandwritingView?,
        HandwritingPanelClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun TryClose(): Boolean {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun TryOpen(): Boolean {
      val fnPtr = _1553648074_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1553648074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHandwritingView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1553648074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandwritingView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c44204a731e044bca38b4bee64ecd99f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandwritingView(ptr: Pointer?): WithDefault = IHandwritingView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandwritingView {
      val address = segment.toRawLongValue()
      return makeIHandwritingView(Pointer(address))
    }

    public override fun toNative(obj: IHandwritingView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1553648074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandwritingView): Array<IHandwritingView?> = (elements as
        Array<IHandwritingView?>).castToImpl<IHandwritingView,IHandwritingView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandwritingView?> =
        arrayOfNulls<IHandwritingView_Impl>(size) as Array<IHandwritingView?>
  }
}
