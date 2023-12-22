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

@ABIMarker(IProximitySensorStatics.ABI::class)
@Signature("{29186649-6269-4e57-a5ad-82be80813392}")
@Guid("2918664962694e57a5ad82be80813392")
@WinRTInterface("2918664962694e57a5ad82be80813392")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProximitySensorStatics.ByReference::class)
public interface IProximitySensorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromId(sensorId: String?): ProximitySensor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProximitySensorStatics> {
    public override fun getValue() = ABI.makeIProximitySensorStatics(pointer.getPointer(0))

    public fun setValue(value: IProximitySensorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProximitySensorStatics {
    public val __97518248_Ptr: Pointer?

    public val _97518248_VtblPtr: Pointer?
      get() = __97518248_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _97518248_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__97518248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromId(sensorId: String?): ProximitySensor? {
      val fnPtr = _97518248_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProximitySensor>()
      val hr = fn.invokeHR(arrayOf(__97518248_Ptr, marshalToNative(sensorId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProximitySensor>(result.getValue())
      return resultValue
    }
  }

  public class IProximitySensorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97518248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProximitySensorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2918664962694e57a5ad82be80813392")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProximitySensorStatics(ptr: Pointer?): WithDefault =
        IProximitySensorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProximitySensorStatics {
      val address = segment.toRawLongValue()
      return makeIProximitySensorStatics(Pointer(address))
    }

    public override fun toNative(obj: IProximitySensorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97518248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProximitySensorStatics): Array<IProximitySensorStatics?>
        = (elements as
        Array<IProximitySensorStatics?>).castToImpl<IProximitySensorStatics,IProximitySensorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProximitySensorStatics?> =
        arrayOfNulls<IProximitySensorStatics_Impl>(size) as Array<IProximitySensorStatics?>
  }
}
