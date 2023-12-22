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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProximitySensorDataThresholdFactory.ABI::class)
@Signature("{905ac121-6d27-4ad3-9db5-6467f2a5ad9d}")
@Guid("905ac1216d274ad39db56467f2a5ad9d")
@WinRTInterface("905ac1216d274ad39db56467f2a5ad9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProximitySensorDataThresholdFactory.ByReference::class)
public interface IProximitySensorDataThresholdFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(sensor: ProximitySensor?): ProximitySensorDataThreshold?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProximitySensorDataThresholdFactory> {
    public override fun getValue() =
        ABI.makeIProximitySensorDataThresholdFactory(pointer.getPointer(0))

    public fun setValue(value: IProximitySensorDataThresholdFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProximitySensorDataThresholdFactory {
    public val __2071179062_Ptr: Pointer?

    public val _2071179062_VtblPtr: Pointer?
      get() = __2071179062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(sensor: ProximitySensor?): ProximitySensorDataThreshold? {
      val fnPtr = _2071179062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProximitySensorDataThreshold>()
      val hr = fn.invokeHR(arrayOf(__2071179062_Ptr, marshalToNative(sensor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProximitySensorDataThreshold>(result.getValue())
      return resultValue
    }
  }

  public class IProximitySensorDataThresholdFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2071179062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProximitySensorDataThresholdFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("905ac1216d274ad39db56467f2a5ad9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProximitySensorDataThresholdFactory(ptr: Pointer?): WithDefault =
        IProximitySensorDataThresholdFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProximitySensorDataThresholdFactory {
      val address = segment.toRawLongValue()
      return makeIProximitySensorDataThresholdFactory(Pointer(address))
    }

    public override fun toNative(obj: IProximitySensorDataThresholdFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2071179062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProximitySensorDataThresholdFactory):
        Array<IProximitySensorDataThresholdFactory?> = (elements as
        Array<IProximitySensorDataThresholdFactory?>).castToImpl<IProximitySensorDataThresholdFactory,IProximitySensorDataThresholdFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProximitySensorDataThresholdFactory?> =
        arrayOfNulls<IProximitySensorDataThresholdFactory_Impl>(size) as
        Array<IProximitySensorDataThresholdFactory?>
  }
}
