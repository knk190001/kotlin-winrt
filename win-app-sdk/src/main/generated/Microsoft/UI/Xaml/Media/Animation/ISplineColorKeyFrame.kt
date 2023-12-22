package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ISplineColorKeyFrame.ABI::class)
@Signature("{60c5905f-4343-504d-a2c6-64b8d924b438}")
@Guid("60c5905f4343504da2c664b8d924b438")
@WinRTInterface("60c5905f4343504da2c664b8d924b438")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplineColorKeyFrame.ByReference::class)
public interface ISplineColorKeyFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeySpline(): KeySpline?

  @InterfaceMethod(1)
  public fun put_KeySpline(value: KeySpline?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplineColorKeyFrame> {
    public override fun getValue() = ABI.makeISplineColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: ISplineColorKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplineColorKeyFrame {
    public val __1706591397_Ptr: Pointer?

    public val _1706591397_VtblPtr: Pointer?
      get() = __1706591397_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeySpline(): KeySpline? {
      val fnPtr = _1706591397_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeySpline>()
      val hr = fn.invokeHR(arrayOf(__1706591397_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeySpline>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_KeySpline(value: KeySpline?): Unit {
      val fnPtr = _1706591397_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1706591397_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplineColorKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1706591397_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplineColorKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60c5905f4343504da2c664b8d924b438")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplineColorKeyFrame(ptr: Pointer?): WithDefault = ISplineColorKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplineColorKeyFrame {
      val address = segment.toRawLongValue()
      return makeISplineColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: ISplineColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1706591397_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplineColorKeyFrame): Array<ISplineColorKeyFrame?> =
        (elements as
        Array<ISplineColorKeyFrame?>).castToImpl<ISplineColorKeyFrame,ISplineColorKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplineColorKeyFrame?> =
        arrayOfNulls<ISplineColorKeyFrame_Impl>(size) as Array<ISplineColorKeyFrame?>
  }
}
