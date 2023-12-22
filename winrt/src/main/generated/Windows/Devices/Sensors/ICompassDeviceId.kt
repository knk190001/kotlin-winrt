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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompassDeviceId.ABI::class)
@Signature("{d181ca29-b085-4b1d-870a-4ff57ba74fd4}")
@Guid("d181ca29b0854b1d870a4ff57ba74fd4")
@WinRTInterface("d181ca29b0854b1d870a4ff57ba74fd4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompassDeviceId.ByReference::class)
public interface ICompassDeviceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompassDeviceId> {
    public override fun getValue() = ABI.makeICompassDeviceId(pointer.getPointer(0))

    public fun setValue(value: ICompassDeviceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompassDeviceId {
    public val __1922731561_Ptr: Pointer?

    public val _1922731561_VtblPtr: Pointer?
      get() = __1922731561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1922731561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1922731561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICompassDeviceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1922731561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompassDeviceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d181ca29b0854b1d870a4ff57ba74fd4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompassDeviceId(ptr: Pointer?): WithDefault = ICompassDeviceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompassDeviceId {
      val address = segment.toRawLongValue()
      return makeICompassDeviceId(Pointer(address))
    }

    public override fun toNative(obj: ICompassDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1922731561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompassDeviceId): Array<ICompassDeviceId?> = (elements as
        Array<ICompassDeviceId?>).castToImpl<ICompassDeviceId,ICompassDeviceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompassDeviceId?> =
        arrayOfNulls<ICompassDeviceId_Impl>(size) as Array<ICompassDeviceId?>
  }
}
