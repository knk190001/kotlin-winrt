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

@ABIMarker(IAppBarToggleButtonTemplateSettings.ABI::class)
@Signature("{aaf99c48-d8f4-40d9-9fa3-3a64f0fec5d8}")
@Guid("aaf99c48d8f440d99fa33a64f0fec5d8")
@WinRTInterface("aaf99c48d8f440d99fa33a64f0fec5d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButtonTemplateSettings.ByReference::class)
public interface IAppBarToggleButtonTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAcceleratorTextMinWidth(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButtonTemplateSettings> {
    public override fun getValue() =
        ABI.makeIAppBarToggleButtonTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButtonTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButtonTemplateSettings {
    public val __944840113_Ptr: Pointer?

    public val _944840113_VtblPtr: Pointer?
      get() = __944840113_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAcceleratorTextMinWidth(): Double {
      val fnPtr = _944840113_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__944840113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBarToggleButtonTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __944840113_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButtonTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aaf99c48d8f440d99fa33a64f0fec5d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButtonTemplateSettings(ptr: Pointer?): WithDefault =
        IAppBarToggleButtonTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButtonTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButtonTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButtonTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__944840113_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButtonTemplateSettings):
        Array<IAppBarToggleButtonTemplateSettings?> = (elements as
        Array<IAppBarToggleButtonTemplateSettings?>).castToImpl<IAppBarToggleButtonTemplateSettings,IAppBarToggleButtonTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButtonTemplateSettings?> =
        arrayOfNulls<IAppBarToggleButtonTemplateSettings_Impl>(size) as
        Array<IAppBarToggleButtonTemplateSettings?>
  }
}
