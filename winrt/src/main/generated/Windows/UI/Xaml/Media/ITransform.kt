package Windows.UI.Xaml.Media

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

@ABIMarker(ITransform.ABI::class)
@Signature("{4df74078-bfd6-4ed1-9682-d2fd8bf2fe6f}")
@Guid("4df74078bfd64ed19682d2fd8bf2fe6f")
@WinRTInterface("4df74078bfd64ed19682d2fd8bf2fe6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransform.ByReference::class)
public interface ITransform : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITransform> {
    public override fun getValue() = ABI.makeITransform(pointer.getPointer(0))

    public fun setValue(value: ITransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransform {
    public val __441985808_Ptr: Pointer?

    public val _441985808_VtblPtr: Pointer?
      get() = __441985808_Ptr?.getPointer(0)
  }

  public class ITransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __441985808_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4df74078bfd64ed19682d2fd8bf2fe6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransform(ptr: Pointer?): WithDefault = ITransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransform {
      val address = segment.toRawLongValue()
      return makeITransform(Pointer(address))
    }

    public override fun toNative(obj: ITransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__441985808_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransform): Array<ITransform?> = (elements as
        Array<ITransform?>).castToImpl<ITransform,ITransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransform?> = arrayOfNulls<ITransform_Impl>(size)
        as Array<ITransform?>
  }
}
