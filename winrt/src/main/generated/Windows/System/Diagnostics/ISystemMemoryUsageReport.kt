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

@ABIMarker(ISystemMemoryUsageReport.ABI::class)
@Signature("{38663c87-2a9f-403a-bd19-2cf3e8169500}")
@Guid("38663c872a9f403abd192cf3e8169500")
@WinRTInterface("38663c872a9f403abd192cf3e8169500")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMemoryUsageReport.ByReference::class)
public interface ISystemMemoryUsageReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TotalPhysicalSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_AvailableSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_CommittedSizeInBytes(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMemoryUsageReport> {
    public override fun getValue() = ABI.makeISystemMemoryUsageReport(pointer.getPointer(0))

    public fun setValue(value: ISystemMemoryUsageReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMemoryUsageReport {
    public val __1223088300_Ptr: Pointer?

    public val _1223088300_VtblPtr: Pointer?
      get() = __1223088300_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TotalPhysicalSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1223088300_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1223088300_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AvailableSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1223088300_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1223088300_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CommittedSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1223088300_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1223088300_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class ISystemMemoryUsageReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1223088300_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMemoryUsageReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38663c872a9f403abd192cf3e8169500")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMemoryUsageReport(ptr: Pointer?): WithDefault =
        ISystemMemoryUsageReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemMemoryUsageReport {
      val address = segment.toRawLongValue()
      return makeISystemMemoryUsageReport(Pointer(address))
    }

    public override fun toNative(obj: ISystemMemoryUsageReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1223088300_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMemoryUsageReport):
        Array<ISystemMemoryUsageReport?> = (elements as
        Array<ISystemMemoryUsageReport?>).castToImpl<ISystemMemoryUsageReport,ISystemMemoryUsageReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemMemoryUsageReport?> =
        arrayOfNulls<ISystemMemoryUsageReport_Impl>(size) as Array<ISystemMemoryUsageReport?>
  }
}
