package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IBuffer
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClaimedMagneticStripeReader.ABI::class)
@Signature("{475ca8f3-9417-48bc-b9d7-4163a7844c02}")
@Guid("475ca8f3941748bcb9d74163a7844c02")
@WinRTInterface("475ca8f3941748bcb9d74163a7844c02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedMagneticStripeReader.ByReference::class)
public interface IClaimedMagneticStripeReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsDisabledOnDataReceived(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsDisabledOnDataReceived(): Boolean

  @InterfaceMethod(4)
  public fun put_IsDecodeDataEnabled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsDecodeDataEnabled(): Boolean

  @InterfaceMethod(6)
  public fun get_IsDeviceAuthenticated(): Boolean

  @InterfaceMethod(7)
  public fun put_DataEncryptionAlgorithm(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_DataEncryptionAlgorithm(): WinDef.UINT

  @InterfaceMethod(9)
  public fun put_TracksToRead(value: MagneticStripeReaderTrackIds?): Unit

  @InterfaceMethod(10)
  public fun get_TracksToRead(): MagneticStripeReaderTrackIds?

  @InterfaceMethod(11)
  public fun put_IsTransmitSentinelsEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsTransmitSentinelsEnabled(): Boolean

  @InterfaceMethod(13)
  public fun EnableAsync(): IAsyncAction?

  @InterfaceMethod(14)
  public fun DisableAsync(): IAsyncAction?

  @InterfaceMethod(15)
  public fun RetainDevice(): Unit

  @InterfaceMethod(16)
  public fun SetErrorReportingType(value: MagneticStripeReaderErrorReportingType?): Unit

  @InterfaceMethod(17)
  public fun RetrieveDeviceAuthenticationDataAsync(): IAsyncOperation<IBuffer?>?

  @InterfaceMethod(18)
  public fun AuthenticateDeviceAsync(responseToken: Array<Byte>): IAsyncAction?

  @InterfaceMethod(19)
  public fun DeAuthenticateDeviceAsync(responseToken: Array<Byte>): IAsyncAction?

  @InterfaceMethod(20)
  public fun UpdateKeyAsync(key: String?, keyName: String?): IAsyncAction?

  @InterfaceMethod(21)
  public fun ResetStatisticsAsync(statisticsCategories: IIterable<String?>?): IAsyncAction?

  @InterfaceMethod(22)
  public fun UpdateStatisticsAsync(statistics: IIterable<IKeyValuePair<String?, String?>?>?):
      IAsyncAction?

  @InterfaceMethod(23)
  public fun add_BankCardDataReceived(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
      MagneticStripeReaderBankCardDataReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_BankCardDataReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun add_AamvaCardDataReceived(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
      MagneticStripeReaderAamvaCardDataReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(26)
  public fun remove_AamvaCardDataReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(27)
  public fun add_VendorSpecificDataReceived(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
      MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(28)
  public fun remove_VendorSpecificDataReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(29)
  public fun add_ReleaseDeviceRequested(handler: EventHandler<ClaimedMagneticStripeReader?>?):
      EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_ErrorOccurred(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
      MagneticStripeReaderErrorOccurredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedMagneticStripeReader> {
    public override fun getValue() = ABI.makeIClaimedMagneticStripeReader(pointer.getPointer(0))

    public fun setValue(value: IClaimedMagneticStripeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedMagneticStripeReader {
    public val __574392208_Ptr: Pointer?

    public val _574392208_VtblPtr: Pointer?
      get() = __574392208_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _574392208_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsDisabledOnDataReceived(value: Boolean): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsDisabledOnDataReceived(): Boolean {
      val fnPtr = _574392208_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsDecodeDataEnabled(value: Boolean): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsDecodeDataEnabled(): Boolean {
      val fnPtr = _574392208_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsDeviceAuthenticated(): Boolean {
      val fnPtr = _574392208_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_DataEncryptionAlgorithm(value: WinDef.UINT): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DataEncryptionAlgorithm(): WinDef.UINT {
      val fnPtr = _574392208_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_TracksToRead(value: MagneticStripeReaderTrackIds?): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_TracksToRead(): MagneticStripeReaderTrackIds? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderTrackIds>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderTrackIds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_IsTransmitSentinelsEnabled(value: Boolean): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsTransmitSentinelsEnabled(): Boolean {
      val fnPtr = _574392208_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun EnableAsync(): IAsyncAction? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun DisableAsync(): IAsyncAction? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun RetainDevice(): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun SetErrorReportingType(value: MagneticStripeReaderErrorReportingType?):
        Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun RetrieveDeviceAuthenticationDataAsync(): IAsyncOperation<IBuffer?>? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun AuthenticateDeviceAsync(responseToken: Array<Byte>): IAsyncAction? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,
          responseToken.size,marshalToNative(responseToken), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun DeAuthenticateDeviceAsync(responseToken: Array<Byte>): IAsyncAction? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr,
          responseToken.size,marshalToNative(responseToken), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun UpdateKeyAsync(key: String?, keyName: String?): IAsyncAction? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(key), marshalToNative(keyName),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun ResetStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncAction? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun UpdateStatisticsAsync(statistics: IIterable<IKeyValuePair<String?,
        String?>?>?): IAsyncAction? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(statistics), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override
        fun add_BankCardDataReceived(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
        MagneticStripeReaderBankCardDataReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_BankCardDataReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override
        fun add_AamvaCardDataReceived(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
        MagneticStripeReaderAamvaCardDataReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun remove_AamvaCardDataReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override
        fun add_VendorSpecificDataReceived(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
        MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun remove_VendorSpecificDataReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override
        fun add_ReleaseDeviceRequested(handler: EventHandler<ClaimedMagneticStripeReader?>?):
        EventRegistrationToken? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_ErrorOccurred(handler: TypedEventHandler<ClaimedMagneticStripeReader?,
        MagneticStripeReaderErrorOccurredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _574392208_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit {
      val fnPtr = _574392208_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574392208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedMagneticStripeReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __574392208_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedMagneticStripeReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("475ca8f3941748bcb9d74163a7844c02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedMagneticStripeReader(ptr: Pointer?): WithDefault =
        IClaimedMagneticStripeReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedMagneticStripeReader {
      val address = segment.toRawLongValue()
      return makeIClaimedMagneticStripeReader(Pointer(address))
    }

    public override fun toNative(obj: IClaimedMagneticStripeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574392208_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedMagneticStripeReader):
        Array<IClaimedMagneticStripeReader?> = (elements as
        Array<IClaimedMagneticStripeReader?>).castToImpl<IClaimedMagneticStripeReader,IClaimedMagneticStripeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedMagneticStripeReader?> =
        arrayOfNulls<IClaimedMagneticStripeReader_Impl>(size) as
        Array<IClaimedMagneticStripeReader?>
  }
}
