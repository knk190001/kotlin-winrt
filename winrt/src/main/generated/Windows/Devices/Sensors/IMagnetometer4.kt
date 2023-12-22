package Windows.Devices.Sensors

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

@ABIMarker(IMagnetometer4.ABI::class)
@Signature("{dfb17901-3e0f-508f-b24b-f2bb75015f40}")
@Guid("dfb179013e0f508fb24bf2bb75015f40")
@WinRTInterface("dfb179013e0f508fb24bf2bb75015f40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagnetometer4.ByReference::class)
public interface IMagnetometer4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReportThreshold(): MagnetometerDataThreshold?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMagnetometer4>
      {
    public override fun getValue() = ABI.makeIMagnetometer4(pointer.getPointer(0))

    public fun setValue(value: IMagnetometer4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagnetometer4 {
    public val __610712036_Ptr: Pointer?

    public val _610712036_VtblPtr: Pointer?
      get() = __610712036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReportThreshold(): MagnetometerDataThreshold? {
      val fnPtr = _610712036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagnetometerDataThreshold>()
      val hr = fn.invokeHR(arrayOf(__610712036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagnetometerDataThreshold>(result.getValue())
      return resultValue
    }
  }

  public class IMagnetometer4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __610712036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagnetometer4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dfb179013e0f508fb24bf2bb75015f40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagnetometer4(ptr: Pointer?): WithDefault = IMagnetometer4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagnetometer4 {
      val address = segment.toRawLongValue()
      return makeIMagnetometer4(Pointer(address))
    }

    public override fun toNative(obj: IMagnetometer4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__610712036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagnetometer4): Array<IMagnetometer4?> = (elements as
        Array<IMagnetometer4?>).castToImpl<IMagnetometer4,IMagnetometer4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagnetometer4?> =
        arrayOfNulls<IMagnetometer4_Impl>(size) as Array<IMagnetometer4?>
  }
}
