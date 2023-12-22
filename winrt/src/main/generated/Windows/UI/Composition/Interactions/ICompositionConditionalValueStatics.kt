package Windows.UI.Composition.Interactions

import Windows.UI.Composition.Compositor
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionConditionalValueStatics.ABI::class)
@Signature("{090c4b72-8467-4d0a-9065-ac46b80a5522}")
@Guid("090c4b7284674d0a9065ac46b80a5522")
@WinRTInterface("090c4b7284674d0a9065ac46b80a5522")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionConditionalValueStatics.ByReference::class)
public interface ICompositionConditionalValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): CompositionConditionalValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionConditionalValueStatics> {
    public override fun getValue() =
        ABI.makeICompositionConditionalValueStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositionConditionalValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionConditionalValueStatics {
    public val __1308554149_Ptr: Pointer?

    public val _1308554149_VtblPtr: Pointer?
      get() = __1308554149_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): CompositionConditionalValue? {
      val fnPtr = _1308554149_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionConditionalValue>()
      val hr = fn.invokeHR(arrayOf(__1308554149_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionConditionalValue>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionConditionalValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1308554149_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionConditionalValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("090c4b7284674d0a9065ac46b80a5522")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionConditionalValueStatics(ptr: Pointer?): WithDefault =
        ICompositionConditionalValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionConditionalValueStatics {
      val address = segment.toRawLongValue()
      return makeICompositionConditionalValueStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositionConditionalValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1308554149_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionConditionalValueStatics):
        Array<ICompositionConditionalValueStatics?> = (elements as
        Array<ICompositionConditionalValueStatics?>).castToImpl<ICompositionConditionalValueStatics,ICompositionConditionalValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionConditionalValueStatics?> =
        arrayOfNulls<ICompositionConditionalValueStatics_Impl>(size) as
        Array<ICompositionConditionalValueStatics?>
  }
}
