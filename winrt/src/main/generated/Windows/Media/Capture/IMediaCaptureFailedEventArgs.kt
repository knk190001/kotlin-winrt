package Windows.Media.Capture

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMediaCaptureFailedEventArgs.ABI::class)
@Signature("{80fde3f4-54c4-42c0-8d19-cea1a87ca18b}")
@Guid("80fde3f454c442c08d19cea1a87ca18b")
@WinRTInterface("80fde3f454c442c08d19cea1a87ca18b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureFailedEventArgs.ByReference::class)
public interface IMediaCaptureFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): String?

  @InterfaceMethod(1)
  public fun get_Code(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureFailedEventArgs> {
    public override fun getValue() = ABI.makeIMediaCaptureFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureFailedEventArgs {
    public val __1022892832_Ptr: Pointer?

    public val _1022892832_VtblPtr: Pointer?
      get() = __1022892832_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): String? {
      val fnPtr = _1022892832_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1022892832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Code(): WinDef.UINT {
      val fnPtr = _1022892832_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1022892832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaCaptureFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1022892832_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80fde3f454c442c08d19cea1a87ca18b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureFailedEventArgs(ptr: Pointer?): WithDefault =
        IMediaCaptureFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1022892832_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureFailedEventArgs):
        Array<IMediaCaptureFailedEventArgs?> = (elements as
        Array<IMediaCaptureFailedEventArgs?>).castToImpl<IMediaCaptureFailedEventArgs,IMediaCaptureFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureFailedEventArgs?> =
        arrayOfNulls<IMediaCaptureFailedEventArgs_Impl>(size) as
        Array<IMediaCaptureFailedEventArgs?>
  }
}
