package Microsoft.UI.Xaml.Media.Animation

import Windows.Foundation.Point
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

@ABIMarker(IPointKeyFrame.ABI::class)
@Signature("{59d5c07d-a3a7-5450-9dfb-4b7e77d58f93}")
@Guid("59d5c07da3a754509dfb4b7e77d58f93")
@WinRTInterface("59d5c07da3a754509dfb4b7e77d58f93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointKeyFrame.ByReference::class)
public interface IPointKeyFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): Point?

  @InterfaceMethod(1)
  public fun put_Value(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_KeyTime(): KeyTime?

  @InterfaceMethod(3)
  public fun put_KeyTime(value: KeyTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPointKeyFrame>
      {
    public override fun getValue() = ABI.makeIPointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IPointKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointKeyFrame {
    public val __1161365987_Ptr: Pointer?

    public val _1161365987_VtblPtr: Pointer?
      get() = __1161365987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): Point? {
      val fnPtr = _1161365987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1161365987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Value(value: Point?): Unit {
      val fnPtr = _1161365987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1161365987_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyTime(): KeyTime? {
      val fnPtr = _1161365987_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTime>()
      val hr = fn.invokeHR(arrayOf(__1161365987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_KeyTime(value: KeyTime?): Unit {
      val fnPtr = _1161365987_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1161365987_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPointKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1161365987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59d5c07da3a754509dfb4b7e77d58f93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointKeyFrame(ptr: Pointer?): WithDefault = IPointKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointKeyFrame {
      val address = segment.toRawLongValue()
      return makeIPointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IPointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1161365987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointKeyFrame): Array<IPointKeyFrame?> = (elements as
        Array<IPointKeyFrame?>).castToImpl<IPointKeyFrame,IPointKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointKeyFrame?> =
        arrayOfNulls<IPointKeyFrame_Impl>(size) as Array<IPointKeyFrame?>
  }
}
