package Windows.System.Diagnostics.TraceReporting

import Windows.Foundation.Collections.IMapView
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PlatformDiagnosticActions.ABI::class)
@WinRTByReference(brClass = PlatformDiagnosticActions.ByReference::class)
public class PlatformDiagnosticActions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlatformDiagnosticActions> {
    public override fun getValue() = PlatformDiagnosticActions(pointer.getPointer(0))

    public fun setValue(value: PlatformDiagnosticActions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlatformDiagnosticActions, MemoryAddress> {
    public val IPlatformDiagnosticActionsStatics_Instance: IPlatformDiagnosticActionsStatics by
        lazy {
      createIPlatformDiagnosticActionsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlatformDiagnosticActionsStatics(): IPlatformDiagnosticActionsStatics {
      val refiid = Guid.REFIID(IPlatformDiagnosticActionsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.TraceReporting.PlatformDiagnosticActions".toHandle(),refiid,interfacePtr)
      val result =
          IPlatformDiagnosticActionsStatics.ABI.makeIPlatformDiagnosticActionsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PlatformDiagnosticActions {
      val address = segment.toRawLongValue()
      return PlatformDiagnosticActions(Pointer(address))
    }

    public override fun toNative(obj: PlatformDiagnosticActions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsScenarioEnabled(scenarioId: Guid.GUID) =
        ABI.IPlatformDiagnosticActionsStatics_Instance.IsScenarioEnabled(scenarioId)

    public fun TryEscalateScenario(
      scenarioId: Guid.GUID,
      escalationType: PlatformDiagnosticEscalationType,
      outputDirectory: String,
      timestampOutputDirectory: Boolean,
      forceEscalationUpload: Boolean,
      triggers: IMapView<String?, String?>
    ) = ABI.IPlatformDiagnosticActionsStatics_Instance.TryEscalateScenario(scenarioId,
        escalationType, outputDirectory, timestampOutputDirectory, forceEscalationUpload, triggers)

    public fun DownloadLatestSettingsForNamespace(
      partner: String,
      feature: String,
      isScenarioNamespace: Boolean,
      downloadOverCostedNetwork: Boolean,
      downloadOverBattery: Boolean
    ) = ABI.IPlatformDiagnosticActionsStatics_Instance.DownloadLatestSettingsForNamespace(partner,
        feature, isScenarioNamespace, downloadOverCostedNetwork, downloadOverBattery)

    public fun GetActiveScenarioList() =
        ABI.IPlatformDiagnosticActionsStatics_Instance.GetActiveScenarioList()

    public fun ForceUpload(
      latency: PlatformDiagnosticEventBufferLatencies,
      uploadOverCostedNetwork: Boolean,
      uploadOverBattery: Boolean
    ) = ABI.IPlatformDiagnosticActionsStatics_Instance.ForceUpload(latency, uploadOverCostedNetwork,
        uploadOverBattery)

    public fun IsTraceRunning(
      slotType: PlatformDiagnosticTraceSlotType,
      scenarioId: Guid.GUID,
      traceProfileHash: WinDef.ULONG
    ) = ABI.IPlatformDiagnosticActionsStatics_Instance.IsTraceRunning(slotType, scenarioId,
        traceProfileHash)

    public fun GetActiveTraceRuntime(slotType: PlatformDiagnosticTraceSlotType) =
        ABI.IPlatformDiagnosticActionsStatics_Instance.GetActiveTraceRuntime(slotType)

    public fun GetKnownTraceList(slotType: PlatformDiagnosticTraceSlotType) =
        ABI.IPlatformDiagnosticActionsStatics_Instance.GetKnownTraceList(slotType)
  }
}
