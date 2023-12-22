package Windows.Media.Capture

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IAppBroadcastStreamAudioFrame.ABI::class)
@Signature("{efab4ac8-21ba-453f-8bb7-5e938a2e9a74}")
@Guid("efab4ac821ba453f8bb75e938a2e9a74")
@WinRTInterface("efab4ac821ba453f8bb75e938a2e9a74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastStreamAudioFrame.ByReference::class)
public interface IAppBroadcastStreamAudioFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioHeader(): AppBroadcastStreamAudioHeader?

  @InterfaceMethod(1)
  public fun get_AudioBuffer(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastStreamAudioFrame> {
    public override fun getValue() = ABI.makeIAppBroadcastStreamAudioFrame(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastStreamAudioFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastStreamAudioFrame {
    public val __2021914223_Ptr: Pointer?

    public val _2021914223_VtblPtr: Pointer?
      get() = __2021914223_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioHeader(): AppBroadcastStreamAudioHeader? {
      val fnPtr = _2021914223_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastStreamAudioHeader>()
      val hr = fn.invokeHR(arrayOf(__2021914223_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastStreamAudioHeader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AudioBuffer(): IBuffer? {
      val fnPtr = _2021914223_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__2021914223_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastStreamAudioFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2021914223_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastStreamAudioFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efab4ac821ba453f8bb75e938a2e9a74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastStreamAudioFrame(ptr: Pointer?): WithDefault =
        IAppBroadcastStreamAudioFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastStreamAudioFrame {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastStreamAudioFrame(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastStreamAudioFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2021914223_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastStreamAudioFrame):
        Array<IAppBroadcastStreamAudioFrame?> = (elements as
        Array<IAppBroadcastStreamAudioFrame?>).castToImpl<IAppBroadcastStreamAudioFrame,IAppBroadcastStreamAudioFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastStreamAudioFrame?> =
        arrayOfNulls<IAppBroadcastStreamAudioFrame_Impl>(size) as
        Array<IAppBroadcastStreamAudioFrame?>
  }
}
