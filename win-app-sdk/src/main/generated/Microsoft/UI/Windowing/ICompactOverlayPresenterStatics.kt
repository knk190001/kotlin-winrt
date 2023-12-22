package Microsoft.UI.Windowing

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

@ABIMarker(ICompactOverlayPresenterStatics.ABI::class)
@Signature("{eab93186-4f6a-52f9-8c03-da57a1522f6e}")
@Guid("eab931864f6a52f98c03da57a1522f6e")
@WinRTInterface("eab931864f6a52f98c03da57a1522f6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompactOverlayPresenterStatics.ByReference::class)
public interface ICompactOverlayPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): CompactOverlayPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompactOverlayPresenterStatics> {
    public override fun getValue() = ABI.makeICompactOverlayPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: ICompactOverlayPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompactOverlayPresenterStatics {
    public val __564852059_Ptr: Pointer?

    public val _564852059_VtblPtr: Pointer?
      get() = __564852059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): CompactOverlayPresenter? {
      val fnPtr = _564852059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompactOverlayPresenter>()
      val hr = fn.invokeHR(arrayOf(__564852059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompactOverlayPresenter>(result.getValue())
      return resultValue
    }
  }

  public class ICompactOverlayPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __564852059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompactOverlayPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eab931864f6a52f98c03da57a1522f6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompactOverlayPresenterStatics(ptr: Pointer?): WithDefault =
        ICompactOverlayPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompactOverlayPresenterStatics {
      val address = segment.toRawLongValue()
      return makeICompactOverlayPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompactOverlayPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__564852059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompactOverlayPresenterStatics):
        Array<ICompactOverlayPresenterStatics?> = (elements as
        Array<ICompactOverlayPresenterStatics?>).castToImpl<ICompactOverlayPresenterStatics,ICompactOverlayPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompactOverlayPresenterStatics?> =
        arrayOfNulls<ICompactOverlayPresenterStatics_Impl>(size) as
        Array<ICompactOverlayPresenterStatics?>
  }
}
