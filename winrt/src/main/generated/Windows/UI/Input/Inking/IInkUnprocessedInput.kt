package Windows.UI.Input.Inking

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Core.PointerEventArgs
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

@ABIMarker(IInkUnprocessedInput.ABI::class)
@Signature("{db4445e0-8398-4921-ac3b-ab978c5ba256}")
@Guid("db4445e083984921ac3bab978c5ba256")
@WinRTInterface("db4445e083984921ac3bab978c5ba256")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkUnprocessedInput.ByReference::class)
public interface IInkUnprocessedInput : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PointerEntered(handler: TypedEventHandler<InkUnprocessedInput?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PointerEntered(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PointerHovered(handler: TypedEventHandler<InkUnprocessedInput?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PointerHovered(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_PointerExited(handler: TypedEventHandler<InkUnprocessedInput?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PointerExited(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_PointerPressed(handler: TypedEventHandler<InkUnprocessedInput?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PointerPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PointerMoved(handler: TypedEventHandler<InkUnprocessedInput?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PointerMoved(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_PointerReleased(handler: TypedEventHandler<InkUnprocessedInput?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_PointerReleased(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_PointerLost(handler: TypedEventHandler<InkUnprocessedInput?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_PointerLost(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun get_InkPresenter(): InkPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkUnprocessedInput> {
    public override fun getValue() = ABI.makeIInkUnprocessedInput(pointer.getPointer(0))

    public fun setValue(value: IInkUnprocessedInput_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkUnprocessedInput {
    public val __1694220255_Ptr: Pointer?

    public val _1694220255_VtblPtr: Pointer?
      get() = __1694220255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PointerEntered(handler: TypedEventHandler<InkUnprocessedInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PointerEntered(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PointerHovered(handler: TypedEventHandler<InkUnprocessedInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PointerHovered(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_PointerExited(handler: TypedEventHandler<InkUnprocessedInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PointerExited(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_PointerPressed(handler: TypedEventHandler<InkUnprocessedInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PointerPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PointerMoved(handler: TypedEventHandler<InkUnprocessedInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PointerMoved(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_PointerReleased(handler: TypedEventHandler<InkUnprocessedInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_PointerReleased(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_PointerLost(handler: TypedEventHandler<InkUnprocessedInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_PointerLost(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_InkPresenter(): InkPresenter? {
      val fnPtr = _1694220255_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenter>()
      val hr = fn.invokeHR(arrayOf(__1694220255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IInkUnprocessedInput_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1694220255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkUnprocessedInput, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db4445e083984921ac3bab978c5ba256")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkUnprocessedInput(ptr: Pointer?): WithDefault = IInkUnprocessedInput_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkUnprocessedInput {
      val address = segment.toRawLongValue()
      return makeIInkUnprocessedInput(Pointer(address))
    }

    public override fun toNative(obj: IInkUnprocessedInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1694220255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkUnprocessedInput): Array<IInkUnprocessedInput?> =
        (elements as
        Array<IInkUnprocessedInput?>).castToImpl<IInkUnprocessedInput,IInkUnprocessedInput_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkUnprocessedInput?> =
        arrayOfNulls<IInkUnprocessedInput_Impl>(size) as Array<IInkUnprocessedInput?>
  }
}
