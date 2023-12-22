package Windows.Devices.Bluetooth.Background

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(IGattServiceProviderConnectionStatics.ABI::class)
@Signature("{3d509f4b-0b0e-4466-b8cd-6ebdda1fa17d}")
@Guid("3d509f4b0b0e4466b8cd6ebdda1fa17d")
@WinRTInterface("3d509f4b0b0e4466b8cd6ebdda1fa17d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceProviderConnectionStatics.ByReference::class)
public interface IGattServiceProviderConnectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllServices(): IMapView<String?, GattServiceProviderConnection?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceProviderConnectionStatics> {
    public override fun getValue() =
        ABI.makeIGattServiceProviderConnectionStatics(pointer.getPointer(0))

    public fun setValue(value: IGattServiceProviderConnectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceProviderConnectionStatics {
    public val __395119078_Ptr: Pointer?

    public val _395119078_VtblPtr: Pointer?
      get() = __395119078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllServices(): IMapView<String?, GattServiceProviderConnection?>? {
      val fnPtr = _395119078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, GattServiceProviderConnection?>>()
      val hr = fn.invokeHR(arrayOf(__395119078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          GattServiceProviderConnection?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattServiceProviderConnectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __395119078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceProviderConnectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d509f4b0b0e4466b8cd6ebdda1fa17d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceProviderConnectionStatics(ptr: Pointer?): WithDefault =
        IGattServiceProviderConnectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceProviderConnectionStatics {
      val address = segment.toRawLongValue()
      return makeIGattServiceProviderConnectionStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceProviderConnectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__395119078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceProviderConnectionStatics):
        Array<IGattServiceProviderConnectionStatics?> = (elements as
        Array<IGattServiceProviderConnectionStatics?>).castToImpl<IGattServiceProviderConnectionStatics,IGattServiceProviderConnectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceProviderConnectionStatics?> =
        arrayOfNulls<IGattServiceProviderConnectionStatics_Impl>(size) as
        Array<IGattServiceProviderConnectionStatics?>
  }
}
