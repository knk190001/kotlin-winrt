package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IESim.ABI::class)
@Signature("{6f6e6e26-f123-437d-8ced-dc1d2bc0c3a9}")
@Guid("6f6e6e26f123437d8ceddc1d2bc0c3a9")
@WinRTInterface("6f6e6e26f123437d8ceddc1d2bc0c3a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESim.ByReference::class)
public interface IESim : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AvailableMemoryInBytes(): IReference<Int>?

  @InterfaceMethod(1)
  public fun get_Eid(): String?

  @InterfaceMethod(2)
  public fun get_FirmwareVersion(): String?

  @InterfaceMethod(3)
  public fun get_MobileBroadbandModemDeviceId(): String?

  @InterfaceMethod(4)
  public fun get_Policy(): ESimPolicy?

  @InterfaceMethod(5)
  public fun get_State(): ESimState?

  @InterfaceMethod(6)
  public fun GetProfiles(): IVectorView<ESimProfile?>?

  @InterfaceMethod(7)
  public fun DeleteProfileAsync(profileId: String?): IAsyncOperation<ESimOperationResult?>?

  @InterfaceMethod(8)
  public fun DownloadProfileMetadataAsync(activationCode: String?):
      IAsyncOperation<ESimDownloadProfileMetadataResult?>?

  @InterfaceMethod(9)
  public fun ResetAsync(): IAsyncOperation<ESimOperationResult?>?

  @InterfaceMethod(10)
  public fun add_ProfileChanged(handler: TypedEventHandler<ESim?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ProfileChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IESim> {
    public override fun getValue() = ABI.makeIESim(pointer.getPointer(0))

    public fun setValue(value: IESim_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESim {
    public val __1683653717_Ptr: Pointer?

    public val _1683653717_VtblPtr: Pointer?
      get() = __1683653717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AvailableMemoryInBytes(): IReference<Int>? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Eid(): String? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FirmwareVersion(): String? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MobileBroadbandModemDeviceId(): String? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Policy(): ESimPolicy? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimPolicy>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_State(): ESimState? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimState>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetProfiles(): IVectorView<ESimProfile?>? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ESimProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ESimProfile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun DeleteProfileAsync(profileId: String?):
        IAsyncOperation<ESimOperationResult?>? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr, marshalToNative(profileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun DownloadProfileMetadataAsync(activationCode: String?):
        IAsyncOperation<ESimDownloadProfileMetadataResult?>? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimDownloadProfileMetadataResult?>>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr, marshalToNative(activationCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ESimDownloadProfileMetadataResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ResetAsync(): IAsyncOperation<ESimOperationResult?>? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun add_ProfileChanged(handler: TypedEventHandler<ESim?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ProfileChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1683653717_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1683653717_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IESim_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1683653717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESim, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f6e6e26f123437d8ceddc1d2bc0c3a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESim(ptr: Pointer?): WithDefault = IESim_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESim {
      val address = segment.toRawLongValue()
      return makeIESim(Pointer(address))
    }

    public override fun toNative(obj: IESim): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1683653717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESim): Array<IESim?> = (elements as
        Array<IESim?>).castToImpl<IESim,IESim_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESim?> = arrayOfNulls<IESim_Impl>(size) as
        Array<IESim?>
  }
}
