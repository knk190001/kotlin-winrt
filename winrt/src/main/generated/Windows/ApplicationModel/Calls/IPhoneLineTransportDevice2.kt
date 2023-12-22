package Windows.ApplicationModel.Calls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLineTransportDevice2.ABI::class)
@Signature("{64c885f2-ecf4-5761-8c04-3c248ce61690}")
@Guid("64c885f2ecf457618c043c248ce61690")
@WinRTInterface("64c885f2ecf457618c043c248ce61690")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineTransportDevice2.ByReference::class)
public interface IPhoneLineTransportDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioRoutingStatus(): TransportDeviceAudioRoutingStatus?

  @InterfaceMethod(1)
  public fun add_AudioRoutingStatusChanged(handler: TypedEventHandler<PhoneLineTransportDevice?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_AudioRoutingStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun get_InBandRingingEnabled(): Boolean

  @InterfaceMethod(4)
  public fun add_InBandRingingEnabledChanged(handler: TypedEventHandler<PhoneLineTransportDevice?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_InBandRingingEnabledChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineTransportDevice2> {
    public override fun getValue() = ABI.makeIPhoneLineTransportDevice2(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineTransportDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineTransportDevice2 {
    public val __2031683351_Ptr: Pointer?

    public val _2031683351_VtblPtr: Pointer?
      get() = __2031683351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioRoutingStatus(): TransportDeviceAudioRoutingStatus? {
      val fnPtr = _2031683351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransportDeviceAudioRoutingStatus>()
      val hr = fn.invokeHR(arrayOf(__2031683351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransportDeviceAudioRoutingStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_AudioRoutingStatusChanged(handler: TypedEventHandler<PhoneLineTransportDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2031683351_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2031683351_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_AudioRoutingStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2031683351_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2031683351_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_InBandRingingEnabled(): Boolean {
      val fnPtr = _2031683351_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2031683351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override
        fun add_InBandRingingEnabledChanged(handler: TypedEventHandler<PhoneLineTransportDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2031683351_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2031683351_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_InBandRingingEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2031683351_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2031683351_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneLineTransportDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2031683351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineTransportDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64c885f2ecf457618c043c248ce61690")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineTransportDevice2(ptr: Pointer?): WithDefault =
        IPhoneLineTransportDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineTransportDevice2 {
      val address = segment.toRawLongValue()
      return makeIPhoneLineTransportDevice2(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineTransportDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2031683351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineTransportDevice2):
        Array<IPhoneLineTransportDevice2?> = (elements as
        Array<IPhoneLineTransportDevice2?>).castToImpl<IPhoneLineTransportDevice2,IPhoneLineTransportDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineTransportDevice2?> =
        arrayOfNulls<IPhoneLineTransportDevice2_Impl>(size) as Array<IPhoneLineTransportDevice2?>
  }
}
