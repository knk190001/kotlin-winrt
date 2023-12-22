package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IQuarticEase.ABI::class)
@Signature("{48215273-05f1-58aa-bade-0b71d7bd0484}")
@Guid("4821527305f158aabade0b71d7bd0484")
@WinRTInterface("4821527305f158aabade0b71d7bd0484")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IQuarticEase.ByReference::class)
public interface IQuarticEase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IQuarticEase> {
    public override fun getValue() = ABI.makeIQuarticEase(pointer.getPointer(0))

    public fun setValue(value: IQuarticEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IQuarticEase {
    public val __1380851148_Ptr: Pointer?

    public val _1380851148_VtblPtr: Pointer?
      get() = __1380851148_Ptr?.getPointer(0)
  }

  public class IQuarticEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1380851148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IQuarticEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4821527305f158aabade0b71d7bd0484")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIQuarticEase(ptr: Pointer?): WithDefault = IQuarticEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IQuarticEase {
      val address = segment.toRawLongValue()
      return makeIQuarticEase(Pointer(address))
    }

    public override fun toNative(obj: IQuarticEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1380851148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IQuarticEase): Array<IQuarticEase?> = (elements as
        Array<IQuarticEase?>).castToImpl<IQuarticEase,IQuarticEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQuarticEase?> =
        arrayOfNulls<IQuarticEase_Impl>(size) as Array<IQuarticEase?>
  }
}
