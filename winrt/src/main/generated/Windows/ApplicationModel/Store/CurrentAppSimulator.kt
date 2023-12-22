package Windows.ApplicationModel.Store

import Windows.Foundation.Collections.IIterable
import Windows.Storage.StorageFile
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

@ABIMarker(CurrentAppSimulator.ABI::class)
@WinRTByReference(brClass = CurrentAppSimulator.ByReference::class)
public class CurrentAppSimulator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CurrentAppSimulator> {
    public override fun getValue() = CurrentAppSimulator(pointer.getPointer(0))

    public fun setValue(value: CurrentAppSimulator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrentAppSimulator, MemoryAddress> {
    public val ICurrentAppSimulator_Instance: ICurrentAppSimulator by lazy {
      createICurrentAppSimulator()
    }


    public val ICurrentAppSimulatorStaticsWithFiltering_Instance:
        ICurrentAppSimulatorStaticsWithFiltering by lazy {
      createICurrentAppSimulatorStaticsWithFiltering()
    }


    public val ICurrentAppSimulatorWithConsumables_Instance: ICurrentAppSimulatorWithConsumables by
        lazy {
      createICurrentAppSimulatorWithConsumables()
    }


    public val ICurrentAppSimulatorWithCampaignId_Instance: ICurrentAppSimulatorWithCampaignId by
        lazy {
      createICurrentAppSimulatorWithCampaignId()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICurrentAppSimulator(): ICurrentAppSimulator {
      val refiid = Guid.REFIID(ICurrentAppSimulator.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentAppSimulator".toHandle(),refiid,interfacePtr)
      val result = ICurrentAppSimulator.ABI.makeICurrentAppSimulator(interfacePtr.value)
      return result
    }

    public fun createICurrentAppSimulatorStaticsWithFiltering():
        ICurrentAppSimulatorStaticsWithFiltering {
      val refiid = Guid.REFIID(ICurrentAppSimulatorStaticsWithFiltering.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentAppSimulator".toHandle(),refiid,interfacePtr)
      val result =
          ICurrentAppSimulatorStaticsWithFiltering.ABI.makeICurrentAppSimulatorStaticsWithFiltering(interfacePtr.value)
      return result
    }

    public fun createICurrentAppSimulatorWithConsumables(): ICurrentAppSimulatorWithConsumables {
      val refiid = Guid.REFIID(ICurrentAppSimulatorWithConsumables.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentAppSimulator".toHandle(),refiid,interfacePtr)
      val result =
          ICurrentAppSimulatorWithConsumables.ABI.makeICurrentAppSimulatorWithConsumables(interfacePtr.value)
      return result
    }

    public fun createICurrentAppSimulatorWithCampaignId(): ICurrentAppSimulatorWithCampaignId {
      val refiid = Guid.REFIID(ICurrentAppSimulatorWithCampaignId.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.CurrentAppSimulator".toHandle(),refiid,interfacePtr)
      val result =
          ICurrentAppSimulatorWithCampaignId.ABI.makeICurrentAppSimulatorWithCampaignId(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CurrentAppSimulator {
      val address = segment.toRawLongValue()
      return CurrentAppSimulator(Pointer(address))
    }

    public override fun toNative(obj: CurrentAppSimulator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LicenseInformation() = ABI.ICurrentAppSimulator_Instance.get_LicenseInformation()

    public fun get_LinkUri() = ABI.ICurrentAppSimulator_Instance.get_LinkUri()

    public fun get_AppId() = ABI.ICurrentAppSimulator_Instance.get_AppId()

    public fun RequestAppPurchaseAsync(includeReceipt: Boolean) =
        ABI.ICurrentAppSimulator_Instance.RequestAppPurchaseAsync(includeReceipt)

    public fun RequestProductPurchaseAsync(productId: String, includeReceipt: Boolean) =
        ABI.ICurrentAppSimulator_Instance.RequestProductPurchaseAsync(productId, includeReceipt)

    public fun LoadListingInformationAsync() =
        ABI.ICurrentAppSimulator_Instance.LoadListingInformationAsync()

    public fun GetAppReceiptAsync() = ABI.ICurrentAppSimulator_Instance.GetAppReceiptAsync()

    public fun GetProductReceiptAsync(productId: String) =
        ABI.ICurrentAppSimulator_Instance.GetProductReceiptAsync(productId)

    public fun ReloadSimulatorAsync(simulatorSettingsFile: StorageFile) =
        ABI.ICurrentAppSimulator_Instance.ReloadSimulatorAsync(simulatorSettingsFile)

    public fun LoadListingInformationByProductIdsAsync(productIds: IIterable<String?>) =
        ABI.ICurrentAppSimulatorStaticsWithFiltering_Instance.LoadListingInformationByProductIdsAsync(productIds)

    public fun LoadListingInformationByKeywordsAsync(keywords: IIterable<String?>) =
        ABI.ICurrentAppSimulatorStaticsWithFiltering_Instance.LoadListingInformationByKeywordsAsync(keywords)

    public fun ReportConsumableFulfillmentAsync(productId: String, transactionId: Guid.GUID) =
        ABI.ICurrentAppSimulatorWithConsumables_Instance.ReportConsumableFulfillmentAsync(productId,
        transactionId)

    public fun RequestProductPurchaseAsync(productId: String) =
        ABI.ICurrentAppSimulatorWithConsumables_Instance.RequestProductPurchaseAsync(productId)

    public fun RequestProductPurchaseAsync(
      productId: String,
      offerId: String,
      displayProperties: ProductPurchaseDisplayProperties
    ) = ABI.ICurrentAppSimulatorWithConsumables_Instance.RequestProductPurchaseAsync(productId,
        offerId, displayProperties)

    public fun GetUnfulfilledConsumablesAsync() =
        ABI.ICurrentAppSimulatorWithConsumables_Instance.GetUnfulfilledConsumablesAsync()

    public fun GetAppPurchaseCampaignIdAsync() =
        ABI.ICurrentAppSimulatorWithCampaignId_Instance.GetAppPurchaseCampaignIdAsync()
  }
}
