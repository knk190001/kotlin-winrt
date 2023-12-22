package Windows.Devices.Sensors

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISensorQuaternion.ABI::class)
@Signature("{c9c5c827-c71c-46e7-9da3-36a193b232bc}")
@Guid("c9c5c827c71c46e79da336a193b232bc")
@WinRTInterface("c9c5c827c71c46e79da336a193b232bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISensorQuaternion.ByReference::class)
public interface ISensorQuaternion : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_W(): Float

  @InterfaceMethod(1)
  public fun get_X(): Float

  @InterfaceMethod(2)
  public fun get_Y(): Float

  @InterfaceMethod(3)
  public fun get_Z(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISensorQuaternion> {
    public override fun getValue() = ABI.makeISensorQuaternion(pointer.getPointer(0))

    public fun setValue(value: ISensorQuaternion_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISensorQuaternion {
    public val __437867620_Ptr: Pointer?

    public val _437867620_VtblPtr: Pointer?
      get() = __437867620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_W(): Float {
      val fnPtr = _437867620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__437867620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_X(): Float {
      val fnPtr = _437867620_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__437867620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Y(): Float {
      val fnPtr = _437867620_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__437867620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Z(): Float {
      val fnPtr = _437867620_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__437867620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class ISensorQuaternion_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __437867620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISensorQuaternion, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9c5c827c71c46e79da336a193b232bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISensorQuaternion(ptr: Pointer?): WithDefault = ISensorQuaternion_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISensorQuaternion {
      val address = segment.toRawLongValue()
      return makeISensorQuaternion(Pointer(address))
    }

    public override fun toNative(obj: ISensorQuaternion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__437867620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISensorQuaternion): Array<ISensorQuaternion?> = (elements
        as Array<ISensorQuaternion?>).castToImpl<ISensorQuaternion,ISensorQuaternion_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISensorQuaternion?> =
        arrayOfNulls<ISensorQuaternion_Impl>(size) as Array<ISensorQuaternion?>
  }
}
