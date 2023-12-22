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

@ABIMarker(IAppResourceGroupMemoryReport.ABI::class)
@Signature("{2c8c06b1-7db1-4c51-a225-7fae2d49e431}")
@Guid("2c8c06b17db14c51a2257fae2d49e431")
@WinRTInterface("2c8c06b17db14c51a2257fae2d49e431")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppResourceGroupMemoryReport.ByReference::class)
public interface IAppResourceGroupMemoryReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CommitUsageLimit(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_CommitUsageLevel(): AppMemoryUsageLevel?

  @InterfaceMethod(2)
  public fun get_PrivateCommitUsage(): WinDef.ULONG

  @InterfaceMethod(3)
  public fun get_TotalCommitUsage(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppResourceGroupMemoryReport> {
    public override fun getValue() = ABI.makeIAppResourceGroupMemoryReport(pointer.getPointer(0))

    public fun setValue(value: IAppResourceGroupMemoryReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppResourceGroupMemoryReport {
    public val __1287057172_Ptr: Pointer?

    public val _1287057172_VtblPtr: Pointer?
      get() = __1287057172_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CommitUsageLimit(): WinDef.ULONG {
      val fnPtr = _1287057172_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1287057172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CommitUsageLevel(): AppMemoryUsageLevel? {
      val fnPtr = _1287057172_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppMemoryUsageLevel>()
      val hr = fn.invokeHR(arrayOf(__1287057172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppMemoryUsageLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PrivateCommitUsage(): WinDef.ULONG {
      val fnPtr = _1287057172_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1287057172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_TotalCommitUsage(): WinDef.ULONG {
      val fnPtr = _1287057172_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1287057172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppResourceGroupMemoryReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1287057172_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppResourceGroupMemoryReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c8c06b17db14c51a2257fae2d49e431")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppResourceGroupMemoryReport(ptr: Pointer?): WithDefault =
        IAppResourceGroupMemoryReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppResourceGroupMemoryReport {
      val address = segment.toRawLongValue()
      return makeIAppResourceGroupMemoryReport(Pointer(address))
    }

    public override fun toNative(obj: IAppResourceGroupMemoryReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1287057172_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppResourceGroupMemoryReport):
        Array<IAppResourceGroupMemoryReport?> = (elements as
        Array<IAppResourceGroupMemoryReport?>).castToImpl<IAppResourceGroupMemoryReport,IAppResourceGroupMemoryReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppResourceGroupMemoryReport?> =
        arrayOfNulls<IAppResourceGroupMemoryReport_Impl>(size) as
        Array<IAppResourceGroupMemoryReport?>
  }
}
