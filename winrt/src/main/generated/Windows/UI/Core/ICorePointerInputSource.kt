package Windows.UI.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Point
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICorePointerInputSource.ABI::class)
@Signature("{bbf1bb18-e47a-48eb-8807-f8f8d3ea4551}")
@Guid("bbf1bb18e47a48eb8807f8f8d3ea4551")
@WinRTInterface("bbf1bb18e47a48eb8807f8f8d3ea4551")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICorePointerInputSource.ByReference::class)
public interface ICorePointerInputSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReleasePointerCapture(): Unit

  @InterfaceMethod(1)
  public fun SetPointerCapture(): Unit

  @InterfaceMethod(2)
  public fun get_HasCapture(): Boolean

  @InterfaceMethod(3)
  public fun get_PointerPosition(): Point?

  @InterfaceMethod(4)
  public fun get_PointerCursor(): CoreCursor?

  @InterfaceMethod(5)
  public fun put_PointerCursor(value: CoreCursor?): Unit

  @InterfaceMethod(6)
  public fun add_PointerCaptureLost(handler: TypedEventHandler<IUnknown?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PointerCaptureLost(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PointerEntered(handler: TypedEventHandler<IUnknown?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PointerEntered(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_PointerExited(handler: TypedEventHandler<IUnknown?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_PointerExited(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_PointerMoved(handler: TypedEventHandler<IUnknown?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_PointerMoved(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_PointerPressed(handler: TypedEventHandler<IUnknown?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_PointerPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_PointerReleased(handler: TypedEventHandler<IUnknown?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_PointerReleased(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_PointerWheelChanged(handler: TypedEventHandler<IUnknown?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_PointerWheelChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICorePointerInputSource> {
    public override fun getValue() = ABI.makeICorePointerInputSource(pointer.getPointer(0))

    public fun setValue(value: ICorePointerInputSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICorePointerInputSource {
    public val __1725612450_Ptr: Pointer?

    public val _1725612450_VtblPtr: Pointer?
      get() = __1725612450_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReleasePointerCapture(): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetPointerCapture(): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HasCapture(): Boolean {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PointerPosition(): Point? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PointerCursor(): CoreCursor? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreCursor>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreCursor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PointerCursor(value: CoreCursor?): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_PointerCaptureLost(handler: TypedEventHandler<IUnknown?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PointerCaptureLost(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PointerEntered(handler: TypedEventHandler<IUnknown?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PointerEntered(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_PointerExited(handler: TypedEventHandler<IUnknown?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_PointerExited(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_PointerMoved(handler: TypedEventHandler<IUnknown?, PointerEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_PointerMoved(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_PointerPressed(handler: TypedEventHandler<IUnknown?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_PointerPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_PointerReleased(handler: TypedEventHandler<IUnknown?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_PointerReleased(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_PointerWheelChanged(handler: TypedEventHandler<IUnknown?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_PointerWheelChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1725612450_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1725612450_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICorePointerInputSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1725612450_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICorePointerInputSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbf1bb18e47a48eb8807f8f8d3ea4551")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICorePointerInputSource(ptr: Pointer?): WithDefault =
        ICorePointerInputSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICorePointerInputSource {
      val address = segment.toRawLongValue()
      return makeICorePointerInputSource(Pointer(address))
    }

    public override fun toNative(obj: ICorePointerInputSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1725612450_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICorePointerInputSource): Array<ICorePointerInputSource?>
        = (elements as
        Array<ICorePointerInputSource?>).castToImpl<ICorePointerInputSource,ICorePointerInputSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICorePointerInputSource?> =
        arrayOfNulls<ICorePointerInputSource_Impl>(size) as Array<ICorePointerInputSource?>
  }
}
