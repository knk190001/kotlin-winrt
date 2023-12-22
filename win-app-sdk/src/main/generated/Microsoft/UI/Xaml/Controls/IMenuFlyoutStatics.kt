package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IMenuFlyoutStatics.ABI::class)
@Signature("{6959e683-16f6-5208-84e0-b0be92d9f6dd}")
@Guid("6959e68316f6520884e0b0be92d9f6dd")
@WinRTInterface("6959e68316f6520884e0b0be92d9f6dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutStatics.ByReference::class)
public interface IMenuFlyoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MenuFlyoutPresenterStyleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutStatics> {
    public override fun getValue() = ABI.makeIMenuFlyoutStatics(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutStatics {
    public val __691981500_Ptr: Pointer?

    public val _691981500_VtblPtr: Pointer?
      get() = __691981500_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MenuFlyoutPresenterStyleProperty(): DependencyProperty? {
      val fnPtr = _691981500_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__691981500_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __691981500_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6959e68316f6520884e0b0be92d9f6dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutStatics(ptr: Pointer?): WithDefault = IMenuFlyoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutStatics {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutStatics(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__691981500_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutStatics): Array<IMenuFlyoutStatics?> =
        (elements as
        Array<IMenuFlyoutStatics?>).castToImpl<IMenuFlyoutStatics,IMenuFlyoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutStatics?> =
        arrayOfNulls<IMenuFlyoutStatics_Impl>(size) as Array<IMenuFlyoutStatics?>
  }
}
