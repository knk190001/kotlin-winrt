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

@ABIMarker(IProgressBarTemplateSettings.ABI::class)
@Signature("{3fe2ea2a-e3f2-4c2b-9488-918d77d2bbe4}")
@Guid("3fe2ea2ae3f24c2b9488918d77d2bbe4")
@WinRTInterface("3fe2ea2ae3f24c2b9488918d77d2bbe4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressBarTemplateSettings.ByReference::class)
public interface IProgressBarTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EllipseDiameter(): Double

  @InterfaceMethod(1)
  public fun get_EllipseOffset(): Double

  @InterfaceMethod(2)
  public fun get_EllipseAnimationWellPosition(): Double

  @InterfaceMethod(3)
  public fun get_EllipseAnimationEndPosition(): Double

  @InterfaceMethod(4)
  public fun get_ContainerAnimationStartPosition(): Double

  @InterfaceMethod(5)
  public fun get_ContainerAnimationEndPosition(): Double

  @InterfaceMethod(6)
  public fun get_IndicatorLengthDelta(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressBarTemplateSettings> {
    public override fun getValue() = ABI.makeIProgressBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IProgressBarTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressBarTemplateSettings {
    public val __1218891047_Ptr: Pointer?

    public val _1218891047_VtblPtr: Pointer?
      get() = __1218891047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EllipseDiameter(): Double {
      val fnPtr = _1218891047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1218891047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EllipseOffset(): Double {
      val fnPtr = _1218891047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1218891047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_EllipseAnimationWellPosition(): Double {
      val fnPtr = _1218891047_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1218891047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_EllipseAnimationEndPosition(): Double {
      val fnPtr = _1218891047_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1218891047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ContainerAnimationStartPosition(): Double {
      val fnPtr = _1218891047_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1218891047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ContainerAnimationEndPosition(): Double {
      val fnPtr = _1218891047_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1218891047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IndicatorLengthDelta(): Double {
      val fnPtr = _1218891047_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1218891047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IProgressBarTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1218891047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressBarTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fe2ea2ae3f24c2b9488918d77d2bbe4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressBarTemplateSettings(ptr: Pointer?): WithDefault =
        IProgressBarTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressBarTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIProgressBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IProgressBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1218891047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressBarTemplateSettings):
        Array<IProgressBarTemplateSettings?> = (elements as
        Array<IProgressBarTemplateSettings?>).castToImpl<IProgressBarTemplateSettings,IProgressBarTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressBarTemplateSettings?> =
        arrayOfNulls<IProgressBarTemplateSettings_Impl>(size) as
        Array<IProgressBarTemplateSettings?>
  }
}
