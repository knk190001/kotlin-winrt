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

@ABIMarker(IQuadraticEase.ABI::class)
@Signature("{e1510e91-ef6d-44f0-803d-68d16de0ddfc}")
@Guid("e1510e91ef6d44f0803d68d16de0ddfc")
@WinRTInterface("e1510e91ef6d44f0803d68d16de0ddfc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IQuadraticEase.ByReference::class)
public interface IQuadraticEase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IQuadraticEase>
      {
    public override fun getValue() = ABI.makeIQuadraticEase(pointer.getPointer(0))

    public fun setValue(value: IQuadraticEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IQuadraticEase {
    public val __513024736_Ptr: Pointer?

    public val _513024736_VtblPtr: Pointer?
      get() = __513024736_Ptr?.getPointer(0)
  }

  public class IQuadraticEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __513024736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IQuadraticEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1510e91ef6d44f0803d68d16de0ddfc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIQuadraticEase(ptr: Pointer?): WithDefault = IQuadraticEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IQuadraticEase {
      val address = segment.toRawLongValue()
      return makeIQuadraticEase(Pointer(address))
    }

    public override fun toNative(obj: IQuadraticEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__513024736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IQuadraticEase): Array<IQuadraticEase?> = (elements as
        Array<IQuadraticEase?>).castToImpl<IQuadraticEase,IQuadraticEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQuadraticEase?> =
        arrayOfNulls<IQuadraticEase_Impl>(size) as Array<IQuadraticEase?>
  }
}
