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

@ABIMarker(IGyrometer4.ABI::class)
@Signature("{0628a60c-4c4b-5096-94e6-c356df68bef7}")
@Guid("0628a60c4c4b509694e6c356df68bef7")
@WinRTInterface("0628a60c4c4b509694e6c356df68bef7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGyrometer4.ByReference::class)
public interface IGyrometer4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReportThreshold(): GyrometerDataThreshold?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGyrometer4> {
    public override fun getValue() = ABI.makeIGyrometer4(pointer.getPointer(0))

    public fun setValue(value: IGyrometer4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGyrometer4 {
    public val __145733594_Ptr: Pointer?

    public val _145733594_VtblPtr: Pointer?
      get() = __145733594_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReportThreshold(): GyrometerDataThreshold? {
      val fnPtr = _145733594_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GyrometerDataThreshold>()
      val hr = fn.invokeHR(arrayOf(__145733594_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GyrometerDataThreshold>(result.getValue())
      return resultValue
    }
  }

  public class IGyrometer4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __145733594_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGyrometer4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0628a60c4c4b509694e6c356df68bef7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGyrometer4(ptr: Pointer?): WithDefault = IGyrometer4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGyrometer4 {
      val address = segment.toRawLongValue()
      return makeIGyrometer4(Pointer(address))
    }

    public override fun toNative(obj: IGyrometer4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__145733594_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGyrometer4): Array<IGyrometer4?> = (elements as
        Array<IGyrometer4?>).castToImpl<IGyrometer4,IGyrometer4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGyrometer4?> =
        arrayOfNulls<IGyrometer4_Impl>(size) as Array<IGyrometer4?>
  }
}
