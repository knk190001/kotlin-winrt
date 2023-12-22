package Windows.System.Diagnostics

import Windows.Foundation.DateTime
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

@ABIMarker(IProcessDiagnosticInfo.ABI::class)
@Signature("{e830b04b-300e-4ee6-a0ab-5b5f5231b434}")
@Guid("e830b04b300e4ee6a0ab5b5f5231b434")
@WinRTInterface("e830b04b300e4ee6a0ab5b5f5231b434")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessDiagnosticInfo.ByReference::class)
public interface IProcessDiagnosticInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProcessId(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ExecutableFileName(): String?

  @InterfaceMethod(2)
  public fun get_Parent(): ProcessDiagnosticInfo?

  @InterfaceMethod(3)
  public fun get_ProcessStartTime(): DateTime?

  @InterfaceMethod(4)
  public fun get_DiskUsage(): ProcessDiskUsage?

  @InterfaceMethod(5)
  public fun get_MemoryUsage(): ProcessMemoryUsage?

  @InterfaceMethod(6)
  public fun get_CpuUsage(): ProcessCpuUsage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessDiagnosticInfo> {
    public override fun getValue() = ABI.makeIProcessDiagnosticInfo(pointer.getPointer(0))

    public fun setValue(value: IProcessDiagnosticInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessDiagnosticInfo {
    public val __1044811693_Ptr: Pointer?

    public val _1044811693_VtblPtr: Pointer?
      get() = __1044811693_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProcessId(): WinDef.UINT {
      val fnPtr = _1044811693_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1044811693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ExecutableFileName(): String? {
      val fnPtr = _1044811693_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1044811693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Parent(): ProcessDiagnosticInfo? {
      val fnPtr = _1044811693_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProcessDiagnosticInfo>()
      val hr = fn.invokeHR(arrayOf(__1044811693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProcessDiagnosticInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ProcessStartTime(): DateTime? {
      val fnPtr = _1044811693_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1044811693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DiskUsage(): ProcessDiskUsage? {
      val fnPtr = _1044811693_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProcessDiskUsage>()
      val hr = fn.invokeHR(arrayOf(__1044811693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProcessDiskUsage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MemoryUsage(): ProcessMemoryUsage? {
      val fnPtr = _1044811693_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProcessMemoryUsage>()
      val hr = fn.invokeHR(arrayOf(__1044811693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProcessMemoryUsage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CpuUsage(): ProcessCpuUsage? {
      val fnPtr = _1044811693_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProcessCpuUsage>()
      val hr = fn.invokeHR(arrayOf(__1044811693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProcessCpuUsage>(result.getValue())
      return resultValue
    }
  }

  public class IProcessDiagnosticInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1044811693_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessDiagnosticInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e830b04b300e4ee6a0ab5b5f5231b434")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessDiagnosticInfo(ptr: Pointer?): WithDefault =
        IProcessDiagnosticInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessDiagnosticInfo {
      val address = segment.toRawLongValue()
      return makeIProcessDiagnosticInfo(Pointer(address))
    }

    public override fun toNative(obj: IProcessDiagnosticInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1044811693_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessDiagnosticInfo): Array<IProcessDiagnosticInfo?> =
        (elements as
        Array<IProcessDiagnosticInfo?>).castToImpl<IProcessDiagnosticInfo,IProcessDiagnosticInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessDiagnosticInfo?> =
        arrayOfNulls<IProcessDiagnosticInfo_Impl>(size) as Array<IProcessDiagnosticInfo?>
  }
}
