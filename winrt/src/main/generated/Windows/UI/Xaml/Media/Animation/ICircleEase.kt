package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ICircleEase.ABI::class)
@Signature("{53a3bdb2-9177-4e6e-a043-5082d889ab1f}")
@Guid("53a3bdb291774e6ea0435082d889ab1f")
@WinRTInterface("53a3bdb291774e6ea0435082d889ab1f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICircleEase.ByReference::class)
public interface ICircleEase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICircleEase> {
    public override fun getValue() = ABI.makeICircleEase(pointer.getPointer(0))

    public fun setValue(value: ICircleEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICircleEase {
    public val __267574428_Ptr: Pointer?

    public val _267574428_VtblPtr: Pointer?
      get() = __267574428_Ptr?.getPointer(0)
  }

  public class ICircleEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __267574428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICircleEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53a3bdb291774e6ea0435082d889ab1f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICircleEase(ptr: Pointer?): WithDefault = ICircleEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICircleEase {
      val address = segment.toRawLongValue()
      return makeICircleEase(Pointer(address))
    }

    public override fun toNative(obj: ICircleEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__267574428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICircleEase): Array<ICircleEase?> = (elements as
        Array<ICircleEase?>).castToImpl<ICircleEase,ICircleEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICircleEase?> =
        arrayOfNulls<ICircleEase_Impl>(size) as Array<ICircleEase?>
  }
}
