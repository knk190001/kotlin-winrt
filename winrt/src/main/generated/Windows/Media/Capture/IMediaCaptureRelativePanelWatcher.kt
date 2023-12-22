package Windows.Media.Capture

import Windows.Devices.Enumeration.Panel
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IMediaCaptureRelativePanelWatcher.ABI::class)
@Signature("{7d896566-04be-5b89-b30e-bd34a9f12db0}")
@Guid("7d89656604be5b89b30ebd34a9f12db0")
@WinRTInterface("7d89656604be5b89b30ebd34a9f12db0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureRelativePanelWatcher.ByReference::class)
public interface IMediaCaptureRelativePanelWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RelativePanel(): Panel?

  @InterfaceMethod(1)
  public fun add_Changed(handler: TypedEventHandler<MediaCaptureRelativePanelWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun Start(): Unit

  @InterfaceMethod(4)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureRelativePanelWatcher> {
    public override fun getValue() =
        ABI.makeIMediaCaptureRelativePanelWatcher(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureRelativePanelWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureRelativePanelWatcher {
    public val __139943490_Ptr: Pointer?

    public val _139943490_VtblPtr: Pointer?
      get() = __139943490_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RelativePanel(): Panel? {
      val fnPtr = _139943490_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Panel>()
      val hr = fn.invokeHR(arrayOf(__139943490_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Panel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_Changed(handler: TypedEventHandler<MediaCaptureRelativePanelWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _139943490_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__139943490_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _139943490_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139943490_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Start(): Unit {
      val fnPtr = _139943490_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139943490_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Stop(): Unit {
      val fnPtr = _139943490_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139943490_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaCaptureRelativePanelWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139943490_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureRelativePanelWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d89656604be5b89b30ebd34a9f12db0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureRelativePanelWatcher(ptr: Pointer?): WithDefault =
        IMediaCaptureRelativePanelWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureRelativePanelWatcher {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureRelativePanelWatcher(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureRelativePanelWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139943490_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureRelativePanelWatcher):
        Array<IMediaCaptureRelativePanelWatcher?> = (elements as
        Array<IMediaCaptureRelativePanelWatcher?>).castToImpl<IMediaCaptureRelativePanelWatcher,IMediaCaptureRelativePanelWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureRelativePanelWatcher?> =
        arrayOfNulls<IMediaCaptureRelativePanelWatcher_Impl>(size) as
        Array<IMediaCaptureRelativePanelWatcher?>
  }
}
