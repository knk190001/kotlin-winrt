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

@ABIMarker(ICompactOverlayPresenter.ABI::class)
@Signature("{efeb0812-6fc7-5b7d-bd92-cc8f9a6454c9}")
@Guid("efeb08126fc75b7dbd92cc8f9a6454c9")
@WinRTInterface("efeb08126fc75b7dbd92cc8f9a6454c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompactOverlayPresenter.ByReference::class)
public interface ICompactOverlayPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InitialSize(): CompactOverlaySize?

  @InterfaceMethod(1)
  public fun put_InitialSize(value: CompactOverlaySize?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompactOverlayPresenter> {
    public override fun getValue() = ABI.makeICompactOverlayPresenter(pointer.getPointer(0))

    public fun setValue(value: ICompactOverlayPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompactOverlayPresenter {
    public val __894173962_Ptr: Pointer?

    public val _894173962_VtblPtr: Pointer?
      get() = __894173962_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InitialSize(): CompactOverlaySize? {
      val fnPtr = _894173962_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompactOverlaySize>()
      val hr = fn.invokeHR(arrayOf(__894173962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompactOverlaySize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InitialSize(value: CompactOverlaySize?): Unit {
      val fnPtr = _894173962_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__894173962_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompactOverlayPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __894173962_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompactOverlayPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efeb08126fc75b7dbd92cc8f9a6454c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompactOverlayPresenter(ptr: Pointer?): WithDefault =
        ICompactOverlayPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompactOverlayPresenter {
      val address = segment.toRawLongValue()
      return makeICompactOverlayPresenter(Pointer(address))
    }

    public override fun toNative(obj: ICompactOverlayPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__894173962_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompactOverlayPresenter):
        Array<ICompactOverlayPresenter?> = (elements as
        Array<ICompactOverlayPresenter?>).castToImpl<ICompactOverlayPresenter,ICompactOverlayPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompactOverlayPresenter?> =
        arrayOfNulls<ICompactOverlayPresenter_Impl>(size) as Array<ICompactOverlayPresenter?>
  }
}
