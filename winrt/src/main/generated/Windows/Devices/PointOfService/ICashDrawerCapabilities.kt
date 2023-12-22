package Windows.Devices.PointOfService

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICashDrawerCapabilities.ABI::class)
@Signature("{0bc6de0b-e8e7-4b1f-b1d1-3e501ad08247}")
@Guid("0bc6de0be8e74b1fb1d13e501ad08247")
@WinRTInterface("0bc6de0be8e74b1fb1d13e501ad08247")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICashDrawerCapabilities.ByReference::class)
public interface ICashDrawerCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PowerReportingType(): UnifiedPosPowerReportingType?

  @InterfaceMethod(1)
  public fun get_IsStatisticsReportingSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_IsStatisticsUpdatingSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_IsStatusReportingSupported(): Boolean

  @InterfaceMethod(4)
  public fun get_IsStatusMultiDrawerDetectSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_IsDrawerOpenSensorAvailable(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICashDrawerCapabilities> {
    public override fun getValue() = ABI.makeICashDrawerCapabilities(pointer.getPointer(0))

    public fun setValue(value: ICashDrawerCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICashDrawerCapabilities {
    public val __797828537_Ptr: Pointer?

    public val _797828537_VtblPtr: Pointer?
      get() = __797828537_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PowerReportingType(): UnifiedPosPowerReportingType? {
      val fnPtr = _797828537_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnifiedPosPowerReportingType>()
      val hr = fn.invokeHR(arrayOf(__797828537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnifiedPosPowerReportingType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsStatisticsReportingSupported(): Boolean {
      val fnPtr = _797828537_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__797828537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsStatisticsUpdatingSupported(): Boolean {
      val fnPtr = _797828537_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__797828537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsStatusReportingSupported(): Boolean {
      val fnPtr = _797828537_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__797828537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsStatusMultiDrawerDetectSupported(): Boolean {
      val fnPtr = _797828537_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__797828537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsDrawerOpenSensorAvailable(): Boolean {
      val fnPtr = _797828537_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__797828537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICashDrawerCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __797828537_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICashDrawerCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0bc6de0be8e74b1fb1d13e501ad08247")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICashDrawerCapabilities(ptr: Pointer?): WithDefault =
        ICashDrawerCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICashDrawerCapabilities {
      val address = segment.toRawLongValue()
      return makeICashDrawerCapabilities(Pointer(address))
    }

    public override fun toNative(obj: ICashDrawerCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__797828537_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICashDrawerCapabilities): Array<ICashDrawerCapabilities?>
        = (elements as
        Array<ICashDrawerCapabilities?>).castToImpl<ICashDrawerCapabilities,ICashDrawerCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICashDrawerCapabilities?> =
        arrayOfNulls<ICashDrawerCapabilities_Impl>(size) as Array<ICashDrawerCapabilities?>
  }
}
