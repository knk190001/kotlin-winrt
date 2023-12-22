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

@ABIMarker(IListBoxItemFactory.ABI::class)
@Signature("{4398b8d4-a3de-402c-b23d-190384b27ca8}")
@Guid("4398b8d4a3de402cb23d190384b27ca8")
@WinRTInterface("4398b8d4a3de402cb23d190384b27ca8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxItemFactory.ByReference::class)
public interface IListBoxItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ListBoxItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListBoxItemFactory> {
    public override fun getValue() = ABI.makeIListBoxItemFactory(pointer.getPointer(0))

    public fun setValue(value: IListBoxItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxItemFactory {
    public val __1521585414_Ptr: Pointer?

    public val _1521585414_VtblPtr: Pointer?
      get() = __1521585414_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ListBoxItem? {
      val fnPtr = _1521585414_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListBoxItem>()
      val hr = fn.invokeHR(arrayOf(__1521585414_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListBoxItem>(result.getValue())
      return resultValue
    }
  }

  public class IListBoxItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1521585414_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4398b8d4a3de402cb23d190384b27ca8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxItemFactory(ptr: Pointer?): WithDefault = IListBoxItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxItemFactory {
      val address = segment.toRawLongValue()
      return makeIListBoxItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IListBoxItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1521585414_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxItemFactory): Array<IListBoxItemFactory?> =
        (elements as
        Array<IListBoxItemFactory?>).castToImpl<IListBoxItemFactory,IListBoxItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxItemFactory?> =
        arrayOfNulls<IListBoxItemFactory_Impl>(size) as Array<IListBoxItemFactory?>
  }
}
