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

@ABIMarker(IMenuBarItemFactory.ABI::class)
@Signature("{87d02172-83cb-5459-940f-173f7501b300}")
@Guid("87d0217283cb5459940f173f7501b300")
@WinRTInterface("87d0217283cb5459940f173f7501b300")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarItemFactory.ByReference::class)
public interface IMenuBarItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MenuBarItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarItemFactory> {
    public override fun getValue() = ABI.makeIMenuBarItemFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuBarItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarItemFactory {
    public val __1355304362_Ptr: Pointer?

    public val _1355304362_VtblPtr: Pointer?
      get() = __1355304362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MenuBarItem? {
      val fnPtr = _1355304362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuBarItem>()
      val hr = fn.invokeHR(arrayOf(__1355304362_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuBarItem>(result.getValue())
      return resultValue
    }
  }

  public class IMenuBarItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1355304362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87d0217283cb5459940f173f7501b300")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarItemFactory(ptr: Pointer?): WithDefault = IMenuBarItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarItemFactory {
      val address = segment.toRawLongValue()
      return makeIMenuBarItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1355304362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarItemFactory): Array<IMenuBarItemFactory?> =
        (elements as
        Array<IMenuBarItemFactory?>).castToImpl<IMenuBarItemFactory,IMenuBarItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarItemFactory?> =
        arrayOfNulls<IMenuBarItemFactory_Impl>(size) as Array<IMenuBarItemFactory?>
  }
}
