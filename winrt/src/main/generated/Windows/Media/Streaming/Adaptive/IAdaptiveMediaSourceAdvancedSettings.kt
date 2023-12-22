package Windows.Media.Streaming.Adaptive

import Windows.Foundation.IReference
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdaptiveMediaSourceAdvancedSettings.ABI::class)
@Signature("{55db1680-1aeb-47dc-aa08-9a11610ba45a}")
@Guid("55db16801aeb47dcaa089a11610ba45a")
@WinRTInterface("55db16801aeb47dcaa089a11610ba45a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceAdvancedSettings.ByReference::class)
public interface IAdaptiveMediaSourceAdvancedSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllSegmentsIndependent(): Boolean

  @InterfaceMethod(1)
  public fun put_AllSegmentsIndependent(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_DesiredBitrateHeadroomRatio(): IReference<Double>?

  @InterfaceMethod(3)
  public fun put_DesiredBitrateHeadroomRatio(value: IReference<Double>?): Unit

  @InterfaceMethod(4)
  public fun get_BitrateDowngradeTriggerRatio(): IReference<Double>?

  @InterfaceMethod(5)
  public fun put_BitrateDowngradeTriggerRatio(value: IReference<Double>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceAdvancedSettings> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceAdvancedSettings(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceAdvancedSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceAdvancedSettings {
    public val __1792189668_Ptr: Pointer?

    public val _1792189668_VtblPtr: Pointer?
      get() = __1792189668_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllSegmentsIndependent(): Boolean {
      val fnPtr = _1792189668_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1792189668_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllSegmentsIndependent(value: Boolean): Unit {
      val fnPtr = _1792189668_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1792189668_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DesiredBitrateHeadroomRatio(): IReference<Double>? {
      val fnPtr = _1792189668_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1792189668_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DesiredBitrateHeadroomRatio(value: IReference<Double>?): Unit {
      val fnPtr = _1792189668_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1792189668_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BitrateDowngradeTriggerRatio(): IReference<Double>? {
      val fnPtr = _1792189668_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__1792189668_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BitrateDowngradeTriggerRatio(value: IReference<Double>?): Unit {
      val fnPtr = _1792189668_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1792189668_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdaptiveMediaSourceAdvancedSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1792189668_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceAdvancedSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55db16801aeb47dcaa089a11610ba45a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceAdvancedSettings(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceAdvancedSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSourceAdvancedSettings {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceAdvancedSettings(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceAdvancedSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1792189668_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceAdvancedSettings):
        Array<IAdaptiveMediaSourceAdvancedSettings?> = (elements as
        Array<IAdaptiveMediaSourceAdvancedSettings?>).castToImpl<IAdaptiveMediaSourceAdvancedSettings,IAdaptiveMediaSourceAdvancedSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceAdvancedSettings?> =
        arrayOfNulls<IAdaptiveMediaSourceAdvancedSettings_Impl>(size) as
        Array<IAdaptiveMediaSourceAdvancedSettings?>
  }
}
