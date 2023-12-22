package Microsoft.UI.Xaml.Media

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

@ABIMarker(IDesktopAcrylicBackdrop.ABI::class)
@Signature("{bfd9915b-82a6-5df6-aff0-a4824ddc1143}")
@Guid("bfd9915b82a65df6aff0a4824ddc1143")
@WinRTInterface("bfd9915b82a65df6aff0a4824ddc1143")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopAcrylicBackdrop.ByReference::class)
public interface IDesktopAcrylicBackdrop : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopAcrylicBackdrop> {
    public override fun getValue() = ABI.makeIDesktopAcrylicBackdrop(pointer.getPointer(0))

    public fun setValue(value: IDesktopAcrylicBackdrop_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopAcrylicBackdrop {
    public val __531460824_Ptr: Pointer?

    public val _531460824_VtblPtr: Pointer?
      get() = __531460824_Ptr?.getPointer(0)
  }

  public class IDesktopAcrylicBackdrop_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __531460824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopAcrylicBackdrop, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfd9915b82a65df6aff0a4824ddc1143")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopAcrylicBackdrop(ptr: Pointer?): WithDefault =
        IDesktopAcrylicBackdrop_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopAcrylicBackdrop {
      val address = segment.toRawLongValue()
      return makeIDesktopAcrylicBackdrop(Pointer(address))
    }

    public override fun toNative(obj: IDesktopAcrylicBackdrop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__531460824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopAcrylicBackdrop): Array<IDesktopAcrylicBackdrop?>
        = (elements as
        Array<IDesktopAcrylicBackdrop?>).castToImpl<IDesktopAcrylicBackdrop,IDesktopAcrylicBackdrop_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopAcrylicBackdrop?> =
        arrayOfNulls<IDesktopAcrylicBackdrop_Impl>(size) as Array<IDesktopAcrylicBackdrop?>
  }
}
