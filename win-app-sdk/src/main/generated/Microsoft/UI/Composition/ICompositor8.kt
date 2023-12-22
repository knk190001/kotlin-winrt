package Microsoft.UI.Composition

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

@ABIMarker(ICompositor8.ABI::class)
@Signature("{02f5c9ee-a3c0-577a-9d23-44024c8eacda}")
@Guid("02f5c9eea3c0577a9d2344024c8eacda")
@WinRTInterface("02f5c9eea3c0577a9d2344024c8eacda")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositor8.ByReference::class)
public interface ICompositor8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAnimationController(): AnimationController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICompositor8> {
    public override fun getValue() = ABI.makeICompositor8(pointer.getPointer(0))

    public fun setValue(value: ICompositor8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositor8 {
    public val __359760226_Ptr: Pointer?

    public val _359760226_VtblPtr: Pointer?
      get() = __359760226_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAnimationController(): AnimationController? {
      val fnPtr = _359760226_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationController>()
      val hr = fn.invokeHR(arrayOf(__359760226_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationController>(result.getValue())
      return resultValue
    }
  }

  public class ICompositor8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __359760226_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositor8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02f5c9eea3c0577a9d2344024c8eacda")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositor8(ptr: Pointer?): WithDefault = ICompositor8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositor8 {
      val address = segment.toRawLongValue()
      return makeICompositor8(Pointer(address))
    }

    public override fun toNative(obj: ICompositor8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__359760226_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositor8): Array<ICompositor8?> = (elements as
        Array<ICompositor8?>).castToImpl<ICompositor8,ICompositor8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositor8?> =
        arrayOfNulls<ICompositor8_Impl>(size) as Array<ICompositor8?>
  }
}
