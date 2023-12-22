package Windows.UI.Input.Spatial

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialInteractionControllerProperties.ABI::class)
@Signature("{61056fb1-7ba9-4e35-b93f-9272cba9b28b}")
@Guid("61056fb17ba94e35b93f9272cba9b28b")
@WinRTInterface("61056fb17ba94e35b93f9272cba9b28b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionControllerProperties.ByReference::class)
public interface ISpatialInteractionControllerProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTouchpadTouched(): Boolean

  @InterfaceMethod(1)
  public fun get_IsTouchpadPressed(): Boolean

  @InterfaceMethod(2)
  public fun get_IsThumbstickPressed(): Boolean

  @InterfaceMethod(3)
  public fun get_ThumbstickX(): Double

  @InterfaceMethod(4)
  public fun get_ThumbstickY(): Double

  @InterfaceMethod(5)
  public fun get_TouchpadX(): Double

  @InterfaceMethod(6)
  public fun get_TouchpadY(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionControllerProperties> {
    public override fun getValue() =
        ABI.makeISpatialInteractionControllerProperties(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionControllerProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionControllerProperties {
    public val __1393444587_Ptr: Pointer?

    public val _1393444587_VtblPtr: Pointer?
      get() = __1393444587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTouchpadTouched(): Boolean {
      val fnPtr = _1393444587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1393444587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsTouchpadPressed(): Boolean {
      val fnPtr = _1393444587_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1393444587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsThumbstickPressed(): Boolean {
      val fnPtr = _1393444587_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1393444587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ThumbstickX(): Double {
      val fnPtr = _1393444587_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1393444587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ThumbstickY(): Double {
      val fnPtr = _1393444587_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1393444587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_TouchpadX(): Double {
      val fnPtr = _1393444587_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1393444587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_TouchpadY(): Double {
      val fnPtr = _1393444587_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1393444587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialInteractionControllerProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1393444587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionControllerProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61056fb17ba94e35b93f9272cba9b28b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionControllerProperties(ptr: Pointer?): WithDefault =
        ISpatialInteractionControllerProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpatialInteractionControllerProperties {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionControllerProperties(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionControllerProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1393444587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionControllerProperties):
        Array<ISpatialInteractionControllerProperties?> = (elements as
        Array<ISpatialInteractionControllerProperties?>).castToImpl<ISpatialInteractionControllerProperties,ISpatialInteractionControllerProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionControllerProperties?> =
        arrayOfNulls<ISpatialInteractionControllerProperties_Impl>(size) as
        Array<ISpatialInteractionControllerProperties?>
  }
}
