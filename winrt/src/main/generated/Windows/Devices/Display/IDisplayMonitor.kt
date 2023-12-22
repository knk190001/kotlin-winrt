package Windows.Devices.Display

import Windows.Foundation.IReference
import Windows.Foundation.Point
import Windows.Foundation.Size
import Windows.Graphics.DisplayAdapterId
import Windows.Graphics.SizeInt32
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
import kotlin.Byte
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayMonitor.ABI::class)
@Signature("{1f6b15d4-1d01-4c51-87e2-6f954a772b59}")
@Guid("1f6b15d41d014c5187e26f954a772b59")
@WinRTInterface("1f6b15d41d014c5187e26f954a772b59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayMonitor.ByReference::class)
public interface IDisplayMonitor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_ConnectionKind(): DisplayMonitorConnectionKind?

  @InterfaceMethod(3)
  public fun get_PhysicalConnector(): DisplayMonitorPhysicalConnectorKind?

  @InterfaceMethod(4)
  public fun get_DisplayAdapterDeviceId(): String?

  @InterfaceMethod(5)
  public fun get_DisplayAdapterId(): DisplayAdapterId?

  @InterfaceMethod(6)
  public fun get_DisplayAdapterTargetId(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_UsageKind(): DisplayMonitorUsageKind?

  @InterfaceMethod(8)
  public fun get_NativeResolutionInRawPixels(): SizeInt32?

  @InterfaceMethod(9)
  public fun get_PhysicalSizeInInches(): IReference<Size?>?

  @InterfaceMethod(10)
  public fun get_RawDpiX(): Float

  @InterfaceMethod(11)
  public fun get_RawDpiY(): Float

  @InterfaceMethod(12)
  public fun get_RedPrimary(): Point?

  @InterfaceMethod(13)
  public fun get_GreenPrimary(): Point?

  @InterfaceMethod(14)
  public fun get_BluePrimary(): Point?

  @InterfaceMethod(15)
  public fun get_WhitePoint(): Point?

  @InterfaceMethod(16)
  public fun get_MaxLuminanceInNits(): Float

  @InterfaceMethod(17)
  public fun get_MinLuminanceInNits(): Float

  @InterfaceMethod(18)
  public fun get_MaxAverageFullFrameLuminanceInNits(): Float

  @InterfaceMethod(19)
  public fun GetDescriptor(descriptorKind: DisplayMonitorDescriptorKind?): Array<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayMonitor> {
    public override fun getValue() = ABI.makeIDisplayMonitor(pointer.getPointer(0))

    public fun setValue(value: IDisplayMonitor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayMonitor {
    public val __1347452101_Ptr: Pointer?

    public val _1347452101_VtblPtr: Pointer?
      get() = __1347452101_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ConnectionKind(): DisplayMonitorConnectionKind? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayMonitorConnectionKind>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayMonitorConnectionKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PhysicalConnector(): DisplayMonitorPhysicalConnectorKind? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayMonitorPhysicalConnectorKind>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayMonitorPhysicalConnectorKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DisplayAdapterDeviceId(): String? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DisplayAdapterId(): DisplayAdapterId? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAdapterId>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAdapterId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DisplayAdapterTargetId(): WinDef.UINT {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_UsageKind(): DisplayMonitorUsageKind? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayMonitorUsageKind>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayMonitorUsageKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_NativeResolutionInRawPixels(): SizeInt32? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PhysicalSizeInInches(): IReference<Size?>? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Size?>>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Size?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_RawDpiX(): Float {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_RawDpiY(): Float {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_RedPrimary(): Point? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_GreenPrimary(): Point? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_BluePrimary(): Point? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_WhitePoint(): Point? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_MaxLuminanceInNits(): Float {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_MinLuminanceInNits(): Float {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_MaxAverageFullFrameLuminanceInNits(): Float {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun GetDescriptor(descriptorKind: DisplayMonitorDescriptorKind?): Array<Byte>? {
      val fnPtr = _1347452101_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1347452101_Ptr, marshalToNative(descriptorKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IDisplayMonitor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1347452101_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayMonitor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f6b15d41d014c5187e26f954a772b59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayMonitor(ptr: Pointer?): WithDefault = IDisplayMonitor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayMonitor {
      val address = segment.toRawLongValue()
      return makeIDisplayMonitor(Pointer(address))
    }

    public override fun toNative(obj: IDisplayMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1347452101_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayMonitor): Array<IDisplayMonitor?> = (elements as
        Array<IDisplayMonitor?>).castToImpl<IDisplayMonitor,IDisplayMonitor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayMonitor?> =
        arrayOfNulls<IDisplayMonitor_Impl>(size) as Array<IDisplayMonitor?>
  }
}
