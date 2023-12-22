package Windows.Security.EnterpriseData

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.DateTime
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Networking.HostName
import Windows.Storage.IStorageFolder
import Windows.Storage.IStorageItem
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(ProtectionPolicyManager.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.ProtectionPolicyManager;{d5703e18-a08d-47e6-a240-9934d7165eb5})")
@WinRTByReference(brClass = ProtectionPolicyManager.ByReference::class)
public class ProtectionPolicyManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtectionPolicyManager.WithDefault, IProtectionPolicyManager2.WithDefault,
    IWinRTObject {
  private val __1806157881_Interface: IProtectionPolicyManager.WithDefault by lazy {
    as_1806157881()
  }


  private val __156319413_Interface: IProtectionPolicyManager2.WithDefault by lazy {
    as_156319413()
  }


  public override val __1806157881_Ptr: JNAPointer? by lazy {
    __1806157881_Interface.__1806157881_Ptr
  }


  public override val __156319413_Ptr: JNAPointer? by lazy {
    __156319413_Interface.__156319413_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1806157881_Interface, __156319413_Interface)

  private fun as_1806157881(): IProtectionPolicyManager.WithDefault {
    if(pointer == NULL) {
      return(IProtectionPolicyManager.ABI.makeIProtectionPolicyManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtectionPolicyManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtectionPolicyManager.ABI.makeIProtectionPolicyManager(ref.value))
  }

  private fun as_156319413(): IProtectionPolicyManager2.WithDefault {
    if(pointer == NULL) {
      return(IProtectionPolicyManager2.ABI.makeIProtectionPolicyManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtectionPolicyManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtectionPolicyManager2.ABI.makeIProtectionPolicyManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProtectionPolicyManager> {
    public override fun getValue() = ProtectionPolicyManager(pointer.getPointer(0))

    public fun setValue(value: ProtectionPolicyManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtectionPolicyManager, MemoryAddress> {
    public val IProtectionPolicyManagerStatics4_Instance: IProtectionPolicyManagerStatics4 by lazy {
      createIProtectionPolicyManagerStatics4()
    }


    public val IProtectionPolicyManagerStatics2_Instance: IProtectionPolicyManagerStatics2 by lazy {
      createIProtectionPolicyManagerStatics2()
    }


    public val IProtectionPolicyManagerStatics_Instance: IProtectionPolicyManagerStatics by lazy {
      createIProtectionPolicyManagerStatics()
    }


    public val IProtectionPolicyManagerStatics3_Instance: IProtectionPolicyManagerStatics3 by lazy {
      createIProtectionPolicyManagerStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProtectionPolicyManagerStatics4(): IProtectionPolicyManagerStatics4 {
      val refiid = Guid.REFIID(IProtectionPolicyManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.ProtectionPolicyManager".toHandle(),refiid,interfacePtr)
      val result =
          IProtectionPolicyManagerStatics4.ABI.makeIProtectionPolicyManagerStatics4(interfacePtr.value)
      return result
    }

    public fun createIProtectionPolicyManagerStatics2(): IProtectionPolicyManagerStatics2 {
      val refiid = Guid.REFIID(IProtectionPolicyManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.ProtectionPolicyManager".toHandle(),refiid,interfacePtr)
      val result =
          IProtectionPolicyManagerStatics2.ABI.makeIProtectionPolicyManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIProtectionPolicyManagerStatics(): IProtectionPolicyManagerStatics {
      val refiid = Guid.REFIID(IProtectionPolicyManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.ProtectionPolicyManager".toHandle(),refiid,interfacePtr)
      val result =
          IProtectionPolicyManagerStatics.ABI.makeIProtectionPolicyManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIProtectionPolicyManagerStatics3(): IProtectionPolicyManagerStatics3 {
      val refiid = Guid.REFIID(IProtectionPolicyManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.ProtectionPolicyManager".toHandle(),refiid,interfacePtr)
      val result =
          IProtectionPolicyManagerStatics3.ABI.makeIProtectionPolicyManagerStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ProtectionPolicyManager {
      val address = segment.toRawLongValue()
      return ProtectionPolicyManager(Pointer(address))
    }

    public override fun toNative(obj: ProtectionPolicyManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsRoamableProtectionEnabled(identity: String) =
        ABI.IProtectionPolicyManagerStatics4_Instance.IsRoamableProtectionEnabled(identity)

    public fun RequestAccessAsync(
      sourceIdentity: String,
      targetIdentity: String,
      auditInfo: ProtectionPolicyAuditInfo,
      messageFromApp: String,
      behavior: ProtectionPolicyRequestAccessBehavior
    ) = ABI.IProtectionPolicyManagerStatics4_Instance.RequestAccessAsync(sourceIdentity,
        targetIdentity, auditInfo, messageFromApp, behavior)

    public fun RequestAccessForAppAsync(
      sourceIdentity: String,
      appPackageFamilyName: String,
      auditInfo: ProtectionPolicyAuditInfo,
      messageFromApp: String,
      behavior: ProtectionPolicyRequestAccessBehavior
    ) = ABI.IProtectionPolicyManagerStatics4_Instance.RequestAccessForAppAsync(sourceIdentity,
        appPackageFamilyName, auditInfo, messageFromApp, behavior)

    public fun RequestAccessToFilesForAppAsync(
      sourceItemList: IIterable<IStorageItem?>,
      appPackageFamilyName: String,
      auditInfo: ProtectionPolicyAuditInfo
    ) =
        ABI.IProtectionPolicyManagerStatics4_Instance.RequestAccessToFilesForAppAsync(sourceItemList,
        appPackageFamilyName, auditInfo)

    public fun RequestAccessToFilesForAppAsync(
      sourceItemList: IIterable<IStorageItem?>,
      appPackageFamilyName: String,
      auditInfo: ProtectionPolicyAuditInfo,
      messageFromApp: String,
      behavior: ProtectionPolicyRequestAccessBehavior
    ) =
        ABI.IProtectionPolicyManagerStatics4_Instance.RequestAccessToFilesForAppAsync(sourceItemList,
        appPackageFamilyName, auditInfo, messageFromApp, behavior)

    public fun RequestAccessToFilesForProcessAsync(
      sourceItemList: IIterable<IStorageItem?>,
      processId: WinDef.UINT,
      auditInfo: ProtectionPolicyAuditInfo
    ) =
        ABI.IProtectionPolicyManagerStatics4_Instance.RequestAccessToFilesForProcessAsync(sourceItemList,
        processId, auditInfo)

    public fun RequestAccessToFilesForProcessAsync(
      sourceItemList: IIterable<IStorageItem?>,
      processId: WinDef.UINT,
      auditInfo: ProtectionPolicyAuditInfo,
      messageFromApp: String,
      behavior: ProtectionPolicyRequestAccessBehavior
    ) =
        ABI.IProtectionPolicyManagerStatics4_Instance.RequestAccessToFilesForProcessAsync(sourceItemList,
        processId, auditInfo, messageFromApp, behavior)

    public fun IsFileProtectionRequiredAsync(target: IStorageItem, identity: String) =
        ABI.IProtectionPolicyManagerStatics4_Instance.IsFileProtectionRequiredAsync(target,
        identity)

    public fun IsFileProtectionRequiredForNewFileAsync(
      parentFolder: IStorageFolder,
      identity: String,
      desiredName: String
    ) =
        ABI.IProtectionPolicyManagerStatics4_Instance.IsFileProtectionRequiredForNewFileAsync(parentFolder,
        identity, desiredName)

    public fun get_PrimaryManagedIdentity() =
        ABI.IProtectionPolicyManagerStatics4_Instance.get_PrimaryManagedIdentity()

    public fun GetPrimaryManagedIdentityForIdentity(identity: String) =
        ABI.IProtectionPolicyManagerStatics4_Instance.GetPrimaryManagedIdentityForIdentity(identity)

    public fun HasContentBeenRevokedSince(identity: String, since: DateTime) =
        ABI.IProtectionPolicyManagerStatics2_Instance.HasContentBeenRevokedSince(identity, since)

    public fun CheckAccessForApp(sourceIdentity: String, appPackageFamilyName: String) =
        ABI.IProtectionPolicyManagerStatics2_Instance.CheckAccessForApp(sourceIdentity,
        appPackageFamilyName)

    public fun RequestAccessForAppAsync(sourceIdentity: String, appPackageFamilyName: String) =
        ABI.IProtectionPolicyManagerStatics2_Instance.RequestAccessForAppAsync(sourceIdentity,
        appPackageFamilyName)

    public fun GetEnforcementLevel(identity: String) =
        ABI.IProtectionPolicyManagerStatics2_Instance.GetEnforcementLevel(identity)

    public fun IsUserDecryptionAllowed(identity: String) =
        ABI.IProtectionPolicyManagerStatics2_Instance.IsUserDecryptionAllowed(identity)

    public fun IsProtectionUnderLockRequired(identity: String) =
        ABI.IProtectionPolicyManagerStatics2_Instance.IsProtectionUnderLockRequired(identity)

    public fun add_PolicyChanged(handler: EventHandler<IUnknown?>) =
        ABI.IProtectionPolicyManagerStatics2_Instance.add_PolicyChanged(handler)

    public fun remove_PolicyChanged(token: EventRegistrationToken) =
        ABI.IProtectionPolicyManagerStatics2_Instance.remove_PolicyChanged(token)

    public fun get_IsProtectionEnabled() =
        ABI.IProtectionPolicyManagerStatics2_Instance.get_IsProtectionEnabled()

    public fun IsIdentityManaged(identity: String) =
        ABI.IProtectionPolicyManagerStatics_Instance.IsIdentityManaged(identity)

    public fun TryApplyProcessUIPolicy(identity: String) =
        ABI.IProtectionPolicyManagerStatics_Instance.TryApplyProcessUIPolicy(identity)

    public fun ClearProcessUIPolicy() =
        ABI.IProtectionPolicyManagerStatics_Instance.ClearProcessUIPolicy()

    public fun CreateCurrentThreadNetworkContext(identity: String) =
        ABI.IProtectionPolicyManagerStatics_Instance.CreateCurrentThreadNetworkContext(identity)

    public fun GetPrimaryManagedIdentityForNetworkEndpointAsync(endpointHost: HostName) =
        ABI.IProtectionPolicyManagerStatics_Instance.GetPrimaryManagedIdentityForNetworkEndpointAsync(endpointHost)

    public fun RevokeContent(identity: String) =
        ABI.IProtectionPolicyManagerStatics_Instance.RevokeContent(identity)

    public fun GetForCurrentView() =
        ABI.IProtectionPolicyManagerStatics_Instance.GetForCurrentView()

    public
        fun add_ProtectedAccessSuspending(handler: EventHandler<ProtectedAccessSuspendingEventArgs?>)
        = ABI.IProtectionPolicyManagerStatics_Instance.add_ProtectedAccessSuspending(handler)

    public fun remove_ProtectedAccessSuspending(token: EventRegistrationToken) =
        ABI.IProtectionPolicyManagerStatics_Instance.remove_ProtectedAccessSuspending(token)

    public fun add_ProtectedAccessResumed(handler: EventHandler<ProtectedAccessResumedEventArgs?>) =
        ABI.IProtectionPolicyManagerStatics_Instance.add_ProtectedAccessResumed(handler)

    public fun remove_ProtectedAccessResumed(token: EventRegistrationToken) =
        ABI.IProtectionPolicyManagerStatics_Instance.remove_ProtectedAccessResumed(token)

    public fun add_ProtectedContentRevoked(handler: EventHandler<ProtectedContentRevokedEventArgs?>)
        = ABI.IProtectionPolicyManagerStatics_Instance.add_ProtectedContentRevoked(handler)

    public fun remove_ProtectedContentRevoked(token: EventRegistrationToken) =
        ABI.IProtectionPolicyManagerStatics_Instance.remove_ProtectedContentRevoked(token)

    public fun CheckAccess(sourceIdentity: String, targetIdentity: String) =
        ABI.IProtectionPolicyManagerStatics_Instance.CheckAccess(sourceIdentity, targetIdentity)

    public fun RequestAccessAsync(sourceIdentity: String, targetIdentity: String) =
        ABI.IProtectionPolicyManagerStatics_Instance.RequestAccessAsync(sourceIdentity,
        targetIdentity)

    public fun RequestAccessAsync(
      sourceIdentity: String,
      targetIdentity: String,
      auditInfo: ProtectionPolicyAuditInfo
    ) = ABI.IProtectionPolicyManagerStatics3_Instance.RequestAccessAsync(sourceIdentity,
        targetIdentity, auditInfo)

    public fun RequestAccessAsync(
      sourceIdentity: String,
      targetIdentity: String,
      auditInfo: ProtectionPolicyAuditInfo,
      messageFromApp: String
    ) = ABI.IProtectionPolicyManagerStatics3_Instance.RequestAccessAsync(sourceIdentity,
        targetIdentity, auditInfo, messageFromApp)

    public fun RequestAccessForAppAsync(
      sourceIdentity: String,
      appPackageFamilyName: String,
      auditInfo: ProtectionPolicyAuditInfo
    ) = ABI.IProtectionPolicyManagerStatics3_Instance.RequestAccessForAppAsync(sourceIdentity,
        appPackageFamilyName, auditInfo)

    public fun RequestAccessForAppAsync(
      sourceIdentity: String,
      appPackageFamilyName: String,
      auditInfo: ProtectionPolicyAuditInfo,
      messageFromApp: String
    ) = ABI.IProtectionPolicyManagerStatics3_Instance.RequestAccessForAppAsync(sourceIdentity,
        appPackageFamilyName, auditInfo, messageFromApp)

    public fun LogAuditEvent(
      sourceIdentity: String,
      targetIdentity: String,
      auditInfo: ProtectionPolicyAuditInfo
    ) = ABI.IProtectionPolicyManagerStatics3_Instance.LogAuditEvent(sourceIdentity, targetIdentity,
        auditInfo)
  }
}
