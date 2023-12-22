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

@ABIMarker(IToggleSwitchTemplateSettings.ABI::class)
@Signature("{02b7bdcd-628a-4363-86e0-51d6e2e89e58}")
@Guid("02b7bdcd628a436386e051d6e2e89e58")
@WinRTInterface("02b7bdcd628a436386e051d6e2e89e58")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSwitchTemplateSettings.ByReference::class)
public interface IToggleSwitchTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KnobCurrentToOnOffset(): Double

  @InterfaceMethod(1)
  public fun get_KnobCurrentToOffOffset(): Double

  @InterfaceMethod(2)
  public fun get_KnobOnToOffOffset(): Double

  @InterfaceMethod(3)
  public fun get_KnobOffToOnOffset(): Double

  @InterfaceMethod(4)
  public fun get_CurtainCurrentToOnOffset(): Double

  @InterfaceMethod(5)
  public fun get_CurtainCurrentToOffOffset(): Double

  @InterfaceMethod(6)
  public fun get_CurtainOnToOffOffset(): Double

  @InterfaceMethod(7)
  public fun get_CurtainOffToOnOffset(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSwitchTemplateSettings> {
    public override fun getValue() = ABI.makeIToggleSwitchTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IToggleSwitchTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSwitchTemplateSettings {
    public val __1923711135_Ptr: Pointer?

    public val _1923711135_VtblPtr: Pointer?
      get() = __1923711135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KnobCurrentToOnOffset(): Double {
      val fnPtr = _1923711135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1923711135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_KnobCurrentToOffOffset(): Double {
      val fnPtr = _1923711135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1923711135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_KnobOnToOffOffset(): Double {
      val fnPtr = _1923711135_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1923711135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_KnobOffToOnOffset(): Double {
      val fnPtr = _1923711135_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1923711135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_CurtainCurrentToOnOffset(): Double {
      val fnPtr = _1923711135_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1923711135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_CurtainCurrentToOffOffset(): Double {
      val fnPtr = _1923711135_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1923711135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_CurtainOnToOffOffset(): Double {
      val fnPtr = _1923711135_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1923711135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_CurtainOffToOnOffset(): Double {
      val fnPtr = _1923711135_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1923711135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IToggleSwitchTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1923711135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSwitchTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02b7bdcd628a436386e051d6e2e89e58")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSwitchTemplateSettings(ptr: Pointer?): WithDefault =
        IToggleSwitchTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSwitchTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIToggleSwitchTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IToggleSwitchTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1923711135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSwitchTemplateSettings):
        Array<IToggleSwitchTemplateSettings?> = (elements as
        Array<IToggleSwitchTemplateSettings?>).castToImpl<IToggleSwitchTemplateSettings,IToggleSwitchTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSwitchTemplateSettings?> =
        arrayOfNulls<IToggleSwitchTemplateSettings_Impl>(size) as
        Array<IToggleSwitchTemplateSettings?>
  }
}
