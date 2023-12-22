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

@ABIMarker(IRadioMenuFlyoutItemFactory.ABI::class)
@Signature("{113822d2-35a3-5b0d-9d0d-c3830ec1973b}")
@Guid("113822d235a35b0d9d0dc3830ec1973b")
@WinRTInterface("113822d235a35b0d9d0dc3830ec1973b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioMenuFlyoutItemFactory.ByReference::class)
public interface IRadioMenuFlyoutItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      RadioMenuFlyoutItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioMenuFlyoutItemFactory> {
    public override fun getValue() = ABI.makeIRadioMenuFlyoutItemFactory(pointer.getPointer(0))

    public fun setValue(value: IRadioMenuFlyoutItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioMenuFlyoutItemFactory {
    public val __343270313_Ptr: Pointer?

    public val _343270313_VtblPtr: Pointer?
      get() = __343270313_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RadioMenuFlyoutItem? {
      val fnPtr = _343270313_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadioMenuFlyoutItem>()
      val hr = fn.invokeHR(arrayOf(__343270313_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadioMenuFlyoutItem>(result.getValue())
      return resultValue
    }
  }

  public class IRadioMenuFlyoutItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __343270313_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioMenuFlyoutItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("113822d235a35b0d9d0dc3830ec1973b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioMenuFlyoutItemFactory(ptr: Pointer?): WithDefault =
        IRadioMenuFlyoutItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioMenuFlyoutItemFactory {
      val address = segment.toRawLongValue()
      return makeIRadioMenuFlyoutItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IRadioMenuFlyoutItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__343270313_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioMenuFlyoutItemFactory):
        Array<IRadioMenuFlyoutItemFactory?> = (elements as
        Array<IRadioMenuFlyoutItemFactory?>).castToImpl<IRadioMenuFlyoutItemFactory,IRadioMenuFlyoutItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioMenuFlyoutItemFactory?> =
        arrayOfNulls<IRadioMenuFlyoutItemFactory_Impl>(size) as Array<IRadioMenuFlyoutItemFactory?>
  }
}
