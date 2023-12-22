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

@ABIMarker(IListViewItemFactory.ABI::class)
@Signature("{f431073d-9cac-42a2-82df-0f4490bc4e2e}")
@Guid("f431073d9cac42a282df0f4490bc4e2e")
@WinRTInterface("f431073d9cac42a282df0f4490bc4e2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemFactory.ByReference::class)
public interface IListViewItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ListViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemFactory> {
    public override fun getValue() = ABI.makeIListViewItemFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemFactory {
    public val __1242731640_Ptr: Pointer?

    public val _1242731640_VtblPtr: Pointer?
      get() = __1242731640_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ListViewItem? {
      val fnPtr = _1242731640_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItem>()
      val hr = fn.invokeHR(arrayOf(__1242731640_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewItem>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1242731640_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f431073d9cac42a282df0f4490bc4e2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemFactory(ptr: Pointer?): WithDefault = IListViewItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemFactory {
      val address = segment.toRawLongValue()
      return makeIListViewItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1242731640_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemFactory): Array<IListViewItemFactory?> =
        (elements as
        Array<IListViewItemFactory?>).castToImpl<IListViewItemFactory,IListViewItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemFactory?> =
        arrayOfNulls<IListViewItemFactory_Impl>(size) as Array<IListViewItemFactory?>
  }
}
