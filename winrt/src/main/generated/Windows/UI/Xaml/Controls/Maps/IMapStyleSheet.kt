package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapStyleSheet.ABI::class)
@Signature("{ae54b2bf-8991-42ed-8d58-20473deede1d}")
@Guid("ae54b2bf899142ed8d5820473deede1d")
@WinRTInterface("ae54b2bf899142ed8d5820473deede1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapStyleSheet.ByReference::class)
public interface IMapStyleSheet : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapStyleSheet>
      {
    public override fun getValue() = ABI.makeIMapStyleSheet(pointer.getPointer(0))

    public fun setValue(value: IMapStyleSheet_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapStyleSheet {
    public val __1495814905_Ptr: Pointer?

    public val _1495814905_VtblPtr: Pointer?
      get() = __1495814905_Ptr?.getPointer(0)
  }

  public class IMapStyleSheet_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1495814905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapStyleSheet, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae54b2bf899142ed8d5820473deede1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapStyleSheet(ptr: Pointer?): WithDefault = IMapStyleSheet_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapStyleSheet {
      val address = segment.toRawLongValue()
      return makeIMapStyleSheet(Pointer(address))
    }

    public override fun toNative(obj: IMapStyleSheet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1495814905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapStyleSheet): Array<IMapStyleSheet?> = (elements as
        Array<IMapStyleSheet?>).castToImpl<IMapStyleSheet,IMapStyleSheet_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapStyleSheet?> =
        arrayOfNulls<IMapStyleSheet_Impl>(size) as Array<IMapStyleSheet?>
  }
}
