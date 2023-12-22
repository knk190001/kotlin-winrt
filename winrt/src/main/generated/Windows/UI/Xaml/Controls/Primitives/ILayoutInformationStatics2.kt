package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.Size
import Windows.UI.Xaml.UIElement
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

@ABIMarker(ILayoutInformationStatics2.ABI::class)
@Signature("{760315b5-6d4e-4939-ac61-639863cea36b}")
@Guid("760315b56d4e4939ac61639863cea36b")
@WinRTInterface("760315b56d4e4939ac61639863cea36b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayoutInformationStatics2.ByReference::class)
public interface ILayoutInformationStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAvailableSize(element: UIElement?): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILayoutInformationStatics2> {
    public override fun getValue() = ABI.makeILayoutInformationStatics2(pointer.getPointer(0))

    public fun setValue(value: ILayoutInformationStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayoutInformationStatics2 {
    public val __1550982285_Ptr: Pointer?

    public val _1550982285_VtblPtr: Pointer?
      get() = __1550982285_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAvailableSize(element: UIElement?): Size? {
      val fnPtr = _1550982285_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1550982285_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class ILayoutInformationStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1550982285_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayoutInformationStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("760315b56d4e4939ac61639863cea36b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayoutInformationStatics2(ptr: Pointer?): WithDefault =
        ILayoutInformationStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayoutInformationStatics2 {
      val address = segment.toRawLongValue()
      return makeILayoutInformationStatics2(Pointer(address))
    }

    public override fun toNative(obj: ILayoutInformationStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1550982285_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayoutInformationStatics2):
        Array<ILayoutInformationStatics2?> = (elements as
        Array<ILayoutInformationStatics2?>).castToImpl<ILayoutInformationStatics2,ILayoutInformationStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayoutInformationStatics2?> =
        arrayOfNulls<ILayoutInformationStatics2_Impl>(size) as Array<ILayoutInformationStatics2?>
  }
}
