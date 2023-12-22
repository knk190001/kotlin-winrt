package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IItemsPanelTemplate.ABI::class)
@Signature("{6153af2f-f095-5e8c-89d4-9e03203b9cc2}")
@Guid("6153af2ff0955e8c89d49e03203b9cc2")
@WinRTInterface("6153af2ff0955e8c89d49e03203b9cc2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsPanelTemplate.ByReference::class)
public interface IItemsPanelTemplate : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsPanelTemplate> {
    public override fun getValue() = ABI.makeIItemsPanelTemplate(pointer.getPointer(0))

    public fun setValue(value: IItemsPanelTemplate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsPanelTemplate {
    public val __1206034235_Ptr: Pointer?

    public val _1206034235_VtblPtr: Pointer?
      get() = __1206034235_Ptr?.getPointer(0)
  }

  public class IItemsPanelTemplate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1206034235_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsPanelTemplate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6153af2ff0955e8c89d49e03203b9cc2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsPanelTemplate(ptr: Pointer?): WithDefault = IItemsPanelTemplate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsPanelTemplate {
      val address = segment.toRawLongValue()
      return makeIItemsPanelTemplate(Pointer(address))
    }

    public override fun toNative(obj: IItemsPanelTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1206034235_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsPanelTemplate): Array<IItemsPanelTemplate?> =
        (elements as
        Array<IItemsPanelTemplate?>).castToImpl<IItemsPanelTemplate,IItemsPanelTemplate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsPanelTemplate?> =
        arrayOfNulls<IItemsPanelTemplate_Impl>(size) as Array<IItemsPanelTemplate?>
  }
}
