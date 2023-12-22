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

@ABIMarker(IGattServiceUuidsStatics.ABI::class)
@Signature("{6dc57058-9aba-4417-b8f2-dce016d34ee2}")
@Guid("6dc570589aba4417b8f2dce016d34ee2")
@WinRTInterface("6dc570589aba4417b8f2dce016d34ee2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceUuidsStatics.ByReference::class)
public interface IGattServiceUuidsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Battery(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_BloodPressure(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_CyclingSpeedAndCadence(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_GenericAccess(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun get_GenericAttribute(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_Glucose(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(6)
  public fun get_HealthThermometer(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(7)
  public fun get_HeartRate(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(8)
  public fun get_RunningSpeedAndCadence(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceUuidsStatics> {
    public override fun getValue() = ABI.makeIGattServiceUuidsStatics(pointer.getPointer(0))

    public fun setValue(value: IGattServiceUuidsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceUuidsStatics {
    public val __1846199481_Ptr: Pointer?

    public val _1846199481_VtblPtr: Pointer?
      get() = __1846199481_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Battery(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BloodPressure(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CyclingSpeedAndCadence(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_GenericAccess(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_GenericAttribute(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Glucose(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_HealthThermometer(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_HeartRate(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_RunningSpeedAndCadence(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1846199481_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1846199481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IGattServiceUuidsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1846199481_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceUuidsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6dc570589aba4417b8f2dce016d34ee2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceUuidsStatics(ptr: Pointer?): WithDefault =
        IGattServiceUuidsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceUuidsStatics {
      val address = segment.toRawLongValue()
      return makeIGattServiceUuidsStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceUuidsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1846199481_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceUuidsStatics):
        Array<IGattServiceUuidsStatics?> = (elements as
        Array<IGattServiceUuidsStatics?>).castToImpl<IGattServiceUuidsStatics,IGattServiceUuidsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceUuidsStatics?> =
        arrayOfNulls<IGattServiceUuidsStatics_Impl>(size) as Array<IGattServiceUuidsStatics?>
  }
}
