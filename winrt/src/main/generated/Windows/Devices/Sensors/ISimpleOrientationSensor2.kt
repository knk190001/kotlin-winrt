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

@ABIMarker(ISimpleOrientationSensor2.ABI::class)
@Signature("{a277a798-8870-453e-8bd6-b8f5d8d7941b}")
@Guid("a277a7988870453e8bd6b8f5d8d7941b")
@WinRTInterface("a277a7988870453e8bd6b8f5d8d7941b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISimpleOrientationSensor2.ByReference::class)
public interface ISimpleOrientationSensor2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ReadingTransform(value: DisplayOrientations?): Unit

  @InterfaceMethod(1)
  public fun get_ReadingTransform(): DisplayOrientations?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISimpleOrientationSensor2> {
    public override fun getValue() = ABI.makeISimpleOrientationSensor2(pointer.getPointer(0))

    public fun setValue(value: ISimpleOrientationSensor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISimpleOrientationSensor2 {
    public val __401379078_Ptr: Pointer?

    public val _401379078_VtblPtr: Pointer?
      get() = __401379078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ReadingTransform(value: DisplayOrientations?): Unit {
      val fnPtr = _401379078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__401379078_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ReadingTransform(): DisplayOrientations? {
      val fnPtr = _401379078_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__401379078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayOrientations>(result.getValue())
      return resultValue
    }
  }

  public class ISimpleOrientationSensor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __401379078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISimpleOrientationSensor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a277a7988870453e8bd6b8f5d8d7941b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISimpleOrientationSensor2(ptr: Pointer?): WithDefault =
        ISimpleOrientationSensor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISimpleOrientationSensor2 {
      val address = segment.toRawLongValue()
      return makeISimpleOrientationSensor2(Pointer(address))
    }

    public override fun toNative(obj: ISimpleOrientationSensor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__401379078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISimpleOrientationSensor2):
        Array<ISimpleOrientationSensor2?> = (elements as
        Array<ISimpleOrientationSensor2?>).castToImpl<ISimpleOrientationSensor2,ISimpleOrientationSensor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISimpleOrientationSensor2?> =
        arrayOfNulls<ISimpleOrientationSensor2_Impl>(size) as Array<ISimpleOrientationSensor2?>
  }
}
