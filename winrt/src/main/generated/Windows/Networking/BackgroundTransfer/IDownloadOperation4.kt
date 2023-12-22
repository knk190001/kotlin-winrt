package Windows.Networking.BackgroundTransfer

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

@ABIMarker(IDownloadOperation4.ABI::class)
@Signature("{0cdaaef4-8cef-404a-966d-f058400bed80}")
@Guid("0cdaaef48cef404a966df058400bed80")
@WinRTInterface("0cdaaef48cef404a966df058400bed80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDownloadOperation4.ByReference::class)
public interface IDownloadOperation4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun MakeCurrentInTransferGroup(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDownloadOperation4> {
    public override fun getValue() = ABI.makeIDownloadOperation4(pointer.getPointer(0))

    public fun setValue(value: IDownloadOperation4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDownloadOperation4 {
    public val __214957910_Ptr: Pointer?

    public val _214957910_VtblPtr: Pointer?
      get() = __214957910_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun MakeCurrentInTransferGroup(): Unit {
      val fnPtr = _214957910_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__214957910_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDownloadOperation4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __214957910_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDownloadOperation4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cdaaef48cef404a966df058400bed80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDownloadOperation4(ptr: Pointer?): WithDefault = IDownloadOperation4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDownloadOperation4 {
      val address = segment.toRawLongValue()
      return makeIDownloadOperation4(Pointer(address))
    }

    public override fun toNative(obj: IDownloadOperation4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__214957910_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDownloadOperation4): Array<IDownloadOperation4?> =
        (elements as
        Array<IDownloadOperation4?>).castToImpl<IDownloadOperation4,IDownloadOperation4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDownloadOperation4?> =
        arrayOfNulls<IDownloadOperation4_Impl>(size) as Array<IDownloadOperation4?>
  }
}
