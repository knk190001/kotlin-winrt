package Windows.Networking.NetworkOperators

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IESimProfileMetadata.ABI::class)
@Signature("{ed25831f-90db-498d-a7b4-ebce807d3c23}")
@Guid("ed25831f90db498da7b4ebce807d3c23")
@WinRTInterface("ed25831f90db498da7b4ebce807d3c23")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimProfileMetadata.ByReference::class)
public interface IESimProfileMetadata : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsConfirmationCodeRequired(): Boolean

  @InterfaceMethod(1)
  public fun get_Policy(): ESimProfilePolicy?

  @InterfaceMethod(2)
  public fun get_Id(): String?

  @InterfaceMethod(3)
  public fun get_ProviderIcon(): IRandomAccessStreamReference?

  @InterfaceMethod(4)
  public fun get_ProviderId(): String?

  @InterfaceMethod(5)
  public fun get_ProviderName(): String?

  @InterfaceMethod(6)
  public fun get_State(): ESimProfileMetadataState?

  @InterfaceMethod(7)
  public fun DenyInstallAsync(): IAsyncOperation<ESimOperationResult?>?

  @InterfaceMethod(8)
  public fun ConfirmInstallAsync(): IAsyncOperationWithProgress<ESimOperationResult?,
      ESimProfileInstallProgress?>?

  @InterfaceMethod(9)
  public fun ConfirmInstallAsync(confirmationCode: String?):
      IAsyncOperationWithProgress<ESimOperationResult?, ESimProfileInstallProgress?>?

  @InterfaceMethod(10)
  public fun PostponeInstallAsync(): IAsyncOperation<ESimOperationResult?>?

  @InterfaceMethod(11)
  public fun add_StateChanged(handler: TypedEventHandler<ESimProfileMetadata?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IESimProfileMetadata> {
    public override fun getValue() = ABI.makeIESimProfileMetadata(pointer.getPointer(0))

    public fun setValue(value: IESimProfileMetadata_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimProfileMetadata {
    public val __1971437773_Ptr: Pointer?

    public val _1971437773_VtblPtr: Pointer?
      get() = __1971437773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsConfirmationCodeRequired(): Boolean {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Policy(): ESimProfilePolicy? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimProfilePolicy>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimProfilePolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Id(): String? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ProviderIcon(): IRandomAccessStreamReference? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ProviderId(): String? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ProviderName(): String? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_State(): ESimProfileMetadataState? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimProfileMetadataState>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimProfileMetadataState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun DenyInstallAsync(): IAsyncOperation<ESimOperationResult?>? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ConfirmInstallAsync(): IAsyncOperationWithProgress<ESimOperationResult?,
        ESimProfileInstallProgress?>? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<ESimOperationResult?,
          ESimProfileInstallProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<ESimOperationResult?,
          ESimProfileInstallProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ConfirmInstallAsync(confirmationCode: String?):
        IAsyncOperationWithProgress<ESimOperationResult?, ESimProfileInstallProgress?>? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<ESimOperationResult?,
          ESimProfileInstallProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr, marshalToNative(confirmationCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<ESimOperationResult?,
          ESimProfileInstallProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun PostponeInstallAsync(): IAsyncOperation<ESimOperationResult?>? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun add_StateChanged(handler: TypedEventHandler<ESimProfileMetadata?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1971437773_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1971437773_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IESimProfileMetadata_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1971437773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimProfileMetadata, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed25831f90db498da7b4ebce807d3c23")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimProfileMetadata(ptr: Pointer?): WithDefault = IESimProfileMetadata_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimProfileMetadata {
      val address = segment.toRawLongValue()
      return makeIESimProfileMetadata(Pointer(address))
    }

    public override fun toNative(obj: IESimProfileMetadata): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1971437773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimProfileMetadata): Array<IESimProfileMetadata?> =
        (elements as
        Array<IESimProfileMetadata?>).castToImpl<IESimProfileMetadata,IESimProfileMetadata_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimProfileMetadata?> =
        arrayOfNulls<IESimProfileMetadata_Impl>(size) as Array<IESimProfileMetadata?>
  }
}
