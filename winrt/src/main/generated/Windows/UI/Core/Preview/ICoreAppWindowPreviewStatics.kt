package Windows.UI.Core.Preview

import Windows.UI.WindowManagement.AppWindow
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

@ABIMarker(ICoreAppWindowPreviewStatics.ABI::class)
@Signature("{33ac21be-423b-5db6-8a8e-4dc87353b75b}")
@Guid("33ac21be423b5db68a8e4dc87353b75b")
@WinRTInterface("33ac21be423b5db68a8e4dc87353b75b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreAppWindowPreviewStatics.ByReference::class)
public interface ICoreAppWindowPreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetIdFromWindow(window: AppWindow?): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreAppWindowPreviewStatics> {
    public override fun getValue() = ABI.makeICoreAppWindowPreviewStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreAppWindowPreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreAppWindowPreviewStatics {
    public val __1388792334_Ptr: Pointer?

    public val _1388792334_VtblPtr: Pointer?
      get() = __1388792334_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetIdFromWindow(window: AppWindow?): Int {
      val fnPtr = _1388792334_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1388792334_Ptr, marshalToNative(window), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreAppWindowPreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1388792334_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreAppWindowPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33ac21be423b5db68a8e4dc87353b75b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreAppWindowPreviewStatics(ptr: Pointer?): WithDefault =
        ICoreAppWindowPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreAppWindowPreviewStatics {
      val address = segment.toRawLongValue()
      return makeICoreAppWindowPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreAppWindowPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1388792334_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreAppWindowPreviewStatics):
        Array<ICoreAppWindowPreviewStatics?> = (elements as
        Array<ICoreAppWindowPreviewStatics?>).castToImpl<ICoreAppWindowPreviewStatics,ICoreAppWindowPreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreAppWindowPreviewStatics?> =
        arrayOfNulls<ICoreAppWindowPreviewStatics_Impl>(size) as
        Array<ICoreAppWindowPreviewStatics?>
  }
}
