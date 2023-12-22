package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMagneticStripeReader.ABI::class)
@Signature("{1a92b015-47c3-468a-9333-0c6517574883}")
@Guid("1a92b01547c3468a93330c6517574883")
@WinRTInterface("1a92b01547c3468a93330c6517574883")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReader.ByReference::class)
public interface IMagneticStripeReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Capabilities(): MagneticStripeReaderCapabilities?

  @InterfaceMethod(2)
  public fun get_SupportedCardTypes(): Array<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_DeviceAuthenticationProtocol(): MagneticStripeReaderAuthenticationProtocol?

  @InterfaceMethod(4)
  public fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?): IAsyncOperation<String?>?

  @InterfaceMethod(5)
  public fun ClaimReaderAsync(): IAsyncOperation<ClaimedMagneticStripeReader?>?

  @InterfaceMethod(6)
  public fun RetrieveStatisticsAsync(statisticsCategories: IIterable<String?>?):
      IAsyncOperation<IBuffer?>?

  @InterfaceMethod(7)
  public fun GetErrorReportingType(): MagneticStripeReaderErrorReportingType?

  @InterfaceMethod(8)
  public fun add_StatusUpdated(handler: TypedEventHandler<MagneticStripeReader?,
      MagneticStripeReaderStatusUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_StatusUpdated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReader> {
    public override fun getValue() = ABI.makeIMagneticStripeReader(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReader {
    public val __1017330381_Ptr: Pointer?

    public val _1017330381_VtblPtr: Pointer?
      get() = __1017330381_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Capabilities(): MagneticStripeReaderCapabilities? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedCardTypes(): Array<WinDef.UINT>? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DeviceAuthenticationProtocol():
        MagneticStripeReaderAuthenticationProtocol? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderAuthenticationProtocol>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MagneticStripeReaderAuthenticationProtocol>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CheckHealthAsync(level: UnifiedPosHealthCheckLevel?):
        IAsyncOperation<String?>? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr, marshalToNative(level), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ClaimReaderAsync(): IAsyncOperation<ClaimedMagneticStripeReader?>? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ClaimedMagneticStripeReader?>>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ClaimedMagneticStripeReader?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun RetrieveStatisticsAsync(statisticsCategories: IIterable<String?>?):
        IAsyncOperation<IBuffer?>? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr, marshalToNative(statisticsCategories), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetErrorReportingType(): MagneticStripeReaderErrorReportingType? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagneticStripeReaderErrorReportingType>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagneticStripeReaderErrorReportingType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun add_StatusUpdated(handler: TypedEventHandler<MagneticStripeReader?,
        MagneticStripeReaderStatusUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_StatusUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1017330381_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1017330381_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMagneticStripeReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1017330381_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a92b01547c3468a93330c6517574883")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReader(ptr: Pointer?): WithDefault =
        IMagneticStripeReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagneticStripeReader {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReader(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1017330381_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReader): Array<IMagneticStripeReader?> =
        (elements as
        Array<IMagneticStripeReader?>).castToImpl<IMagneticStripeReader,IMagneticStripeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReader?> =
        arrayOfNulls<IMagneticStripeReader_Impl>(size) as Array<IMagneticStripeReader?>
  }
}
