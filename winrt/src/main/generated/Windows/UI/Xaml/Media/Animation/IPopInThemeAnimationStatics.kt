package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IPopInThemeAnimationStatics.ABI::class)
@Signature("{efaa99d3-218a-4701-977f-f1bfae8ba649}")
@Guid("efaa99d3218a4701977ff1bfae8ba649")
@WinRTInterface("efaa99d3218a4701977ff1bfae8ba649")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopInThemeAnimationStatics.ByReference::class)
public interface IPopInThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FromHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FromVerticalOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPopInThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIPopInThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IPopInThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopInThemeAnimationStatics {
    public val __1512675238_Ptr: Pointer?

    public val _1512675238_VtblPtr: Pointer?
      get() = __1512675238_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _1512675238_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1512675238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FromHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1512675238_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1512675238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FromVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1512675238_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1512675238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPopInThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1512675238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopInThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efaa99d3218a4701977ff1bfae8ba649")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopInThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IPopInThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopInThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIPopInThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IPopInThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1512675238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopInThemeAnimationStatics):
        Array<IPopInThemeAnimationStatics?> = (elements as
        Array<IPopInThemeAnimationStatics?>).castToImpl<IPopInThemeAnimationStatics,IPopInThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopInThemeAnimationStatics?> =
        arrayOfNulls<IPopInThemeAnimationStatics_Impl>(size) as Array<IPopInThemeAnimationStatics?>
  }
}
