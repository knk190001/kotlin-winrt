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

@ABIMarker(ITransition.ABI::class)
@Signature("{3c677c7c-01d0-4dce-b333-976f93312b08}")
@Guid("3c677c7c01d04dceb333976f93312b08")
@WinRTInterface("3c677c7c01d04dceb333976f93312b08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransition.ByReference::class)
public interface ITransition : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITransition> {
    public override fun getValue() = ABI.makeITransition(pointer.getPointer(0))

    public fun setValue(value: ITransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransition {
    public val __880417829_Ptr: Pointer?

    public val _880417829_VtblPtr: Pointer?
      get() = __880417829_Ptr?.getPointer(0)
  }

  public class ITransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __880417829_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c677c7c01d04dceb333976f93312b08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransition(ptr: Pointer?): WithDefault = ITransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransition {
      val address = segment.toRawLongValue()
      return makeITransition(Pointer(address))
    }

    public override fun toNative(obj: ITransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__880417829_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransition): Array<ITransition?> = (elements as
        Array<ITransition?>).castToImpl<ITransition,ITransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransition?> =
        arrayOfNulls<ITransition_Impl>(size) as Array<ITransition?>
  }
}
