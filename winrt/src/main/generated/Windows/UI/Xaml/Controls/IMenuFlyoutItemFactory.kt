package Windows.UI.Xaml.Controls

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

@ABIMarker(IMenuFlyoutItemFactory.ABI::class)
@Signature("{c5aa39e2-44f3-455e-9c5b-62bb6afce3ad}")
@Guid("c5aa39e244f3455e9c5b62bb6afce3ad")
@WinRTInterface("c5aa39e244f3455e9c5b62bb6afce3ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItemFactory.ByReference::class)
public interface IMenuFlyoutItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MenuFlyoutItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItemFactory> {
    public override fun getValue() = ABI.makeIMenuFlyoutItemFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItemFactory {
    public val __443627711_Ptr: Pointer?

    public val _443627711_VtblPtr: Pointer?
      get() = __443627711_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MenuFlyoutItem? {
      val fnPtr = _443627711_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyoutItem>()
      val hr = fn.invokeHR(arrayOf(__443627711_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuFlyoutItem>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __443627711_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5aa39e244f3455e9c5b62bb6afce3ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemFactory(ptr: Pointer?): WithDefault =
        IMenuFlyoutItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemFactory {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__443627711_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemFactory): Array<IMenuFlyoutItemFactory?> =
        (elements as
        Array<IMenuFlyoutItemFactory?>).castToImpl<IMenuFlyoutItemFactory,IMenuFlyoutItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemFactory?> =
        arrayOfNulls<IMenuFlyoutItemFactory_Impl>(size) as Array<IMenuFlyoutItemFactory?>
  }
}
