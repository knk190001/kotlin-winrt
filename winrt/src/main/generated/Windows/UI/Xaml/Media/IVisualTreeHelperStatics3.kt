package Windows.UI.Xaml.Media

import Windows.Foundation.Collections.IVectorView
import Windows.UI.Xaml.Controls.Primitives.Popup
import Windows.UI.Xaml.XamlRoot
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

@ABIMarker(IVisualTreeHelperStatics3.ABI::class)
@Signature("{40420d50-ca16-57da-8aac-944c8af577fd}")
@Guid("40420d50ca1657da8aac944c8af577fd")
@WinRTInterface("40420d50ca1657da8aac944c8af577fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualTreeHelperStatics3.ByReference::class)
public interface IVisualTreeHelperStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetOpenPopupsForXamlRoot(xamlRoot: XamlRoot?): IVectorView<Popup?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualTreeHelperStatics3> {
    public override fun getValue() = ABI.makeIVisualTreeHelperStatics3(pointer.getPointer(0))

    public fun setValue(value: IVisualTreeHelperStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualTreeHelperStatics3 {
    public val __1761590410_Ptr: Pointer?

    public val _1761590410_VtblPtr: Pointer?
      get() = __1761590410_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetOpenPopupsForXamlRoot(xamlRoot: XamlRoot?): IVectorView<Popup?>? {
      val fnPtr = _1761590410_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Popup?>>()
      val hr = fn.invokeHR(arrayOf(__1761590410_Ptr, marshalToNative(xamlRoot), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Popup?>>(result.getValue())
      return resultValue
    }
  }

  public class IVisualTreeHelperStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1761590410_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualTreeHelperStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40420d50ca1657da8aac944c8af577fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualTreeHelperStatics3(ptr: Pointer?): WithDefault =
        IVisualTreeHelperStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualTreeHelperStatics3 {
      val address = segment.toRawLongValue()
      return makeIVisualTreeHelperStatics3(Pointer(address))
    }

    public override fun toNative(obj: IVisualTreeHelperStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1761590410_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualTreeHelperStatics3):
        Array<IVisualTreeHelperStatics3?> = (elements as
        Array<IVisualTreeHelperStatics3?>).castToImpl<IVisualTreeHelperStatics3,IVisualTreeHelperStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualTreeHelperStatics3?> =
        arrayOfNulls<IVisualTreeHelperStatics3_Impl>(size) as Array<IVisualTreeHelperStatics3?>
  }
}
