package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IMobileBroadbandSarManager.ABI::class)
@Signature("{e5b26833-967e-40c9-a485-19c0dd209e22}")
@Guid("e5b26833967e40c9a48519c0dd209e22")
@WinRTInterface("e5b26833967e40c9a48519c0dd209e22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandSarManager.ByReference::class)
public interface IMobileBroadbandSarManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBackoffEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_IsWiFiHardwareIntegrated(): Boolean

  @InterfaceMethod(2)
  public fun get_IsSarControlledByHardware(): Boolean

  @InterfaceMethod(3)
  public fun get_Antennas(): IVectorView<MobileBroadbandAntennaSar?>?

  @InterfaceMethod(4)
  public fun get_HysteresisTimerPeriod(): TimeSpan?

  @InterfaceMethod(5)
  public fun add_TransmissionStateChanged(handler: TypedEventHandler<MobileBroadbandSarManager?,
      MobileBroadbandTransmissionStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_TransmissionStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun EnableBackoffAsync(): IAsyncAction?

  @InterfaceMethod(8)
  public fun DisableBackoffAsync(): IAsyncAction?

  @InterfaceMethod(9)
  public fun SetConfigurationAsync(antennas: IIterable<MobileBroadbandAntennaSar?>?): IAsyncAction?

  @InterfaceMethod(10)
  public fun RevertSarToHardwareControlAsync(): IAsyncAction?

  @InterfaceMethod(11)
  public fun SetTransmissionStateChangedHysteresisAsync(timerPeriod: TimeSpan?): IAsyncAction?

  @InterfaceMethod(12)
  public fun GetIsTransmittingAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(13)
  public fun StartTransmissionStateMonitoring(): Unit

  @InterfaceMethod(14)
  public fun StopTransmissionStateMonitoring(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandSarManager> {
    public override fun getValue() = ABI.makeIMobileBroadbandSarManager(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandSarManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandSarManager {
    public val __1898397083_Ptr: Pointer?

    public val _1898397083_VtblPtr: Pointer?
      get() = __1898397083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBackoffEnabled(): Boolean {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsWiFiHardwareIntegrated(): Boolean {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsSarControlledByHardware(): Boolean {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Antennas(): IVectorView<MobileBroadbandAntennaSar?>? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandAntennaSar?>>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MobileBroadbandAntennaSar?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HysteresisTimerPeriod(): TimeSpan? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun add_TransmissionStateChanged(handler: TypedEventHandler<MobileBroadbandSarManager?,
        MobileBroadbandTransmissionStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_TransmissionStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun EnableBackoffAsync(): IAsyncAction? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun DisableBackoffAsync(): IAsyncAction? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun SetConfigurationAsync(antennas: IIterable<MobileBroadbandAntennaSar?>?):
        IAsyncAction? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr, marshalToNative(antennas), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun RevertSarToHardwareControlAsync(): IAsyncAction? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SetTransmissionStateChangedHysteresisAsync(timerPeriod: TimeSpan?):
        IAsyncAction? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr, marshalToNative(timerPeriod), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetIsTransmittingAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun StartTransmissionStateMonitoring(): Unit {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun StopTransmissionStateMonitoring(): Unit {
      val fnPtr = _1898397083_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1898397083_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMobileBroadbandSarManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1898397083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandSarManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5b26833967e40c9a48519c0dd209e22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandSarManager(ptr: Pointer?): WithDefault =
        IMobileBroadbandSarManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandSarManager {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandSarManager(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandSarManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1898397083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandSarManager):
        Array<IMobileBroadbandSarManager?> = (elements as
        Array<IMobileBroadbandSarManager?>).castToImpl<IMobileBroadbandSarManager,IMobileBroadbandSarManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandSarManager?> =
        arrayOfNulls<IMobileBroadbandSarManager_Impl>(size) as Array<IMobileBroadbandSarManager?>
  }
}
