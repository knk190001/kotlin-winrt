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

@ABIMarker(IMagnetometerDataThreshold.ABI::class)
@Signature("{d177cb01-9063-5fa5-b596-b445e9dc3401}")
@Guid("d177cb0190635fa5b596b445e9dc3401")
@WinRTInterface("d177cb0190635fa5b596b445e9dc3401")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagnetometerDataThreshold.ByReference::class)
public interface IMagnetometerDataThreshold : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_XAxisMicroteslas(): Float

  @InterfaceMethod(1)
  public fun put_XAxisMicroteslas(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_YAxisMicroteslas(): Float

  @InterfaceMethod(3)
  public fun put_YAxisMicroteslas(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_ZAxisMicroteslas(): Float

  @InterfaceMethod(5)
  public fun put_ZAxisMicroteslas(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagnetometerDataThreshold> {
    public override fun getValue() = ABI.makeIMagnetometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: IMagnetometerDataThreshold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagnetometerDataThreshold {
    public val __854329999_Ptr: Pointer?

    public val _854329999_VtblPtr: Pointer?
      get() = __854329999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_XAxisMicroteslas(): Float {
      val fnPtr = _854329999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__854329999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_XAxisMicroteslas(value: Float): Unit {
      val fnPtr = _854329999_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__854329999_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_YAxisMicroteslas(): Float {
      val fnPtr = _854329999_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__854329999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_YAxisMicroteslas(value: Float): Unit {
      val fnPtr = _854329999_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__854329999_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ZAxisMicroteslas(): Float {
      val fnPtr = _854329999_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__854329999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ZAxisMicroteslas(value: Float): Unit {
      val fnPtr = _854329999_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__854329999_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMagnetometerDataThreshold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __854329999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagnetometerDataThreshold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d177cb0190635fa5b596b445e9dc3401")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagnetometerDataThreshold(ptr: Pointer?): WithDefault =
        IMagnetometerDataThreshold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagnetometerDataThreshold {
      val address = segment.toRawLongValue()
      return makeIMagnetometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: IMagnetometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__854329999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagnetometerDataThreshold):
        Array<IMagnetometerDataThreshold?> = (elements as
        Array<IMagnetometerDataThreshold?>).castToImpl<IMagnetometerDataThreshold,IMagnetometerDataThreshold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagnetometerDataThreshold?> =
        arrayOfNulls<IMagnetometerDataThreshold_Impl>(size) as Array<IMagnetometerDataThreshold?>
  }
}
