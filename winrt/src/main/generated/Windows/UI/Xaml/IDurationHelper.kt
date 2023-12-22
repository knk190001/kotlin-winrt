package Windows.UI.Xaml

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

@ABIMarker(IDurationHelper.ABI::class)
@Signature("{25c1659f-4497-4135-940f-ee96f4d6e934}")
@Guid("25c1659f44974135940fee96f4d6e934")
@WinRTInterface("25c1659f44974135940fee96f4d6e934")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDurationHelper.ByReference::class)
public interface IDurationHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDurationHelper> {
    public override fun getValue() = ABI.makeIDurationHelper(pointer.getPointer(0))

    public fun setValue(value: IDurationHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDurationHelper {
    public val __1548674764_Ptr: Pointer?

    public val _1548674764_VtblPtr: Pointer?
      get() = __1548674764_Ptr?.getPointer(0)
  }

  public class IDurationHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1548674764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDurationHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25c1659f44974135940fee96f4d6e934")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDurationHelper(ptr: Pointer?): WithDefault = IDurationHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDurationHelper {
      val address = segment.toRawLongValue()
      return makeIDurationHelper(Pointer(address))
    }

    public override fun toNative(obj: IDurationHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1548674764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDurationHelper): Array<IDurationHelper?> = (elements as
        Array<IDurationHelper?>).castToImpl<IDurationHelper,IDurationHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDurationHelper?> =
        arrayOfNulls<IDurationHelper_Impl>(size) as Array<IDurationHelper?>
  }
}
