package Windows.Services.Maps.OfflineMaps

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IOfflineMapPackage.ABI::class)
@Signature("{a797673b-a5b5-4144-b525-e68c8862664b}")
@Guid("a797673ba5b54144b525e68c8862664b")
@WinRTInterface("a797673ba5b54144b525e68c8862664b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOfflineMapPackage.ByReference::class)
public interface IOfflineMapPackage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): OfflineMapPackageStatus?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_EnclosingRegionName(): String?

  @InterfaceMethod(3)
  public fun get_EstimatedSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(4)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_StatusChanged(value: TypedEventHandler<OfflineMapPackage?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun RequestStartDownloadAsync(): IAsyncOperation<OfflineMapPackageStartDownloadResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOfflineMapPackage> {
    public override fun getValue() = ABI.makeIOfflineMapPackage(pointer.getPointer(0))

    public fun setValue(value: IOfflineMapPackage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOfflineMapPackage {
    public val __199253972_Ptr: Pointer?

    public val _199253972_VtblPtr: Pointer?
      get() = __199253972_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): OfflineMapPackageStatus? {
      val fnPtr = _199253972_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OfflineMapPackageStatus>()
      val hr = fn.invokeHR(arrayOf(__199253972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OfflineMapPackageStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _199253972_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199253972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EnclosingRegionName(): String? {
      val fnPtr = _199253972_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199253972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_EstimatedSizeInBytes(): WinDef.ULONG {
      val fnPtr = _199253972_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__199253972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _199253972_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199253972_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_StatusChanged(value: TypedEventHandler<OfflineMapPackage?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _199253972_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__199253972_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun RequestStartDownloadAsync():
        IAsyncOperation<OfflineMapPackageStartDownloadResult?>? {
      val fnPtr = _199253972_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<OfflineMapPackageStartDownloadResult?>>()
      val hr = fn.invokeHR(arrayOf(__199253972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<OfflineMapPackageStartDownloadResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IOfflineMapPackage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __199253972_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOfflineMapPackage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a797673ba5b54144b525e68c8862664b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOfflineMapPackage(ptr: Pointer?): WithDefault = IOfflineMapPackage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOfflineMapPackage {
      val address = segment.toRawLongValue()
      return makeIOfflineMapPackage(Pointer(address))
    }

    public override fun toNative(obj: IOfflineMapPackage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__199253972_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOfflineMapPackage): Array<IOfflineMapPackage?> =
        (elements as
        Array<IOfflineMapPackage?>).castToImpl<IOfflineMapPackage,IOfflineMapPackage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOfflineMapPackage?> =
        arrayOfNulls<IOfflineMapPackage_Impl>(size) as Array<IOfflineMapPackage?>
  }
}
