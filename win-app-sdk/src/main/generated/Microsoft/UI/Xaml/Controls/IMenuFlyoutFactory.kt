package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMenuFlyoutFactory.ABI::class)
@Signature("{a3d225de-6b35-5442-b6c9-06fd24139a63}")
@Guid("a3d225de6b355442b6c906fd24139a63")
@WinRTInterface("a3d225de6b355442b6c906fd24139a63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutFactory.ByReference::class)
public interface IMenuFlyoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MenuFlyout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutFactory> {
    public override fun getValue() = ABI.makeIMenuFlyoutFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutFactory {
    public val __113271945_Ptr: Pointer?

    public val _113271945_VtblPtr: Pointer?
      get() = __113271945_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MenuFlyout? {
      val fnPtr = _113271945_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyout>()
      val hr = fn.invokeHR(arrayOf(__113271945_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuFlyout>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __113271945_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3d225de6b355442b6c906fd24139a63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutFactory(ptr: Pointer?): WithDefault = IMenuFlyoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutFactory {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__113271945_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutFactory): Array<IMenuFlyoutFactory?> =
        (elements as
        Array<IMenuFlyoutFactory?>).castToImpl<IMenuFlyoutFactory,IMenuFlyoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutFactory?> =
        arrayOfNulls<IMenuFlyoutFactory_Impl>(size) as Array<IMenuFlyoutFactory?>
  }
}
