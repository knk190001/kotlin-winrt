package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IPickerFlyoutBaseFactory.ABI::class)
@Signature("{8231dab5-4b8b-5674-b273-1c66701c14e1}")
@Guid("8231dab54b8b5674b2731c66701c14e1")
@WinRTInterface("8231dab54b8b5674b2731c66701c14e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerFlyoutBaseFactory.ByReference::class)
public interface IPickerFlyoutBaseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PickerFlyoutBase?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerFlyoutBaseFactory> {
    public override fun getValue() = ABI.makeIPickerFlyoutBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IPickerFlyoutBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerFlyoutBaseFactory {
    public val __1739166111_Ptr: Pointer?

    public val _1739166111_VtblPtr: Pointer?
      get() = __1739166111_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PickerFlyoutBase? {
      val fnPtr = _1739166111_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PickerFlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1739166111_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PickerFlyoutBase>(result.getValue())
      return resultValue
    }
  }

  public class IPickerFlyoutBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1739166111_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerFlyoutBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8231dab54b8b5674b2731c66701c14e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerFlyoutBaseFactory(ptr: Pointer?): WithDefault =
        IPickerFlyoutBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerFlyoutBaseFactory {
      val address = segment.toRawLongValue()
      return makeIPickerFlyoutBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IPickerFlyoutBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1739166111_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerFlyoutBaseFactory):
        Array<IPickerFlyoutBaseFactory?> = (elements as
        Array<IPickerFlyoutBaseFactory?>).castToImpl<IPickerFlyoutBaseFactory,IPickerFlyoutBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerFlyoutBaseFactory?> =
        arrayOfNulls<IPickerFlyoutBaseFactory_Impl>(size) as Array<IPickerFlyoutBaseFactory?>
  }
}
