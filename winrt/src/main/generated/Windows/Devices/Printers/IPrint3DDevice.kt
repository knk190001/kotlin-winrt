package Windows.Devices.Printers

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

@ABIMarker(IPrint3DDevice.ABI::class)
@Signature("{041c3d19-9713-42a2-9813-7dc3337428d3}")
@Guid("041c3d19971342a298137dc3337428d3")
@WinRTInterface("041c3d19971342a298137dc3337428d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DDevice.ByReference::class)
public interface IPrint3DDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrintSchema(): PrintSchema?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPrint3DDevice>
      {
    public override fun getValue() = ABI.makeIPrint3DDevice(pointer.getPointer(0))

    public fun setValue(value: IPrint3DDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DDevice {
    public val __580958528_Ptr: Pointer?

    public val _580958528_VtblPtr: Pointer?
      get() = __580958528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrintSchema(): PrintSchema? {
      val fnPtr = _580958528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintSchema>()
      val hr = fn.invokeHR(arrayOf(__580958528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintSchema>(result.getValue())
      return resultValue
    }
  }

  public class IPrint3DDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __580958528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("041c3d19971342a298137dc3337428d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DDevice(ptr: Pointer?): WithDefault = IPrint3DDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DDevice {
      val address = segment.toRawLongValue()
      return makeIPrint3DDevice(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__580958528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DDevice): Array<IPrint3DDevice?> = (elements as
        Array<IPrint3DDevice?>).castToImpl<IPrint3DDevice,IPrint3DDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DDevice?> =
        arrayOfNulls<IPrint3DDevice_Impl>(size) as Array<IPrint3DDevice?>
  }
}
