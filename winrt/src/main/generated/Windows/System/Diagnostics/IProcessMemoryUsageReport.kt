package Windows.System.Diagnostics

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProcessMemoryUsageReport.ABI::class)
@Signature("{c2c77cba-1951-4685-8532-7e749ecf8eeb}")
@Guid("c2c77cba1951468585327e749ecf8eeb")
@WinRTInterface("c2c77cba1951468585327e749ecf8eeb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessMemoryUsageReport.ByReference::class)
public interface IProcessMemoryUsageReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NonPagedPoolSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_PageFaultCount(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_PageFileSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(3)
  public fun get_PagedPoolSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(4)
  public fun get_PeakNonPagedPoolSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(5)
  public fun get_PeakPageFileSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(6)
  public fun get_PeakPagedPoolSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(7)
  public fun get_PeakVirtualMemorySizeInBytes(): WinDef.ULONG

  @InterfaceMethod(8)
  public fun get_PeakWorkingSetSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(9)
  public fun get_PrivatePageCount(): WinDef.ULONG

  @InterfaceMethod(10)
  public fun get_VirtualMemorySizeInBytes(): WinDef.ULONG

  @InterfaceMethod(11)
  public fun get_WorkingSetSizeInBytes(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessMemoryUsageReport> {
    public override fun getValue() = ABI.makeIProcessMemoryUsageReport(pointer.getPointer(0))

    public fun setValue(value: IProcessMemoryUsageReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessMemoryUsageReport {
    public val __1237244330_Ptr: Pointer?

    public val _1237244330_VtblPtr: Pointer?
      get() = __1237244330_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NonPagedPoolSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PageFaultCount(): WinDef.UINT {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_PageFileSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PagedPoolSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PeakNonPagedPoolSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_PeakPageFileSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_PeakPagedPoolSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_PeakVirtualMemorySizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_PeakWorkingSetSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_PrivatePageCount(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_VirtualMemorySizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_WorkingSetSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1237244330_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1237244330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IProcessMemoryUsageReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237244330_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessMemoryUsageReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2c77cba1951468585327e749ecf8eeb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessMemoryUsageReport(ptr: Pointer?): WithDefault =
        IProcessMemoryUsageReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessMemoryUsageReport {
      val address = segment.toRawLongValue()
      return makeIProcessMemoryUsageReport(Pointer(address))
    }

    public override fun toNative(obj: IProcessMemoryUsageReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237244330_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessMemoryUsageReport):
        Array<IProcessMemoryUsageReport?> = (elements as
        Array<IProcessMemoryUsageReport?>).castToImpl<IProcessMemoryUsageReport,IProcessMemoryUsageReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessMemoryUsageReport?> =
        arrayOfNulls<IProcessMemoryUsageReport_Impl>(size) as Array<IProcessMemoryUsageReport?>
  }
}
