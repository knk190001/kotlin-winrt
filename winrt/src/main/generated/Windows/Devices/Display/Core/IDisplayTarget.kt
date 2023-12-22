package Windows.Devices.Display.Core

import Windows.Devices.Display.DisplayMonitor
import Windows.Devices.Display.DisplayMonitorUsageKind
import Windows.Foundation.Collections.IMapView
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayTarget.ABI::class)
@Signature("{aec57c6f-47b4-546b-987c-e73fa791fe3a}")
@Guid("aec57c6f47b4546b987ce73fa791fe3a")
@WinRTInterface("aec57c6f47b4546b987ce73fa791fe3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayTarget.ByReference::class)
public interface IDisplayTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Adapter(): DisplayAdapter?

  @InterfaceMethod(1)
  public fun get_DeviceInterfacePath(): String?

  @InterfaceMethod(2)
  public fun get_AdapterRelativeId(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_IsConnected(): Boolean

  @InterfaceMethod(4)
  public fun get_IsVirtualModeEnabled(): Boolean

  @InterfaceMethod(5)
  public fun get_IsVirtualTopologyEnabled(): Boolean

  @InterfaceMethod(6)
  public fun get_UsageKind(): DisplayMonitorUsageKind?

  @InterfaceMethod(7)
  public fun get_MonitorPersistence(): DisplayTargetPersistence?

  @InterfaceMethod(8)
  public fun get_StableMonitorId(): String?

  @InterfaceMethod(9)
  public fun TryGetMonitor(): DisplayMonitor?

  @InterfaceMethod(10)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  @InterfaceMethod(11)
  public fun get_IsStale(): Boolean

  @InterfaceMethod(12)
  public fun IsSame(otherTarget: DisplayTarget?): Boolean

  @InterfaceMethod(13)
  public fun IsEqual(otherTarget: DisplayTarget?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayTarget>
      {
    public override fun getValue() = ABI.makeIDisplayTarget(pointer.getPointer(0))

    public fun setValue(value: IDisplayTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayTarget {
    public val __1224619185_Ptr: Pointer?

    public val _1224619185_VtblPtr: Pointer?
      get() = __1224619185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Adapter(): DisplayAdapter? {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAdapter>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAdapter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceInterfacePath(): String? {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AdapterRelativeId(): WinDef.UINT {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsConnected(): Boolean {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsVirtualModeEnabled(): Boolean {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsVirtualTopologyEnabled(): Boolean {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_UsageKind(): DisplayMonitorUsageKind? {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayMonitorUsageKind>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayMonitorUsageKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MonitorPersistence(): DisplayTargetPersistence? {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayTargetPersistence>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayTargetPersistence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_StableMonitorId(): String? {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun TryGetMonitor(): DisplayMonitor? {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayMonitor>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayMonitor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IsStale(): Boolean {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun IsSame(otherTarget: DisplayTarget?): Boolean {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr, marshalToNative(otherTarget), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun IsEqual(otherTarget: DisplayTarget?): Boolean {
      val fnPtr = _1224619185_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1224619185_Ptr, marshalToNative(otherTarget), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDisplayTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1224619185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aec57c6f47b4546b987ce73fa791fe3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayTarget(ptr: Pointer?): WithDefault = IDisplayTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayTarget {
      val address = segment.toRawLongValue()
      return makeIDisplayTarget(Pointer(address))
    }

    public override fun toNative(obj: IDisplayTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1224619185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayTarget): Array<IDisplayTarget?> = (elements as
        Array<IDisplayTarget?>).castToImpl<IDisplayTarget,IDisplayTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayTarget?> =
        arrayOfNulls<IDisplayTarget_Impl>(size) as Array<IDisplayTarget?>
  }
}
