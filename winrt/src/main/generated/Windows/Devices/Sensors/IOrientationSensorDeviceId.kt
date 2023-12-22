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

@ABIMarker(IOrientationSensorDeviceId.ABI::class)
@Signature("{5a69b648-4c29-49ec-b28f-ea1d117b66f0}")
@Guid("5a69b6484c2949ecb28fea1d117b66f0")
@WinRTInterface("5a69b6484c2949ecb28fea1d117b66f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorDeviceId.ByReference::class)
public interface IOrientationSensorDeviceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorDeviceId> {
    public override fun getValue() = ABI.makeIOrientationSensorDeviceId(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorDeviceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorDeviceId {
    public val __1038480017_Ptr: Pointer?

    public val _1038480017_VtblPtr: Pointer?
      get() = __1038480017_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1038480017_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1038480017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorDeviceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1038480017_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorDeviceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a69b6484c2949ecb28fea1d117b66f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorDeviceId(ptr: Pointer?): WithDefault =
        IOrientationSensorDeviceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientationSensorDeviceId {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorDeviceId(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1038480017_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorDeviceId):
        Array<IOrientationSensorDeviceId?> = (elements as
        Array<IOrientationSensorDeviceId?>).castToImpl<IOrientationSensorDeviceId,IOrientationSensorDeviceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorDeviceId?> =
        arrayOfNulls<IOrientationSensorDeviceId_Impl>(size) as Array<IOrientationSensorDeviceId?>
  }
}
