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

@ABIMarker(IBarometer3.ABI::class)
@Signature("{0e35f0ea-02b5-5a04-b03d-822084863a54}")
@Guid("0e35f0ea02b55a04b03d822084863a54")
@WinRTInterface("0e35f0ea02b55a04b03d822084863a54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarometer3.ByReference::class)
public interface IBarometer3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReportThreshold(): BarometerDataThreshold?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBarometer3> {
    public override fun getValue() = ABI.makeIBarometer3(pointer.getPointer(0))

    public fun setValue(value: IBarometer3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarometer3 {
    public val __1266068082_Ptr: Pointer?

    public val _1266068082_VtblPtr: Pointer?
      get() = __1266068082_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReportThreshold(): BarometerDataThreshold? {
      val fnPtr = _1266068082_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarometerDataThreshold>()
      val hr = fn.invokeHR(arrayOf(__1266068082_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarometerDataThreshold>(result.getValue())
      return resultValue
    }
  }

  public class IBarometer3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1266068082_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarometer3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e35f0ea02b55a04b03d822084863a54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarometer3(ptr: Pointer?): WithDefault = IBarometer3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarometer3 {
      val address = segment.toRawLongValue()
      return makeIBarometer3(Pointer(address))
    }

    public override fun toNative(obj: IBarometer3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1266068082_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarometer3): Array<IBarometer3?> = (elements as
        Array<IBarometer3?>).castToImpl<IBarometer3,IBarometer3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarometer3?> =
        arrayOfNulls<IBarometer3_Impl>(size) as Array<IBarometer3?>
  }
}
