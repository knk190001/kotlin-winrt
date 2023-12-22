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

@ABIMarker(IWebUINavigatedDeferral.ABI::class)
@Signature("{d804204d-831f-46e2-b432-3afce211f962}")
@Guid("d804204d831f46e2b4323afce211f962")
@WinRTInterface("d804204d831f46e2b4323afce211f962")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUINavigatedDeferral.ByReference::class)
public interface IWebUINavigatedDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUINavigatedDeferral> {
    public override fun getValue() = ABI.makeIWebUINavigatedDeferral(pointer.getPointer(0))

    public fun setValue(value: IWebUINavigatedDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUINavigatedDeferral {
    public val __1425355014_Ptr: Pointer?

    public val _1425355014_VtblPtr: Pointer?
      get() = __1425355014_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1425355014_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425355014_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUINavigatedDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1425355014_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUINavigatedDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d804204d831f46e2b4323afce211f962")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUINavigatedDeferral(ptr: Pointer?): WithDefault =
        IWebUINavigatedDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUINavigatedDeferral {
      val address = segment.toRawLongValue()
      return makeIWebUINavigatedDeferral(Pointer(address))
    }

    public override fun toNative(obj: IWebUINavigatedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1425355014_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUINavigatedDeferral): Array<IWebUINavigatedDeferral?>
        = (elements as
        Array<IWebUINavigatedDeferral?>).castToImpl<IWebUINavigatedDeferral,IWebUINavigatedDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUINavigatedDeferral?> =
        arrayOfNulls<IWebUINavigatedDeferral_Impl>(size) as Array<IWebUINavigatedDeferral?>
  }
}
