package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IListViewItemTemplateSettings.ABI::class)
@Signature("{6e302714-2955-5961-94ed-5d0c0c1d0b07}")
@Guid("6e3027142955596194ed5d0c0c1d0b07")
@WinRTInterface("6e3027142955596194ed5d0c0c1d0b07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemTemplateSettings.ByReference::class)
public interface IListViewItemTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DragItemsCount(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemTemplateSettings> {
    public override fun getValue() = ABI.makeIListViewItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IListViewItemTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemTemplateSettings {
    public val __600142396_Ptr: Pointer?

    public val _600142396_VtblPtr: Pointer?
      get() = __600142396_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DragItemsCount(): Int {
      val fnPtr = _600142396_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__600142396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IListViewItemTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __600142396_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e3027142955596194ed5d0c0c1d0b07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemTemplateSettings(ptr: Pointer?): WithDefault =
        IListViewItemTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIListViewItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__600142396_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemTemplateSettings):
        Array<IListViewItemTemplateSettings?> = (elements as
        Array<IListViewItemTemplateSettings?>).castToImpl<IListViewItemTemplateSettings,IListViewItemTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemTemplateSettings?> =
        arrayOfNulls<IListViewItemTemplateSettings_Impl>(size) as
        Array<IListViewItemTemplateSettings?>
  }
}
