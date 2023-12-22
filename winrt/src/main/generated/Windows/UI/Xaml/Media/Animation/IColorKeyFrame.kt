package Windows.UI.Xaml.Media.Animation

import Windows.UI.Color
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

@ABIMarker(IColorKeyFrame.ABI::class)
@Signature("{b51d82d9-0910-4589-a284-b0c9205858e9}")
@Guid("b51d82d909104589a284b0c9205858e9")
@WinRTInterface("b51d82d909104589a284b0c9205858e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorKeyFrame.ByReference::class)
public interface IColorKeyFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): Color?

  @InterfaceMethod(1)
  public fun put_Value(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_KeyTime(): KeyTime?

  @InterfaceMethod(3)
  public fun put_KeyTime(value: KeyTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IColorKeyFrame>
      {
    public override fun getValue() = ABI.makeIColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IColorKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorKeyFrame {
    public val __584224117_Ptr: Pointer?

    public val _584224117_VtblPtr: Pointer?
      get() = __584224117_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): Color? {
      val fnPtr = _584224117_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__584224117_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Value(value: Color?): Unit {
      val fnPtr = _584224117_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584224117_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyTime(): KeyTime? {
      val fnPtr = _584224117_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTime>()
      val hr = fn.invokeHR(arrayOf(__584224117_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_KeyTime(value: KeyTime?): Unit {
      val fnPtr = _584224117_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584224117_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColorKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __584224117_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b51d82d909104589a284b0c9205858e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorKeyFrame(ptr: Pointer?): WithDefault = IColorKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorKeyFrame {
      val address = segment.toRawLongValue()
      return makeIColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__584224117_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorKeyFrame): Array<IColorKeyFrame?> = (elements as
        Array<IColorKeyFrame?>).castToImpl<IColorKeyFrame,IColorKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorKeyFrame?> =
        arrayOfNulls<IColorKeyFrame_Impl>(size) as Array<IColorKeyFrame?>
  }
}
