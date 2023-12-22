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

@ABIMarker(IGyrometerDeviceId.ABI::class)
@Signature("{1ee5e978-89a2-4275-9e95-7126f4708760}")
@Guid("1ee5e97889a242759e957126f4708760")
@WinRTInterface("1ee5e97889a242759e957126f4708760")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGyrometerDeviceId.ByReference::class)
public interface IGyrometerDeviceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGyrometerDeviceId> {
    public override fun getValue() = ABI.makeIGyrometerDeviceId(pointer.getPointer(0))

    public fun setValue(value: IGyrometerDeviceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGyrometerDeviceId {
    public val __452301311_Ptr: Pointer?

    public val _452301311_VtblPtr: Pointer?
      get() = __452301311_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _452301311_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__452301311_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IGyrometerDeviceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __452301311_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGyrometerDeviceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ee5e97889a242759e957126f4708760")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGyrometerDeviceId(ptr: Pointer?): WithDefault = IGyrometerDeviceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGyrometerDeviceId {
      val address = segment.toRawLongValue()
      return makeIGyrometerDeviceId(Pointer(address))
    }

    public override fun toNative(obj: IGyrometerDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__452301311_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGyrometerDeviceId): Array<IGyrometerDeviceId?> =
        (elements as
        Array<IGyrometerDeviceId?>).castToImpl<IGyrometerDeviceId,IGyrometerDeviceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGyrometerDeviceId?> =
        arrayOfNulls<IGyrometerDeviceId_Impl>(size) as Array<IGyrometerDeviceId?>
  }
}
