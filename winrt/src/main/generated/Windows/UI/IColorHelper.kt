package Windows.UI

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

@ABIMarker(IColorHelper.ABI::class)
@Signature("{193cfbe7-65c7-4540-ad08-6283ba76879a}")
@Guid("193cfbe765c74540ad086283ba76879a")
@WinRTInterface("193cfbe765c74540ad086283ba76879a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorHelper.ByReference::class)
public interface IColorHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IColorHelper> {
    public override fun getValue() = ABI.makeIColorHelper(pointer.getPointer(0))

    public fun setValue(value: IColorHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorHelper {
    public val __1300964249_Ptr: Pointer?

    public val _1300964249_VtblPtr: Pointer?
      get() = __1300964249_Ptr?.getPointer(0)
  }

  public class IColorHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1300964249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("193cfbe765c74540ad086283ba76879a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorHelper(ptr: Pointer?): WithDefault = IColorHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorHelper {
      val address = segment.toRawLongValue()
      return makeIColorHelper(Pointer(address))
    }

    public override fun toNative(obj: IColorHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1300964249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorHelper): Array<IColorHelper?> = (elements as
        Array<IColorHelper?>).castToImpl<IColorHelper,IColorHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorHelper?> =
        arrayOfNulls<IColorHelper_Impl>(size) as Array<IColorHelper?>
  }
}
