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

@ABIMarker(ISystemDiagnosticInfo.ABI::class)
@Signature("{a290fe05-dff3-407f-9a1b-0b2b317ca800}")
@Guid("a290fe05dff3407f9a1b0b2b317ca800")
@WinRTInterface("a290fe05dff3407f9a1b0b2b317ca800")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemDiagnosticInfo.ByReference::class)
public interface ISystemDiagnosticInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MemoryUsage(): SystemMemoryUsage?

  @InterfaceMethod(1)
  public fun get_CpuUsage(): SystemCpuUsage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemDiagnosticInfo> {
    public override fun getValue() = ABI.makeISystemDiagnosticInfo(pointer.getPointer(0))

    public fun setValue(value: ISystemDiagnosticInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemDiagnosticInfo {
    public val __1867300843_Ptr: Pointer?

    public val _1867300843_VtblPtr: Pointer?
      get() = __1867300843_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MemoryUsage(): SystemMemoryUsage? {
      val fnPtr = _1867300843_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMemoryUsage>()
      val hr = fn.invokeHR(arrayOf(__1867300843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemMemoryUsage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CpuUsage(): SystemCpuUsage? {
      val fnPtr = _1867300843_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemCpuUsage>()
      val hr = fn.invokeHR(arrayOf(__1867300843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemCpuUsage>(result.getValue())
      return resultValue
    }
  }

  public class ISystemDiagnosticInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1867300843_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemDiagnosticInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a290fe05dff3407f9a1b0b2b317ca800")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemDiagnosticInfo(ptr: Pointer?): WithDefault =
        ISystemDiagnosticInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemDiagnosticInfo {
      val address = segment.toRawLongValue()
      return makeISystemDiagnosticInfo(Pointer(address))
    }

    public override fun toNative(obj: ISystemDiagnosticInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1867300843_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemDiagnosticInfo): Array<ISystemDiagnosticInfo?> =
        (elements as
        Array<ISystemDiagnosticInfo?>).castToImpl<ISystemDiagnosticInfo,ISystemDiagnosticInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemDiagnosticInfo?> =
        arrayOfNulls<ISystemDiagnosticInfo_Impl>(size) as Array<ISystemDiagnosticInfo?>
  }
}
