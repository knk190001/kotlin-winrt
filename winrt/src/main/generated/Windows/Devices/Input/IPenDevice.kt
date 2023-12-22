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

@ABIMarker(IPenDevice.ABI::class)
@Signature("{31856eba-a738-5a8c-b8f6-f97ef68d18ef}")
@Guid("31856ebaa7385a8cb8f6f97ef68d18ef")
@WinRTInterface("31856ebaa7385a8cb8f6f97ef68d18ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenDevice.ByReference::class)
public interface IPenDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PenId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPenDevice> {
    public override fun getValue() = ABI.makeIPenDevice(pointer.getPointer(0))

    public fun setValue(value: IPenDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenDevice {
    public val __935475188_Ptr: Pointer?

    public val _935475188_VtblPtr: Pointer?
      get() = __935475188_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PenId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _935475188_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__935475188_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IPenDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __935475188_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31856ebaa7385a8cb8f6f97ef68d18ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenDevice(ptr: Pointer?): WithDefault = IPenDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenDevice {
      val address = segment.toRawLongValue()
      return makeIPenDevice(Pointer(address))
    }

    public override fun toNative(obj: IPenDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__935475188_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenDevice): Array<IPenDevice?> = (elements as
        Array<IPenDevice?>).castToImpl<IPenDevice,IPenDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenDevice?> = arrayOfNulls<IPenDevice_Impl>(size)
        as Array<IPenDevice?>
  }
}
