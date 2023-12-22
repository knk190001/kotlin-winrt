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

@ABIMarker(IProcessCpuUsage.ABI::class)
@Signature("{0bbb2472-c8bf-423a-a810-b559ae4354e2}")
@Guid("0bbb2472c8bf423aa810b559ae4354e2")
@WinRTInterface("0bbb2472c8bf423aa810b559ae4354e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessCpuUsage.ByReference::class)
public interface IProcessCpuUsage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetReport(): ProcessCpuUsageReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessCpuUsage> {
    public override fun getValue() = ABI.makeIProcessCpuUsage(pointer.getPointer(0))

    public fun setValue(value: IProcessCpuUsage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessCpuUsage {
    public val __1094247753_Ptr: Pointer?

    public val _1094247753_VtblPtr: Pointer?
      get() = __1094247753_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetReport(): ProcessCpuUsageReport? {
      val fnPtr = _1094247753_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProcessCpuUsageReport>()
      val hr = fn.invokeHR(arrayOf(__1094247753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProcessCpuUsageReport>(result.getValue())
      return resultValue
    }
  }

  public class IProcessCpuUsage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1094247753_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessCpuUsage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0bbb2472c8bf423aa810b559ae4354e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessCpuUsage(ptr: Pointer?): WithDefault = IProcessCpuUsage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessCpuUsage {
      val address = segment.toRawLongValue()
      return makeIProcessCpuUsage(Pointer(address))
    }

    public override fun toNative(obj: IProcessCpuUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1094247753_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessCpuUsage): Array<IProcessCpuUsage?> = (elements as
        Array<IProcessCpuUsage?>).castToImpl<IProcessCpuUsage,IProcessCpuUsage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessCpuUsage?> =
        arrayOfNulls<IProcessCpuUsage_Impl>(size) as Array<IProcessCpuUsage?>
  }
}
