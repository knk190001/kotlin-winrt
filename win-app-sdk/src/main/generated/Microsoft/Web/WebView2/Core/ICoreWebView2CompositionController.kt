package Microsoft.Web.WebView2.Core

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.ApplicationModel.DataTransfer.DragDrop.Core.CoreDragInfo
import Windows.ApplicationModel.DataTransfer.DragDrop.Core.CoreDragUIOverride
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Point
import Windows.Foundation.TypedEventHandler
import Windows.UI.Core.CoreCursor
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICoreWebView2CompositionController.ABI::class)
@Signature("{31bbb153-11b2-58e8-9beb-69f5c8e14420}")
@Guid("31bbb15311b258e89beb69f5c8e14420")
@WinRTInterface("31bbb15311b258e89beb69f5c8e14420")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2CompositionController.ByReference::class)
public interface ICoreWebView2CompositionController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RootVisualTarget(): IUnknown?

  @InterfaceMethod(1)
  public fun put_RootVisualTarget(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun add_CursorChanged(handler: TypedEventHandler<CoreWebView2CompositionController?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CursorChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun SendMouseInput(
    eventKind: CoreWebView2MouseEventKind?,
    virtualKeys: CoreWebView2MouseEventVirtualKeys?,
    mouseData: WinDef.UINT,
    point: Point?
  ): Unit

  @InterfaceMethod(5)
  public fun SendPointerInput(eventKind: CoreWebView2PointerEventKind?,
      pointerInfo: CoreWebView2PointerInfo?): Unit

  @InterfaceMethod(6)
  public fun get_Cursor(): CoreCursor?

  @InterfaceMethod(7)
  public fun DragEnter(dragInfo: CoreDragInfo?, dragUIOverride: CoreDragUIOverride?):
      DataPackageOperation?

  @InterfaceMethod(8)
  public fun DragOver(dragInfo: CoreDragInfo?, dragUIOverride: CoreDragUIOverride?):
      DataPackageOperation?

  @InterfaceMethod(9)
  public fun Drop(dragInfo: CoreDragInfo?): DataPackageOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2CompositionController> {
    public override fun getValue() =
        ABI.makeICoreWebView2CompositionController(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2CompositionController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2CompositionController {
    public val __884807457_Ptr: Pointer?

    public val _884807457_VtblPtr: Pointer?
      get() = __884807457_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RootVisualTarget(): IUnknown? {
      val fnPtr = _884807457_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RootVisualTarget(value: IUnknown?): Unit {
      val fnPtr = _884807457_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_CursorChanged(handler: TypedEventHandler<CoreWebView2CompositionController?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _884807457_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CursorChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _884807457_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SendMouseInput(
      eventKind: CoreWebView2MouseEventKind?,
      virtualKeys: CoreWebView2MouseEventVirtualKeys?,
      mouseData: WinDef.UINT,
      point: Point?
    ): Unit {
      val fnPtr = _884807457_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr, marshalToNative(eventKind),
          marshalToNative(virtualKeys), mouseData, marshalToNative(point),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SendPointerInput(eventKind: CoreWebView2PointerEventKind?,
        pointerInfo: CoreWebView2PointerInfo?): Unit {
      val fnPtr = _884807457_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr, marshalToNative(eventKind),
          marshalToNative(pointerInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Cursor(): CoreCursor? {
      val fnPtr = _884807457_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreCursor>()
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreCursor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun DragEnter(dragInfo: CoreDragInfo?, dragUIOverride: CoreDragUIOverride?):
        DataPackageOperation? {
      val fnPtr = _884807457_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr, marshalToNative(dragInfo),
          marshalToNative(dragUIOverride), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun DragOver(dragInfo: CoreDragInfo?, dragUIOverride: CoreDragUIOverride?):
        DataPackageOperation? {
      val fnPtr = _884807457_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr, marshalToNative(dragInfo),
          marshalToNative(dragUIOverride), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun Drop(dragInfo: CoreDragInfo?): DataPackageOperation? {
      val fnPtr = _884807457_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__884807457_Ptr, marshalToNative(dragInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2CompositionController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __884807457_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2CompositionController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31bbb15311b258e89beb69f5c8e14420")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2CompositionController(ptr: Pointer?): WithDefault =
        ICoreWebView2CompositionController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2CompositionController {
      val address = segment.toRawLongValue()
      return makeICoreWebView2CompositionController(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2CompositionController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__884807457_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2CompositionController):
        Array<ICoreWebView2CompositionController?> = (elements as
        Array<ICoreWebView2CompositionController?>).castToImpl<ICoreWebView2CompositionController,ICoreWebView2CompositionController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2CompositionController?> =
        arrayOfNulls<ICoreWebView2CompositionController_Impl>(size) as
        Array<ICoreWebView2CompositionController?>
  }
}
