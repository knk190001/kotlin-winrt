package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.GridViewItemTemplateSettings
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

@ABIMarker(IGridViewItem.ABI::class)
@Signature("{9debb4a5-e7b7-5a41-a1ee-f77d8a7b0023}")
@Guid("9debb4a5e7b75a41a1eef77d8a7b0023")
@WinRTInterface("9debb4a5e7b75a41a1eef77d8a7b0023")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewItem.ByReference::class)
public interface IGridViewItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TemplateSettings(): GridViewItemTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGridViewItem>
      {
    public override fun getValue() = ABI.makeIGridViewItem(pointer.getPointer(0))

    public fun setValue(value: IGridViewItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewItem {
    public val __2028014587_Ptr: Pointer?

    public val _2028014587_VtblPtr: Pointer?
      get() = __2028014587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TemplateSettings(): GridViewItemTemplateSettings? {
      val fnPtr = _2028014587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridViewItemTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__2028014587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridViewItemTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IGridViewItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2028014587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9debb4a5e7b75a41a1eef77d8a7b0023")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewItem(ptr: Pointer?): WithDefault = IGridViewItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewItem {
      val address = segment.toRawLongValue()
      return makeIGridViewItem(Pointer(address))
    }

    public override fun toNative(obj: IGridViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2028014587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewItem): Array<IGridViewItem?> = (elements as
        Array<IGridViewItem?>).castToImpl<IGridViewItem,IGridViewItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewItem?> =
        arrayOfNulls<IGridViewItem_Impl>(size) as Array<IGridViewItem?>
  }
}
