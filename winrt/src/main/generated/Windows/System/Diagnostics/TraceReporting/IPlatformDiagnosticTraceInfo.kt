package Windows.System.Diagnostics.TraceReporting

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
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlatformDiagnosticTraceInfo.ABI::class)
@Signature("{f870ed97-d597-4bf7-88dc-cf5c7dc2a1d2}")
@Guid("f870ed97d5974bf788dccf5c7dc2a1d2")
@WinRTInterface("f870ed97d5974bf788dccf5c7dc2a1d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlatformDiagnosticTraceInfo.ByReference::class)
public interface IPlatformDiagnosticTraceInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScenarioId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_ProfileHash(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_IsExclusive(): Boolean

  @InterfaceMethod(3)
  public fun get_IsAutoLogger(): Boolean

  @InterfaceMethod(4)
  public fun get_MaxTraceDurationFileTime(): Long

  @InterfaceMethod(5)
  public fun get_Priority(): PlatformDiagnosticTracePriority?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlatformDiagnosticTraceInfo> {
    public override fun getValue() = ABI.makeIPlatformDiagnosticTraceInfo(pointer.getPointer(0))

    public fun setValue(value: IPlatformDiagnosticTraceInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlatformDiagnosticTraceInfo {
    public val __1516454129_Ptr: Pointer?

    public val _1516454129_VtblPtr: Pointer?
      get() = __1516454129_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScenarioId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1516454129_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1516454129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProfileHash(): WinDef.ULONG {
      val fnPtr = _1516454129_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1516454129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsExclusive(): Boolean {
      val fnPtr = _1516454129_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1516454129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsAutoLogger(): Boolean {
      val fnPtr = _1516454129_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1516454129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MaxTraceDurationFileTime(): Long {
      val fnPtr = _1516454129_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__1516454129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Priority(): PlatformDiagnosticTracePriority? {
      val fnPtr = _1516454129_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlatformDiagnosticTracePriority>()
      val hr = fn.invokeHR(arrayOf(__1516454129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlatformDiagnosticTracePriority>(result.getValue())
      return resultValue
    }
  }

  public class IPlatformDiagnosticTraceInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1516454129_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlatformDiagnosticTraceInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f870ed97d5974bf788dccf5c7dc2a1d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlatformDiagnosticTraceInfo(ptr: Pointer?): WithDefault =
        IPlatformDiagnosticTraceInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlatformDiagnosticTraceInfo {
      val address = segment.toRawLongValue()
      return makeIPlatformDiagnosticTraceInfo(Pointer(address))
    }

    public override fun toNative(obj: IPlatformDiagnosticTraceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1516454129_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlatformDiagnosticTraceInfo):
        Array<IPlatformDiagnosticTraceInfo?> = (elements as
        Array<IPlatformDiagnosticTraceInfo?>).castToImpl<IPlatformDiagnosticTraceInfo,IPlatformDiagnosticTraceInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlatformDiagnosticTraceInfo?> =
        arrayOfNulls<IPlatformDiagnosticTraceInfo_Impl>(size) as
        Array<IPlatformDiagnosticTraceInfo?>
  }
}
