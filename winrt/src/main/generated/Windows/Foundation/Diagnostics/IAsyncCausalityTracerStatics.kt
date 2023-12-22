package Windows.Foundation.Diagnostics

import Windows.Foundation.AsyncStatus
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAsyncCausalityTracerStatics.ABI::class)
@Signature("{50850b26-267e-451b-a890-ab6a370245ee}")
@Guid("50850b26267e451ba890ab6a370245ee")
@WinRTInterface("50850b26267e451ba890ab6a370245ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAsyncCausalityTracerStatics.ByReference::class)
public interface IAsyncCausalityTracerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TraceOperationCreation(
    traceLevel: CausalityTraceLevel?,
    source: CausalitySource?,
    platformId: com.sun.jna.platform.win32.Guid.GUID?,
    operationId: WinDef.ULONG,
    operationName: String?,
    relatedContext: WinDef.ULONG
  ): Unit

  @InterfaceMethod(1)
  public fun TraceOperationCompletion(
    traceLevel: CausalityTraceLevel?,
    source: CausalitySource?,
    platformId: com.sun.jna.platform.win32.Guid.GUID?,
    operationId: WinDef.ULONG,
    status: AsyncStatus?
  ): Unit

  @InterfaceMethod(2)
  public fun TraceOperationRelation(
    traceLevel: CausalityTraceLevel?,
    source: CausalitySource?,
    platformId: com.sun.jna.platform.win32.Guid.GUID?,
    operationId: WinDef.ULONG,
    relation: CausalityRelation?
  ): Unit

  @InterfaceMethod(3)
  public fun TraceSynchronousWorkStart(
    traceLevel: CausalityTraceLevel?,
    source: CausalitySource?,
    platformId: com.sun.jna.platform.win32.Guid.GUID?,
    operationId: WinDef.ULONG,
    work: CausalitySynchronousWork?
  ): Unit

  @InterfaceMethod(4)
  public fun TraceSynchronousWorkCompletion(
    traceLevel: CausalityTraceLevel?,
    source: CausalitySource?,
    work: CausalitySynchronousWork?
  ): Unit

  @InterfaceMethod(5)
  public fun add_TracingStatusChanged(handler: EventHandler<TracingStatusChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_TracingStatusChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsyncCausalityTracerStatics> {
    public override fun getValue() = ABI.makeIAsyncCausalityTracerStatics(pointer.getPointer(0))

    public fun setValue(value: IAsyncCausalityTracerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAsyncCausalityTracerStatics {
    public val __2140353984_Ptr: Pointer?

    public val _2140353984_VtblPtr: Pointer?
      get() = __2140353984_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TraceOperationCreation(
      traceLevel: CausalityTraceLevel?,
      source: CausalitySource?,
      platformId: com.sun.jna.platform.win32.Guid.GUID?,
      operationId: WinDef.ULONG,
      operationName: String?,
      relatedContext: WinDef.ULONG
    ): Unit {
      val fnPtr = _2140353984_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2140353984_Ptr, marshalToNative(traceLevel),
          marshalToNative(source), marshalToNative(platformId), operationId,
          marshalToNative(operationName), relatedContext,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TraceOperationCompletion(
      traceLevel: CausalityTraceLevel?,
      source: CausalitySource?,
      platformId: com.sun.jna.platform.win32.Guid.GUID?,
      operationId: WinDef.ULONG,
      status: AsyncStatus?
    ): Unit {
      val fnPtr = _2140353984_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2140353984_Ptr, marshalToNative(traceLevel),
          marshalToNative(source), marshalToNative(platformId), operationId,
          marshalToNative(status),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun TraceOperationRelation(
      traceLevel: CausalityTraceLevel?,
      source: CausalitySource?,
      platformId: com.sun.jna.platform.win32.Guid.GUID?,
      operationId: WinDef.ULONG,
      relation: CausalityRelation?
    ): Unit {
      val fnPtr = _2140353984_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2140353984_Ptr, marshalToNative(traceLevel),
          marshalToNative(source), marshalToNative(platformId), operationId,
          marshalToNative(relation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun TraceSynchronousWorkStart(
      traceLevel: CausalityTraceLevel?,
      source: CausalitySource?,
      platformId: com.sun.jna.platform.win32.Guid.GUID?,
      operationId: WinDef.ULONG,
      work: CausalitySynchronousWork?
    ): Unit {
      val fnPtr = _2140353984_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2140353984_Ptr, marshalToNative(traceLevel),
          marshalToNative(source), marshalToNative(platformId), operationId,
          marshalToNative(work),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun TraceSynchronousWorkCompletion(
      traceLevel: CausalityTraceLevel?,
      source: CausalitySource?,
      work: CausalitySynchronousWork?
    ): Unit {
      val fnPtr = _2140353984_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2140353984_Ptr, marshalToNative(traceLevel),
          marshalToNative(source), marshalToNative(work),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override
        fun add_TracingStatusChanged(handler: EventHandler<TracingStatusChangedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _2140353984_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2140353984_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_TracingStatusChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _2140353984_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2140353984_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAsyncCausalityTracerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2140353984_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAsyncCausalityTracerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50850b26267e451ba890ab6a370245ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAsyncCausalityTracerStatics(ptr: Pointer?): WithDefault =
        IAsyncCausalityTracerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAsyncCausalityTracerStatics {
      val address = segment.toRawLongValue()
      return makeIAsyncCausalityTracerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAsyncCausalityTracerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2140353984_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncCausalityTracerStatics):
        Array<IAsyncCausalityTracerStatics?> = (elements as
        Array<IAsyncCausalityTracerStatics?>).castToImpl<IAsyncCausalityTracerStatics,IAsyncCausalityTracerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncCausalityTracerStatics?> =
        arrayOfNulls<IAsyncCausalityTracerStatics_Impl>(size) as
        Array<IAsyncCausalityTracerStatics?>
  }
}
