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

@ABIMarker(IInkStrokeInput.ABI::class)
@Signature("{cf2ffe7b-5e10-43c6-a080-88f26e1dc67d}")
@Guid("cf2ffe7b5e1043c6a08088f26e1dc67d")
@WinRTInterface("cf2ffe7b5e1043c6a08088f26e1dc67d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokeInput.ByReference::class)
public interface IInkStrokeInput : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_StrokeStarted(handler: TypedEventHandler<InkStrokeInput?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_StrokeStarted(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_StrokeContinued(handler: TypedEventHandler<InkStrokeInput?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_StrokeContinued(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_StrokeEnded(handler: TypedEventHandler<InkStrokeInput?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_StrokeEnded(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_StrokeCanceled(handler: TypedEventHandler<InkStrokeInput?, PointerEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_StrokeCanceled(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun get_InkPresenter(): InkPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokeInput> {
    public override fun getValue() = ABI.makeIInkStrokeInput(pointer.getPointer(0))

    public fun setValue(value: IInkStrokeInput_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokeInput {
    public val __426177734_Ptr: Pointer?

    public val _426177734_VtblPtr: Pointer?
      get() = __426177734_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_StrokeStarted(handler: TypedEventHandler<InkStrokeInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _426177734_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_StrokeStarted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _426177734_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_StrokeContinued(handler: TypedEventHandler<InkStrokeInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _426177734_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_StrokeContinued(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _426177734_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_StrokeEnded(handler: TypedEventHandler<InkStrokeInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _426177734_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_StrokeEnded(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _426177734_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_StrokeCanceled(handler: TypedEventHandler<InkStrokeInput?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _426177734_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_StrokeCanceled(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _426177734_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_InkPresenter(): InkPresenter? {
      val fnPtr = _426177734_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenter>()
      val hr = fn.invokeHR(arrayOf(__426177734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IInkStrokeInput_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __426177734_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokeInput, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf2ffe7b5e1043c6a08088f26e1dc67d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokeInput(ptr: Pointer?): WithDefault = IInkStrokeInput_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokeInput {
      val address = segment.toRawLongValue()
      return makeIInkStrokeInput(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokeInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__426177734_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokeInput): Array<IInkStrokeInput?> = (elements as
        Array<IInkStrokeInput?>).castToImpl<IInkStrokeInput,IInkStrokeInput_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokeInput?> =
        arrayOfNulls<IInkStrokeInput_Impl>(size) as Array<IInkStrokeInput?>
  }
}
