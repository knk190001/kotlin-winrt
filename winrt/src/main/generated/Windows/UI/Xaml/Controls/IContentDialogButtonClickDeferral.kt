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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentDialogButtonClickDeferral.ABI::class)
@Signature("{bd0d3637-19ce-4946-8e77-bd03fe8ebe03}")
@Guid("bd0d363719ce49468e77bd03fe8ebe03")
@WinRTInterface("bd0d363719ce49468e77bd03fe8ebe03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialogButtonClickDeferral.ByReference::class)
public interface IContentDialogButtonClickDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialogButtonClickDeferral> {
    public override fun getValue() =
        ABI.makeIContentDialogButtonClickDeferral(pointer.getPointer(0))

    public fun setValue(value: IContentDialogButtonClickDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialogButtonClickDeferral {
    public val __1998965308_Ptr: Pointer?

    public val _1998965308_VtblPtr: Pointer?
      get() = __1998965308_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1998965308_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1998965308_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentDialogButtonClickDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1998965308_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogButtonClickDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd0d363719ce49468e77bd03fe8ebe03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogButtonClickDeferral(ptr: Pointer?): WithDefault =
        IContentDialogButtonClickDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogButtonClickDeferral {
      val address = segment.toRawLongValue()
      return makeIContentDialogButtonClickDeferral(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogButtonClickDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1998965308_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialogButtonClickDeferral):
        Array<IContentDialogButtonClickDeferral?> = (elements as
        Array<IContentDialogButtonClickDeferral?>).castToImpl<IContentDialogButtonClickDeferral,IContentDialogButtonClickDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialogButtonClickDeferral?> =
        arrayOfNulls<IContentDialogButtonClickDeferral_Impl>(size) as
        Array<IContentDialogButtonClickDeferral?>
  }
}
