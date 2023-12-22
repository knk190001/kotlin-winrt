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

@ABIMarker(ICompass4.ABI::class)
@Signature("{291e7f11-ec32-5dcc-bfcb-0bb39eba5774}")
@Guid("291e7f11ec325dccbfcb0bb39eba5774")
@WinRTInterface("291e7f11ec325dccbfcb0bb39eba5774")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompass4.ByReference::class)
public interface ICompass4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReportThreshold(): CompassDataThreshold?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICompass4> {
    public override fun getValue() = ABI.makeICompass4(pointer.getPointer(0))

    public fun setValue(value: ICompass4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompass4 {
    public val __614337358_Ptr: Pointer?

    public val _614337358_VtblPtr: Pointer?
      get() = __614337358_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReportThreshold(): CompassDataThreshold? {
      val fnPtr = _614337358_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompassDataThreshold>()
      val hr = fn.invokeHR(arrayOf(__614337358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompassDataThreshold>(result.getValue())
      return resultValue
    }
  }

  public class ICompass4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __614337358_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompass4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("291e7f11ec325dccbfcb0bb39eba5774")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompass4(ptr: Pointer?): WithDefault = ICompass4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompass4 {
      val address = segment.toRawLongValue()
      return makeICompass4(Pointer(address))
    }

    public override fun toNative(obj: ICompass4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__614337358_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompass4): Array<ICompass4?> = (elements as
        Array<ICompass4?>).castToImpl<ICompass4,ICompass4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompass4?> = arrayOfNulls<ICompass4_Impl>(size)
        as Array<ICompass4?>
  }
}
