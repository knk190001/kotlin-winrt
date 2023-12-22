package Microsoft.Graphics.Display

import Microsoft.UI.Dispatching.DispatcherQueue
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IDisplayInformation.ABI::class)
@Signature("{f0d58d4f-84ce-5b27-b222-4f8f7dc0aaeb}")
@Guid("f0d58d4f84ce5b27b2224f8f7dc0aaeb")
@WinRTInterface("f0d58d4f84ce5b27b2224f8f7dc0aaeb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayInformation.ByReference::class)
public interface IDisplayInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(1)
  public fun get_IsStereoEnabled(): Boolean

  @InterfaceMethod(2)
  public fun add_IsStereoEnabledChanged(handler: TypedEventHandler<DisplayInformation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_IsStereoEnabledChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun GetColorProfileAsync(): IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(5)
  public fun GetColorProfile(): IRandomAccessStream?

  @InterfaceMethod(6)
  public fun add_ColorProfileChanged(handler: TypedEventHandler<DisplayInformation?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ColorProfileChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun GetAdvancedColorInfo(): DisplayAdvancedColorInfo?

  @InterfaceMethod(9)
  public fun add_AdvancedColorInfoChanged(handler: TypedEventHandler<DisplayInformation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_AdvancedColorInfoChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_Destroyed(handler: TypedEventHandler<DisplayInformation?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_Destroyed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayInformation> {
    public override fun getValue() = ABI.makeIDisplayInformation(pointer.getPointer(0))

    public fun setValue(value: IDisplayInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayInformation {
    public val __1753960620_Ptr: Pointer?

    public val _1753960620_VtblPtr: Pointer?
      get() = __1753960620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsStereoEnabled(): Boolean {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_IsStereoEnabledChanged(handler: TypedEventHandler<DisplayInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_IsStereoEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetColorProfileAsync(): IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetColorProfile(): IRandomAccessStream? {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_ColorProfileChanged(handler: TypedEventHandler<DisplayInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ColorProfileChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun GetAdvancedColorInfo(): DisplayAdvancedColorInfo? {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAdvancedColorInfo>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAdvancedColorInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_AdvancedColorInfoChanged(handler: TypedEventHandler<DisplayInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_AdvancedColorInfoChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_Destroyed(handler: TypedEventHandler<DisplayInformation?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_Destroyed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1753960620_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1753960620_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1753960620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0d58d4f84ce5b27b2224f8f7dc0aaeb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayInformation(ptr: Pointer?): WithDefault = IDisplayInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayInformation {
      val address = segment.toRawLongValue()
      return makeIDisplayInformation(Pointer(address))
    }

    public override fun toNative(obj: IDisplayInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1753960620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayInformation): Array<IDisplayInformation?> =
        (elements as
        Array<IDisplayInformation?>).castToImpl<IDisplayInformation,IDisplayInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayInformation?> =
        arrayOfNulls<IDisplayInformation_Impl>(size) as Array<IDisplayInformation?>
  }
}
