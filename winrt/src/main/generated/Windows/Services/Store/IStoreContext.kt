package Windows.Services.Store

import Windows.ApplicationModel.Package
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.TypedEventHandler
import Windows.System.User
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

@ABIMarker(IStoreContext.ABI::class)
@Signature("{ac98b6be-f4fd-4912-babd-5035e5e8bcab}")
@Guid("ac98b6bef4fd4912babd5035e5e8bcab")
@WinRTInterface("ac98b6bef4fd4912babd5035e5e8bcab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreContext.ByReference::class)
public interface IStoreContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun add_OfflineLicensesChanged(handler: TypedEventHandler<StoreContext?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_OfflineLicensesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun GetCustomerPurchaseIdAsync(serviceTicket: String?, publisherUserId: String?):
      IAsyncOperation<String?>?

  @InterfaceMethod(4)
  public fun GetCustomerCollectionsIdAsync(serviceTicket: String?, publisherUserId: String?):
      IAsyncOperation<String?>?

  @InterfaceMethod(5)
  public fun GetAppLicenseAsync(): IAsyncOperation<StoreAppLicense?>?

  @InterfaceMethod(6)
  public fun GetStoreProductForCurrentAppAsync(): IAsyncOperation<StoreProductResult?>?

  @InterfaceMethod(7)
  public fun GetStoreProductsAsync(productKinds: IIterable<String?>?,
      storeIds: IIterable<String?>?): IAsyncOperation<StoreProductQueryResult?>?

  @InterfaceMethod(8)
  public fun GetAssociatedStoreProductsAsync(productKinds: IIterable<String?>?):
      IAsyncOperation<StoreProductQueryResult?>?

  @InterfaceMethod(9)
  public fun GetAssociatedStoreProductsWithPagingAsync(productKinds: IIterable<String?>?,
      maxItemsToRetrievePerPage: WinDef.UINT): IAsyncOperation<StoreProductPagedQueryResult?>?

  @InterfaceMethod(10)
  public fun GetUserCollectionAsync(productKinds: IIterable<String?>?):
      IAsyncOperation<StoreProductQueryResult?>?

  @InterfaceMethod(11)
  public fun GetUserCollectionWithPagingAsync(productKinds: IIterable<String?>?,
      maxItemsToRetrievePerPage: WinDef.UINT): IAsyncOperation<StoreProductPagedQueryResult?>?

  @InterfaceMethod(12)
  public fun ReportConsumableFulfillmentAsync(
    productStoreId: String?,
    quantity: WinDef.UINT,
    trackingId: com.sun.jna.platform.win32.Guid.GUID?
  ): IAsyncOperation<StoreConsumableResult?>?

  @InterfaceMethod(13)
  public fun GetConsumableBalanceRemainingAsync(productStoreId: String?):
      IAsyncOperation<StoreConsumableResult?>?

  @InterfaceMethod(14)
  public fun AcquireStoreLicenseForOptionalPackageAsync(optionalPackage: Package?):
      IAsyncOperation<StoreAcquireLicenseResult?>?

  @InterfaceMethod(15)
  public fun RequestPurchaseAsync(storeId: String?): IAsyncOperation<StorePurchaseResult?>?

  @InterfaceMethod(16)
  public fun RequestPurchaseAsync(storeId: String?,
      storePurchaseProperties: StorePurchaseProperties?): IAsyncOperation<StorePurchaseResult?>?

  @InterfaceMethod(17)
  public fun GetAppAndOptionalStorePackageUpdatesAsync():
      IAsyncOperation<IVectorView<StorePackageUpdate?>?>?

  @InterfaceMethod(18)
  public
      fun RequestDownloadStorePackageUpdatesAsync(storePackageUpdates: IIterable<StorePackageUpdate?>?):
      IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>?

  @InterfaceMethod(19)
  public
      fun RequestDownloadAndInstallStorePackageUpdatesAsync(storePackageUpdates: IIterable<StorePackageUpdate?>?):
      IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>?

  @InterfaceMethod(20)
  public fun RequestDownloadAndInstallStorePackagesAsync(storeIds: IIterable<String?>?):
      IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStoreContext>
      {
    public override fun getValue() = ABI.makeIStoreContext(pointer.getPointer(0))

    public fun setValue(value: IStoreContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreContext {
    public val __4421563_Ptr: Pointer?

    public val _4421563_VtblPtr: Pointer?
      get() = __4421563_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_OfflineLicensesChanged(handler: TypedEventHandler<StoreContext?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_OfflineLicensesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _4421563_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetCustomerPurchaseIdAsync(serviceTicket: String?,
        publisherUserId: String?): IAsyncOperation<String?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(serviceTicket),
          marshalToNative(publisherUserId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetCustomerCollectionsIdAsync(serviceTicket: String?,
        publisherUserId: String?): IAsyncOperation<String?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(serviceTicket),
          marshalToNative(publisherUserId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetAppLicenseAsync(): IAsyncOperation<StoreAppLicense?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreAppLicense?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StoreAppLicense?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetStoreProductForCurrentAppAsync(): IAsyncOperation<StoreProductResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StoreProductResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetStoreProductsAsync(productKinds: IIterable<String?>?,
        storeIds: IIterable<String?>?): IAsyncOperation<StoreProductQueryResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(productKinds),
          marshalToNative(storeIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreProductQueryResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetAssociatedStoreProductsAsync(productKinds: IIterable<String?>?):
        IAsyncOperation<StoreProductQueryResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(productKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreProductQueryResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetAssociatedStoreProductsWithPagingAsync(productKinds: IIterable<String?>?,
        maxItemsToRetrievePerPage: WinDef.UINT): IAsyncOperation<StoreProductPagedQueryResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductPagedQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(productKinds),
          maxItemsToRetrievePerPage, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreProductPagedQueryResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetUserCollectionAsync(productKinds: IIterable<String?>?):
        IAsyncOperation<StoreProductQueryResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(productKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreProductQueryResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetUserCollectionWithPagingAsync(productKinds: IIterable<String?>?,
        maxItemsToRetrievePerPage: WinDef.UINT): IAsyncOperation<StoreProductPagedQueryResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductPagedQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(productKinds),
          maxItemsToRetrievePerPage, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreProductPagedQueryResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun ReportConsumableFulfillmentAsync(
      productStoreId: String?,
      quantity: WinDef.UINT,
      trackingId: com.sun.jna.platform.win32.Guid.GUID?
    ): IAsyncOperation<StoreConsumableResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreConsumableResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(productStoreId), quantity,
          marshalToNative(trackingId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreConsumableResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetConsumableBalanceRemainingAsync(productStoreId: String?):
        IAsyncOperation<StoreConsumableResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreConsumableResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(productStoreId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreConsumableResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun AcquireStoreLicenseForOptionalPackageAsync(optionalPackage: Package?):
        IAsyncOperation<StoreAcquireLicenseResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreAcquireLicenseResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(optionalPackage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StoreAcquireLicenseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun RequestPurchaseAsync(storeId: String?):
        IAsyncOperation<StorePurchaseResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePurchaseResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(storeId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorePurchaseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun RequestPurchaseAsync(storeId: String?,
        storePurchaseProperties: StorePurchaseProperties?): IAsyncOperation<StorePurchaseResult?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePurchaseResult?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(storeId),
          marshalToNative(storePurchaseProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorePurchaseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetAppAndOptionalStorePackageUpdatesAsync():
        IAsyncOperation<IVectorView<StorePackageUpdate?>?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorePackageUpdate?>?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorePackageUpdate?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override
        fun RequestDownloadStorePackageUpdatesAsync(storePackageUpdates: IIterable<StorePackageUpdate?>?):
        IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(storePackageUpdates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override
        fun RequestDownloadAndInstallStorePackageUpdatesAsync(storePackageUpdates: IIterable<StorePackageUpdate?>?):
        IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(storePackageUpdates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun RequestDownloadAndInstallStorePackagesAsync(storeIds: IIterable<String?>?):
        IAsyncOperationWithProgress<StorePackageUpdateResult?, StorePackageUpdateStatus?>? {
      val fnPtr = _4421563_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>()
      val hr = fn.invokeHR(arrayOf(__4421563_Ptr, marshalToNative(storeIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<StorePackageUpdateResult?,
          StorePackageUpdateStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IStoreContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __4421563_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac98b6bef4fd4912babd5035e5e8bcab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreContext(ptr: Pointer?): WithDefault = IStoreContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreContext {
      val address = segment.toRawLongValue()
      return makeIStoreContext(Pointer(address))
    }

    public override fun toNative(obj: IStoreContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__4421563_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreContext): Array<IStoreContext?> = (elements as
        Array<IStoreContext?>).castToImpl<IStoreContext,IStoreContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreContext?> =
        arrayOfNulls<IStoreContext_Impl>(size) as Array<IStoreContext?>
  }
}
