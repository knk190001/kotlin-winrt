package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(IGattServiceUuidsStatics2.ABI::class)
@Signature("{d2ae94f5-3d15-4f79-9c0c-eaafa675155c}")
@Guid("d2ae94f53d154f799c0ceaafa675155c")
@WinRTInterface("d2ae94f53d154f799c0ceaafa675155c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceUuidsStatics2.ByReference::class)
public interface IGattServiceUuidsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlertNotification(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_CurrentTime(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_CyclingPower(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_DeviceInformation(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun get_HumanInterfaceDevice(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_ImmediateAlert(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(6)
  public fun get_LinkLoss(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(7)
  public fun get_LocationAndNavigation(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(8)
  public fun get_NextDstChange(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(9)
  public fun get_PhoneAlertStatus(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(10)
  public fun get_ReferenceTimeUpdate(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(11)
  public fun get_ScanParameters(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(12)
  public fun get_TxPower(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceUuidsStatics2> {
    public override fun getValue() = ABI.makeIGattServiceUuidsStatics2(pointer.getPointer(0))

    public fun setValue(value: IGattServiceUuidsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceUuidsStatics2 {
    public val __1397609013_Ptr: Pointer?

    public val _1397609013_VtblPtr: Pointer?
      get() = __1397609013_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlertNotification(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CurrentTime(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CyclingPower(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DeviceInformation(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HumanInterfaceDevice(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ImmediateAlert(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_LinkLoss(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_LocationAndNavigation(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_NextDstChange(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PhoneAlertStatus(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ReferenceTimeUpdate(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_ScanParameters(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_TxPower(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1397609013_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1397609013_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IGattServiceUuidsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1397609013_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceUuidsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2ae94f53d154f799c0ceaafa675155c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceUuidsStatics2(ptr: Pointer?): WithDefault =
        IGattServiceUuidsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceUuidsStatics2 {
      val address = segment.toRawLongValue()
      return makeIGattServiceUuidsStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceUuidsStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1397609013_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceUuidsStatics2):
        Array<IGattServiceUuidsStatics2?> = (elements as
        Array<IGattServiceUuidsStatics2?>).castToImpl<IGattServiceUuidsStatics2,IGattServiceUuidsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceUuidsStatics2?> =
        arrayOfNulls<IGattServiceUuidsStatics2_Impl>(size) as Array<IGattServiceUuidsStatics2?>
  }
}
