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

@ABIMarker(IAppBroadcastPreviewStreamVideoFrame.ABI::class)
@Signature("{010fbea1-94fe-4499-b8c0-8d244279fb12}")
@Guid("010fbea194fe4499b8c08d244279fb12")
@WinRTInterface("010fbea194fe4499b8c08d244279fb12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastPreviewStreamVideoFrame.ByReference::class)
public interface IAppBroadcastPreviewStreamVideoFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoHeader(): AppBroadcastPreviewStreamVideoHeader?

  @InterfaceMethod(1)
  public fun get_VideoBuffer(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastPreviewStreamVideoFrame> {
    public override fun getValue() =
        ABI.makeIAppBroadcastPreviewStreamVideoFrame(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastPreviewStreamVideoFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastPreviewStreamVideoFrame {
    public val __1605416286_Ptr: Pointer?

    public val _1605416286_VtblPtr: Pointer?
      get() = __1605416286_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoHeader(): AppBroadcastPreviewStreamVideoHeader? {
      val fnPtr = _1605416286_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPreviewStreamVideoHeader>()
      val hr = fn.invokeHR(arrayOf(__1605416286_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPreviewStreamVideoHeader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoBuffer(): IBuffer? {
      val fnPtr = _1605416286_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1605416286_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastPreviewStreamVideoFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1605416286_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastPreviewStreamVideoFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("010fbea194fe4499b8c08d244279fb12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastPreviewStreamVideoFrame(ptr: Pointer?): WithDefault =
        IAppBroadcastPreviewStreamVideoFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastPreviewStreamVideoFrame {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastPreviewStreamVideoFrame(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastPreviewStreamVideoFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1605416286_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastPreviewStreamVideoFrame):
        Array<IAppBroadcastPreviewStreamVideoFrame?> = (elements as
        Array<IAppBroadcastPreviewStreamVideoFrame?>).castToImpl<IAppBroadcastPreviewStreamVideoFrame,IAppBroadcastPreviewStreamVideoFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastPreviewStreamVideoFrame?> =
        arrayOfNulls<IAppBroadcastPreviewStreamVideoFrame_Impl>(size) as
        Array<IAppBroadcastPreviewStreamVideoFrame?>
  }
}
