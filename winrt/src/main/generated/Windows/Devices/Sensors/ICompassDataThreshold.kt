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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompassDataThreshold.ABI::class)
@Signature("{d15b52b3-d39d-5ec8-b2e4-f193e6ab34ed}")
@Guid("d15b52b3d39d5ec8b2e4f193e6ab34ed")
@WinRTInterface("d15b52b3d39d5ec8b2e4f193e6ab34ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompassDataThreshold.ByReference::class)
public interface ICompassDataThreshold : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Degrees(): Double

  @InterfaceMethod(1)
  public fun put_Degrees(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompassDataThreshold> {
    public override fun getValue() = ABI.makeICompassDataThreshold(pointer.getPointer(0))

    public fun setValue(value: ICompassDataThreshold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompassDataThreshold {
    public val __1780119515_Ptr: Pointer?

    public val _1780119515_VtblPtr: Pointer?
      get() = __1780119515_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Degrees(): Double {
      val fnPtr = _1780119515_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1780119515_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Degrees(value: Double): Unit {
      val fnPtr = _1780119515_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1780119515_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompassDataThreshold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1780119515_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompassDataThreshold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d15b52b3d39d5ec8b2e4f193e6ab34ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompassDataThreshold(ptr: Pointer?): WithDefault =
        ICompassDataThreshold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompassDataThreshold {
      val address = segment.toRawLongValue()
      return makeICompassDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: ICompassDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1780119515_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompassDataThreshold): Array<ICompassDataThreshold?> =
        (elements as
        Array<ICompassDataThreshold?>).castToImpl<ICompassDataThreshold,ICompassDataThreshold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompassDataThreshold?> =
        arrayOfNulls<ICompassDataThreshold_Impl>(size) as Array<ICompassDataThreshold?>
  }
}
