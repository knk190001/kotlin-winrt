package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IMapView
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.SizeInt32
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

@ABIMarker(IDisplayModeInfo.ABI::class)
@Signature("{48d513a0-f79b-5a74-a05e-da821f470868}")
@Guid("48d513a0f79b5a74a05eda821f470868")
@WinRTInterface("48d513a0f79b5a74a05eda821f470868")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayModeInfo.ByReference::class)
public interface IDisplayModeInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceResolution(): SizeInt32?

  @InterfaceMethod(1)
  public fun get_IsStereo(): Boolean

  @InterfaceMethod(2)
  public fun get_SourcePixelFormat(): DirectXPixelFormat?

  @InterfaceMethod(3)
  public fun get_TargetResolution(): SizeInt32?

  @InterfaceMethod(4)
  public fun get_PresentationRate(): DisplayPresentationRate?

  @InterfaceMethod(5)
  public fun get_IsInterlaced(): Boolean

  @InterfaceMethod(6)
  public fun GetWireFormatSupportedBitsPerChannel(encoding: DisplayWireFormatPixelEncoding?):
      DisplayBitsPerChannel?

  @InterfaceMethod(7)
  public fun IsWireFormatSupported(wireFormat: DisplayWireFormat?): Boolean

  @InterfaceMethod(8)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayModeInfo> {
    public override fun getValue() = ABI.makeIDisplayModeInfo(pointer.getPointer(0))

    public fun setValue(value: IDisplayModeInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayModeInfo {
    public val __140114927_Ptr: Pointer?

    public val _140114927_VtblPtr: Pointer?
      get() = __140114927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceResolution(): SizeInt32? {
      val fnPtr = _140114927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsStereo(): Boolean {
      val fnPtr = _140114927_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SourcePixelFormat(): DirectXPixelFormat? {
      val fnPtr = _140114927_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TargetResolution(): SizeInt32? {
      val fnPtr = _140114927_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PresentationRate(): DisplayPresentationRate? {
      val fnPtr = _140114927_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPresentationRate>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPresentationRate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsInterlaced(): Boolean {
      val fnPtr = _140114927_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override
        fun GetWireFormatSupportedBitsPerChannel(encoding: DisplayWireFormatPixelEncoding?):
        DisplayBitsPerChannel? {
      val fnPtr = _140114927_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayBitsPerChannel>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr, marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayBitsPerChannel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun IsWireFormatSupported(wireFormat: DisplayWireFormat?): Boolean {
      val fnPtr = _140114927_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr, marshalToNative(wireFormat), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _140114927_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__140114927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayModeInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __140114927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayModeInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48d513a0f79b5a74a05eda821f470868")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayModeInfo(ptr: Pointer?): WithDefault = IDisplayModeInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayModeInfo {
      val address = segment.toRawLongValue()
      return makeIDisplayModeInfo(Pointer(address))
    }

    public override fun toNative(obj: IDisplayModeInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__140114927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayModeInfo): Array<IDisplayModeInfo?> = (elements as
        Array<IDisplayModeInfo?>).castToImpl<IDisplayModeInfo,IDisplayModeInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayModeInfo?> =
        arrayOfNulls<IDisplayModeInfo_Impl>(size) as Array<IDisplayModeInfo?>
  }
}
