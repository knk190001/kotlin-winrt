package Windows.System.Diagnostics.TraceReporting

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPlatformDiagnosticActionsStatics.ABI::class)
@Signature("{c1145cfa-9292-4267-890a-9ea3ed072312}")
@Guid("c1145cfa92924267890a9ea3ed072312")
@WinRTInterface("c1145cfa92924267890a9ea3ed072312")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlatformDiagnosticActionsStatics.ByReference::class)
public interface IPlatformDiagnosticActionsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsScenarioEnabled(scenarioId: com.sun.jna.platform.win32.Guid.GUID?): Boolean

  @InterfaceMethod(1)
  public fun TryEscalateScenario(
    scenarioId: com.sun.jna.platform.win32.Guid.GUID?,
    escalationType: PlatformDiagnosticEscalationType?,
    outputDirectory: String?,
    timestampOutputDirectory: Boolean,
    forceEscalationUpload: Boolean,
    triggers: IMapView<String?, String?>?
  ): Boolean

  @InterfaceMethod(2)
  public fun DownloadLatestSettingsForNamespace(
    partner: String?,
    feature: String?,
    isScenarioNamespace: Boolean,
    downloadOverCostedNetwork: Boolean,
    downloadOverBattery: Boolean
  ): PlatformDiagnosticActionState?

  @InterfaceMethod(3)
  public fun GetActiveScenarioList(): IVectorView<com.sun.jna.platform.win32.Guid.GUID?>?

  @InterfaceMethod(4)
  public fun ForceUpload(
    latency: PlatformDiagnosticEventBufferLatencies?,
    uploadOverCostedNetwork: Boolean,
    uploadOverBattery: Boolean
  ): PlatformDiagnosticActionState?

  @InterfaceMethod(5)
  public fun IsTraceRunning(
    slotType: PlatformDiagnosticTraceSlotType?,
    scenarioId: com.sun.jna.platform.win32.Guid.GUID?,
    traceProfileHash: WinDef.ULONG
  ): PlatformDiagnosticTraceSlotState?

  @InterfaceMethod(6)
  public fun GetActiveTraceRuntime(slotType: PlatformDiagnosticTraceSlotType?):
      PlatformDiagnosticTraceRuntimeInfo?

  @InterfaceMethod(7)
  public fun GetKnownTraceList(slotType: PlatformDiagnosticTraceSlotType?):
      IVectorView<PlatformDiagnosticTraceInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlatformDiagnosticActionsStatics> {
    public override fun getValue() =
        ABI.makeIPlatformDiagnosticActionsStatics(pointer.getPointer(0))

    public fun setValue(value: IPlatformDiagnosticActionsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlatformDiagnosticActionsStatics {
    public val __156576244_Ptr: Pointer?

    public val _156576244_VtblPtr: Pointer?
      get() = __156576244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsScenarioEnabled(scenarioId: com.sun.jna.platform.win32.Guid.GUID?):
        Boolean {
      val fnPtr = _156576244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156576244_Ptr, marshalToNative(scenarioId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryEscalateScenario(
      scenarioId: com.sun.jna.platform.win32.Guid.GUID?,
      escalationType: PlatformDiagnosticEscalationType?,
      outputDirectory: String?,
      timestampOutputDirectory: Boolean,
      forceEscalationUpload: Boolean,
      triggers: IMapView<String?, String?>?
    ): Boolean {
      val fnPtr = _156576244_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156576244_Ptr, marshalToNative(scenarioId),
          marshalToNative(escalationType), marshalToNative(outputDirectory),
          timestampOutputDirectory, forceEscalationUpload, marshalToNative(triggers), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun DownloadLatestSettingsForNamespace(
      partner: String?,
      feature: String?,
      isScenarioNamespace: Boolean,
      downloadOverCostedNetwork: Boolean,
      downloadOverBattery: Boolean
    ): PlatformDiagnosticActionState? {
      val fnPtr = _156576244_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlatformDiagnosticActionState>()
      val hr = fn.invokeHR(arrayOf(__156576244_Ptr, marshalToNative(partner),
          marshalToNative(feature), isScenarioNamespace, downloadOverCostedNetwork,
          downloadOverBattery, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlatformDiagnosticActionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetActiveScenarioList():
        IVectorView<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _156576244_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<com.sun.jna.platform.win32.Guid.GUID?>>()
      val hr = fn.invokeHR(arrayOf(__156576244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<com.sun.jna.platform.win32.Guid.GUID?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ForceUpload(
      latency: PlatformDiagnosticEventBufferLatencies?,
      uploadOverCostedNetwork: Boolean,
      uploadOverBattery: Boolean
    ): PlatformDiagnosticActionState? {
      val fnPtr = _156576244_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlatformDiagnosticActionState>()
      val hr = fn.invokeHR(arrayOf(__156576244_Ptr, marshalToNative(latency),
          uploadOverCostedNetwork, uploadOverBattery, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlatformDiagnosticActionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun IsTraceRunning(
      slotType: PlatformDiagnosticTraceSlotType?,
      scenarioId: com.sun.jna.platform.win32.Guid.GUID?,
      traceProfileHash: WinDef.ULONG
    ): PlatformDiagnosticTraceSlotState? {
      val fnPtr = _156576244_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlatformDiagnosticTraceSlotState>()
      val hr = fn.invokeHR(arrayOf(__156576244_Ptr, marshalToNative(slotType),
          marshalToNative(scenarioId), traceProfileHash, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlatformDiagnosticTraceSlotState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetActiveTraceRuntime(slotType: PlatformDiagnosticTraceSlotType?):
        PlatformDiagnosticTraceRuntimeInfo? {
      val fnPtr = _156576244_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlatformDiagnosticTraceRuntimeInfo>()
      val hr = fn.invokeHR(arrayOf(__156576244_Ptr, marshalToNative(slotType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlatformDiagnosticTraceRuntimeInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetKnownTraceList(slotType: PlatformDiagnosticTraceSlotType?):
        IVectorView<PlatformDiagnosticTraceInfo?>? {
      val fnPtr = _156576244_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PlatformDiagnosticTraceInfo?>>()
      val hr = fn.invokeHR(arrayOf(__156576244_Ptr, marshalToNative(slotType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<PlatformDiagnosticTraceInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IPlatformDiagnosticActionsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __156576244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlatformDiagnosticActionsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1145cfa92924267890a9ea3ed072312")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlatformDiagnosticActionsStatics(ptr: Pointer?): WithDefault =
        IPlatformDiagnosticActionsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlatformDiagnosticActionsStatics {
      val address = segment.toRawLongValue()
      return makeIPlatformDiagnosticActionsStatics(Pointer(address))
    }

    public override fun toNative(obj: IPlatformDiagnosticActionsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156576244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlatformDiagnosticActionsStatics):
        Array<IPlatformDiagnosticActionsStatics?> = (elements as
        Array<IPlatformDiagnosticActionsStatics?>).castToImpl<IPlatformDiagnosticActionsStatics,IPlatformDiagnosticActionsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlatformDiagnosticActionsStatics?> =
        arrayOfNulls<IPlatformDiagnosticActionsStatics_Impl>(size) as
        Array<IPlatformDiagnosticActionsStatics?>
  }
}
