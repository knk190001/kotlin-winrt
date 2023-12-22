package Windows.ApplicationModel.Store.Preview

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.System.User
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StoreConfiguration.ABI::class)
@WinRTByReference(brClass = StoreConfiguration.ByReference::class)
public class StoreConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreConfiguration> {
    public override fun getValue() = StoreConfiguration(pointer.getPointer(0))

    public fun setValue(value: StoreConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreConfiguration, MemoryAddress> {
    public val IStoreConfigurationStatics2_Instance: IStoreConfigurationStatics2 by lazy {
      createIStoreConfigurationStatics2()
    }


    public val IStoreConfigurationStatics_Instance: IStoreConfigurationStatics by lazy {
      createIStoreConfigurationStatics()
    }


    public val IStoreConfigurationStatics5_Instance: IStoreConfigurationStatics5 by lazy {
      createIStoreConfigurationStatics5()
    }


    public val IStoreConfigurationStatics4_Instance: IStoreConfigurationStatics4 by lazy {
      createIStoreConfigurationStatics4()
    }


    public val IStoreConfigurationStatics3_Instance: IStoreConfigurationStatics3 by lazy {
      createIStoreConfigurationStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStoreConfigurationStatics2(): IStoreConfigurationStatics2 {
      val refiid = Guid.REFIID(IStoreConfigurationStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.StoreConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          IStoreConfigurationStatics2.ABI.makeIStoreConfigurationStatics2(interfacePtr.value)
      return result
    }

    public fun createIStoreConfigurationStatics(): IStoreConfigurationStatics {
      val refiid = Guid.REFIID(IStoreConfigurationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.StoreConfiguration".toHandle(),refiid,interfacePtr)
      val result = IStoreConfigurationStatics.ABI.makeIStoreConfigurationStatics(interfacePtr.value)
      return result
    }

    public fun createIStoreConfigurationStatics5(): IStoreConfigurationStatics5 {
      val refiid = Guid.REFIID(IStoreConfigurationStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.StoreConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          IStoreConfigurationStatics5.ABI.makeIStoreConfigurationStatics5(interfacePtr.value)
      return result
    }

    public fun createIStoreConfigurationStatics4(): IStoreConfigurationStatics4 {
      val refiid = Guid.REFIID(IStoreConfigurationStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.StoreConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          IStoreConfigurationStatics4.ABI.makeIStoreConfigurationStatics4(interfacePtr.value)
      return result
    }

    public fun createIStoreConfigurationStatics3(): IStoreConfigurationStatics3 {
      val refiid = Guid.REFIID(IStoreConfigurationStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.StoreConfiguration".toHandle(),refiid,interfacePtr)
      val result =
          IStoreConfigurationStatics3.ABI.makeIStoreConfigurationStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StoreConfiguration {
      val address = segment.toRawLongValue()
      return StoreConfiguration(Pointer(address))
    }

    public override fun toNative(obj: StoreConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PurchasePromptingPolicy() =
        ABI.IStoreConfigurationStatics2_Instance.get_PurchasePromptingPolicy()

    public fun put_PurchasePromptingPolicy(value: IReference<WinDef.UINT>) =
        ABI.IStoreConfigurationStatics2_Instance.put_PurchasePromptingPolicy(value)

    public fun SetSystemConfiguration(
      catalogHardwareManufacturerId: String,
      catalogStoreContentModifierId: String,
      systemConfigurationExpiration: DateTime,
      catalogHardwareDescriptor: String
    ) =
        ABI.IStoreConfigurationStatics_Instance.SetSystemConfiguration(catalogHardwareManufacturerId,
        catalogStoreContentModifierId, systemConfigurationExpiration, catalogHardwareDescriptor)

    public fun SetMobileOperatorConfiguration(
      mobileOperatorId: String,
      appDownloadLimitInMegabytes: WinDef.UINT,
      updateDownloadLimitInMegabytes: WinDef.UINT
    ) = ABI.IStoreConfigurationStatics_Instance.SetMobileOperatorConfiguration(mobileOperatorId,
        appDownloadLimitInMegabytes, updateDownloadLimitInMegabytes)

    public fun SetStoreWebAccountId(webAccountId: String) =
        ABI.IStoreConfigurationStatics_Instance.SetStoreWebAccountId(webAccountId)

    public fun IsStoreWebAccountId(webAccountId: String) =
        ABI.IStoreConfigurationStatics_Instance.IsStoreWebAccountId(webAccountId)

    public fun get_HardwareManufacturerInfo() =
        ABI.IStoreConfigurationStatics_Instance.get_HardwareManufacturerInfo()

    public fun FilterUnsupportedSystemFeaturesAsync(systemFeatures: IIterable<StoreSystemFeature?>)
        =
        ABI.IStoreConfigurationStatics_Instance.FilterUnsupportedSystemFeaturesAsync(systemFeatures)

    public fun IsPinToDesktopSupported() =
        ABI.IStoreConfigurationStatics5_Instance.IsPinToDesktopSupported()

    public fun IsPinToTaskbarSupported() =
        ABI.IStoreConfigurationStatics5_Instance.IsPinToTaskbarSupported()

    public fun IsPinToStartSupported() =
        ABI.IStoreConfigurationStatics5_Instance.IsPinToStartSupported()

    public fun PinToDesktop(appPackageFamilyName: String) =
        ABI.IStoreConfigurationStatics5_Instance.PinToDesktop(appPackageFamilyName)

    public fun PinToDesktopForUser(user: User, appPackageFamilyName: String) =
        ABI.IStoreConfigurationStatics5_Instance.PinToDesktopForUser(user, appPackageFamilyName)

    public fun GetStoreWebAccountId() =
        ABI.IStoreConfigurationStatics4_Instance.GetStoreWebAccountId()

    public fun GetStoreWebAccountIdForUser(user: User) =
        ABI.IStoreConfigurationStatics4_Instance.GetStoreWebAccountIdForUser(user)

    public fun SetEnterpriseStoreWebAccountId(webAccountId: String) =
        ABI.IStoreConfigurationStatics4_Instance.SetEnterpriseStoreWebAccountId(webAccountId)

    public fun SetEnterpriseStoreWebAccountIdForUser(user: User, webAccountId: String) =
        ABI.IStoreConfigurationStatics4_Instance.SetEnterpriseStoreWebAccountIdForUser(user,
        webAccountId)

    public fun GetEnterpriseStoreWebAccountId() =
        ABI.IStoreConfigurationStatics4_Instance.GetEnterpriseStoreWebAccountId()

    public fun GetEnterpriseStoreWebAccountIdForUser(user: User) =
        ABI.IStoreConfigurationStatics4_Instance.GetEnterpriseStoreWebAccountIdForUser(user)

    public fun ShouldRestrictToEnterpriseStoreOnly() =
        ABI.IStoreConfigurationStatics4_Instance.ShouldRestrictToEnterpriseStoreOnly()

    public fun ShouldRestrictToEnterpriseStoreOnlyForUser(user: User) =
        ABI.IStoreConfigurationStatics4_Instance.ShouldRestrictToEnterpriseStoreOnlyForUser(user)

    public fun HasStoreWebAccount() = ABI.IStoreConfigurationStatics3_Instance.HasStoreWebAccount()

    public fun HasStoreWebAccountForUser(user: User) =
        ABI.IStoreConfigurationStatics3_Instance.HasStoreWebAccountForUser(user)

    public fun GetStoreLogDataAsync(options: StoreLogOptions) =
        ABI.IStoreConfigurationStatics3_Instance.GetStoreLogDataAsync(options)

    public fun SetStoreWebAccountIdForUser(user: User, webAccountId: String) =
        ABI.IStoreConfigurationStatics3_Instance.SetStoreWebAccountIdForUser(user, webAccountId)

    public fun IsStoreWebAccountIdForUser(user: User, webAccountId: String) =
        ABI.IStoreConfigurationStatics3_Instance.IsStoreWebAccountIdForUser(user, webAccountId)

    public fun GetPurchasePromptingPolicyForUser(user: User) =
        ABI.IStoreConfigurationStatics3_Instance.GetPurchasePromptingPolicyForUser(user)

    public fun SetPurchasePromptingPolicyForUser(user: User, value: IReference<WinDef.UINT>) =
        ABI.IStoreConfigurationStatics3_Instance.SetPurchasePromptingPolicyForUser(user, value)
  }
}
