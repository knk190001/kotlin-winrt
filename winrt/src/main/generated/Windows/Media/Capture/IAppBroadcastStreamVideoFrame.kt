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

@ABIMarker(IAppBroadcastStreamVideoFrame.ABI::class)
@Signature("{0f97cf2b-c9e4-4e88-8194-d814cbd585d8}")
@Guid("0f97cf2bc9e44e888194d814cbd585d8")
@WinRTInterface("0f97cf2bc9e44e888194d814cbd585d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastStreamVideoFrame.ByReference::class)
public interface IAppBroadcastStreamVideoFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoHeader(): AppBroadcastStreamVideoHeader?

  @InterfaceMethod(1)
  public fun get_VideoBuffer(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastStreamVideoFrame> {
    public override fun getValue() = ABI.makeIAppBroadcastStreamVideoFrame(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastStreamVideoFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastStreamVideoFrame {
    public val __1145299734_Ptr: Pointer?

    public val _1145299734_VtblPtr: Pointer?
      get() = __1145299734_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoHeader(): AppBroadcastStreamVideoHeader? {
      val fnPtr = _1145299734_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastStreamVideoHeader>()
      val hr = fn.invokeHR(arrayOf(__1145299734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastStreamVideoHeader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoBuffer(): IBuffer? {
      val fnPtr = _1145299734_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1145299734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastStreamVideoFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1145299734_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastStreamVideoFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f97cf2bc9e44e888194d814cbd585d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastStreamVideoFrame(ptr: Pointer?): WithDefault =
        IAppBroadcastStreamVideoFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastStreamVideoFrame {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastStreamVideoFrame(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastStreamVideoFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1145299734_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastStreamVideoFrame):
        Array<IAppBroadcastStreamVideoFrame?> = (elements as
        Array<IAppBroadcastStreamVideoFrame?>).castToImpl<IAppBroadcastStreamVideoFrame,IAppBroadcastStreamVideoFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastStreamVideoFrame?> =
        arrayOfNulls<IAppBroadcastStreamVideoFrame_Impl>(size) as
        Array<IAppBroadcastStreamVideoFrame?>
  }
}
