package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Thickness
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

@ABIMarker(IProgressRingTemplateSettings.ABI::class)
@Signature("{b9b675ec-c723-42e6-83e9-9826272bdc0e}")
@Guid("b9b675ecc72342e683e99826272bdc0e")
@WinRTInterface("b9b675ecc72342e683e99826272bdc0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressRingTemplateSettings.ByReference::class)
public interface IProgressRingTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EllipseDiameter(): Double

  @InterfaceMethod(1)
  public fun get_EllipseOffset(): Thickness?

  @InterfaceMethod(2)
  public fun get_MaxSideLength(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressRingTemplateSettings> {
    public override fun getValue() = ABI.makeIProgressRingTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IProgressRingTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressRingTemplateSettings {
    public val __2031392842_Ptr: Pointer?

    public val _2031392842_VtblPtr: Pointer?
      get() = __2031392842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EllipseDiameter(): Double {
      val fnPtr = _2031392842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2031392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EllipseOffset(): Thickness? {
      val fnPtr = _2031392842_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__2031392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaxSideLength(): Double {
      val fnPtr = _2031392842_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2031392842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IProgressRingTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2031392842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressRingTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9b675ecc72342e683e99826272bdc0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressRingTemplateSettings(ptr: Pointer?): WithDefault =
        IProgressRingTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressRingTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIProgressRingTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IProgressRingTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2031392842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressRingTemplateSettings):
        Array<IProgressRingTemplateSettings?> = (elements as
        Array<IProgressRingTemplateSettings?>).castToImpl<IProgressRingTemplateSettings,IProgressRingTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressRingTemplateSettings?> =
        arrayOfNulls<IProgressRingTemplateSettings_Impl>(size) as
        Array<IProgressRingTemplateSettings?>
  }
}
