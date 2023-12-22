package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IColorSpectrumStatics.ABI::class)
@Signature("{906bee7c-2cee-4e90-968b-f0a5bd691b4a}")
@Guid("906bee7c2cee4e90968bf0a5bd691b4a")
@WinRTInterface("906bee7c2cee4e90968bf0a5bd691b4a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorSpectrumStatics.ByReference::class)
public interface IColorSpectrumStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColorProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HsvColorProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MinHueProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_MaxHueProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_MinSaturationProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_MaxSaturationProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_MinValueProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_MaxValueProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_ShapeProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_ComponentsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorSpectrumStatics> {
    public override fun getValue() = ABI.makeIColorSpectrumStatics(pointer.getPointer(0))

    public fun setValue(value: IColorSpectrumStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorSpectrumStatics {
    public val __226393517_Ptr: Pointer?

    public val _226393517_VtblPtr: Pointer?
      get() = __226393517_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColorProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HsvColorProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinHueProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MaxHueProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MinSaturationProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MaxSaturationProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MinValueProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MaxValueProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ShapeProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ComponentsProperty(): DependencyProperty? {
      val fnPtr = _226393517_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__226393517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IColorSpectrumStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __226393517_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorSpectrumStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("906bee7c2cee4e90968bf0a5bd691b4a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorSpectrumStatics(ptr: Pointer?): WithDefault =
        IColorSpectrumStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorSpectrumStatics {
      val address = segment.toRawLongValue()
      return makeIColorSpectrumStatics(Pointer(address))
    }

    public override fun toNative(obj: IColorSpectrumStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__226393517_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorSpectrumStatics): Array<IColorSpectrumStatics?> =
        (elements as
        Array<IColorSpectrumStatics?>).castToImpl<IColorSpectrumStatics,IColorSpectrumStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorSpectrumStatics?> =
        arrayOfNulls<IColorSpectrumStatics_Impl>(size) as Array<IColorSpectrumStatics?>
  }
}
