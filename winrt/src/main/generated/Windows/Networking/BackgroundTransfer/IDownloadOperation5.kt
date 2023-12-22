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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDownloadOperation5.ABI::class)
@Signature("{a699a86f-5590-463a-b8d6-1e491a2760a5}")
@Guid("a699a86f5590463ab8d61e491a2760a5")
@WinRTInterface("a699a86f5590463ab8d61e491a2760a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDownloadOperation5.ByReference::class)
public interface IDownloadOperation5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetRequestHeader(headerName: String?, headerValue: String?): Unit

  @InterfaceMethod(1)
  public fun RemoveRequestHeader(headerName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDownloadOperation5> {
    public override fun getValue() = ABI.makeIDownloadOperation5(pointer.getPointer(0))

    public fun setValue(value: IDownloadOperation5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDownloadOperation5 {
    public val __214957911_Ptr: Pointer?

    public val _214957911_VtblPtr: Pointer?
      get() = __214957911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetRequestHeader(headerName: String?, headerValue: String?): Unit {
      val fnPtr = _214957911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__214957911_Ptr, marshalToNative(headerName),
          marshalToNative(headerValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RemoveRequestHeader(headerName: String?): Unit {
      val fnPtr = _214957911_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__214957911_Ptr, marshalToNative(headerName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDownloadOperation5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __214957911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDownloadOperation5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a699a86f5590463ab8d61e491a2760a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDownloadOperation5(ptr: Pointer?): WithDefault = IDownloadOperation5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDownloadOperation5 {
      val address = segment.toRawLongValue()
      return makeIDownloadOperation5(Pointer(address))
    }

    public override fun toNative(obj: IDownloadOperation5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__214957911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDownloadOperation5): Array<IDownloadOperation5?> =
        (elements as
        Array<IDownloadOperation5?>).castToImpl<IDownloadOperation5,IDownloadOperation5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDownloadOperation5?> =
        arrayOfNulls<IDownloadOperation5_Impl>(size) as Array<IDownloadOperation5?>
  }
}
