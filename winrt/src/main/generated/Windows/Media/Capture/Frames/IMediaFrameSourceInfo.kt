package Windows.Media.Capture.Frames

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.Collections.IMapView
import Windows.Media.Capture.MediaStreamType
import Windows.Perception.Spatial.SpatialCoordinateSystem
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaFrameSourceInfo.ABI::class)
@Signature("{87bdc9cd-4601-408f-91cf-038318cd0af3}")
@Guid("87bdc9cd4601408f91cf038318cd0af3")
@WinRTInterface("87bdc9cd4601408f91cf038318cd0af3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceInfo.ByReference::class)
public interface IMediaFrameSourceInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_MediaStreamType(): MediaStreamType?

  @InterfaceMethod(2)
  public fun get_SourceKind(): MediaFrameSourceKind?

  @InterfaceMethod(3)
  public fun get_SourceGroup(): MediaFrameSourceGroup?

  @InterfaceMethod(4)
  public fun get_DeviceInformation(): DeviceInformation?

  @InterfaceMethod(5)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  @InterfaceMethod(6)
  public fun get_CoordinateSystem(): SpatialCoordinateSystem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceInfo> {
    public override fun getValue() = ABI.makeIMediaFrameSourceInfo(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceInfo {
    public val __983663448_Ptr: Pointer?

    public val _983663448_VtblPtr: Pointer?
      get() = __983663448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _983663448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__983663448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaStreamType(): MediaStreamType? {
      val fnPtr = _983663448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamType>()
      val hr = fn.invokeHR(arrayOf(__983663448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SourceKind(): MediaFrameSourceKind? {
      val fnPtr = _983663448_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameSourceKind>()
      val hr = fn.invokeHR(arrayOf(__983663448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SourceGroup(): MediaFrameSourceGroup? {
      val fnPtr = _983663448_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameSourceGroup>()
      val hr = fn.invokeHR(arrayOf(__983663448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameSourceGroup>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DeviceInformation(): DeviceInformation? {
      val fnPtr = _983663448_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__983663448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _983663448_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__983663448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CoordinateSystem(): SpatialCoordinateSystem? {
      val fnPtr = _983663448_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__983663448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __983663448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87bdc9cd4601408f91cf038318cd0af3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceInfo(ptr: Pointer?): WithDefault =
        IMediaFrameSourceInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceInfo {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceInfo(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__983663448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceInfo): Array<IMediaFrameSourceInfo?> =
        (elements as
        Array<IMediaFrameSourceInfo?>).castToImpl<IMediaFrameSourceInfo,IMediaFrameSourceInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceInfo?> =
        arrayOfNulls<IMediaFrameSourceInfo_Impl>(size) as Array<IMediaFrameSourceInfo?>
  }
}
