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

@ABIMarker(IMagnetometerDeviceId.ABI::class)
@Signature("{58b498c2-7e4b-404c-9fc5-5de8b40ebae3}")
@Guid("58b498c27e4b404c9fc55de8b40ebae3")
@WinRTInterface("58b498c27e4b404c9fc55de8b40ebae3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagnetometerDeviceId.ByReference::class)
public interface IMagnetometerDeviceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagnetometerDeviceId> {
    public override fun getValue() = ABI.makeIMagnetometerDeviceId(pointer.getPointer(0))

    public fun setValue(value: IMagnetometerDeviceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagnetometerDeviceId {
    public val __1492300159_Ptr: Pointer?

    public val _1492300159_VtblPtr: Pointer?
      get() = __1492300159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1492300159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1492300159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMagnetometerDeviceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1492300159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagnetometerDeviceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58b498c27e4b404c9fc55de8b40ebae3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagnetometerDeviceId(ptr: Pointer?): WithDefault =
        IMagnetometerDeviceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagnetometerDeviceId {
      val address = segment.toRawLongValue()
      return makeIMagnetometerDeviceId(Pointer(address))
    }

    public override fun toNative(obj: IMagnetometerDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1492300159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagnetometerDeviceId): Array<IMagnetometerDeviceId?> =
        (elements as
        Array<IMagnetometerDeviceId?>).castToImpl<IMagnetometerDeviceId,IMagnetometerDeviceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagnetometerDeviceId?> =
        arrayOfNulls<IMagnetometerDeviceId_Impl>(size) as Array<IMagnetometerDeviceId?>
  }
}
