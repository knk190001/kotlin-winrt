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

@ABIMarker(ILightSensorDeviceId.ABI::class)
@Signature("{7fee49f8-0afb-4f51-87f0-6c26375ce94f}")
@Guid("7fee49f80afb4f5187f06c26375ce94f")
@WinRTInterface("7fee49f80afb4f5187f06c26375ce94f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILightSensorDeviceId.ByReference::class)
public interface ILightSensorDeviceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILightSensorDeviceId> {
    public override fun getValue() = ABI.makeILightSensorDeviceId(pointer.getPointer(0))

    public fun setValue(value: ILightSensorDeviceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILightSensorDeviceId {
    public val __1401903413_Ptr: Pointer?

    public val _1401903413_VtblPtr: Pointer?
      get() = __1401903413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1401903413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1401903413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILightSensorDeviceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1401903413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILightSensorDeviceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7fee49f80afb4f5187f06c26375ce94f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILightSensorDeviceId(ptr: Pointer?): WithDefault = ILightSensorDeviceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILightSensorDeviceId {
      val address = segment.toRawLongValue()
      return makeILightSensorDeviceId(Pointer(address))
    }

    public override fun toNative(obj: ILightSensorDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1401903413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILightSensorDeviceId): Array<ILightSensorDeviceId?> =
        (elements as
        Array<ILightSensorDeviceId?>).castToImpl<ILightSensorDeviceId,ILightSensorDeviceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILightSensorDeviceId?> =
        arrayOfNulls<ILightSensorDeviceId_Impl>(size) as Array<ILightSensorDeviceId?>
  }
}
