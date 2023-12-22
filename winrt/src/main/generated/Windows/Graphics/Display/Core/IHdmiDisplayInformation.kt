package Windows.Graphics.Display.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHdmiDisplayInformation.ABI::class)
@Signature("{130b3c0a-f565-476e-abd5-ea05aee74c69}")
@Guid("130b3c0af565476eabd5ea05aee74c69")
@WinRTInterface("130b3c0af565476eabd5ea05aee74c69")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHdmiDisplayInformation.ByReference::class)
public interface IHdmiDisplayInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSupportedDisplayModes(): IVectorView<HdmiDisplayMode?>?

  @InterfaceMethod(1)
  public fun GetCurrentDisplayMode(): HdmiDisplayMode?

  @InterfaceMethod(2)
  public fun SetDefaultDisplayModeAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun RequestSetCurrentDisplayModeAsync(mode: HdmiDisplayMode?): IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun RequestSetCurrentDisplayModeAsync(mode: HdmiDisplayMode?,
      hdrOption: HdmiDisplayHdrOption?): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun RequestSetCurrentDisplayModeAsync(
    mode: HdmiDisplayMode?,
    hdrOption: HdmiDisplayHdrOption?,
    hdrMetadata: HdmiDisplayHdr2086Metadata?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(6)
  public fun add_DisplayModesChanged(value: TypedEventHandler<HdmiDisplayInformation?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_DisplayModesChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHdmiDisplayInformation> {
    public override fun getValue() = ABI.makeIHdmiDisplayInformation(pointer.getPointer(0))

    public fun setValue(value: IHdmiDisplayInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHdmiDisplayInformation {
    public val __767594904_Ptr: Pointer?

    public val _767594904_VtblPtr: Pointer?
      get() = __767594904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSupportedDisplayModes(): IVectorView<HdmiDisplayMode?>? {
      val fnPtr = _767594904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HdmiDisplayMode?>>()
      val hr = fn.invokeHR(arrayOf(__767594904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HdmiDisplayMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentDisplayMode(): HdmiDisplayMode? {
      val fnPtr = _767594904_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HdmiDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__767594904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HdmiDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetDefaultDisplayModeAsync(): IAsyncAction? {
      val fnPtr = _767594904_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__767594904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestSetCurrentDisplayModeAsync(mode: HdmiDisplayMode?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _767594904_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__767594904_Ptr, marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestSetCurrentDisplayModeAsync(mode: HdmiDisplayMode?,
        hdrOption: HdmiDisplayHdrOption?): IAsyncOperation<Boolean>? {
      val fnPtr = _767594904_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__767594904_Ptr, marshalToNative(mode),
          marshalToNative(hdrOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RequestSetCurrentDisplayModeAsync(
      mode: HdmiDisplayMode?,
      hdrOption: HdmiDisplayHdrOption?,
      hdrMetadata: HdmiDisplayHdr2086Metadata?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _767594904_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__767594904_Ptr, marshalToNative(mode),
          marshalToNative(hdrOption), marshalToNative(hdrMetadata), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_DisplayModesChanged(value: TypedEventHandler<HdmiDisplayInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _767594904_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__767594904_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_DisplayModesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _767594904_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__767594904_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHdmiDisplayInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __767594904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHdmiDisplayInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("130b3c0af565476eabd5ea05aee74c69")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHdmiDisplayInformation(ptr: Pointer?): WithDefault =
        IHdmiDisplayInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHdmiDisplayInformation {
      val address = segment.toRawLongValue()
      return makeIHdmiDisplayInformation(Pointer(address))
    }

    public override fun toNative(obj: IHdmiDisplayInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__767594904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHdmiDisplayInformation): Array<IHdmiDisplayInformation?>
        = (elements as
        Array<IHdmiDisplayInformation?>).castToImpl<IHdmiDisplayInformation,IHdmiDisplayInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHdmiDisplayInformation?> =
        arrayOfNulls<IHdmiDisplayInformation_Impl>(size) as Array<IHdmiDisplayInformation?>
  }
}
