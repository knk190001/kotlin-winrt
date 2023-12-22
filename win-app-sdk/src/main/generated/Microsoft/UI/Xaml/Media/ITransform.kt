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

@ABIMarker(ITransform.ABI::class)
@Signature("{92a8dee5-1413-56b9-8cca-3c46918fde1b}")
@Guid("92a8dee5141356b98cca3c46918fde1b")
@WinRTInterface("92a8dee5141356b98cca3c46918fde1b")
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
    public val __1185028699_Ptr: Pointer?

    public val _1185028699_VtblPtr: Pointer?
      get() = __1185028699_Ptr?.getPointer(0)
  }

  public class ITransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1185028699_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92a8dee5141356b98cca3c46918fde1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransform(ptr: Pointer?): WithDefault = ITransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransform {
      val address = segment.toRawLongValue()
      return makeITransform(Pointer(address))
    }

    public override fun toNative(obj: ITransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1185028699_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransform): Array<ITransform?> = (elements as
        Array<ITransform?>).castToImpl<ITransform,ITransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransform?> = arrayOfNulls<ITransform_Impl>(size)
        as Array<ITransform?>
  }
}
