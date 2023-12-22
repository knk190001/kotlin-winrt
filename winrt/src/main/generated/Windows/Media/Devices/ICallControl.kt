package Windows.Media.Devices

import Windows.Foundation.EventRegistrationToken
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICallControl.ABI::class)
@Signature("{a520d0d6-ae8d-45db-8011-ca49d3b3e578}")
@Guid("a520d0d6ae8d45db8011ca49d3b3e578")
@WinRTInterface("a520d0d6ae8d45db8011ca49d3b3e578")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICallControl.ByReference::class)
public interface ICallControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IndicateNewIncomingCall(enableRinger: Boolean, callerId: String?): WinDef.ULONG

  @InterfaceMethod(1)
  public fun IndicateNewOutgoingCall(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun IndicateActiveCall(callToken: WinDef.ULONG): Unit

  @InterfaceMethod(3)
  public fun EndCall(callToken: WinDef.ULONG): Unit

  @InterfaceMethod(4)
  public fun get_HasRinger(): Boolean

  @InterfaceMethod(5)
  public fun add_AnswerRequested(handler: CallControlEventHandler?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_AnswerRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_HangUpRequested(handler: CallControlEventHandler?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_HangUpRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_DialRequested(handler: DialRequestedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_DialRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_RedialRequested(handler: RedialRequestedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_RedialRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_KeypadPressed(handler: KeypadPressedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_KeypadPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_AudioTransferRequested(handler: CallControlEventHandler?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_AudioTransferRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICallControl> {
    public override fun getValue() = ABI.makeICallControl(pointer.getPointer(0))

    public fun setValue(value: ICallControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICallControl {
    public val __596458846_Ptr: Pointer?

    public val _596458846_VtblPtr: Pointer?
      get() = __596458846_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IndicateNewIncomingCall(enableRinger: Boolean, callerId: String?):
        WinDef.ULONG {
      val fnPtr = _596458846_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, enableRinger, marshalToNative(callerId),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IndicateNewOutgoingCall(): WinDef.ULONG {
      val fnPtr = _596458846_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun IndicateActiveCall(callToken: WinDef.ULONG): Unit {
      val fnPtr = _596458846_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, callToken,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun EndCall(callToken: WinDef.ULONG): Unit {
      val fnPtr = _596458846_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, callToken,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HasRinger(): Boolean {
      val fnPtr = _596458846_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun add_AnswerRequested(handler: CallControlEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _596458846_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_AnswerRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _596458846_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_HangUpRequested(handler: CallControlEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _596458846_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_HangUpRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _596458846_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_DialRequested(handler: DialRequestedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _596458846_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_DialRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _596458846_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_RedialRequested(handler: RedialRequestedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _596458846_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_RedialRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _596458846_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_KeypadPressed(handler: KeypadPressedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _596458846_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_KeypadPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _596458846_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_AudioTransferRequested(handler: CallControlEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _596458846_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_AudioTransferRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _596458846_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596458846_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICallControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __596458846_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICallControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a520d0d6ae8d45db8011ca49d3b3e578")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICallControl(ptr: Pointer?): WithDefault = ICallControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICallControl {
      val address = segment.toRawLongValue()
      return makeICallControl(Pointer(address))
    }

    public override fun toNative(obj: ICallControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__596458846_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICallControl): Array<ICallControl?> = (elements as
        Array<ICallControl?>).castToImpl<ICallControl,ICallControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICallControl?> =
        arrayOfNulls<ICallControl_Impl>(size) as Array<ICallControl?>
  }
}
