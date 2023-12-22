package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.IVisualElement
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

@ABIMarker(IVisualInteractionSourceStatics2.ABI::class)
@Signature("{a6b494fe-12a1-5a73-b87e-4c4ef58eac6c}")
@Guid("a6b494fe12a15a73b87e4c4ef58eac6c")
@WinRTInterface("a6b494fe12a15a73b87e4c4ef58eac6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualInteractionSourceStatics2.ByReference::class)
public interface IVisualInteractionSourceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromIVisualElement(source: IVisualElement?): VisualInteractionSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualInteractionSourceStatics2> {
    public override fun getValue() = ABI.makeIVisualInteractionSourceStatics2(pointer.getPointer(0))

    public fun setValue(value: IVisualInteractionSourceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualInteractionSourceStatics2 {
    public val __1157181360_Ptr: Pointer?

    public val _1157181360_VtblPtr: Pointer?
      get() = __1157181360_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromIVisualElement(source: IVisualElement?):
        VisualInteractionSource? {
      val fnPtr = _1157181360_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualInteractionSource>()
      val hr = fn.invokeHR(arrayOf(__1157181360_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualInteractionSource>(result.getValue())
      return resultValue
    }
  }

  public class IVisualInteractionSourceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1157181360_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualInteractionSourceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6b494fe12a15a73b87e4c4ef58eac6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualInteractionSourceStatics2(ptr: Pointer?): WithDefault =
        IVisualInteractionSourceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualInteractionSourceStatics2 {
      val address = segment.toRawLongValue()
      return makeIVisualInteractionSourceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IVisualInteractionSourceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1157181360_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualInteractionSourceStatics2):
        Array<IVisualInteractionSourceStatics2?> = (elements as
        Array<IVisualInteractionSourceStatics2?>).castToImpl<IVisualInteractionSourceStatics2,IVisualInteractionSourceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualInteractionSourceStatics2?> =
        arrayOfNulls<IVisualInteractionSourceStatics2_Impl>(size) as
        Array<IVisualInteractionSourceStatics2?>
  }
}
