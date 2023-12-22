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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompassReadingHeadingAccuracy.ABI::class)
@Signature("{e761354e-8911-40f7-9e16-6ecc7daec5de}")
@Guid("e761354e891140f79e166ecc7daec5de")
@WinRTInterface("e761354e891140f79e166ecc7daec5de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompassReadingHeadingAccuracy.ByReference::class)
public interface ICompassReadingHeadingAccuracy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeadingAccuracy(): MagnetometerAccuracy?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompassReadingHeadingAccuracy> {
    public override fun getValue() = ABI.makeICompassReadingHeadingAccuracy(pointer.getPointer(0))

    public fun setValue(value: ICompassReadingHeadingAccuracy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompassReadingHeadingAccuracy {
    public val __540962357_Ptr: Pointer?

    public val _540962357_VtblPtr: Pointer?
      get() = __540962357_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeadingAccuracy(): MagnetometerAccuracy? {
      val fnPtr = _540962357_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagnetometerAccuracy>()
      val hr = fn.invokeHR(arrayOf(__540962357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagnetometerAccuracy>(result.getValue())
      return resultValue
    }
  }

  public class ICompassReadingHeadingAccuracy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __540962357_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompassReadingHeadingAccuracy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e761354e891140f79e166ecc7daec5de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompassReadingHeadingAccuracy(ptr: Pointer?): WithDefault =
        ICompassReadingHeadingAccuracy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompassReadingHeadingAccuracy {
      val address = segment.toRawLongValue()
      return makeICompassReadingHeadingAccuracy(Pointer(address))
    }

    public override fun toNative(obj: ICompassReadingHeadingAccuracy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__540962357_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompassReadingHeadingAccuracy):
        Array<ICompassReadingHeadingAccuracy?> = (elements as
        Array<ICompassReadingHeadingAccuracy?>).castToImpl<ICompassReadingHeadingAccuracy,ICompassReadingHeadingAccuracy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompassReadingHeadingAccuracy?> =
        arrayOfNulls<ICompassReadingHeadingAccuracy_Impl>(size) as
        Array<ICompassReadingHeadingAccuracy?>
  }
}
