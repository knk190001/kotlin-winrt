package Windows.UI.Xaml.Media

import Windows.Foundation.Collections.IVectorView
import Windows.UI.Xaml.Controls.Primitives.Popup
import Windows.UI.Xaml.Window
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

@ABIMarker(IVisualTreeHelperStatics2.ABI::class)
@Signature("{07bcd176-869f-44a7-8797-2103a4c3e47a}")
@Guid("07bcd176869f44a787972103a4c3e47a")
@WinRTInterface("07bcd176869f44a787972103a4c3e47a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualTreeHelperStatics2.ByReference::class)
public interface IVisualTreeHelperStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetOpenPopups(window: Window?): IVectorView<Popup?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualTreeHelperStatics2> {
    public override fun getValue() = ABI.makeIVisualTreeHelperStatics2(pointer.getPointer(0))

    public fun setValue(value: IVisualTreeHelperStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualTreeHelperStatics2 {
    public val __1761590411_Ptr: Pointer?

    public val _1761590411_VtblPtr: Pointer?
      get() = __1761590411_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetOpenPopups(window: Window?): IVectorView<Popup?>? {
      val fnPtr = _1761590411_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Popup?>>()
      val hr = fn.invokeHR(arrayOf(__1761590411_Ptr, marshalToNative(window), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Popup?>>(result.getValue())
      return resultValue
    }
  }

  public class IVisualTreeHelperStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1761590411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualTreeHelperStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07bcd176869f44a787972103a4c3e47a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualTreeHelperStatics2(ptr: Pointer?): WithDefault =
        IVisualTreeHelperStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualTreeHelperStatics2 {
      val address = segment.toRawLongValue()
      return makeIVisualTreeHelperStatics2(Pointer(address))
    }

    public override fun toNative(obj: IVisualTreeHelperStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1761590411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualTreeHelperStatics2):
        Array<IVisualTreeHelperStatics2?> = (elements as
        Array<IVisualTreeHelperStatics2?>).castToImpl<IVisualTreeHelperStatics2,IVisualTreeHelperStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualTreeHelperStatics2?> =
        arrayOfNulls<IVisualTreeHelperStatics2_Impl>(size) as Array<IVisualTreeHelperStatics2?>
  }
}
