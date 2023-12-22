package Windows.Networking.Proximity

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

@ABIMarker(IProximityDeviceStatics.ABI::class)
@Signature("{914ba01d-f6e1-47c4-a14c-148a1903d0c6}")
@Guid("914ba01df6e147c4a14c148a1903d0c6")
@WinRTInterface("914ba01df6e147c4a14c148a1903d0c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProximityDeviceStatics.ByReference::class)
public interface IProximityDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun GetDefault(): ProximityDevice?

  @InterfaceMethod(2)
  public fun FromId(deviceId: String?): ProximityDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProximityDeviceStatics> {
    public override fun getValue() = ABI.makeIProximityDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IProximityDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProximityDeviceStatics {
    public val __1811365705_Ptr: Pointer?

    public val _1811365705_VtblPtr: Pointer?
      get() = __1811365705_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1811365705_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1811365705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefault(): ProximityDevice? {
      val fnPtr = _1811365705_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProximityDevice>()
      val hr = fn.invokeHR(arrayOf(__1811365705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProximityDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromId(deviceId: String?): ProximityDevice? {
      val fnPtr = _1811365705_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProximityDevice>()
      val hr = fn.invokeHR(arrayOf(__1811365705_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProximityDevice>(result.getValue())
      return resultValue
    }
  }

  public class IProximityDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1811365705_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProximityDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("914ba01df6e147c4a14c148a1903d0c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProximityDeviceStatics(ptr: Pointer?): WithDefault =
        IProximityDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProximityDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIProximityDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IProximityDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1811365705_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProximityDeviceStatics): Array<IProximityDeviceStatics?>
        = (elements as
        Array<IProximityDeviceStatics?>).castToImpl<IProximityDeviceStatics,IProximityDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProximityDeviceStatics?> =
        arrayOfNulls<IProximityDeviceStatics_Impl>(size) as Array<IProximityDeviceStatics?>
  }
}
