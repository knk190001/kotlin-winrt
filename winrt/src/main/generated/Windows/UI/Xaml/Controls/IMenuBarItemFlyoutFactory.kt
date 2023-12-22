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

@ABIMarker(IMenuBarItemFlyoutFactory.ABI::class)
@Signature("{1d24f9bd-bd19-5d95-b573-711f649fcbe9}")
@Guid("1d24f9bdbd195d95b573711f649fcbe9")
@WinRTInterface("1d24f9bdbd195d95b573711f649fcbe9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarItemFlyoutFactory.ByReference::class)
public interface IMenuBarItemFlyoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MenuBarItemFlyout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarItemFlyoutFactory> {
    public override fun getValue() = ABI.makeIMenuBarItemFlyoutFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuBarItemFlyoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarItemFlyoutFactory {
    public val __134021764_Ptr: Pointer?

    public val _134021764_VtblPtr: Pointer?
      get() = __134021764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MenuBarItemFlyout? {
      val fnPtr = _134021764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuBarItemFlyout>()
      val hr = fn.invokeHR(arrayOf(__134021764_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuBarItemFlyout>(result.getValue())
      return resultValue
    }
  }

  public class IMenuBarItemFlyoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __134021764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarItemFlyoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d24f9bdbd195d95b573711f649fcbe9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarItemFlyoutFactory(ptr: Pointer?): WithDefault =
        IMenuBarItemFlyoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarItemFlyoutFactory {
      val address = segment.toRawLongValue()
      return makeIMenuBarItemFlyoutFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarItemFlyoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__134021764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarItemFlyoutFactory):
        Array<IMenuBarItemFlyoutFactory?> = (elements as
        Array<IMenuBarItemFlyoutFactory?>).castToImpl<IMenuBarItemFlyoutFactory,IMenuBarItemFlyoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarItemFlyoutFactory?> =
        arrayOfNulls<IMenuBarItemFlyoutFactory_Impl>(size) as Array<IMenuBarItemFlyoutFactory?>
  }
}
