package Windows.Devices.Sensors

import Windows.Graphics.Display.DisplayOrientations
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

@ABIMarker(IInclinometer2.ABI::class)
@Signature("{029f3393-28b2-45f8-bb16-61e86a7fae6e}")
@Guid("029f339328b245f8bb1661e86a7fae6e")
@WinRTInterface("029f339328b245f8bb1661e86a7fae6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometer2.ByReference::class)
public interface IInclinometer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ReadingTransform(value: DisplayOrientations?): Unit

  @InterfaceMethod(1)
  public fun get_ReadingTransform(): DisplayOrientations?

  @InterfaceMethod(2)
  public fun get_ReadingType(): SensorReadingType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInclinometer2>
      {
    public override fun getValue() = ABI.makeIInclinometer2(pointer.getPointer(0))

    public fun setValue(value: IInclinometer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometer2 {
    public val __1946486585_Ptr: Pointer?

    public val _1946486585_VtblPtr: Pointer?
      get() = __1946486585_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ReadingTransform(value: DisplayOrientations?): Unit {
      val fnPtr = _1946486585_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946486585_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ReadingTransform(): DisplayOrientations? {
      val fnPtr = _1946486585_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__1946486585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ReadingType(): SensorReadingType? {
      val fnPtr = _1946486585_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SensorReadingType>()
      val hr = fn.invokeHR(arrayOf(__1946486585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SensorReadingType>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946486585_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("029f339328b245f8bb1661e86a7fae6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometer2(ptr: Pointer?): WithDefault = IInclinometer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometer2 {
      val address = segment.toRawLongValue()
      return makeIInclinometer2(Pointer(address))
    }

    public override fun toNative(obj: IInclinometer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946486585_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometer2): Array<IInclinometer2?> = (elements as
        Array<IInclinometer2?>).castToImpl<IInclinometer2,IInclinometer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometer2?> =
        arrayOfNulls<IInclinometer2_Impl>(size) as Array<IInclinometer2?>
  }
}
