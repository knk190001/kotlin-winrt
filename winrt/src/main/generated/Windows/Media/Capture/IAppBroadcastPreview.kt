package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TypedEventHandler
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastPreview.ABI::class)
@Signature("{14b60f5a-6e4a-4b80-a14f-67ee77d153e7}")
@Guid("14b60f5a6e4a4b80a14f67ee77d153e7")
@WinRTInterface("14b60f5a6e4a4b80a14f67ee77d153e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastPreview.ByReference::class)
public interface IAppBroadcastPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StopPreview(): Unit

  @InterfaceMethod(1)
  public fun get_PreviewState(): AppBroadcastPreviewState?

  @InterfaceMethod(2)
  public fun get_ErrorCode(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun add_PreviewStateChanged(value: TypedEventHandler<AppBroadcastPreview?,
      AppBroadcastPreviewStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PreviewStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun get_PreviewStreamReader(): AppBroadcastPreviewStreamReader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastPreview> {
    public override fun getValue() = ABI.makeIAppBroadcastPreview(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastPreview {
    public val __1215914288_Ptr: Pointer?

    public val _1215914288_VtblPtr: Pointer?
      get() = __1215914288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StopPreview(): Unit {
      val fnPtr = _1215914288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215914288_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_PreviewState(): AppBroadcastPreviewState? {
      val fnPtr = _1215914288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPreviewState>()
      val hr = fn.invokeHR(arrayOf(__1215914288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPreviewState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ErrorCode(): IReference<WinDef.UINT>? {
      val fnPtr = _1215914288_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1215914288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_PreviewStateChanged(value: TypedEventHandler<AppBroadcastPreview?,
        AppBroadcastPreviewStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215914288_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215914288_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PreviewStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215914288_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215914288_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PreviewStreamReader(): AppBroadcastPreviewStreamReader? {
      val fnPtr = _1215914288_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPreviewStreamReader>()
      val hr = fn.invokeHR(arrayOf(__1215914288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPreviewStreamReader>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215914288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14b60f5a6e4a4b80a14f67ee77d153e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastPreview(ptr: Pointer?): WithDefault = IAppBroadcastPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastPreview {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastPreview(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215914288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastPreview): Array<IAppBroadcastPreview?> =
        (elements as
        Array<IAppBroadcastPreview?>).castToImpl<IAppBroadcastPreview,IAppBroadcastPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastPreview?> =
        arrayOfNulls<IAppBroadcastPreview_Impl>(size) as Array<IAppBroadcastPreview?>
  }
}
