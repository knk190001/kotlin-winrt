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

@ABIMarker(IMenuFlyoutSeparatorFactory.ABI::class)
@Signature("{26156c9c-95ef-5e55-8342-773fc43baac3}")
@Guid("26156c9c95ef5e558342773fc43baac3")
@WinRTInterface("26156c9c95ef5e558342773fc43baac3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutSeparatorFactory.ByReference::class)
public interface IMenuFlyoutSeparatorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      MenuFlyoutSeparator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutSeparatorFactory> {
    public override fun getValue() = ABI.makeIMenuFlyoutSeparatorFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutSeparatorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutSeparatorFactory {
    public val __1180101178_Ptr: Pointer?

    public val _1180101178_VtblPtr: Pointer?
      get() = __1180101178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MenuFlyoutSeparator? {
      val fnPtr = _1180101178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyoutSeparator>()
      val hr = fn.invokeHR(arrayOf(__1180101178_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuFlyoutSeparator>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutSeparatorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1180101178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutSeparatorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26156c9c95ef5e558342773fc43baac3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutSeparatorFactory(ptr: Pointer?): WithDefault =
        IMenuFlyoutSeparatorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutSeparatorFactory {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutSeparatorFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutSeparatorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1180101178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutSeparatorFactory):
        Array<IMenuFlyoutSeparatorFactory?> = (elements as
        Array<IMenuFlyoutSeparatorFactory?>).castToImpl<IMenuFlyoutSeparatorFactory,IMenuFlyoutSeparatorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutSeparatorFactory?> =
        arrayOfNulls<IMenuFlyoutSeparatorFactory_Impl>(size) as Array<IMenuFlyoutSeparatorFactory?>
  }
}
