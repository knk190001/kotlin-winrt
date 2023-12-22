package Windows.Services.Store

import Windows.ApplicationModel.Package
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IAsyncOperationWithProgress
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreContext3.ABI::class)
@Signature("{e26226ca-1a01-4730-85a6-ecc896e4ae38}")
@Guid("e26226ca1a01473085a6ecc896e4ae38")
@WinRTInterface("e26226ca1a01473085a6ecc896e4ae38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreContext3.ByReference::class)
public interface IStoreContext3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanSilentlyDownloadStorePackageUpdates(): Boolean

  @InterfaceMethod(1)
  public
      fun TrySilentDownloadStorePackageUpdatesAsync(storePackageUpdates: IIterable<StorePackageUpdate?>?):
      IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>?

  @InterfaceMethod(2)
  public
      fun TrySilentDownloadAndInstallStorePackageUpdatesAsync(storePackageUpdates: IIterable<StorePackageUpdate?>?):
      IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>?

  @InterfaceMethod(3)
  public fun CanAcquireStoreLicenseForOptionalPackageAsync(optionalPackage: Package?):
      IAsyncOperation<StoreCanAcquireLicenseResult?>?

  @InterfaceMethod(4)
  public fun CanAcquireStoreLicenseAsync(productStoreId: String?):
      IAsyncOperation<StoreCanAcquireLicenseResult?>?

  @InterfaceMethod(5)
  public fun GetStoreProductsAsync(
    productKinds: IIterable<String?>?,
    storeIds: IIterable<String?>?,
    storeProductOptions: StoreProductOptions?
  ): IAsyncOperation<StoreProductQueryResult?>?

  @InterfaceMethod(6)
  public fun GetAssociatedStoreQueueItemsAsync(): IAsyncOperation<IVectorView<StoreQueueItem?>?>?

  @InterfaceMethod(7)
  public fun GetStoreQueueItemsAsync(storeIds: IIterable<String?>?):
      IAsyncOperation<IVectorView<StoreQueueItem?>?>?

  @InterfaceMethod(8)
  public fun RequestDownloadAndInstallStorePackagesAsync(storeIds: IIterable<String?>?,
      storePackageInstallOptions: StorePackageInstallOptions?):
      IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>?

  @InterfaceMethod(9)
  public fun DownloadAndInstallStorePackagesAsync(storeIds: IIterable<String?>?):
      IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>?

  @InterfaceMethod(10)
  public fun RequestUninstallStorePackageAsync(`package`: Package?):
      IAsyncOperation<StoreUninstallStorePackageResult?>?

  @InterfaceMethod(11)
  public fun RequestUninstallStorePackageByStoreIdAsync(storeId: String?):
      IAsyncOperation<StoreUninstallStorePackageResult?>?

  @InterfaceMethod(12)
  public fun UninstallStorePackageAsync(`package`: Package?):
      IAsyncOperation<StoreUninstallStorePackageResult?>?

  @InterfaceMethod(13)
  public fun UninstallStorePackageByStoreIdAsync(storeId: String?):
      IAsyncOperation<StoreUninstallStorePackageResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStoreContext3>
      {
    public override fun getValue() = ABI.makeIStoreContext3(pointer.getPointer(0))

    public fun setValue(value: IStoreContext3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreContext3 {
    public val __137068504_Ptr: Pointer?

    public val _137068504_VtblPtr: Pointer?
      get() = __137068504_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanSilentlyDownloadStorePackageUpdates(): Boolean {
      val fnPtr = _137068504_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override
        fun TrySilentDownloadStorePackageUpdatesAsync(storePackageUpdates: IIterable<StorePackageUpdate?>?):
        IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(storePackageUpdates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun TrySilentDownloadAndInstallStorePackageUpdatesAsync(storePackageUpdates: IIterable<StorePackageUpdate?>?):
        IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(storePackageUpdates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CanAcquireStoreLicenseForOptionalPackageAsync(optionalPackage: Package?):
        IAsyncOperation<StoreCanAcquireLicenseResult?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreCanAcquireLicenseResult?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(optionalPackage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreCanAcquireLicenseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CanAcquireStoreLicenseAsync(productStoreId: String?):
        IAsyncOperation<StoreCanAcquireLicenseResult?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreCanAcquireLicenseResult?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(productStoreId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreCanAcquireLicenseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetStoreProductsAsync(
      productKinds: IIterable<String?>?,
      storeIds: IIterable<String?>?,
      storeProductOptions: StoreProductOptions?
    ): IAsyncOperation<StoreProductQueryResult?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(productKinds),
          marshalToNative(storeIds), marshalToNative(storeProductOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreProductQueryResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetAssociatedStoreQueueItemsAsync():
        IAsyncOperation<IVectorView<StoreQueueItem?>?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StoreQueueItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StoreQueueItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetStoreQueueItemsAsync(storeIds: IIterable<String?>?):
        IAsyncOperation<IVectorView<StoreQueueItem?>?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StoreQueueItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(storeIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StoreQueueItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun RequestDownloadAndInstallStorePackagesAsync(storeIds: IIterable<String?>?,
        storePackageInstallOptions: StorePackageInstallOptions?):
        IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(storeIds),
          marshalToNative(storePackageInstallOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun DownloadAndInstallStorePackagesAsync(storeIds: IIterable<String?>?):
        IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(storeIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun RequestUninstallStorePackageAsync(`package`: Package?):
        IAsyncOperation<StoreUninstallStorePackageResult?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreUninstallStorePackageResult?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(`package`), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreUninstallStorePackageResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun RequestUninstallStorePackageByStoreIdAsync(storeId: String?):
        IAsyncOperation<StoreUninstallStorePackageResult?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreUninstallStorePackageResult?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(storeId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreUninstallStorePackageResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun UninstallStorePackageAsync(`package`: Package?):
        IAsyncOperation<StoreUninstallStorePackageResult?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreUninstallStorePackageResult?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(`package`), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreUninstallStorePackageResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun UninstallStorePackageByStoreIdAsync(storeId: String?):
        IAsyncOperation<StoreUninstallStorePackageResult?>? {
      val fnPtr = _137068504_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreUninstallStorePackageResult?>>()
      val hr = fn.invokeHR(arrayOf(__137068504_Ptr, marshalToNative(storeId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreUninstallStorePackageResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IStoreContext3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __137068504_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreContext3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e26226ca1a01473085a6ecc896e4ae38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreContext3(ptr: Pointer?): WithDefault = IStoreContext3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreContext3 {
      val address = segment.toRawLongValue()
      return makeIStoreContext3(Pointer(address))
    }

    public override fun toNative(obj: IStoreContext3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__137068504_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreContext3): Array<IStoreContext3?> = (elements as
        Array<IStoreContext3?>).castToImpl<IStoreContext3,IStoreContext3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreContext3?> =
        arrayOfNulls<IStoreContext3_Impl>(size) as Array<IStoreContext3?>
  }
}
