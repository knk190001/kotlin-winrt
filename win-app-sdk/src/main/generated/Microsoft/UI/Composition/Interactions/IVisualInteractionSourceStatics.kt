package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.Visual
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

@ABIMarker(IVisualInteractionSourceStatics.ABI::class)
@Signature("{5fc9c763-e2e5-530e-87cd-b93118ade8a3}")
@Guid("5fc9c763e2e5530e87cdb93118ade8a3")
@WinRTInterface("5fc9c763e2e5530e87cdb93118ade8a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualInteractionSourceStatics.ByReference::class)
public interface IVisualInteractionSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(source: Visual?): VisualInteractionSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualInteractionSourceStatics> {
    public override fun getValue() = ABI.makeIVisualInteractionSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IVisualInteractionSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualInteractionSourceStatics {
    public val __730065090_Ptr: Pointer?

    public val _730065090_VtblPtr: Pointer?
      get() = __730065090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(source: Visual?): VisualInteractionSource? {
      val fnPtr = _730065090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualInteractionSource>()
      val hr = fn.invokeHR(arrayOf(__730065090_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualInteractionSource>(result.getValue())
      return resultValue
    }
  }

  public class IVisualInteractionSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __730065090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualInteractionSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5fc9c763e2e5530e87cdb93118ade8a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualInteractionSourceStatics(ptr: Pointer?): WithDefault =
        IVisualInteractionSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualInteractionSourceStatics {
      val address = segment.toRawLongValue()
      return makeIVisualInteractionSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IVisualInteractionSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__730065090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualInteractionSourceStatics):
        Array<IVisualInteractionSourceStatics?> = (elements as
        Array<IVisualInteractionSourceStatics?>).castToImpl<IVisualInteractionSourceStatics,IVisualInteractionSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualInteractionSourceStatics?> =
        arrayOfNulls<IVisualInteractionSourceStatics_Impl>(size) as
        Array<IVisualInteractionSourceStatics?>
  }
}
