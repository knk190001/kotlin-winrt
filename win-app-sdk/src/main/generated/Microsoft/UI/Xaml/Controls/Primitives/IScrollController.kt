package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Composition.CompositionAnimation
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Numerics.Vector2
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollController.ABI::class)
@Signature("{54396786-1726-53d6-97a3-40af0838314c}")
@Guid("54396786172653d697a340af0838314c")
@WinRTInterface("54396786172653d697a340af0838314c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollController.ByReference::class)
public interface IScrollController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PanningInfo(): IScrollControllerPanningInfo?

  @InterfaceMethod(1)
  public fun get_CanScroll(): Boolean

  @InterfaceMethod(2)
  public fun get_IsScrollingWithMouse(): Boolean

  @InterfaceMethod(3)
  public fun SetIsScrollable(isScrollable: Boolean): Unit

  @InterfaceMethod(4)
  public fun SetValues(
    minOffset: Double,
    maxOffset: Double,
    offset: Double,
    viewportLength: Double
  ): Unit

  @InterfaceMethod(5)
  public fun GetScrollAnimation(
    correlationId: Int,
    startPosition: Vector2?,
    endPosition: Vector2?,
    defaultAnimation: CompositionAnimation?
  ): CompositionAnimation?

  @InterfaceMethod(6)
  public fun NotifyRequestedScrollCompleted(correlationId: Int): Unit

  @InterfaceMethod(7)
  public fun add_CanScrollChanged(handler: TypedEventHandler<IScrollController?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_CanScrollChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_IsScrollingWithMouseChanged(handler: TypedEventHandler<IScrollController?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_IsScrollingWithMouseChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_ScrollToRequested(handler: TypedEventHandler<IScrollController?,
      ScrollControllerScrollToRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_ScrollToRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_ScrollByRequested(handler: TypedEventHandler<IScrollController?,
      ScrollControllerScrollByRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_ScrollByRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_AddScrollVelocityRequested(handler: TypedEventHandler<IScrollController?,
      ScrollControllerAddScrollVelocityRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_AddScrollVelocityRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollController> {
    public override fun getValue() = ABI.makeIScrollController(pointer.getPointer(0))

    public fun setValue(value: IScrollController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollController {
    public val __2133444454_Ptr: Pointer?

    public val _2133444454_VtblPtr: Pointer?
      get() = __2133444454_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PanningInfo(): IScrollControllerPanningInfo? {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IScrollControllerPanningInfo>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IScrollControllerPanningInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanScroll(): Boolean {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsScrollingWithMouse(): Boolean {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SetIsScrollable(isScrollable: Boolean): Unit {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, isScrollable,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetValues(
      minOffset: Double,
      maxOffset: Double,
      offset: Double,
      viewportLength: Double
    ): Unit {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, minOffset, maxOffset, offset, viewportLength,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetScrollAnimation(
      correlationId: Int,
      startPosition: Vector2?,
      endPosition: Vector2?,
      defaultAnimation: CompositionAnimation?
    ): CompositionAnimation? {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionAnimation>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, correlationId, marshalToNative(startPosition),
          marshalToNative(endPosition), marshalToNative(defaultAnimation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun NotifyRequestedScrollCompleted(correlationId: Int): Unit {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, correlationId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_CanScrollChanged(handler: TypedEventHandler<IScrollController?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_CanScrollChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override
        fun add_IsScrollingWithMouseChanged(handler: TypedEventHandler<IScrollController?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_IsScrollingWithMouseChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_ScrollToRequested(handler: TypedEventHandler<IScrollController?,
        ScrollControllerScrollToRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_ScrollToRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_ScrollByRequested(handler: TypedEventHandler<IScrollController?,
        ScrollControllerScrollByRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_ScrollByRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override
        fun add_AddScrollVelocityRequested(handler: TypedEventHandler<IScrollController?,
        ScrollControllerAddScrollVelocityRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_AddScrollVelocityRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2133444454_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2133444454_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2133444454_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54396786172653d697a340af0838314c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollController(ptr: Pointer?): WithDefault = IScrollController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollController {
      val address = segment.toRawLongValue()
      return makeIScrollController(Pointer(address))
    }

    public override fun toNative(obj: IScrollController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2133444454_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollController): Array<IScrollController?> = (elements
        as Array<IScrollController?>).castToImpl<IScrollController,IScrollController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollController?> =
        arrayOfNulls<IScrollController_Impl>(size) as Array<IScrollController?>
  }
}
