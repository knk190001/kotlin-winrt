package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IComboBoxItem.ABI::class)
@Signature("{993fd6d2-2aae-4f3b-b44d-5648f4d06114}")
@Guid("993fd6d22aae4f3bb44d5648f4d06114")
@WinRTInterface("993fd6d22aae4f3bb44d5648f4d06114")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxItem.ByReference::class)
public interface IComboBoxItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IComboBoxItem>
      {
    public override fun getValue() = ABI.makeIComboBoxItem(pointer.getPointer(0))

    public fun setValue(value: IComboBoxItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxItem {
    public val __295881772_Ptr: Pointer?

    public val _295881772_VtblPtr: Pointer?
      get() = __295881772_Ptr?.getPointer(0)
  }

  public class IComboBoxItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __295881772_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("993fd6d22aae4f3bb44d5648f4d06114")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxItem(ptr: Pointer?): WithDefault = IComboBoxItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxItem {
      val address = segment.toRawLongValue()
      return makeIComboBoxItem(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__295881772_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxItem): Array<IComboBoxItem?> = (elements as
        Array<IComboBoxItem?>).castToImpl<IComboBoxItem,IComboBoxItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxItem?> =
        arrayOfNulls<IComboBoxItem_Impl>(size) as Array<IComboBoxItem?>
  }
}
