package Windows.Devices.Input

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

@ABIMarker(IPenDeviceStatics.ABI::class)
@Signature("{9dfbbe01-0966-5180-bcb4-b85060e39479}")
@Guid("9dfbbe0109665180bcb4b85060e39479")
@WinRTInterface("9dfbbe0109665180bcb4b85060e39479")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenDeviceStatics.ByReference::class)
public interface IPenDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFromPointerId(pointerId: WinDef.UINT): PenDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenDeviceStatics> {
    public override fun getValue() = ABI.makeIPenDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IPenDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenDeviceStatics {
    public val __1063601457_Ptr: Pointer?

    public val _1063601457_VtblPtr: Pointer?
      get() = __1063601457_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFromPointerId(pointerId: WinDef.UINT): PenDevice? {
      val fnPtr = _1063601457_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenDevice>()
      val hr = fn.invokeHR(arrayOf(__1063601457_Ptr, pointerId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenDevice>(result.getValue())
      return resultValue
    }
  }

  public class IPenDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1063601457_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9dfbbe0109665180bcb4b85060e39479")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenDeviceStatics(ptr: Pointer?): WithDefault = IPenDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIPenDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPenDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1063601457_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenDeviceStatics): Array<IPenDeviceStatics?> = (elements
        as Array<IPenDeviceStatics?>).castToImpl<IPenDeviceStatics,IPenDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenDeviceStatics?> =
        arrayOfNulls<IPenDeviceStatics_Impl>(size) as Array<IPenDeviceStatics?>
  }
}
