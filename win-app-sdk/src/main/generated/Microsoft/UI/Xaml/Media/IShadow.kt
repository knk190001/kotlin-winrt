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

@ABIMarker(IShadow.ABI::class)
@Signature("{cc12fd6a-50aa-5eb3-9a0e-b938b454c439}")
@Guid("cc12fd6a50aa5eb39a0eb938b454c439")
@WinRTInterface("cc12fd6a50aa5eb39a0eb938b454c439")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShadow.ByReference::class)
public interface IShadow : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IShadow> {
    public override fun getValue() = ABI.makeIShadow(pointer.getPointer(0))

    public fun setValue(value: IShadow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShadow {
    public val __742537071_Ptr: Pointer?

    public val _742537071_VtblPtr: Pointer?
      get() = __742537071_Ptr?.getPointer(0)
  }

  public class IShadow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __742537071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShadow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc12fd6a50aa5eb39a0eb938b454c439")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShadow(ptr: Pointer?): WithDefault = IShadow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShadow {
      val address = segment.toRawLongValue()
      return makeIShadow(Pointer(address))
    }

    public override fun toNative(obj: IShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__742537071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShadow): Array<IShadow?> = (elements as
        Array<IShadow?>).castToImpl<IShadow,IShadow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShadow?> = arrayOfNulls<IShadow_Impl>(size) as
        Array<IShadow?>
  }
}
