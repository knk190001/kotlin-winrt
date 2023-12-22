package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IContentDialogClosingDeferral.ABI::class)
@Signature("{9d74ecc1-67d3-5f02-9b30-56f3b2e8b0a6}")
@Guid("9d74ecc167d35f029b3056f3b2e8b0a6")
@WinRTInterface("9d74ecc167d35f029b3056f3b2e8b0a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialogClosingDeferral.ByReference::class)
public interface IContentDialogClosingDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialogClosingDeferral> {
    public override fun getValue() = ABI.makeIContentDialogClosingDeferral(pointer.getPointer(0))

    public fun setValue(value: IContentDialogClosingDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialogClosingDeferral {
    public val __1980728102_Ptr: Pointer?

    public val _1980728102_VtblPtr: Pointer?
      get() = __1980728102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1980728102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980728102_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentDialogClosingDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1980728102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogClosingDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d74ecc167d35f029b3056f3b2e8b0a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogClosingDeferral(ptr: Pointer?): WithDefault =
        IContentDialogClosingDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogClosingDeferral {
      val address = segment.toRawLongValue()
      return makeIContentDialogClosingDeferral(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogClosingDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1980728102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialogClosingDeferral):
        Array<IContentDialogClosingDeferral?> = (elements as
        Array<IContentDialogClosingDeferral?>).castToImpl<IContentDialogClosingDeferral,IContentDialogClosingDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialogClosingDeferral?> =
        arrayOfNulls<IContentDialogClosingDeferral_Impl>(size) as
        Array<IContentDialogClosingDeferral?>
  }
}
