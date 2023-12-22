package Microsoft.UI.Xaml.Automation

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

@ABIMarker(IDragPatternIdentifiers.ABI::class)
@Signature("{aa2fdfd5-fb45-5d2b-8d92-a8e7b07061c2}")
@Guid("aa2fdfd5fb455d2b8d92a8e7b07061c2")
@WinRTInterface("aa2fdfd5fb455d2b8d92a8e7b07061c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragPatternIdentifiers.ByReference::class)
public interface IDragPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragPatternIdentifiers> {
    public override fun getValue() = ABI.makeIDragPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IDragPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragPatternIdentifiers {
    public val __60895852_Ptr: Pointer?

    public val _60895852_VtblPtr: Pointer?
      get() = __60895852_Ptr?.getPointer(0)
  }

  public class IDragPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __60895852_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa2fdfd5fb455d2b8d92a8e7b07061c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragPatternIdentifiers(ptr: Pointer?): WithDefault =
        IDragPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIDragPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IDragPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__60895852_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragPatternIdentifiers): Array<IDragPatternIdentifiers?>
        = (elements as
        Array<IDragPatternIdentifiers?>).castToImpl<IDragPatternIdentifiers,IDragPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragPatternIdentifiers?> =
        arrayOfNulls<IDragPatternIdentifiers_Impl>(size) as Array<IDragPatternIdentifiers?>
  }
}
