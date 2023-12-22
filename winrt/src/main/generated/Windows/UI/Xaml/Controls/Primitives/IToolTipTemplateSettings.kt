package Windows.UI.Xaml.Controls.Primitives

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToolTipTemplateSettings.ABI::class)
@Signature("{d4388247-0ec4-4506-affd-afac2225b48c}")
@Guid("d43882470ec44506affdafac2225b48c")
@WinRTInterface("d43882470ec44506affdafac2225b48c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToolTipTemplateSettings.ByReference::class)
public interface IToolTipTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FromHorizontalOffset(): Double

  @InterfaceMethod(1)
  public fun get_FromVerticalOffset(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToolTipTemplateSettings> {
    public override fun getValue() = ABI.makeIToolTipTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IToolTipTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToolTipTemplateSettings {
    public val __33031780_Ptr: Pointer?

    public val _33031780_VtblPtr: Pointer?
      get() = __33031780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FromHorizontalOffset(): Double {
      val fnPtr = _33031780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__33031780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_FromVerticalOffset(): Double {
      val fnPtr = _33031780_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__33031780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IToolTipTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __33031780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToolTipTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d43882470ec44506affdafac2225b48c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToolTipTemplateSettings(ptr: Pointer?): WithDefault =
        IToolTipTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToolTipTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIToolTipTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IToolTipTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__33031780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToolTipTemplateSettings):
        Array<IToolTipTemplateSettings?> = (elements as
        Array<IToolTipTemplateSettings?>).castToImpl<IToolTipTemplateSettings,IToolTipTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToolTipTemplateSettings?> =
        arrayOfNulls<IToolTipTemplateSettings_Impl>(size) as Array<IToolTipTemplateSettings?>
  }
}
