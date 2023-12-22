package Windows.System.Diagnostics

import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProcessCpuUsageReport.ABI::class)
@Signature("{8a6d9cac-3987-4e2f-a119-6b5fa214f1b4}")
@Guid("8a6d9cac39874e2fa1196b5fa214f1b4")
@WinRTInterface("8a6d9cac39874e2fa1196b5fa214f1b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessCpuUsageReport.ByReference::class)
public interface IProcessCpuUsageReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KernelTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_UserTime(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessCpuUsageReport> {
    public override fun getValue() = ABI.makeIProcessCpuUsageReport(pointer.getPointer(0))

    public fun setValue(value: IProcessCpuUsageReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessCpuUsageReport {
    public val __298923723_Ptr: Pointer?

    public val _298923723_VtblPtr: Pointer?
      get() = __298923723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KernelTime(): TimeSpan? {
      val fnPtr = _298923723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__298923723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UserTime(): TimeSpan? {
      val fnPtr = _298923723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__298923723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IProcessCpuUsageReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __298923723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessCpuUsageReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a6d9cac39874e2fa1196b5fa214f1b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessCpuUsageReport(ptr: Pointer?): WithDefault =
        IProcessCpuUsageReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessCpuUsageReport {
      val address = segment.toRawLongValue()
      return makeIProcessCpuUsageReport(Pointer(address))
    }

    public override fun toNative(obj: IProcessCpuUsageReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__298923723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessCpuUsageReport): Array<IProcessCpuUsageReport?> =
        (elements as
        Array<IProcessCpuUsageReport?>).castToImpl<IProcessCpuUsageReport,IProcessCpuUsageReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessCpuUsageReport?> =
        arrayOfNulls<IProcessCpuUsageReport_Impl>(size) as Array<IProcessCpuUsageReport?>
  }
}
