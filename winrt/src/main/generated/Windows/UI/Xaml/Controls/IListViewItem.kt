package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.ListViewItemTemplateSettings
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IListViewItem.ABI::class)
@Signature("{b7bb4305-3dd9-43de-a8c0-c472f085bc11}")
@Guid("b7bb43053dd943dea8c0c472f085bc11")
@WinRTInterface("b7bb43053dd943dea8c0c472f085bc11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItem.ByReference::class)
public interface IListViewItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TemplateSettings(): ListViewItemTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListViewItem>
      {
    public override fun getValue() = ABI.makeIListViewItem(pointer.getPointer(0))

    public fun setValue(value: IListViewItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItem {
    public val __653985742_Ptr: Pointer?

    public val _653985742_VtblPtr: Pointer?
      get() = __653985742_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TemplateSettings(): ListViewItemTemplateSettings? {
      val fnPtr = _653985742_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__653985742_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewItemTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653985742_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7bb43053dd943dea8c0c472f085bc11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItem(ptr: Pointer?): WithDefault = IListViewItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItem {
      val address = segment.toRawLongValue()
      return makeIListViewItem(Pointer(address))
    }

    public override fun toNative(obj: IListViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__653985742_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItem): Array<IListViewItem?> = (elements as
        Array<IListViewItem?>).castToImpl<IListViewItem,IListViewItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItem?> =
        arrayOfNulls<IListViewItem_Impl>(size) as Array<IListViewItem?>
  }
}
