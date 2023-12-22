package Windows.UI.WebUI

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

@ABIMarker(IActivatedDeferral.ABI::class)
@Signature("{c3bd1978-a431-49d8-a76a-395a4e03dcf3}")
@Guid("c3bd1978a43149d8a76a395a4e03dcf3")
@WinRTInterface("c3bd1978a43149d8a76a395a4e03dcf3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivatedDeferral.ByReference::class)
public interface IActivatedDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivatedDeferral> {
    public override fun getValue() = ABI.makeIActivatedDeferral(pointer.getPointer(0))

    public fun setValue(value: IActivatedDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivatedDeferral {
    public val __908651244_Ptr: Pointer?

    public val _908651244_VtblPtr: Pointer?
      get() = __908651244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _908651244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__908651244_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IActivatedDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __908651244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivatedDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3bd1978a43149d8a76a395a4e03dcf3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivatedDeferral(ptr: Pointer?): WithDefault = IActivatedDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivatedDeferral {
      val address = segment.toRawLongValue()
      return makeIActivatedDeferral(Pointer(address))
    }

    public override fun toNative(obj: IActivatedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__908651244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivatedDeferral): Array<IActivatedDeferral?> =
        (elements as
        Array<IActivatedDeferral?>).castToImpl<IActivatedDeferral,IActivatedDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivatedDeferral?> =
        arrayOfNulls<IActivatedDeferral_Impl>(size) as Array<IActivatedDeferral?>
  }
}
