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

@ABIMarker(ISystemCpuUsage.ABI::class)
@Signature("{6037b3ac-02d6-4234-8362-7fe3adc81f5f}")
@Guid("6037b3ac02d6423483627fe3adc81f5f")
@WinRTInterface("6037b3ac02d6423483627fe3adc81f5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemCpuUsage.ByReference::class)
public interface ISystemCpuUsage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetReport(): SystemCpuUsageReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemCpuUsage> {
    public override fun getValue() = ABI.makeISystemCpuUsage(pointer.getPointer(0))

    public fun setValue(value: ISystemCpuUsage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemCpuUsage {
    public val __2109709319_Ptr: Pointer?

    public val _2109709319_VtblPtr: Pointer?
      get() = __2109709319_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetReport(): SystemCpuUsageReport? {
      val fnPtr = _2109709319_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemCpuUsageReport>()
      val hr = fn.invokeHR(arrayOf(__2109709319_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemCpuUsageReport>(result.getValue())
      return resultValue
    }
  }

  public class ISystemCpuUsage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2109709319_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemCpuUsage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6037b3ac02d6423483627fe3adc81f5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemCpuUsage(ptr: Pointer?): WithDefault = ISystemCpuUsage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemCpuUsage {
      val address = segment.toRawLongValue()
      return makeISystemCpuUsage(Pointer(address))
    }

    public override fun toNative(obj: ISystemCpuUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2109709319_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemCpuUsage): Array<ISystemCpuUsage?> = (elements as
        Array<ISystemCpuUsage?>).castToImpl<ISystemCpuUsage,ISystemCpuUsage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemCpuUsage?> =
        arrayOfNulls<ISystemCpuUsage_Impl>(size) as Array<ISystemCpuUsage?>
  }
}
