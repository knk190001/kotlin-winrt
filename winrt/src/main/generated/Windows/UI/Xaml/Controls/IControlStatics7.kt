package Windows.UI.Xaml.Controls

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

@ABIMarker(IControlStatics7.ABI::class)
@Signature("{aee1ca45-c910-5dab-a266-fdf50c0bedd2}")
@Guid("aee1ca45c9105daba266fdf50c0bedd2")
@WinRTInterface("aee1ca45c9105daba266fdf50c0bedd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlStatics7.ByReference::class)
public interface IControlStatics7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizingProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CornerRadiusProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlStatics7> {
    public override fun getValue() = ABI.makeIControlStatics7(pointer.getPointer(0))

    public fun setValue(value: IControlStatics7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlStatics7 {
    public val __2067758579_Ptr: Pointer?

    public val _2067758579_VtblPtr: Pointer?
      get() = __2067758579_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizingProperty(): DependencyProperty? {
      val fnPtr = _2067758579_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _2067758579_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2067758579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IControlStatics7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067758579_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlStatics7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aee1ca45c9105daba266fdf50c0bedd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlStatics7(ptr: Pointer?): WithDefault = IControlStatics7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlStatics7 {
      val address = segment.toRawLongValue()
      return makeIControlStatics7(Pointer(address))
    }

    public override fun toNative(obj: IControlStatics7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067758579_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlStatics7): Array<IControlStatics7?> = (elements as
        Array<IControlStatics7?>).castToImpl<IControlStatics7,IControlStatics7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlStatics7?> =
        arrayOfNulls<IControlStatics7_Impl>(size) as Array<IControlStatics7?>
  }
}
