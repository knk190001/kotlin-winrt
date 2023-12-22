package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(IDeliveryOptimizationSettingsStatics.ABI::class)
@Signature("{5c817caf-aed5-5999-b4c9-8c60898bc4f3}")
@Guid("5c817cafaed55999b4c98c60898bc4f3")
@WinRTInterface("5c817cafaed55999b4c98c60898bc4f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeliveryOptimizationSettingsStatics.ByReference::class)
public interface IDeliveryOptimizationSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentSettings(): DeliveryOptimizationSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeliveryOptimizationSettingsStatics> {
    public override fun getValue() =
        ABI.makeIDeliveryOptimizationSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IDeliveryOptimizationSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeliveryOptimizationSettingsStatics {
    public val __785724905_Ptr: Pointer?

    public val _785724905_VtblPtr: Pointer?
      get() = __785724905_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentSettings(): DeliveryOptimizationSettings? {
      val fnPtr = _785724905_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeliveryOptimizationSettings>()
      val hr = fn.invokeHR(arrayOf(__785724905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeliveryOptimizationSettings>(result.getValue())
      return resultValue
    }
  }

  public class IDeliveryOptimizationSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __785724905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeliveryOptimizationSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c817cafaed55999b4c98c60898bc4f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeliveryOptimizationSettingsStatics(ptr: Pointer?): WithDefault =
        IDeliveryOptimizationSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeliveryOptimizationSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIDeliveryOptimizationSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IDeliveryOptimizationSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__785724905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeliveryOptimizationSettingsStatics):
        Array<IDeliveryOptimizationSettingsStatics?> = (elements as
        Array<IDeliveryOptimizationSettingsStatics?>).castToImpl<IDeliveryOptimizationSettingsStatics,IDeliveryOptimizationSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeliveryOptimizationSettingsStatics?> =
        arrayOfNulls<IDeliveryOptimizationSettingsStatics_Impl>(size) as
        Array<IDeliveryOptimizationSettingsStatics?>
  }
}
