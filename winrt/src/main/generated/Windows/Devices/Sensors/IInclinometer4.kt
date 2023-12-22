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

@ABIMarker(IInclinometer4.ABI::class)
@Signature("{43852618-8fca-548e-bbf5-5c50412b6aa4}")
@Guid("438526188fca548ebbf55c50412b6aa4")
@WinRTInterface("438526188fca548ebbf55c50412b6aa4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometer4.ByReference::class)
public interface IInclinometer4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReportThreshold(): InclinometerDataThreshold?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInclinometer4>
      {
    public override fun getValue() = ABI.makeIInclinometer4(pointer.getPointer(0))

    public fun setValue(value: IInclinometer4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometer4 {
    public val __1946486587_Ptr: Pointer?

    public val _1946486587_VtblPtr: Pointer?
      get() = __1946486587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReportThreshold(): InclinometerDataThreshold? {
      val fnPtr = _1946486587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InclinometerDataThreshold>()
      val hr = fn.invokeHR(arrayOf(__1946486587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InclinometerDataThreshold>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometer4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946486587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometer4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("438526188fca548ebbf55c50412b6aa4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometer4(ptr: Pointer?): WithDefault = IInclinometer4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometer4 {
      val address = segment.toRawLongValue()
      return makeIInclinometer4(Pointer(address))
    }

    public override fun toNative(obj: IInclinometer4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946486587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometer4): Array<IInclinometer4?> = (elements as
        Array<IInclinometer4?>).castToImpl<IInclinometer4,IInclinometer4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometer4?> =
        arrayOfNulls<IInclinometer4_Impl>(size) as Array<IInclinometer4?>
  }
}
