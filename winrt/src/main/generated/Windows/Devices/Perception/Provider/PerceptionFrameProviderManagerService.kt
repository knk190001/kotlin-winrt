package Windows.Devices.Perception.Provider

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PerceptionFrameProviderManagerService.ABI::class)
@WinRTByReference(brClass = PerceptionFrameProviderManagerService.ByReference::class)
public class PerceptionFrameProviderManagerService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionFrameProviderManagerService> {
    public override fun getValue() = PerceptionFrameProviderManagerService(pointer.getPointer(0))

    public fun setValue(value: PerceptionFrameProviderManagerService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionFrameProviderManagerService, MemoryAddress> {
    public val IPerceptionFrameProviderManagerServiceStatics_Instance:
        IPerceptionFrameProviderManagerServiceStatics by lazy {
      createIPerceptionFrameProviderManagerServiceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionFrameProviderManagerServiceStatics():
        IPerceptionFrameProviderManagerServiceStatics {
      val refiid = Guid.REFIID(IPerceptionFrameProviderManagerServiceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService".toHandle(),refiid,interfacePtr)
      val result =
          IPerceptionFrameProviderManagerServiceStatics.ABI.makeIPerceptionFrameProviderManagerServiceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PerceptionFrameProviderManagerService {
      val address = segment.toRawLongValue()
      return PerceptionFrameProviderManagerService(Pointer(address))
    }

    public override fun toNative(obj: PerceptionFrameProviderManagerService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RegisterFrameProviderInfo(manager: IPerceptionFrameProviderManager,
        frameProviderInfo: PerceptionFrameProviderInfo) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.RegisterFrameProviderInfo(manager,
        frameProviderInfo)

    public fun UnregisterFrameProviderInfo(manager: IPerceptionFrameProviderManager,
        frameProviderInfo: PerceptionFrameProviderInfo) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.UnregisterFrameProviderInfo(manager,
        frameProviderInfo)

    public fun RegisterFaceAuthenticationGroup(manager: IPerceptionFrameProviderManager,
        faceAuthenticationGroup: PerceptionFaceAuthenticationGroup) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.RegisterFaceAuthenticationGroup(manager,
        faceAuthenticationGroup)

    public fun UnregisterFaceAuthenticationGroup(manager: IPerceptionFrameProviderManager,
        faceAuthenticationGroup: PerceptionFaceAuthenticationGroup) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.UnregisterFaceAuthenticationGroup(manager,
        faceAuthenticationGroup)

    public fun RegisterControlGroup(manager: IPerceptionFrameProviderManager,
        controlGroup: PerceptionControlGroup) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.RegisterControlGroup(manager,
        controlGroup)

    public fun UnregisterControlGroup(manager: IPerceptionFrameProviderManager,
        controlGroup: PerceptionControlGroup) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.UnregisterControlGroup(manager,
        controlGroup)

    public fun RegisterCorrelationGroup(manager: IPerceptionFrameProviderManager,
        correlationGroup: PerceptionCorrelationGroup) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.RegisterCorrelationGroup(manager,
        correlationGroup)

    public fun UnregisterCorrelationGroup(manager: IPerceptionFrameProviderManager,
        correlationGroup: PerceptionCorrelationGroup) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.UnregisterCorrelationGroup(manager,
        correlationGroup)

    public fun UpdateAvailabilityForProvider(provider: IPerceptionFrameProvider, available: Boolean)
        =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.UpdateAvailabilityForProvider(provider,
        available)

    public fun PublishFrameForProvider(provider: IPerceptionFrameProvider, frame: PerceptionFrame) =
        ABI.IPerceptionFrameProviderManagerServiceStatics_Instance.PublishFrameForProvider(provider,
        frame)
  }
}
