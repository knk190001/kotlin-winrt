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

@ABIMarker(IEasingFunctionBaseStatics.ABI::class)
@Signature("{09032445-967c-52b8-b712-15f066b32821}")
@Guid("09032445967c52b8b71215f066b32821")
@WinRTInterface("09032445967c52b8b71215f066b32821")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasingFunctionBaseStatics.ByReference::class)
public interface IEasingFunctionBaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EasingModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasingFunctionBaseStatics> {
    public override fun getValue() = ABI.makeIEasingFunctionBaseStatics(pointer.getPointer(0))

    public fun setValue(value: IEasingFunctionBaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasingFunctionBaseStatics {
    public val __767053834_Ptr: Pointer?

    public val _767053834_VtblPtr: Pointer?
      get() = __767053834_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EasingModeProperty(): DependencyProperty? {
      val fnPtr = _767053834_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__767053834_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IEasingFunctionBaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __767053834_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasingFunctionBaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09032445967c52b8b71215f066b32821")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasingFunctionBaseStatics(ptr: Pointer?): WithDefault =
        IEasingFunctionBaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasingFunctionBaseStatics {
      val address = segment.toRawLongValue()
      return makeIEasingFunctionBaseStatics(Pointer(address))
    }

    public override fun toNative(obj: IEasingFunctionBaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__767053834_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasingFunctionBaseStatics):
        Array<IEasingFunctionBaseStatics?> = (elements as
        Array<IEasingFunctionBaseStatics?>).castToImpl<IEasingFunctionBaseStatics,IEasingFunctionBaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasingFunctionBaseStatics?> =
        arrayOfNulls<IEasingFunctionBaseStatics_Impl>(size) as Array<IEasingFunctionBaseStatics?>
  }
}
