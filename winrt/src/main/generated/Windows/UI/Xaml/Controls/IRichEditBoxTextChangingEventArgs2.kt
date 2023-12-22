package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRichEditBoxTextChangingEventArgs2.ABI::class)
@Signature("{395b0db5-636e-413e-9eb4-fc22ebfa3628}")
@Guid("395b0db5636e413e9eb4fc22ebfa3628")
@WinRTInterface("395b0db5636e413e9eb4fc22ebfa3628")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxTextChangingEventArgs2.ByReference::class)
public interface IRichEditBoxTextChangingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsContentChanging(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxTextChangingEventArgs2> {
    public override fun getValue() =
        ABI.makeIRichEditBoxTextChangingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxTextChangingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxTextChangingEventArgs2 {
    public val __112746878_Ptr: Pointer?

    public val _112746878_VtblPtr: Pointer?
      get() = __112746878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsContentChanging(): Boolean {
      val fnPtr = _112746878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__112746878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRichEditBoxTextChangingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __112746878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxTextChangingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("395b0db5636e413e9eb4fc22ebfa3628")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxTextChangingEventArgs2(ptr: Pointer?): WithDefault =
        IRichEditBoxTextChangingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxTextChangingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxTextChangingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxTextChangingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__112746878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxTextChangingEventArgs2):
        Array<IRichEditBoxTextChangingEventArgs2?> = (elements as
        Array<IRichEditBoxTextChangingEventArgs2?>).castToImpl<IRichEditBoxTextChangingEventArgs2,IRichEditBoxTextChangingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxTextChangingEventArgs2?> =
        arrayOfNulls<IRichEditBoxTextChangingEventArgs2_Impl>(size) as
        Array<IRichEditBoxTextChangingEventArgs2?>
  }
}
