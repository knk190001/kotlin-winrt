package Windows.Media.Core

import Windows.Networking.BackgroundTransfer.DownloadOperation
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

@ABIMarker(IMediaSource5.ABI::class)
@Signature("{331a22ae-ed2e-4a22-94c8-b743a92b3022}")
@Guid("331a22aeed2e4a2294c8b743a92b3022")
@WinRTInterface("331a22aeed2e4a2294c8b743a92b3022")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSource5.ByReference::class)
public interface IMediaSource5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DownloadOperation(): DownloadOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaSource5>
      {
    public override fun getValue() = ABI.makeIMediaSource5(pointer.getPointer(0))

    public fun setValue(value: IMediaSource5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSource5 {
    public val __983754165_Ptr: Pointer?

    public val _983754165_VtblPtr: Pointer?
      get() = __983754165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DownloadOperation(): DownloadOperation? {
      val fnPtr = _983754165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DownloadOperation>()
      val hr = fn.invokeHR(arrayOf(__983754165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DownloadOperation>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSource5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __983754165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSource5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("331a22aeed2e4a2294c8b743a92b3022")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSource5(ptr: Pointer?): WithDefault = IMediaSource5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSource5 {
      val address = segment.toRawLongValue()
      return makeIMediaSource5(Pointer(address))
    }

    public override fun toNative(obj: IMediaSource5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__983754165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSource5): Array<IMediaSource5?> = (elements as
        Array<IMediaSource5?>).castToImpl<IMediaSource5,IMediaSource5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSource5?> =
        arrayOfNulls<IMediaSource5_Impl>(size) as Array<IMediaSource5?>
  }
}
