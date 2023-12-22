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

@ABIMarker(IInkToolbarEraserButtonStatics2.ABI::class)
@Signature("{038a1736-c5cd-4311-83f4-38cbf07c2066}")
@Guid("038a1736c5cd431183f438cbf07c2066")
@WinRTInterface("038a1736c5cd431183f438cbf07c2066")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarEraserButtonStatics2.ByReference::class)
public interface IInkToolbarEraserButtonStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsClearAllVisibleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarEraserButtonStatics2> {
    public override fun getValue() = ABI.makeIInkToolbarEraserButtonStatics2(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarEraserButtonStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarEraserButtonStatics2 {
    public val __44604548_Ptr: Pointer?

    public val _44604548_VtblPtr: Pointer?
      get() = __44604548_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsClearAllVisibleProperty(): DependencyProperty? {
      val fnPtr = _44604548_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__44604548_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarEraserButtonStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __44604548_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarEraserButtonStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("038a1736c5cd431183f438cbf07c2066")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarEraserButtonStatics2(ptr: Pointer?): WithDefault =
        IInkToolbarEraserButtonStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarEraserButtonStatics2 {
      val address = segment.toRawLongValue()
      return makeIInkToolbarEraserButtonStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarEraserButtonStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__44604548_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarEraserButtonStatics2):
        Array<IInkToolbarEraserButtonStatics2?> = (elements as
        Array<IInkToolbarEraserButtonStatics2?>).castToImpl<IInkToolbarEraserButtonStatics2,IInkToolbarEraserButtonStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarEraserButtonStatics2?> =
        arrayOfNulls<IInkToolbarEraserButtonStatics2_Impl>(size) as
        Array<IInkToolbarEraserButtonStatics2?>
  }
}
