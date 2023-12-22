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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IOverlappedPresenter2.ABI::class)
@Signature("{5c6ccd93-4244-5cd2-b355-ed5ea34df730}")
@Guid("5c6ccd9342445cd2b355ed5ea34df730")
@WinRTInterface("5c6ccd9342445cd2b355ed5ea34df730")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOverlappedPresenter2.ByReference::class)
public interface IOverlappedPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Minimize(activateWindow: Boolean): Unit

  @InterfaceMethod(1)
  public fun Restore(activateWindow: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOverlappedPresenter2> {
    public override fun getValue() = ABI.makeIOverlappedPresenter2(pointer.getPointer(0))

    public fun setValue(value: IOverlappedPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOverlappedPresenter2 {
    public val __948162787_Ptr: Pointer?

    public val _948162787_VtblPtr: Pointer?
      get() = __948162787_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Minimize(activateWindow: Boolean): Unit {
      val fnPtr = _948162787_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__948162787_Ptr, activateWindow,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Restore(activateWindow: Boolean): Unit {
      val fnPtr = _948162787_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__948162787_Ptr, activateWindow,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IOverlappedPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __948162787_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOverlappedPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c6ccd9342445cd2b355ed5ea34df730")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOverlappedPresenter2(ptr: Pointer?): WithDefault =
        IOverlappedPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOverlappedPresenter2 {
      val address = segment.toRawLongValue()
      return makeIOverlappedPresenter2(Pointer(address))
    }

    public override fun toNative(obj: IOverlappedPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__948162787_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOverlappedPresenter2): Array<IOverlappedPresenter2?> =
        (elements as
        Array<IOverlappedPresenter2?>).castToImpl<IOverlappedPresenter2,IOverlappedPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOverlappedPresenter2?> =
        arrayOfNulls<IOverlappedPresenter2_Impl>(size) as Array<IOverlappedPresenter2?>
  }
}
