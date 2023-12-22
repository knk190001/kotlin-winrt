package Windows.ApplicationModel.SocialInfo.Provider

import Windows.ApplicationModel.SocialInfo.SocialFeedKind
import Windows.ApplicationModel.SocialInfo.SocialFeedUpdateMode
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SocialInfoProviderManager.ABI::class)
@WinRTByReference(brClass = SocialInfoProviderManager.ByReference::class)
public class SocialInfoProviderManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SocialInfoProviderManager> {
    public override fun getValue() = SocialInfoProviderManager(pointer.getPointer(0))

    public fun setValue(value: SocialInfoProviderManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocialInfoProviderManager, MemoryAddress> {
    public val ISocialInfoProviderManagerStatics_Instance: ISocialInfoProviderManagerStatics by
        lazy {
      createISocialInfoProviderManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISocialInfoProviderManagerStatics(): ISocialInfoProviderManagerStatics {
      val refiid = Guid.REFIID(ISocialInfoProviderManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.SocialInfo.Provider.SocialInfoProviderManager".toHandle(),refiid,interfacePtr)
      val result =
          ISocialInfoProviderManagerStatics.ABI.makeISocialInfoProviderManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SocialInfoProviderManager {
      val address = segment.toRawLongValue()
      return SocialInfoProviderManager(Pointer(address))
    }

    public override fun toNative(obj: SocialInfoProviderManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateSocialFeedUpdaterAsync(
      kind: SocialFeedKind,
      mode: SocialFeedUpdateMode,
      ownerRemoteId: String
    ) = ABI.ISocialInfoProviderManagerStatics_Instance.CreateSocialFeedUpdaterAsync(kind, mode,
        ownerRemoteId)

    public fun CreateDashboardItemUpdaterAsync(ownerRemoteId: String) =
        ABI.ISocialInfoProviderManagerStatics_Instance.CreateDashboardItemUpdaterAsync(ownerRemoteId)

    public fun UpdateBadgeCountValue(itemRemoteId: String, newCount: Int) =
        ABI.ISocialInfoProviderManagerStatics_Instance.UpdateBadgeCountValue(itemRemoteId, newCount)

    public fun ReportNewContentAvailable(contactRemoteId: String, kind: SocialFeedKind) =
        ABI.ISocialInfoProviderManagerStatics_Instance.ReportNewContentAvailable(contactRemoteId,
        kind)

    public fun ProvisionAsync() = ABI.ISocialInfoProviderManagerStatics_Instance.ProvisionAsync()

    public fun DeprovisionAsync() =
        ABI.ISocialInfoProviderManagerStatics_Instance.DeprovisionAsync()
  }
}
