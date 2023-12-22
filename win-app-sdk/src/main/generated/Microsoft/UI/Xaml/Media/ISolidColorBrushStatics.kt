package Microsoft.UI.Xaml.Media

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

@ABIMarker(ISolidColorBrushStatics.ABI::class)
@Signature("{6bc16da0-c4e6-59b8-995b-b31e48424c07}")
@Guid("6bc16da0c4e659b8995bb31e48424c07")
@WinRTInterface("6bc16da0c4e659b8995bb31e48424c07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISolidColorBrushStatics.ByReference::class)
public interface ISolidColorBrushStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColorProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISolidColorBrushStatics> {
    public override fun getValue() = ABI.makeISolidColorBrushStatics(pointer.getPointer(0))

    public fun setValue(value: ISolidColorBrushStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISolidColorBrushStatics {
    public val __653952052_Ptr: Pointer?

    public val _653952052_VtblPtr: Pointer?
      get() = __653952052_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColorProperty(): DependencyProperty? {
      val fnPtr = _653952052_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__653952052_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISolidColorBrushStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653952052_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISolidColorBrushStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6bc16da0c4e659b8995bb31e48424c07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISolidColorBrushStatics(ptr: Pointer?): WithDefault =
        ISolidColorBrushStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISolidColorBrushStatics {
      val address = segment.toRawLongValue()
      return makeISolidColorBrushStatics(Pointer(address))
    }

    public override fun toNative(obj: ISolidColorBrushStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__653952052_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISolidColorBrushStatics): Array<ISolidColorBrushStatics?>
        = (elements as
        Array<ISolidColorBrushStatics?>).castToImpl<ISolidColorBrushStatics,ISolidColorBrushStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISolidColorBrushStatics?> =
        arrayOfNulls<ISolidColorBrushStatics_Impl>(size) as Array<ISolidColorBrushStatics?>
  }
}
