package Windows.UI.Composition.Interactions

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

@ABIMarker(IVisualInteractionSource3.ABI::class)
@Signature("{d941ef2a-0d5c-4057-92d7-c9711533204f}")
@Guid("d941ef2a0d5c405792d7c9711533204f")
@WinRTInterface("d941ef2a0d5c405792d7c9711533204f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualInteractionSource3.ByReference::class)
public interface IVisualInteractionSource3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerWheelConfig(): InteractionSourceConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualInteractionSource3> {
    public override fun getValue() = ABI.makeIVisualInteractionSource3(pointer.getPointer(0))

    public fun setValue(value: IVisualInteractionSource3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualInteractionSource3 {
    public val __1219357541_Ptr: Pointer?

    public val _1219357541_VtblPtr: Pointer?
      get() = __1219357541_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerWheelConfig(): InteractionSourceConfiguration? {
      val fnPtr = _1219357541_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionSourceConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1219357541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionSourceConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IVisualInteractionSource3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1219357541_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualInteractionSource3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d941ef2a0d5c405792d7c9711533204f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualInteractionSource3(ptr: Pointer?): WithDefault =
        IVisualInteractionSource3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualInteractionSource3 {
      val address = segment.toRawLongValue()
      return makeIVisualInteractionSource3(Pointer(address))
    }

    public override fun toNative(obj: IVisualInteractionSource3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1219357541_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualInteractionSource3):
        Array<IVisualInteractionSource3?> = (elements as
        Array<IVisualInteractionSource3?>).castToImpl<IVisualInteractionSource3,IVisualInteractionSource3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualInteractionSource3?> =
        arrayOfNulls<IVisualInteractionSource3_Impl>(size) as Array<IVisualInteractionSource3?>
  }
}
