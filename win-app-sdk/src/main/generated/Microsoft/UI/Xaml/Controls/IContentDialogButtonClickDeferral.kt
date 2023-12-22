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

@ABIMarker(IContentDialogButtonClickDeferral.ABI::class)
@Signature("{ddca6d2e-a81a-5f61-8b87-e4b6ec5fa398}")
@Guid("ddca6d2ea81a5f618b87e4b6ec5fa398")
@WinRTInterface("ddca6d2ea81a5f618b87e4b6ec5fa398")
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
    public val __33935335_Ptr: Pointer?

    public val _33935335_VtblPtr: Pointer?
      get() = __33935335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _33935335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__33935335_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentDialogButtonClickDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __33935335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogButtonClickDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddca6d2ea81a5f618b87e4b6ec5fa398")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogButtonClickDeferral(ptr: Pointer?): WithDefault =
        IContentDialogButtonClickDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogButtonClickDeferral {
      val address = segment.toRawLongValue()
      return makeIContentDialogButtonClickDeferral(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogButtonClickDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__33935335_Ptr))
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
