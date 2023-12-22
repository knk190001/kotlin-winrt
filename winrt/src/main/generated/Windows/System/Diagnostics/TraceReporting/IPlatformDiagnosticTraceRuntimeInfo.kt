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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlatformDiagnosticTraceRuntimeInfo.ABI::class)
@Signature("{3d4d5e2d-01d8-4768-8554-1eb1ca610986}")
@Guid("3d4d5e2d01d8476885541eb1ca610986")
@WinRTInterface("3d4d5e2d01d8476885541eb1ca610986")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlatformDiagnosticTraceRuntimeInfo.ByReference::class)
public interface IPlatformDiagnosticTraceRuntimeInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RuntimeFileTime(): Long

  @InterfaceMethod(1)
  public fun get_EtwRuntimeFileTime(): Long

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlatformDiagnosticTraceRuntimeInfo> {
    public override fun getValue() =
        ABI.makeIPlatformDiagnosticTraceRuntimeInfo(pointer.getPointer(0))

    public fun setValue(value: IPlatformDiagnosticTraceRuntimeInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlatformDiagnosticTraceRuntimeInfo {
    public val __793142053_Ptr: Pointer?

    public val _793142053_VtblPtr: Pointer?
      get() = __793142053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RuntimeFileTime(): Long {
      val fnPtr = _793142053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__793142053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EtwRuntimeFileTime(): Long {
      val fnPtr = _793142053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__793142053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlatformDiagnosticTraceRuntimeInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __793142053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlatformDiagnosticTraceRuntimeInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d4d5e2d01d8476885541eb1ca610986")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlatformDiagnosticTraceRuntimeInfo(ptr: Pointer?): WithDefault =
        IPlatformDiagnosticTraceRuntimeInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlatformDiagnosticTraceRuntimeInfo {
      val address = segment.toRawLongValue()
      return makeIPlatformDiagnosticTraceRuntimeInfo(Pointer(address))
    }

    public override fun toNative(obj: IPlatformDiagnosticTraceRuntimeInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__793142053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlatformDiagnosticTraceRuntimeInfo):
        Array<IPlatformDiagnosticTraceRuntimeInfo?> = (elements as
        Array<IPlatformDiagnosticTraceRuntimeInfo?>).castToImpl<IPlatformDiagnosticTraceRuntimeInfo,IPlatformDiagnosticTraceRuntimeInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlatformDiagnosticTraceRuntimeInfo?> =
        arrayOfNulls<IPlatformDiagnosticTraceRuntimeInfo_Impl>(size) as
        Array<IPlatformDiagnosticTraceRuntimeInfo?>
  }
}
