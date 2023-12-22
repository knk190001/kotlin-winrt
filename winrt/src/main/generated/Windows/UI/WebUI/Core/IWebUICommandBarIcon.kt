package Windows.UI.WebUI.Core

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

@ABIMarker(IWebUICommandBarIcon.ABI::class)
@Signature("{d587655d-2014-42be-969a-7d14ca6c8a49}")
@Guid("d587655d201442be969a7d14ca6c8a49")
@WinRTInterface("d587655d201442be969a7d14ca6c8a49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarIcon.ByReference::class)
public interface IWebUICommandBarIcon : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarIcon> {
    public override fun getValue() = ABI.makeIWebUICommandBarIcon(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarIcon {
    public val __1332685780_Ptr: Pointer?

    public val _1332685780_VtblPtr: Pointer?
      get() = __1332685780_Ptr?.getPointer(0)
  }

  public class IWebUICommandBarIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1332685780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d587655d201442be969a7d14ca6c8a49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarIcon(ptr: Pointer?): WithDefault = IWebUICommandBarIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarIcon {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarIcon(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1332685780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarIcon): Array<IWebUICommandBarIcon?> =
        (elements as
        Array<IWebUICommandBarIcon?>).castToImpl<IWebUICommandBarIcon,IWebUICommandBarIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarIcon?> =
        arrayOfNulls<IWebUICommandBarIcon_Impl>(size) as Array<IWebUICommandBarIcon?>
  }
}
