package Windows.Media.Devices

import Windows.Media.Capture.PowerlineFrequency
import Windows.Media.Devices.IMediaDeviceController.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IVideoDeviceController.ABI::class)
@Signature("{99555575-2e2e-40b8-b6c7-f82d10013210}")
@Guid("995555752e2e40b8b6c7f82d10013210")
@WinRTInterface("995555752e2e40b8b6c7f82d10013210")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoDeviceController.ByReference::class)
public interface IVideoDeviceController : NativeMapped, IWinRTInterface, IMediaDeviceController {
  @InterfaceMethod(0)
  public fun get_Brightness(): MediaDeviceControl?

  @InterfaceMethod(1)
  public fun get_Contrast(): MediaDeviceControl?

  @InterfaceMethod(2)
  public fun get_Hue(): MediaDeviceControl?

  @InterfaceMethod(3)
  public fun get_WhiteBalance(): MediaDeviceControl?

  @InterfaceMethod(4)
  public fun get_BacklightCompensation(): MediaDeviceControl?

  @InterfaceMethod(5)
  public fun get_Pan(): MediaDeviceControl?

  @InterfaceMethod(6)
  public fun get_Tilt(): MediaDeviceControl?

  @InterfaceMethod(7)
  public fun get_Zoom(): MediaDeviceControl?

  @InterfaceMethod(8)
  public fun get_Roll(): MediaDeviceControl?

  @InterfaceMethod(9)
  public fun get_Exposure(): MediaDeviceControl?

  @InterfaceMethod(10)
  public fun get_Focus(): MediaDeviceControl?

  @InterfaceMethod(11)
  public fun TrySetPowerlineFrequency(value: PowerlineFrequency?): Boolean

  @InterfaceMethod(12)
  public fun TryGetPowerlineFrequency(value: Windows.Media.Capture.PowerlineFrequency.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoDeviceController> {
    public override fun getValue() = ABI.makeIVideoDeviceController(pointer.getPointer(0))

    public fun setValue(value: IVideoDeviceController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoDeviceController, IMediaDeviceController.WithDefault {
    public val __1051825492_Ptr: Pointer?

    public val _1051825492_VtblPtr: Pointer?
      get() = __1051825492_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Brightness(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Contrast(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Hue(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_WhiteBalance(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_BacklightCompensation(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Pan(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Tilt(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Zoom(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Roll(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Exposure(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Focus(): MediaDeviceControl? {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaDeviceControl>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaDeviceControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun TrySetPowerlineFrequency(value: PowerlineFrequency?): Boolean {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override
        fun TryGetPowerlineFrequency(value: Windows.Media.Capture.PowerlineFrequency.ByReference?):
        Boolean {
      val fnPtr = _1051825492_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1051825492_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVideoDeviceController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaDeviceController {
    public override val __1516491797_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1051825492_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1051825492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoDeviceController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("995555752e2e40b8b6c7f82d10013210")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoDeviceController(ptr: Pointer?): WithDefault =
        IVideoDeviceController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoDeviceController {
      val address = segment.toRawLongValue()
      return makeIVideoDeviceController(Pointer(address))
    }

    public override fun toNative(obj: IVideoDeviceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1051825492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoDeviceController): Array<IVideoDeviceController?> =
        (elements as
        Array<IVideoDeviceController?>).castToImpl<IVideoDeviceController,IVideoDeviceController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoDeviceController?> =
        arrayOfNulls<IVideoDeviceController_Impl>(size) as Array<IVideoDeviceController?>
  }
}
