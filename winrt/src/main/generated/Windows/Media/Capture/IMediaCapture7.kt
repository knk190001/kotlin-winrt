package Windows.Media.Capture

import Windows.UI.WindowManagement.DisplayRegion
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

@ABIMarker(IMediaCapture7.ABI::class)
@Signature("{9169f102-8888-541a-95bc-24e4d462542a}")
@Guid("9169f1028888541a95bc24e4d462542a")
@WinRTInterface("9169f1028888541a95bc24e4d462542a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCapture7.ByReference::class)
public interface IMediaCapture7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateRelativePanelWatcher(captureMode: StreamingCaptureMode?,
      displayRegion: DisplayRegion?): MediaCaptureRelativePanelWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaCapture7>
      {
    public override fun getValue() = ABI.makeIMediaCapture7(pointer.getPointer(0))

    public fun setValue(value: IMediaCapture7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCapture7 {
    public val __1535274205_Ptr: Pointer?

    public val _1535274205_VtblPtr: Pointer?
      get() = __1535274205_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateRelativePanelWatcher(captureMode: StreamingCaptureMode?,
        displayRegion: DisplayRegion?): MediaCaptureRelativePanelWatcher? {
      val fnPtr = _1535274205_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureRelativePanelWatcher>()
      val hr = fn.invokeHR(arrayOf(__1535274205_Ptr, marshalToNative(captureMode),
          marshalToNative(displayRegion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCaptureRelativePanelWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCapture7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1535274205_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCapture7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9169f1028888541a95bc24e4d462542a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCapture7(ptr: Pointer?): WithDefault = IMediaCapture7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCapture7 {
      val address = segment.toRawLongValue()
      return makeIMediaCapture7(Pointer(address))
    }

    public override fun toNative(obj: IMediaCapture7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1535274205_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCapture7): Array<IMediaCapture7?> = (elements as
        Array<IMediaCapture7?>).castToImpl<IMediaCapture7,IMediaCapture7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCapture7?> =
        arrayOfNulls<IMediaCapture7_Impl>(size) as Array<IMediaCapture7?>
  }
}
