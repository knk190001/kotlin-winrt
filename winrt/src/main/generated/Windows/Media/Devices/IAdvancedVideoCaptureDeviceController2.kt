package Windows.Media.Devices

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

@ABIMarker(IAdvancedVideoCaptureDeviceController2.ABI::class)
@Signature("{8bb94f8f-f11a-43db-b402-11930b80ae56}")
@Guid("8bb94f8ff11a43dbb40211930b80ae56")
@WinRTInterface("8bb94f8ff11a43dbb40211930b80ae56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController2.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LowLagPhotoSequence(): LowLagPhotoSequenceControl?

  @InterfaceMethod(1)
  public fun get_LowLagPhoto(): LowLagPhotoControl?

  @InterfaceMethod(2)
  public fun get_SceneModeControl(): SceneModeControl?

  @InterfaceMethod(3)
  public fun get_TorchControl(): TorchControl?

  @InterfaceMethod(4)
  public fun get_FlashControl(): FlashControl?

  @InterfaceMethod(5)
  public fun get_WhiteBalanceControl(): WhiteBalanceControl?

  @InterfaceMethod(6)
  public fun get_ExposureControl(): ExposureControl?

  @InterfaceMethod(7)
  public fun get_FocusControl(): FocusControl?

  @InterfaceMethod(8)
  public fun get_ExposureCompensationControl(): ExposureCompensationControl?

  @InterfaceMethod(9)
  public fun get_IsoSpeedControl(): IsoSpeedControl?

  @InterfaceMethod(10)
  public fun get_RegionsOfInterestControl(): RegionsOfInterestControl?

  @InterfaceMethod(11)
  public fun get_PrimaryUse(): CaptureUse?

  @InterfaceMethod(12)
  public fun put_PrimaryUse(value: CaptureUse?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController2> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController2(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController2 {
    public val __71515986_Ptr: Pointer?

    public val _71515986_VtblPtr: Pointer?
      get() = __71515986_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LowLagPhotoSequence(): LowLagPhotoSequenceControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LowLagPhotoSequenceControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LowLagPhotoSequenceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LowLagPhoto(): LowLagPhotoControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LowLagPhotoControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LowLagPhotoControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SceneModeControl(): SceneModeControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneModeControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneModeControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TorchControl(): TorchControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TorchControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TorchControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FlashControl(): FlashControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlashControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlashControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_WhiteBalanceControl(): WhiteBalanceControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WhiteBalanceControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WhiteBalanceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ExposureControl(): ExposureControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExposureControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExposureControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_FocusControl(): FocusControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ExposureCompensationControl(): ExposureCompensationControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExposureCompensationControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExposureCompensationControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_IsoSpeedControl(): IsoSpeedControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsoSpeedControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsoSpeedControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_RegionsOfInterestControl(): RegionsOfInterestControl? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RegionsOfInterestControl>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RegionsOfInterestControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_PrimaryUse(): CaptureUse? {
      val fnPtr = _71515986_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CaptureUse>()
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CaptureUse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_PrimaryUse(value: CaptureUse?): Unit {
      val fnPtr = _71515986_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__71515986_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdvancedVideoCaptureDeviceController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71515986_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bb94f8ff11a43dbb40211930b80ae56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController2(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController2 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController2(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__71515986_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController2):
        Array<IAdvancedVideoCaptureDeviceController2?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController2?>).castToImpl<IAdvancedVideoCaptureDeviceController2,IAdvancedVideoCaptureDeviceController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController2?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController2_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController2?>
  }
}
