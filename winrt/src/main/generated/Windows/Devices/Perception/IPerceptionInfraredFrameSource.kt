package Windows.Devices.Perception

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Media.Devices.Core.CameraIntrinsics
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerceptionInfraredFrameSource.ABI::class)
@Signature("{55b08742-1808-494e-9e30-9d2a7be8f700}")
@Guid("55b087421808494e9e309d2a7be8f700")
@WinRTInterface("55b087421808494e9e309d2a7be8f700")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionInfraredFrameSource.ByReference::class)
public interface IPerceptionInfraredFrameSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AvailableChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AvailableChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_ActiveChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ActiveChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_PropertiesChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
      PerceptionFrameSourcePropertiesChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PropertiesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_VideoProfileChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_VideoProfileChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_CameraIntrinsicsChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_CameraIntrinsicsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun get_Id(): String?

  @InterfaceMethod(11)
  public fun get_DisplayName(): String?

  @InterfaceMethod(12)
  public fun get_DeviceKind(): String?

  @InterfaceMethod(13)
  public fun get_Available(): Boolean

  @InterfaceMethod(14)
  public fun get_Active(): Boolean

  @InterfaceMethod(15)
  public fun get_IsControlled(): Boolean

  @InterfaceMethod(16)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  @InterfaceMethod(17)
  public fun get_SupportedVideoProfiles(): IVectorView<PerceptionVideoProfile?>?

  @InterfaceMethod(18)
  public fun get_AvailableVideoProfiles(): IVectorView<PerceptionVideoProfile?>?

  @InterfaceMethod(19)
  public fun get_VideoProfile(): PerceptionVideoProfile?

  @InterfaceMethod(20)
  public fun get_CameraIntrinsics(): CameraIntrinsics?

  @InterfaceMethod(21)
  public fun AcquireControlSession(): PerceptionControlSession?

  @InterfaceMethod(22)
  public fun CanControlIndependentlyFrom(targetId: String?): Boolean

  @InterfaceMethod(23)
  public fun IsCorrelatedWith(targetId: String?): Boolean

  @InterfaceMethod(24)
  public fun TryGetTransformTo(targetId: String?,
      result: Windows.Foundation.Numerics.Matrix4x4.ByReference?): Boolean

  @InterfaceMethod(25)
  public fun TryGetDepthCorrelatedCameraIntrinsicsAsync(target: PerceptionDepthFrameSource?):
      IAsyncOperation<PerceptionDepthCorrelatedCameraIntrinsics?>?

  @InterfaceMethod(26)
  public fun TryGetDepthCorrelatedCoordinateMapperAsync(targetId: String?,
      depthFrameSourceToMapWith: PerceptionDepthFrameSource?):
      IAsyncOperation<PerceptionDepthCorrelatedCoordinateMapper?>?

  @InterfaceMethod(27)
  public fun TrySetVideoProfileAsync(controlSession: PerceptionControlSession?,
      profile: PerceptionVideoProfile?):
      IAsyncOperation<PerceptionFrameSourcePropertyChangeResult?>?

  @InterfaceMethod(28)
  public fun OpenReader(): PerceptionInfraredFrameReader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionInfraredFrameSource> {
    public override fun getValue() = ABI.makeIPerceptionInfraredFrameSource(pointer.getPointer(0))

    public fun setValue(value: IPerceptionInfraredFrameSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionInfraredFrameSource {
    public val __2007416838_Ptr: Pointer?

    public val _2007416838_VtblPtr: Pointer?
      get() = __2007416838_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_AvailableChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AvailableChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ActiveChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ActiveChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_PropertiesChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
        PerceptionFrameSourcePropertiesChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PropertiesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_VideoProfileChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_VideoProfileChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun add_CameraIntrinsicsChanged(handler: TypedEventHandler<PerceptionInfraredFrameSource?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_CameraIntrinsicsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Id(): String? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_DisplayName(): String? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_DeviceKind(): String? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Available(): Boolean {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_Active(): Boolean {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_IsControlled(): Boolean {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_SupportedVideoProfiles(): IVectorView<PerceptionVideoProfile?>? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PerceptionVideoProfile?>>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PerceptionVideoProfile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_AvailableVideoProfiles(): IVectorView<PerceptionVideoProfile?>? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PerceptionVideoProfile?>>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PerceptionVideoProfile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_VideoProfile(): PerceptionVideoProfile? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionVideoProfile>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionVideoProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_CameraIntrinsics(): CameraIntrinsics? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraIntrinsics>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraIntrinsics>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun AcquireControlSession(): PerceptionControlSession? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionControlSession>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionControlSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun CanControlIndependentlyFrom(targetId: String?): Boolean {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(targetId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun IsCorrelatedWith(targetId: String?): Boolean {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(targetId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun TryGetTransformTo(targetId: String?,
        result: Windows.Foundation.Numerics.Matrix4x4.ByReference?): Boolean {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(targetId),
          marshalToNative(result), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override
        fun TryGetDepthCorrelatedCameraIntrinsicsAsync(target: PerceptionDepthFrameSource?):
        IAsyncOperation<PerceptionDepthCorrelatedCameraIntrinsics?>? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<PerceptionDepthCorrelatedCameraIntrinsics?>>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PerceptionDepthCorrelatedCameraIntrinsics?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun TryGetDepthCorrelatedCoordinateMapperAsync(targetId: String?,
        depthFrameSourceToMapWith: PerceptionDepthFrameSource?):
        IAsyncOperation<PerceptionDepthCorrelatedCoordinateMapper?>? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<PerceptionDepthCorrelatedCoordinateMapper?>>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(targetId),
          marshalToNative(depthFrameSourceToMapWith), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PerceptionDepthCorrelatedCoordinateMapper?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun TrySetVideoProfileAsync(controlSession: PerceptionControlSession?,
        profile: PerceptionVideoProfile?):
        IAsyncOperation<PerceptionFrameSourcePropertyChangeResult?>? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<PerceptionFrameSourcePropertyChangeResult?>>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr, marshalToNative(controlSession),
          marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PerceptionFrameSourcePropertyChangeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun OpenReader(): PerceptionInfraredFrameReader? {
      val fnPtr = _2007416838_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionInfraredFrameReader>()
      val hr = fn.invokeHR(arrayOf(__2007416838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionInfraredFrameReader>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionInfraredFrameSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2007416838_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionInfraredFrameSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55b087421808494e9e309d2a7be8f700")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionInfraredFrameSource(ptr: Pointer?): WithDefault =
        IPerceptionInfraredFrameSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionInfraredFrameSource {
      val address = segment.toRawLongValue()
      return makeIPerceptionInfraredFrameSource(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionInfraredFrameSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2007416838_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionInfraredFrameSource):
        Array<IPerceptionInfraredFrameSource?> = (elements as
        Array<IPerceptionInfraredFrameSource?>).castToImpl<IPerceptionInfraredFrameSource,IPerceptionInfraredFrameSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionInfraredFrameSource?> =
        arrayOfNulls<IPerceptionInfraredFrameSource_Impl>(size) as
        Array<IPerceptionInfraredFrameSource?>
  }
}
