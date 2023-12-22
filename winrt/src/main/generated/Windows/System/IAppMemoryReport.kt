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

@ABIMarker(IAppMemoryReport.ABI::class)
@Signature("{6d65339b-4d6f-45bc-9c5e-e49b3ff2758d}")
@Guid("6d65339b4d6f45bc9c5ee49b3ff2758d")
@WinRTInterface("6d65339b4d6f45bc9c5ee49b3ff2758d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppMemoryReport.ByReference::class)
public interface IAppMemoryReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrivateCommitUsage(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_PeakPrivateCommitUsage(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_TotalCommitUsage(): WinDef.ULONG

  @InterfaceMethod(3)
  public fun get_TotalCommitLimit(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppMemoryReport> {
    public override fun getValue() = ABI.makeIAppMemoryReport(pointer.getPointer(0))

    public fun setValue(value: IAppMemoryReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppMemoryReport {
    public val __129518343_Ptr: Pointer?

    public val _129518343_VtblPtr: Pointer?
      get() = __129518343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrivateCommitUsage(): WinDef.ULONG {
      val fnPtr = _129518343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__129518343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PeakPrivateCommitUsage(): WinDef.ULONG {
      val fnPtr = _129518343_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__129518343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_TotalCommitUsage(): WinDef.ULONG {
      val fnPtr = _129518343_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__129518343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_TotalCommitLimit(): WinDef.ULONG {
      val fnPtr = _129518343_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__129518343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppMemoryReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __129518343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppMemoryReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d65339b4d6f45bc9c5ee49b3ff2758d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppMemoryReport(ptr: Pointer?): WithDefault = IAppMemoryReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppMemoryReport {
      val address = segment.toRawLongValue()
      return makeIAppMemoryReport(Pointer(address))
    }

    public override fun toNative(obj: IAppMemoryReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__129518343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppMemoryReport): Array<IAppMemoryReport?> = (elements as
        Array<IAppMemoryReport?>).castToImpl<IAppMemoryReport,IAppMemoryReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppMemoryReport?> =
        arrayOfNulls<IAppMemoryReport_Impl>(size) as Array<IAppMemoryReport?>
  }
}
