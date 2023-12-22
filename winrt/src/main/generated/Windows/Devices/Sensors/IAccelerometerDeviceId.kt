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

@ABIMarker(IAccelerometerDeviceId.ABI::class)
@Signature("{7eac64a9-97d5-446d-ab5a-917df9b96a2c}")
@Guid("7eac64a997d5446dab5a917df9b96a2c")
@WinRTInterface("7eac64a997d5446dab5a917df9b96a2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometerDeviceId.ByReference::class)
public interface IAccelerometerDeviceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometerDeviceId> {
    public override fun getValue() = ABI.makeIAccelerometerDeviceId(pointer.getPointer(0))

    public fun setValue(value: IAccelerometerDeviceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometerDeviceId {
    public val __1193974036_Ptr: Pointer?

    public val _1193974036_VtblPtr: Pointer?
      get() = __1193974036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1193974036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1193974036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAccelerometerDeviceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1193974036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometerDeviceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7eac64a997d5446dab5a917df9b96a2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometerDeviceId(ptr: Pointer?): WithDefault =
        IAccelerometerDeviceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometerDeviceId {
      val address = segment.toRawLongValue()
      return makeIAccelerometerDeviceId(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometerDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1193974036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometerDeviceId): Array<IAccelerometerDeviceId?> =
        (elements as
        Array<IAccelerometerDeviceId?>).castToImpl<IAccelerometerDeviceId,IAccelerometerDeviceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometerDeviceId?> =
        arrayOfNulls<IAccelerometerDeviceId_Impl>(size) as Array<IAccelerometerDeviceId?>
  }
}
