package Microsoft.UI.Input

import Microsoft.UI.Dispatching.DispatcherQueue
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.RectInt32
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

@ABIMarker(IInputNonClientPointerSource.ABI::class)
@Signature("{471732b4-3d07-5104-b192-ebacf71e86df}")
@Guid("471732b43d075104b192ebacf71e86df")
@WinRTInterface("471732b43d075104b192ebacf71e86df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputNonClientPointerSource.ByReference::class)
public interface IInputNonClientPointerSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(1)
  public fun ClearAllRegionRects(): Unit

  @InterfaceMethod(2)
  public fun ClearRegionRects(region: NonClientRegionKind?): Unit

  @InterfaceMethod(3)
  public fun GetRegionRects(region: NonClientRegionKind?): Array<RectInt32?>?

  @InterfaceMethod(4)
  public fun SetRegionRects(region: NonClientRegionKind?, rects: Array<RectInt32?>): Unit

  @InterfaceMethod(5)
  public fun add_CaptionTapped(handler: TypedEventHandler<InputNonClientPointerSource?,
      NonClientCaptionTappedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_CaptionTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_PointerEntered(handler: TypedEventHandler<InputNonClientPointerSource?,
      NonClientPointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_PointerEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_PointerExited(handler: TypedEventHandler<InputNonClientPointerSource?,
      NonClientPointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_PointerExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_PointerMoved(handler: TypedEventHandler<InputNonClientPointerSource?,
      NonClientPointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_PointerMoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_PointerPressed(handler: TypedEventHandler<InputNonClientPointerSource?,
      NonClientPointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_PointerPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_PointerReleased(handler: TypedEventHandler<InputNonClientPointerSource?,
      NonClientPointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_PointerReleased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_RegionsChanged(handler: TypedEventHandler<InputNonClientPointerSource?,
      NonClientRegionsChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_RegionsChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputNonClientPointerSource> {
    public override fun getValue() = ABI.makeIInputNonClientPointerSource(pointer.getPointer(0))

    public fun setValue(value: IInputNonClientPointerSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputNonClientPointerSource {
    public val __1925868017_Ptr: Pointer?

    public val _1925868017_VtblPtr: Pointer?
      get() = __1925868017_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ClearAllRegionRects(): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ClearRegionRects(region: NonClientRegionKind?): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(region),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetRegionRects(region: NonClientRegionKind?): Array<RectInt32?>? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<RectInt32>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(region), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array as Array<RectInt32?>
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetRegionRects(region: NonClientRegionKind?, rects: Array<RectInt32?>):
        Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(region),
          rects.size,marshalToNative(rects),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_CaptionTapped(handler: TypedEventHandler<InputNonClientPointerSource?,
        NonClientCaptionTappedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_CaptionTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_PointerEntered(handler: TypedEventHandler<InputNonClientPointerSource?,
        NonClientPointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_PointerEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_PointerExited(handler: TypedEventHandler<InputNonClientPointerSource?,
        NonClientPointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_PointerExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_PointerMoved(handler: TypedEventHandler<InputNonClientPointerSource?,
        NonClientPointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_PointerMoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_PointerPressed(handler: TypedEventHandler<InputNonClientPointerSource?,
        NonClientPointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_PointerPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_PointerReleased(handler: TypedEventHandler<InputNonClientPointerSource?,
        NonClientPointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_PointerReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_RegionsChanged(handler: TypedEventHandler<InputNonClientPointerSource?,
        NonClientRegionsChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_RegionsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1925868017_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925868017_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputNonClientPointerSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1925868017_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputNonClientPointerSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("471732b43d075104b192ebacf71e86df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputNonClientPointerSource(ptr: Pointer?): WithDefault =
        IInputNonClientPointerSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputNonClientPointerSource {
      val address = segment.toRawLongValue()
      return makeIInputNonClientPointerSource(Pointer(address))
    }

    public override fun toNative(obj: IInputNonClientPointerSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1925868017_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputNonClientPointerSource):
        Array<IInputNonClientPointerSource?> = (elements as
        Array<IInputNonClientPointerSource?>).castToImpl<IInputNonClientPointerSource,IInputNonClientPointerSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputNonClientPointerSource?> =
        arrayOfNulls<IInputNonClientPointerSource_Impl>(size) as
        Array<IInputNonClientPointerSource?>
  }
}
