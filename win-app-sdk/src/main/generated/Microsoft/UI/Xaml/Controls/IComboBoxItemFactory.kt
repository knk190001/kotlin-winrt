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

@ABIMarker(IComboBoxItemFactory.ABI::class)
@Signature("{8540b906-c96b-592d-88d7-0c23a3386d93}")
@Guid("8540b906c96b592d88d70c23a3386d93")
@WinRTInterface("8540b906c96b592d88d70c23a3386d93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxItemFactory.ByReference::class)
public interface IComboBoxItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ComboBoxItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxItemFactory> {
    public override fun getValue() = ABI.makeIComboBoxItemFactory(pointer.getPointer(0))

    public fun setValue(value: IComboBoxItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxItemFactory {
    public val __1426609075_Ptr: Pointer?

    public val _1426609075_VtblPtr: Pointer?
      get() = __1426609075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ComboBoxItem? {
      val fnPtr = _1426609075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBoxItem>()
      val hr = fn.invokeHR(arrayOf(__1426609075_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBoxItem>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1426609075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8540b906c96b592d88d70c23a3386d93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxItemFactory(ptr: Pointer?): WithDefault = IComboBoxItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxItemFactory {
      val address = segment.toRawLongValue()
      return makeIComboBoxItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1426609075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxItemFactory): Array<IComboBoxItemFactory?> =
        (elements as
        Array<IComboBoxItemFactory?>).castToImpl<IComboBoxItemFactory,IComboBoxItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxItemFactory?> =
        arrayOfNulls<IComboBoxItemFactory_Impl>(size) as Array<IComboBoxItemFactory?>
  }
}
