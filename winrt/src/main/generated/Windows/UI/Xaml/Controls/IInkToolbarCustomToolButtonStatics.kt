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

@ABIMarker(IInkToolbarCustomToolButtonStatics.ABI::class)
@Signature("{11fe4cb9-bbac-4314-9344-92c6693ddeaf}")
@Guid("11fe4cb9bbac4314934492c6693ddeaf")
@WinRTInterface("11fe4cb9bbac4314934492c6693ddeaf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarCustomToolButtonStatics.ByReference::class)
public interface IInkToolbarCustomToolButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConfigurationContentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarCustomToolButtonStatics> {
    public override fun getValue() =
        ABI.makeIInkToolbarCustomToolButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarCustomToolButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarCustomToolButtonStatics {
    public val __514765575_Ptr: Pointer?

    public val _514765575_VtblPtr: Pointer?
      get() = __514765575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConfigurationContentProperty(): DependencyProperty? {
      val fnPtr = _514765575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__514765575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarCustomToolButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __514765575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarCustomToolButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11fe4cb9bbac4314934492c6693ddeaf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarCustomToolButtonStatics(ptr: Pointer?): WithDefault =
        IInkToolbarCustomToolButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarCustomToolButtonStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarCustomToolButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarCustomToolButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__514765575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarCustomToolButtonStatics):
        Array<IInkToolbarCustomToolButtonStatics?> = (elements as
        Array<IInkToolbarCustomToolButtonStatics?>).castToImpl<IInkToolbarCustomToolButtonStatics,IInkToolbarCustomToolButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarCustomToolButtonStatics?> =
        arrayOfNulls<IInkToolbarCustomToolButtonStatics_Impl>(size) as
        Array<IInkToolbarCustomToolButtonStatics?>
  }
}
