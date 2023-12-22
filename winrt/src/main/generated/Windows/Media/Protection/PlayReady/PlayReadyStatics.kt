package Windows.Media.Protection.PlayReady

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PlayReadyStatics.ABI::class)
@WinRTByReference(brClass = PlayReadyStatics.ByReference::class)
public class PlayReadyStatics(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyStatics> {
    public override fun getValue() = PlayReadyStatics(pointer.getPointer(0))

    public fun setValue(value: PlayReadyStatics): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyStatics, MemoryAddress> {
    public val IPlayReadyStatics_Instance: IPlayReadyStatics by lazy {
      createIPlayReadyStatics()
    }


    public val IPlayReadyStatics4_Instance: IPlayReadyStatics4 by lazy {
      createIPlayReadyStatics4()
    }


    public val IPlayReadyStatics5_Instance: IPlayReadyStatics5 by lazy {
      createIPlayReadyStatics5()
    }


    public val IPlayReadyStatics3_Instance: IPlayReadyStatics3 by lazy {
      createIPlayReadyStatics3()
    }


    public val IPlayReadyStatics2_Instance: IPlayReadyStatics2 by lazy {
      createIPlayReadyStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlayReadyStatics(): IPlayReadyStatics {
      val refiid = Guid.REFIID(IPlayReadyStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyStatics".toHandle(),refiid,interfacePtr)
      val result = IPlayReadyStatics.ABI.makeIPlayReadyStatics(interfacePtr.value)
      return result
    }

    public fun createIPlayReadyStatics4(): IPlayReadyStatics4 {
      val refiid = Guid.REFIID(IPlayReadyStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyStatics".toHandle(),refiid,interfacePtr)
      val result = IPlayReadyStatics4.ABI.makeIPlayReadyStatics4(interfacePtr.value)
      return result
    }

    public fun createIPlayReadyStatics5(): IPlayReadyStatics5 {
      val refiid = Guid.REFIID(IPlayReadyStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyStatics".toHandle(),refiid,interfacePtr)
      val result = IPlayReadyStatics5.ABI.makeIPlayReadyStatics5(interfacePtr.value)
      return result
    }

    public fun createIPlayReadyStatics3(): IPlayReadyStatics3 {
      val refiid = Guid.REFIID(IPlayReadyStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyStatics".toHandle(),refiid,interfacePtr)
      val result = IPlayReadyStatics3.ABI.makeIPlayReadyStatics3(interfacePtr.value)
      return result
    }

    public fun createIPlayReadyStatics2(): IPlayReadyStatics2 {
      val refiid = Guid.REFIID(IPlayReadyStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyStatics".toHandle(),refiid,interfacePtr)
      val result = IPlayReadyStatics2.ABI.makeIPlayReadyStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PlayReadyStatics {
      val address = segment.toRawLongValue()
      return PlayReadyStatics(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DomainJoinServiceRequestType() =
        ABI.IPlayReadyStatics_Instance.get_DomainJoinServiceRequestType()

    public fun get_DomainLeaveServiceRequestType() =
        ABI.IPlayReadyStatics_Instance.get_DomainLeaveServiceRequestType()

    public fun get_IndividualizationServiceRequestType() =
        ABI.IPlayReadyStatics_Instance.get_IndividualizationServiceRequestType()

    public fun get_LicenseAcquirerServiceRequestType() =
        ABI.IPlayReadyStatics_Instance.get_LicenseAcquirerServiceRequestType()

    public fun get_MeteringReportServiceRequestType() =
        ABI.IPlayReadyStatics_Instance.get_MeteringReportServiceRequestType()

    public fun get_RevocationServiceRequestType() =
        ABI.IPlayReadyStatics_Instance.get_RevocationServiceRequestType()

    public fun get_MediaProtectionSystemId() =
        ABI.IPlayReadyStatics_Instance.get_MediaProtectionSystemId()

    public fun get_PlayReadySecurityVersion() =
        ABI.IPlayReadyStatics_Instance.get_PlayReadySecurityVersion()

    public fun get_InputTrustAuthorityToCreate() =
        ABI.IPlayReadyStatics4_Instance.get_InputTrustAuthorityToCreate()

    public fun get_ProtectionSystemId() = ABI.IPlayReadyStatics4_Instance.get_ProtectionSystemId()

    public fun get_HardwareDRMDisabledAtTime() =
        ABI.IPlayReadyStatics5_Instance.get_HardwareDRMDisabledAtTime()

    public fun get_HardwareDRMDisabledUntilTime() =
        ABI.IPlayReadyStatics5_Instance.get_HardwareDRMDisabledUntilTime()

    public fun ResetHardwareDRMDisabled() =
        ABI.IPlayReadyStatics5_Instance.ResetHardwareDRMDisabled()

    public fun get_SecureStopServiceRequestType() =
        ABI.IPlayReadyStatics3_Instance.get_SecureStopServiceRequestType()

    public fun CheckSupportedHardware(hwdrmFeature: PlayReadyHardwareDRMFeatures) =
        ABI.IPlayReadyStatics3_Instance.CheckSupportedHardware(hwdrmFeature)

    public fun get_PlayReadyCertificateSecurityLevel() =
        ABI.IPlayReadyStatics2_Instance.get_PlayReadyCertificateSecurityLevel()
  }
}
