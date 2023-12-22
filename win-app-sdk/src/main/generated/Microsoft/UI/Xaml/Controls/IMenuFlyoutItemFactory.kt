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

@ABIMarker(IMenuFlyoutItemFactory.ABI::class)
@Signature("{9c3c9a1f-89af-521a-81a5-8a01db7a79af}")
@Guid("9c3c9a1f89af521a81a58a01db7a79af")
@WinRTInterface("9c3c9a1f89af521a81a58a01db7a79af")
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
    public val __904290698_Ptr: Pointer?

    public val _904290698_VtblPtr: Pointer?
      get() = __904290698_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MenuFlyoutItem? {
      val fnPtr = _904290698_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyoutItem>()
      val hr = fn.invokeHR(arrayOf(__904290698_Ptr, marshalToNative(baseInterface),
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
    public override val __904290698_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c3c9a1f89af521a81a58a01db7a79af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemFactory(ptr: Pointer?): WithDefault =
        IMenuFlyoutItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemFactory {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__904290698_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemFactory): Array<IMenuFlyoutItemFactory?> =
        (elements as
        Array<IMenuFlyoutItemFactory?>).castToImpl<IMenuFlyoutItemFactory,IMenuFlyoutItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemFactory?> =
        arrayOfNulls<IMenuFlyoutItemFactory_Impl>(size) as Array<IMenuFlyoutItemFactory?>
  }
}
