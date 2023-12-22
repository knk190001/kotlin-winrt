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

@ABIMarker(IAccelerometer4.ABI::class)
@Signature("{1d373c4f-42d3-45b2-8144-ab7fb665eb59}")
@Guid("1d373c4f42d345b28144ab7fb665eb59")
@WinRTInterface("1d373c4f42d345b28144ab7fb665eb59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometer4.ByReference::class)
public interface IAccelerometer4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReadingType(): AccelerometerReadingType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometer4> {
    public override fun getValue() = ABI.makeIAccelerometer4(pointer.getPointer(0))

    public fun setValue(value: IAccelerometer4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometer4 {
    public val __9035441_Ptr: Pointer?

    public val _9035441_VtblPtr: Pointer?
      get() = __9035441_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReadingType(): AccelerometerReadingType? {
      val fnPtr = _9035441_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccelerometerReadingType>()
      val hr = fn.invokeHR(arrayOf(__9035441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccelerometerReadingType>(result.getValue())
      return resultValue
    }
  }

  public class IAccelerometer4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __9035441_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometer4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d373c4f42d345b28144ab7fb665eb59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometer4(ptr: Pointer?): WithDefault = IAccelerometer4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometer4 {
      val address = segment.toRawLongValue()
      return makeIAccelerometer4(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometer4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__9035441_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometer4): Array<IAccelerometer4?> = (elements as
        Array<IAccelerometer4?>).castToImpl<IAccelerometer4,IAccelerometer4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometer4?> =
        arrayOfNulls<IAccelerometer4_Impl>(size) as Array<IAccelerometer4?>
  }
}
