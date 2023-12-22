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

@ABIMarker(IAccelerometer2.ABI::class)
@Signature("{e8f092ee-4964-401a-b602-220d7153c60a}")
@Guid("e8f092ee4964401ab602220d7153c60a")
@WinRTInterface("e8f092ee4964401ab602220d7153c60a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometer2.ByReference::class)
public interface IAccelerometer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ReadingTransform(value: DisplayOrientations?): Unit

  @InterfaceMethod(1)
  public fun get_ReadingTransform(): DisplayOrientations?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometer2> {
    public override fun getValue() = ABI.makeIAccelerometer2(pointer.getPointer(0))

    public fun setValue(value: IAccelerometer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometer2 {
    public val __9035439_Ptr: Pointer?

    public val _9035439_VtblPtr: Pointer?
      get() = __9035439_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ReadingTransform(value: DisplayOrientations?): Unit {
      val fnPtr = _9035439_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__9035439_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ReadingTransform(): DisplayOrientations? {
      val fnPtr = _9035439_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__9035439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayOrientations>(result.getValue())
      return resultValue
    }
  }

  public class IAccelerometer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __9035439_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8f092ee4964401ab602220d7153c60a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometer2(ptr: Pointer?): WithDefault = IAccelerometer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometer2 {
      val address = segment.toRawLongValue()
      return makeIAccelerometer2(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__9035439_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometer2): Array<IAccelerometer2?> = (elements as
        Array<IAccelerometer2?>).castToImpl<IAccelerometer2,IAccelerometer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometer2?> =
        arrayOfNulls<IAccelerometer2_Impl>(size) as Array<IAccelerometer2?>
  }
}
