package Windows.UI.Composition

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

@ABIMarker(ICompositor3.ABI::class)
@Signature("{c9dd8ef0-6eb1-4e3c-a658-675d9c64d4ab}")
@Guid("c9dd8ef06eb14e3ca658675d9c64d4ab")
@WinRTInterface("c9dd8ef06eb14e3ca658675d9c64d4ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositor3.ByReference::class)
public interface ICompositor3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateHostBackdropBrush(): CompositionBackdropBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICompositor3> {
    public override fun getValue() = ABI.makeICompositor3(pointer.getPointer(0))

    public fun setValue(value: ICompositor3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositor3 {
    public val __2043002908_Ptr: Pointer?

    public val _2043002908_VtblPtr: Pointer?
      get() = __2043002908_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateHostBackdropBrush(): CompositionBackdropBrush? {
      val fnPtr = _2043002908_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBackdropBrush>()
      val hr = fn.invokeHR(arrayOf(__2043002908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBackdropBrush>(result.getValue())
      return resultValue
    }
  }

  public class ICompositor3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2043002908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositor3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9dd8ef06eb14e3ca658675d9c64d4ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositor3(ptr: Pointer?): WithDefault = ICompositor3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositor3 {
      val address = segment.toRawLongValue()
      return makeICompositor3(Pointer(address))
    }

    public override fun toNative(obj: ICompositor3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2043002908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositor3): Array<ICompositor3?> = (elements as
        Array<ICompositor3?>).castToImpl<ICompositor3,ICompositor3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositor3?> =
        arrayOfNulls<ICompositor3_Impl>(size) as Array<ICompositor3?>
  }
}
