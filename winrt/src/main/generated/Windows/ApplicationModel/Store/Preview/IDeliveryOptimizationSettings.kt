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

@ABIMarker(IDeliveryOptimizationSettings.ABI::class)
@Signature("{1810fda0-e853-565e-b874-7a8a7b9a0e0f}")
@Guid("1810fda0e853565eb8747a8a7b9a0e0f")
@WinRTInterface("1810fda0e853565eb8747a8a7b9a0e0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeliveryOptimizationSettings.ByReference::class)
public interface IDeliveryOptimizationSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DownloadMode(): DeliveryOptimizationDownloadMode?

  @InterfaceMethod(1)
  public fun get_DownloadModeSource(): DeliveryOptimizationDownloadModeSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeliveryOptimizationSettings> {
    public override fun getValue() = ABI.makeIDeliveryOptimizationSettings(pointer.getPointer(0))

    public fun setValue(value: IDeliveryOptimizationSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeliveryOptimizationSettings {
    public val __1075894724_Ptr: Pointer?

    public val _1075894724_VtblPtr: Pointer?
      get() = __1075894724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DownloadMode(): DeliveryOptimizationDownloadMode? {
      val fnPtr = _1075894724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeliveryOptimizationDownloadMode>()
      val hr = fn.invokeHR(arrayOf(__1075894724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeliveryOptimizationDownloadMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DownloadModeSource(): DeliveryOptimizationDownloadModeSource? {
      val fnPtr = _1075894724_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeliveryOptimizationDownloadModeSource>()
      val hr = fn.invokeHR(arrayOf(__1075894724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeliveryOptimizationDownloadModeSource>(result.getValue())
      return resultValue
    }
  }

  public class IDeliveryOptimizationSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075894724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeliveryOptimizationSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1810fda0e853565eb8747a8a7b9a0e0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeliveryOptimizationSettings(ptr: Pointer?): WithDefault =
        IDeliveryOptimizationSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeliveryOptimizationSettings {
      val address = segment.toRawLongValue()
      return makeIDeliveryOptimizationSettings(Pointer(address))
    }

    public override fun toNative(obj: IDeliveryOptimizationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075894724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeliveryOptimizationSettings):
        Array<IDeliveryOptimizationSettings?> = (elements as
        Array<IDeliveryOptimizationSettings?>).castToImpl<IDeliveryOptimizationSettings,IDeliveryOptimizationSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeliveryOptimizationSettings?> =
        arrayOfNulls<IDeliveryOptimizationSettings_Impl>(size) as
        Array<IDeliveryOptimizationSettings?>
  }
}
