package Windows.Devices.Sensors

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IProximitySensorReading.ABI::class)
@Signature("{71228d59-132d-4d5f-8ff9-2f0db8751ced}")
@Guid("71228d59132d4d5f8ff92f0db8751ced")
@WinRTInterface("71228d59132d4d5f8ff92f0db8751ced")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProximitySensorReading.ByReference::class)
public interface IProximitySensorReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_IsDetected(): Boolean

  @InterfaceMethod(2)
  public fun get_DistanceInMillimeters(): IReference<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProximitySensorReading> {
    public override fun getValue() = ABI.makeIProximitySensorReading(pointer.getPointer(0))

    public fun setValue(value: IProximitySensorReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProximitySensorReading {
    public val __1414935521_Ptr: Pointer?

    public val _1414935521_VtblPtr: Pointer?
      get() = __1414935521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1414935521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1414935521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsDetected(): Boolean {
      val fnPtr = _1414935521_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1414935521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_DistanceInMillimeters(): IReference<WinDef.UINT>? {
      val fnPtr = _1414935521_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1414935521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IProximitySensorReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1414935521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProximitySensorReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71228d59132d4d5f8ff92f0db8751ced")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProximitySensorReading(ptr: Pointer?): WithDefault =
        IProximitySensorReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProximitySensorReading {
      val address = segment.toRawLongValue()
      return makeIProximitySensorReading(Pointer(address))
    }

    public override fun toNative(obj: IProximitySensorReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1414935521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProximitySensorReading): Array<IProximitySensorReading?>
        = (elements as
        Array<IProximitySensorReading?>).castToImpl<IProximitySensorReading,IProximitySensorReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProximitySensorReading?> =
        arrayOfNulls<IProximitySensorReading_Impl>(size) as Array<IProximitySensorReading?>
  }
}
