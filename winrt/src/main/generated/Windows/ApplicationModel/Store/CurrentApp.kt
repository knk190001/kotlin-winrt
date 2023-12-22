package Windows.ApplicationModel.Store

import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CurrentApp.ABI::class)
@WinRTByReference(brClass = CurrentApp.ByReference::class)
public class CurrentApp(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CurrentApp> {
    public override fun getValue() = CurrentApp(pointer.getPointer(0))

    public fun setValue(value: CurrentApp): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrentApp, MemoryAddress> {
    public val ICurrentApp_Instance: ICurrentApp by lazy {
      createICurrentApp()
    }


    public val ICurrentApp2Statics_Instance: ICurrentApp2Statics by lazy {
      createICurrentApp2Statics()
    }


    public val ICurrentAppStaticsWithFiltering_Instance: ICurrentAppStaticsWithFiltering by lazy {
      createICurrentAppStaticsWithFiltering()
    }


    public val ICurrentAppWithConsumables_Instance: ICurrentAppWithConsumables by lazy {
      createICurrentAppWithConsumables()
    }


    public val ICurrentAppWithCampaignId_Instance: ICurrentAppWithCampaignId by lazy {
      createICurrentAppWithCampaignId()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICurrentApp(): ICurrentApp {
      val refiid = Guid.REFIID(ICurrentApp.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentApp".toHandle(),refiid,interfacePtr)
      val result = ICurrentApp.ABI.makeICurrentApp(interfacePtr.value)
      return result
    }

    public fun createICurrentApp2Statics(): ICurrentApp2Statics {
      val refiid = Guid.REFIID(ICurrentApp2Statics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentApp".toHandle(),refiid,interfacePtr)
      val result = ICurrentApp2Statics.ABI.makeICurrentApp2Statics(interfacePtr.value)
      return result
    }

    public fun createICurrentAppStaticsWithFiltering(): ICurrentAppStaticsWithFiltering {
      val refiid = Guid.REFIID(ICurrentAppStaticsWithFiltering.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentApp".toHandle(),refiid,interfacePtr)
      val result =
          ICurrentAppStaticsWithFiltering.ABI.makeICurrentAppStaticsWithFiltering(interfacePtr.value)
      return result
    }

    public fun createICurrentAppWithConsumables(): ICurrentAppWithConsumables {
      val refiid = Guid.REFIID(ICurrentAppWithConsumables.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentApp".toHandle(),refiid,interfacePtr)
      val result = ICurrentAppWithConsumables.ABI.makeICurrentAppWithConsumables(interfacePtr.value)
      return result
    }

    public fun createICurrentAppWithCampaignId(): ICurrentAppWithCampaignId {
      val refiid = Guid.REFIID(ICurrentAppWithCampaignId.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentApp".toHandle(),refiid,interfacePtr)
      val result = ICurrentAppWithCampaignId.ABI.makeICurrentAppWithCampaignId(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CurrentApp {
      val address = segment.toRawLongValue()
      return CurrentApp(Pointer(address))
    }

    public override fun toNative(obj: CurrentApp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LicenseInformation() = ABI.ICurrentApp_Instance.get_LicenseInformation()

    public fun get_LinkUri() = ABI.ICurrentApp_Instance.get_LinkUri()

    public fun get_AppId() = ABI.ICurrentApp_Instance.get_AppId()

    public fun RequestAppPurchaseAsync(includeReceipt: Boolean) =
        ABI.ICurrentApp_Instance.RequestAppPurchaseAsync(includeReceipt)

    public fun RequestProductPurchaseAsync(productId: String, includeReceipt: Boolean) =
        ABI.ICurrentApp_Instance.RequestProductPurchaseAsync(productId, includeReceipt)

    public fun LoadListingInformationAsync() =
        ABI.ICurrentApp_Instance.LoadListingInformationAsync()

    public fun GetAppReceiptAsync() = ABI.ICurrentApp_Instance.GetAppReceiptAsync()

    public fun GetProductReceiptAsync(productId: String) =
        ABI.ICurrentApp_Instance.GetProductReceiptAsync(productId)

    public fun GetCustomerPurchaseIdAsync(serviceTicket: String, publisherUserId: String) =
        ABI.ICurrentApp2Statics_Instance.GetCustomerPurchaseIdAsync(serviceTicket, publisherUserId)

    public fun GetCustomerCollectionsIdAsync(serviceTicket: String, publisherUserId: String) =
        ABI.ICurrentApp2Statics_Instance.GetCustomerCollectionsIdAsync(serviceTicket,
        publisherUserId)

    public fun LoadListingInformationByProductIdsAsync(productIds: IIterable<String?>) =
        ABI.ICurrentAppStaticsWithFiltering_Instance.LoadListingInformationByProductIdsAsync(productIds)

    public fun LoadListingInformationByKeywordsAsync(keywords: IIterable<String?>) =
        ABI.ICurrentAppStaticsWithFiltering_Instance.LoadListingInformationByKeywordsAsync(keywords)

    public fun ReportProductFulfillment(productId: String) =
        ABI.ICurrentAppStaticsWithFiltering_Instance.ReportProductFulfillment(productId)

    public fun ReportConsumableFulfillmentAsync(productId: String, transactionId: Guid.GUID) =
        ABI.ICurrentAppWithConsumables_Instance.ReportConsumableFulfillmentAsync(productId,
        transactionId)

    public fun RequestProductPurchaseAsync(productId: String) =
        ABI.ICurrentAppWithConsumables_Instance.RequestProductPurchaseAsync(productId)

    public fun RequestProductPurchaseAsync(
      productId: String,
      offerId: String,
      displayProperties: ProductPurchaseDisplayProperties
    ) = ABI.ICurrentAppWithConsumables_Instance.RequestProductPurchaseAsync(productId, offerId,
        displayProperties)

    public fun GetUnfulfilledConsumablesAsync() =
        ABI.ICurrentAppWithConsumables_Instance.GetUnfulfilledConsumablesAsync()

    public fun GetAppPurchaseCampaignIdAsync() =
        ABI.ICurrentAppWithCampaignId_Instance.GetAppPurchaseCampaignIdAsync()
  }
}
