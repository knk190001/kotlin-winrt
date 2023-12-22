package Windows.Phone.Devices.Power

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

@ABIMarker(IBatteryStatics.ABI::class)
@Signature("{faf5bc70-6369-11e1-b86c-0800200c9a66}")
@Guid("faf5bc70636911e1b86c0800200c9a66")
@WinRTInterface("faf5bc70636911e1b86c0800200c9a66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBatteryStatics.ByReference::class)
public interface IBatteryStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): Battery?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBatteryStatics> {
    public override fun getValue() = ABI.makeIBatteryStatics(pointer.getPointer(0))

    public fun setValue(value: IBatteryStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBatteryStatics {
    public val __159415992_Ptr: Pointer?

    public val _159415992_VtblPtr: Pointer?
      get() = __159415992_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): Battery? {
      val fnPtr = _159415992_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Battery>()
      val hr = fn.invokeHR(arrayOf(__159415992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Battery>(result.getValue())
      return resultValue
    }
  }

  public class IBatteryStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __159415992_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBatteryStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("faf5bc70636911e1b86c0800200c9a66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBatteryStatics(ptr: Pointer?): WithDefault = IBatteryStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBatteryStatics {
      val address = segment.toRawLongValue()
      return makeIBatteryStatics(Pointer(address))
    }

    public override fun toNative(obj: IBatteryStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__159415992_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBatteryStatics): Array<IBatteryStatics?> = (elements as
        Array<IBatteryStatics?>).castToImpl<IBatteryStatics,IBatteryStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBatteryStatics?> =
        arrayOfNulls<IBatteryStatics_Impl>(size) as Array<IBatteryStatics?>
  }
}
