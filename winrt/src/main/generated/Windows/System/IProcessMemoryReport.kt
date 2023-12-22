package Windows.System

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

@ABIMarker(IProcessMemoryReport.ABI::class)
@Signature("{087305a8-9b70-4782-8741-3a982b6ce5e4}")
@Guid("087305a89b70478287413a982b6ce5e4")
@WinRTInterface("087305a89b70478287413a982b6ce5e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessMemoryReport.ByReference::class)
public interface IProcessMemoryReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrivateWorkingSetUsage(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_TotalWorkingSetUsage(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessMemoryReport> {
    public override fun getValue() = ABI.makeIProcessMemoryReport(pointer.getPointer(0))

    public fun setValue(value: IProcessMemoryReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessMemoryReport {
    public val __1281218091_Ptr: Pointer?

    public val _1281218091_VtblPtr: Pointer?
      get() = __1281218091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrivateWorkingSetUsage(): WinDef.ULONG {
      val fnPtr = _1281218091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1281218091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_TotalWorkingSetUsage(): WinDef.ULONG {
      val fnPtr = _1281218091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1281218091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IProcessMemoryReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1281218091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessMemoryReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("087305a89b70478287413a982b6ce5e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessMemoryReport(ptr: Pointer?): WithDefault = IProcessMemoryReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessMemoryReport {
      val address = segment.toRawLongValue()
      return makeIProcessMemoryReport(Pointer(address))
    }

    public override fun toNative(obj: IProcessMemoryReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1281218091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessMemoryReport): Array<IProcessMemoryReport?> =
        (elements as
        Array<IProcessMemoryReport?>).castToImpl<IProcessMemoryReport,IProcessMemoryReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessMemoryReport?> =
        arrayOfNulls<IProcessMemoryReport_Impl>(size) as Array<IProcessMemoryReport?>
  }
}
