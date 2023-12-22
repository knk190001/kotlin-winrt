package Windows.Media.Protection.PlayReady

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
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

@ABIMarker(INDClient.ABI::class)
@Signature("{3bd6781b-61b8-46e2-99a5-8abcb6b9f7d6}")
@Guid("3bd6781b61b846e299a58abcb6b9f7d6")
@WinRTInterface("3bd6781b61b846e299a58abcb6b9f7d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDClient.ByReference::class)
public interface INDClient : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_RegistrationCompleted(handler: TypedEventHandler<NDClient?,
      INDRegistrationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_RegistrationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_ProximityDetectionCompleted(handler: TypedEventHandler<NDClient?,
      INDProximityDetectionCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ProximityDetectionCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_LicenseFetchCompleted(handler: TypedEventHandler<NDClient?,
      INDLicenseFetchCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_LicenseFetchCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_ReRegistrationNeeded(handler: TypedEventHandler<NDClient?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ReRegistrationNeeded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_ClosedCaptionDataReceived(handler: TypedEventHandler<NDClient?,
      INDClosedCaptionDataReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_ClosedCaptionDataReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun StartAsync(
    contentUrl: Uri?,
    startAsyncOptions: WinDef.UINT,
    registrationCustomData: INDCustomData?,
    licenseFetchDescriptor: INDLicenseFetchDescriptor?
  ): IAsyncOperation<INDStartResult?>?

  @InterfaceMethod(11)
  public fun LicenseFetchAsync(licenseFetchDescriptor: INDLicenseFetchDescriptor?):
      IAsyncOperation<INDLicenseFetchResult?>?

  @InterfaceMethod(12)
  public fun ReRegistrationAsync(registrationCustomData: INDCustomData?): IAsyncAction?

  @InterfaceMethod(13)
  public fun Close(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INDClient> {
    public override fun getValue() = ABI.makeINDClient(pointer.getPointer(0))

    public fun setValue(value: INDClient_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDClient {
    public val __1508994821_Ptr: Pointer?

    public val _1508994821_VtblPtr: Pointer?
      get() = __1508994821_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_RegistrationCompleted(handler: TypedEventHandler<NDClient?,
        INDRegistrationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_RegistrationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ProximityDetectionCompleted(handler: TypedEventHandler<NDClient?,
        INDProximityDetectionCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ProximityDetectionCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_LicenseFetchCompleted(handler: TypedEventHandler<NDClient?,
        INDLicenseFetchCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_LicenseFetchCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_ReRegistrationNeeded(handler: TypedEventHandler<NDClient?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ReRegistrationNeeded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_ClosedCaptionDataReceived(handler: TypedEventHandler<NDClient?,
        INDClosedCaptionDataReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_ClosedCaptionDataReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun StartAsync(
      contentUrl: Uri?,
      startAsyncOptions: WinDef.UINT,
      registrationCustomData: INDCustomData?,
      licenseFetchDescriptor: INDLicenseFetchDescriptor?
    ): IAsyncOperation<INDStartResult?>? {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<INDStartResult?>>()
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(contentUrl), startAsyncOptions,
          marshalToNative(registrationCustomData), marshalToNative(licenseFetchDescriptor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<INDStartResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun LicenseFetchAsync(licenseFetchDescriptor: INDLicenseFetchDescriptor?):
        IAsyncOperation<INDLicenseFetchResult?>? {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<INDLicenseFetchResult?>>()
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(licenseFetchDescriptor),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<INDLicenseFetchResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun ReRegistrationAsync(registrationCustomData: INDCustomData?): IAsyncAction? {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, marshalToNative(registrationCustomData),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun Close(): Unit {
      val fnPtr = _1508994821_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1508994821_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INDClient_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1508994821_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDClient, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bd6781b61b846e299a58abcb6b9f7d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDClient(ptr: Pointer?): WithDefault = INDClient_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDClient {
      val address = segment.toRawLongValue()
      return makeINDClient(Pointer(address))
    }

    public override fun toNative(obj: INDClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1508994821_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDClient): Array<INDClient?> = (elements as
        Array<INDClient?>).castToImpl<INDClient,INDClient_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDClient?> = arrayOfNulls<INDClient_Impl>(size)
        as Array<INDClient?>
  }
}
