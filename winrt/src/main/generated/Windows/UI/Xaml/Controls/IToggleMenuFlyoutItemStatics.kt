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

@ABIMarker(IToggleMenuFlyoutItemStatics.ABI::class)
@Signature("{16c724fb-6c1a-4852-9258-08c038367907}")
@Guid("16c724fb6c1a4852925808c038367907")
@WinRTInterface("16c724fb6c1a4852925808c038367907")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleMenuFlyoutItemStatics.ByReference::class)
public interface IToggleMenuFlyoutItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCheckedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleMenuFlyoutItemStatics> {
    public override fun getValue() = ABI.makeIToggleMenuFlyoutItemStatics(pointer.getPointer(0))

    public fun setValue(value: IToggleMenuFlyoutItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleMenuFlyoutItemStatics {
    public val __309832712_Ptr: Pointer?

    public val _309832712_VtblPtr: Pointer?
      get() = __309832712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCheckedProperty(): DependencyProperty? {
      val fnPtr = _309832712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__309832712_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IToggleMenuFlyoutItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __309832712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleMenuFlyoutItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16c724fb6c1a4852925808c038367907")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleMenuFlyoutItemStatics(ptr: Pointer?): WithDefault =
        IToggleMenuFlyoutItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleMenuFlyoutItemStatics {
      val address = segment.toRawLongValue()
      return makeIToggleMenuFlyoutItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IToggleMenuFlyoutItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__309832712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleMenuFlyoutItemStatics):
        Array<IToggleMenuFlyoutItemStatics?> = (elements as
        Array<IToggleMenuFlyoutItemStatics?>).castToImpl<IToggleMenuFlyoutItemStatics,IToggleMenuFlyoutItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleMenuFlyoutItemStatics?> =
        arrayOfNulls<IToggleMenuFlyoutItemStatics_Impl>(size) as
        Array<IToggleMenuFlyoutItemStatics?>
  }
}
