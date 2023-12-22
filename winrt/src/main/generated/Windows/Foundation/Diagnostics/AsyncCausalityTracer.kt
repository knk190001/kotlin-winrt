package Windows.Foundation.Diagnostics

import Windows.Foundation.AsyncStatus
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(AsyncCausalityTracer.ABI::class)
@WinRTByReference(brClass = AsyncCausalityTracer.ByReference::class)
public class AsyncCausalityTracer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AsyncCausalityTracer> {
    public override fun getValue() = AsyncCausalityTracer(pointer.getPointer(0))

    public fun setValue(value: AsyncCausalityTracer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AsyncCausalityTracer, MemoryAddress> {
    public val IAsyncCausalityTracerStatics_Instance: IAsyncCausalityTracerStatics by lazy {
      createIAsyncCausalityTracerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAsyncCausalityTracerStatics(): IAsyncCausalityTracerStatics {
      val refiid = Guid.REFIID(IAsyncCausalityTracerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.AsyncCausalityTracer".toHandle(),refiid,interfacePtr)
      val result =
          IAsyncCausalityTracerStatics.ABI.makeIAsyncCausalityTracerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AsyncCausalityTracer {
      val address = segment.toRawLongValue()
      return AsyncCausalityTracer(Pointer(address))
    }

    public override fun toNative(obj: AsyncCausalityTracer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TraceOperationCreation(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      platformId: Guid.GUID,
      operationId: WinDef.ULONG,
      operationName: String,
      relatedContext: WinDef.ULONG
    ) = ABI.IAsyncCausalityTracerStatics_Instance.TraceOperationCreation(traceLevel, source,
        platformId, operationId, operationName, relatedContext)

    public fun TraceOperationCompletion(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      platformId: Guid.GUID,
      operationId: WinDef.ULONG,
      status: AsyncStatus
    ) = ABI.IAsyncCausalityTracerStatics_Instance.TraceOperationCompletion(traceLevel, source,
        platformId, operationId, status)

    public fun TraceOperationRelation(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      platformId: Guid.GUID,
      operationId: WinDef.ULONG,
      relation: CausalityRelation
    ) = ABI.IAsyncCausalityTracerStatics_Instance.TraceOperationRelation(traceLevel, source,
        platformId, operationId, relation)

    public fun TraceSynchronousWorkStart(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      platformId: Guid.GUID,
      operationId: WinDef.ULONG,
      work: CausalitySynchronousWork
    ) = ABI.IAsyncCausalityTracerStatics_Instance.TraceSynchronousWorkStart(traceLevel, source,
        platformId, operationId, work)

    public fun TraceSynchronousWorkCompletion(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      work: CausalitySynchronousWork
    ) = ABI.IAsyncCausalityTracerStatics_Instance.TraceSynchronousWorkCompletion(traceLevel, source,
        work)

    public fun add_TracingStatusChanged(handler: EventHandler<TracingStatusChangedEventArgs?>) =
        ABI.IAsyncCausalityTracerStatics_Instance.add_TracingStatusChanged(handler)

    public fun remove_TracingStatusChanged(cookie: EventRegistrationToken) =
        ABI.IAsyncCausalityTracerStatics_Instance.remove_TracingStatusChanged(cookie)
  }
}
