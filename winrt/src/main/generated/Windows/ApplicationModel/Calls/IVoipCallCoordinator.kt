package Windows.ApplicationModel.Calls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVoipCallCoordinator.ABI::class)
@Signature("{4f118bcf-e8ef-4434-9c5f-a8d893fafe79}")
@Guid("4f118bcfe8ef44349c5fa8d893fafe79")
@WinRTInterface("4f118bcfe8ef44349c5fa8d893fafe79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoipCallCoordinator.ByReference::class)
public interface IVoipCallCoordinator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReserveCallResourcesAsync(taskEntryPoint: String?):
      IAsyncOperation<VoipPhoneCallResourceReservationStatus?>?

  @InterfaceMethod(1)
  public fun add_MuteStateChanged(muteChangeHandler: TypedEventHandler<VoipCallCoordinator?,
      MuteChangeEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_MuteStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun RequestNewIncomingCall(
    context: String?,
    contactName: String?,
    contactNumber: String?,
    contactImage: Uri?,
    serviceName: String?,
    brandingImage: Uri?,
    callDetails: String?,
    ringtone: Uri?,
    media: VoipPhoneCallMedia?,
    ringTimeout: TimeSpan?
  ): VoipPhoneCall?

  @InterfaceMethod(4)
  public fun RequestNewOutgoingCall(
    context: String?,
    contactName: String?,
    serviceName: String?,
    media: VoipPhoneCallMedia?
  ): VoipPhoneCall?

  @InterfaceMethod(5)
  public fun NotifyMuted(): Unit

  @InterfaceMethod(6)
  public fun NotifyUnmuted(): Unit

  @InterfaceMethod(7)
  public fun RequestOutgoingUpgradeToVideoCall(
    callUpgradeGuid: com.sun.jna.platform.win32.Guid.GUID?,
    context: String?,
    contactName: String?,
    serviceName: String?
  ): VoipPhoneCall?

  @InterfaceMethod(8)
  public fun RequestIncomingUpgradeToVideoCall(
    context: String?,
    contactName: String?,
    contactNumber: String?,
    contactImage: Uri?,
    serviceName: String?,
    brandingImage: Uri?,
    callDetails: String?,
    ringtone: Uri?,
    ringTimeout: TimeSpan?
  ): VoipPhoneCall?

  @InterfaceMethod(9)
  public fun TerminateCellularCall(callUpgradeGuid: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(10)
  public fun CancelUpgrade(callUpgradeGuid: com.sun.jna.platform.win32.Guid.GUID?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoipCallCoordinator> {
    public override fun getValue() = ABI.makeIVoipCallCoordinator(pointer.getPointer(0))

    public fun setValue(value: IVoipCallCoordinator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoipCallCoordinator {
    public val __1372871924_Ptr: Pointer?

    public val _1372871924_VtblPtr: Pointer?
      get() = __1372871924_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReserveCallResourcesAsync(taskEntryPoint: String?):
        IAsyncOperation<VoipPhoneCallResourceReservationStatus?>? {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VoipPhoneCallResourceReservationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(taskEntryPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VoipPhoneCallResourceReservationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_MuteStateChanged(muteChangeHandler: TypedEventHandler<VoipCallCoordinator?,
        MuteChangeEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(muteChangeHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_MuteStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RequestNewIncomingCall(
      context: String?,
      contactName: String?,
      contactNumber: String?,
      contactImage: Uri?,
      serviceName: String?,
      brandingImage: Uri?,
      callDetails: String?,
      ringtone: Uri?,
      media: VoipPhoneCallMedia?,
      ringTimeout: TimeSpan?
    ): VoipPhoneCall? {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCall>()
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(context),
          marshalToNative(contactName), marshalToNative(contactNumber),
          marshalToNative(contactImage), marshalToNative(serviceName),
          marshalToNative(brandingImage), marshalToNative(callDetails), marshalToNative(ringtone),
          marshalToNative(media), marshalToNative(ringTimeout), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCall>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestNewOutgoingCall(
      context: String?,
      contactName: String?,
      serviceName: String?,
      media: VoipPhoneCallMedia?
    ): VoipPhoneCall? {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCall>()
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(context),
          marshalToNative(contactName), marshalToNative(serviceName), marshalToNative(media),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCall>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun NotifyMuted(): Unit {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun NotifyUnmuted(): Unit {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun RequestOutgoingUpgradeToVideoCall(
      callUpgradeGuid: com.sun.jna.platform.win32.Guid.GUID?,
      context: String?,
      contactName: String?,
      serviceName: String?
    ): VoipPhoneCall? {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCall>()
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(callUpgradeGuid),
          marshalToNative(context), marshalToNative(contactName), marshalToNative(serviceName),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCall>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun RequestIncomingUpgradeToVideoCall(
      context: String?,
      contactName: String?,
      contactNumber: String?,
      contactImage: Uri?,
      serviceName: String?,
      brandingImage: Uri?,
      callDetails: String?,
      ringtone: Uri?,
      ringTimeout: TimeSpan?
    ): VoipPhoneCall? {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCall>()
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(context),
          marshalToNative(contactName), marshalToNative(contactNumber),
          marshalToNative(contactImage), marshalToNative(serviceName),
          marshalToNative(brandingImage), marshalToNative(callDetails), marshalToNative(ringtone),
          marshalToNative(ringTimeout), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCall>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override
        fun TerminateCellularCall(callUpgradeGuid: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(callUpgradeGuid),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun CancelUpgrade(callUpgradeGuid: com.sun.jna.platform.win32.Guid.GUID?):
        Unit {
      val fnPtr = _1372871924_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1372871924_Ptr, marshalToNative(callUpgradeGuid),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVoipCallCoordinator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1372871924_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoipCallCoordinator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f118bcfe8ef44349c5fa8d893fafe79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoipCallCoordinator(ptr: Pointer?): WithDefault = IVoipCallCoordinator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoipCallCoordinator {
      val address = segment.toRawLongValue()
      return makeIVoipCallCoordinator(Pointer(address))
    }

    public override fun toNative(obj: IVoipCallCoordinator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1372871924_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoipCallCoordinator): Array<IVoipCallCoordinator?> =
        (elements as
        Array<IVoipCallCoordinator?>).castToImpl<IVoipCallCoordinator,IVoipCallCoordinator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoipCallCoordinator?> =
        arrayOfNulls<IVoipCallCoordinator_Impl>(size) as Array<IVoipCallCoordinator?>
  }
}
