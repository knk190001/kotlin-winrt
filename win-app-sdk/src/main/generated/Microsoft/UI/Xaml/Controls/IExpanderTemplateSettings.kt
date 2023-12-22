package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IExpanderTemplateSettings.ABI::class)
@Signature("{8f959018-f6b8-5c02-be08-cd196c9fcd2d}")
@Guid("8f959018f6b85c02be08cd196c9fcd2d")
@WinRTInterface("8f959018f6b85c02be08cd196c9fcd2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpanderTemplateSettings.ByReference::class)
public interface IExpanderTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentHeight(): Double

  @InterfaceMethod(1)
  public fun get_NegativeContentHeight(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpanderTemplateSettings> {
    public override fun getValue() = ABI.makeIExpanderTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IExpanderTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpanderTemplateSettings {
    public val __1015610987_Ptr: Pointer?

    public val _1015610987_VtblPtr: Pointer?
      get() = __1015610987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentHeight(): Double {
      val fnPtr = _1015610987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1015610987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_NegativeContentHeight(): Double {
      val fnPtr = _1015610987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1015610987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IExpanderTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1015610987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpanderTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f959018f6b85c02be08cd196c9fcd2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpanderTemplateSettings(ptr: Pointer?): WithDefault =
        IExpanderTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpanderTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIExpanderTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IExpanderTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1015610987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpanderTemplateSettings):
        Array<IExpanderTemplateSettings?> = (elements as
        Array<IExpanderTemplateSettings?>).castToImpl<IExpanderTemplateSettings,IExpanderTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpanderTemplateSettings?> =
        arrayOfNulls<IExpanderTemplateSettings_Impl>(size) as Array<IExpanderTemplateSettings?>
  }
}
