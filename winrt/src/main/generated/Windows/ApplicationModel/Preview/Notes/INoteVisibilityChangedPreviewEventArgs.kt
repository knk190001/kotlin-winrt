package Windows.ApplicationModel.Preview.Notes

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

@ABIMarker(INoteVisibilityChangedPreviewEventArgs.ABI::class)
@Signature("{0e34649e-3815-4ff6-83b3-a14d17120e24}")
@Guid("0e34649e38154ff683b3a14d17120e24")
@WinRTInterface("0e34649e38154ff683b3a14d17120e24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INoteVisibilityChangedPreviewEventArgs.ByReference::class)
public interface INoteVisibilityChangedPreviewEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViewId(): Int

  @InterfaceMethod(1)
  public fun get_IsVisible(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INoteVisibilityChangedPreviewEventArgs> {
    public override fun getValue() =
        ABI.makeINoteVisibilityChangedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: INoteVisibilityChangedPreviewEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INoteVisibilityChangedPreviewEventArgs {
    public val __1351422425_Ptr: Pointer?

    public val _1351422425_VtblPtr: Pointer?
      get() = __1351422425_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewId(): Int {
      val fnPtr = _1351422425_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1351422425_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _1351422425_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1351422425_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class INoteVisibilityChangedPreviewEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1351422425_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INoteVisibilityChangedPreviewEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e34649e38154ff683b3a14d17120e24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINoteVisibilityChangedPreviewEventArgs(ptr: Pointer?): WithDefault =
        INoteVisibilityChangedPreviewEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INoteVisibilityChangedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return makeINoteVisibilityChangedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INoteVisibilityChangedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1351422425_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INoteVisibilityChangedPreviewEventArgs):
        Array<INoteVisibilityChangedPreviewEventArgs?> = (elements as
        Array<INoteVisibilityChangedPreviewEventArgs?>).castToImpl<INoteVisibilityChangedPreviewEventArgs,INoteVisibilityChangedPreviewEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INoteVisibilityChangedPreviewEventArgs?> =
        arrayOfNulls<INoteVisibilityChangedPreviewEventArgs_Impl>(size) as
        Array<INoteVisibilityChangedPreviewEventArgs?>
  }
}
