package Windows.Devices.Input.Preview

import Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription
import Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGazeDevicePreview.ABI::class)
@Signature("{e79e7ee9-b389-11e7-b201-c8d3ffb75721}")
@Guid("e79e7ee9b38911e7b201c8d3ffb75721")
@WinRTInterface("e79e7ee9b38911e7b201c8d3ffb75721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazeDevicePreview.ByReference::class)
public interface IGazeDevicePreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_CanTrackEyes(): Boolean

  @InterfaceMethod(2)
  public fun get_CanTrackHead(): Boolean

  @InterfaceMethod(3)
  public fun get_ConfigurationState(): GazeDeviceConfigurationStatePreview?

  @InterfaceMethod(4)
  public fun RequestCalibrationAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun GetNumericControlDescriptions(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
      IVectorView<HidNumericControlDescription?>?

  @InterfaceMethod(6)
  public fun GetBooleanControlDescriptions(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
      IVectorView<HidBooleanControlDescription?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazeDevicePreview> {
    public override fun getValue() = ABI.makeIGazeDevicePreview(pointer.getPointer(0))

    public fun setValue(value: IGazeDevicePreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazeDevicePreview {
    public val __9145236_Ptr: Pointer?

    public val _9145236_VtblPtr: Pointer?
      get() = __9145236_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _9145236_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__9145236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanTrackEyes(): Boolean {
      val fnPtr = _9145236_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__9145236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CanTrackHead(): Boolean {
      val fnPtr = _9145236_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__9145236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ConfigurationState(): GazeDeviceConfigurationStatePreview? {
      val fnPtr = _9145236_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GazeDeviceConfigurationStatePreview>()
      val hr = fn.invokeHR(arrayOf(__9145236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GazeDeviceConfigurationStatePreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestCalibrationAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _9145236_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__9145236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetNumericControlDescriptions(usagePage: WinDef.USHORT,
        usageId: WinDef.USHORT): IVectorView<HidNumericControlDescription?>? {
      val fnPtr = _9145236_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HidNumericControlDescription?>>()
      val hr = fn.invokeHR(arrayOf(__9145236_Ptr, usagePage, usageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<HidNumericControlDescription?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetBooleanControlDescriptions(usagePage: WinDef.USHORT,
        usageId: WinDef.USHORT): IVectorView<HidBooleanControlDescription?>? {
      val fnPtr = _9145236_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HidBooleanControlDescription?>>()
      val hr = fn.invokeHR(arrayOf(__9145236_Ptr, usagePage, usageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<HidBooleanControlDescription?>>(result.getValue())
      return resultValue
    }
  }

  public class IGazeDevicePreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __9145236_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazeDevicePreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e79e7ee9b38911e7b201c8d3ffb75721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazeDevicePreview(ptr: Pointer?): WithDefault = IGazeDevicePreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGazeDevicePreview {
      val address = segment.toRawLongValue()
      return makeIGazeDevicePreview(Pointer(address))
    }

    public override fun toNative(obj: IGazeDevicePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__9145236_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazeDevicePreview): Array<IGazeDevicePreview?> =
        (elements as
        Array<IGazeDevicePreview?>).castToImpl<IGazeDevicePreview,IGazeDevicePreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazeDevicePreview?> =
        arrayOfNulls<IGazeDevicePreview_Impl>(size) as Array<IGazeDevicePreview?>
  }
}
