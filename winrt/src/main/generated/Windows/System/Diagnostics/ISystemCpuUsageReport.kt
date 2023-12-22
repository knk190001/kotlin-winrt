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

@ABIMarker(ISystemCpuUsageReport.ABI::class)
@Signature("{2c26d0b2-9483-4f62-ab57-82b29d9719b8}")
@Guid("2c26d0b294834f62ab5782b29d9719b8")
@WinRTInterface("2c26d0b294834f62ab5782b29d9719b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemCpuUsageReport.ByReference::class)
public interface ISystemCpuUsageReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KernelTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_UserTime(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_IdleTime(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemCpuUsageReport> {
    public override fun getValue() = ABI.makeISystemCpuUsageReport(pointer.getPointer(0))

    public fun setValue(value: ISystemCpuUsageReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemCpuUsageReport {
    public val __523565427_Ptr: Pointer?

    public val _523565427_VtblPtr: Pointer?
      get() = __523565427_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KernelTime(): TimeSpan? {
      val fnPtr = _523565427_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__523565427_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UserTime(): TimeSpan? {
      val fnPtr = _523565427_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__523565427_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IdleTime(): TimeSpan? {
      val fnPtr = _523565427_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__523565427_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ISystemCpuUsageReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __523565427_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemCpuUsageReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c26d0b294834f62ab5782b29d9719b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemCpuUsageReport(ptr: Pointer?): WithDefault =
        ISystemCpuUsageReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemCpuUsageReport {
      val address = segment.toRawLongValue()
      return makeISystemCpuUsageReport(Pointer(address))
    }

    public override fun toNative(obj: ISystemCpuUsageReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__523565427_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemCpuUsageReport): Array<ISystemCpuUsageReport?> =
        (elements as
        Array<ISystemCpuUsageReport?>).castToImpl<ISystemCpuUsageReport,ISystemCpuUsageReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemCpuUsageReport?> =
        arrayOfNulls<ISystemCpuUsageReport_Impl>(size) as Array<ISystemCpuUsageReport?>
  }
}
