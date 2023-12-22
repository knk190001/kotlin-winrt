package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IDoubleAnimationStatics.ABI::class)
@Signature("{4e098387-adc6-5549-ad21-633e4fa244c2}")
@Guid("4e098387adc65549ad21633e4fa244c2")
@WinRTInterface("4e098387adc65549ad21633e4fa244c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDoubleAnimationStatics.ByReference::class)
public interface IDoubleAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FromProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ToProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ByProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_EasingFunctionProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_EnableDependentAnimationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDoubleAnimationStatics> {
    public override fun getValue() = ABI.makeIDoubleAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IDoubleAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDoubleAnimationStatics {
    public val __416410957_Ptr: Pointer?

    public val _416410957_VtblPtr: Pointer?
      get() = __416410957_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FromProperty(): DependencyProperty? {
      val fnPtr = _416410957_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__416410957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ToProperty(): DependencyProperty? {
      val fnPtr = _416410957_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__416410957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ByProperty(): DependencyProperty? {
      val fnPtr = _416410957_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__416410957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_EasingFunctionProperty(): DependencyProperty? {
      val fnPtr = _416410957_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__416410957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_EnableDependentAnimationProperty(): DependencyProperty? {
      val fnPtr = _416410957_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__416410957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDoubleAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __416410957_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDoubleAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e098387adc65549ad21633e4fa244c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDoubleAnimationStatics(ptr: Pointer?): WithDefault =
        IDoubleAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDoubleAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIDoubleAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDoubleAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__416410957_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDoubleAnimationStatics): Array<IDoubleAnimationStatics?>
        = (elements as
        Array<IDoubleAnimationStatics?>).castToImpl<IDoubleAnimationStatics,IDoubleAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDoubleAnimationStatics?> =
        arrayOfNulls<IDoubleAnimationStatics_Impl>(size) as Array<IDoubleAnimationStatics?>
  }
}
