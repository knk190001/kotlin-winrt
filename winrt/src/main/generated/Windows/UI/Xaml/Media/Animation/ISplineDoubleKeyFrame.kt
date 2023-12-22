package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ISplineDoubleKeyFrame.ABI::class)
@Signature("{00d72d38-6b2b-4843-838e-c8b115eec801}")
@Guid("00d72d386b2b4843838ec8b115eec801")
@WinRTInterface("00d72d386b2b4843838ec8b115eec801")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplineDoubleKeyFrame.ByReference::class)
public interface ISplineDoubleKeyFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeySpline(): KeySpline?

  @InterfaceMethod(1)
  public fun put_KeySpline(value: KeySpline?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplineDoubleKeyFrame> {
    public override fun getValue() = ABI.makeISplineDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: ISplineDoubleKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplineDoubleKeyFrame {
    public val __1084107146_Ptr: Pointer?

    public val _1084107146_VtblPtr: Pointer?
      get() = __1084107146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeySpline(): KeySpline? {
      val fnPtr = _1084107146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeySpline>()
      val hr = fn.invokeHR(arrayOf(__1084107146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeySpline>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_KeySpline(value: KeySpline?): Unit {
      val fnPtr = _1084107146_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1084107146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplineDoubleKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1084107146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplineDoubleKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00d72d386b2b4843838ec8b115eec801")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplineDoubleKeyFrame(ptr: Pointer?): WithDefault =
        ISplineDoubleKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplineDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return makeISplineDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: ISplineDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1084107146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplineDoubleKeyFrame): Array<ISplineDoubleKeyFrame?> =
        (elements as
        Array<ISplineDoubleKeyFrame?>).castToImpl<ISplineDoubleKeyFrame,ISplineDoubleKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplineDoubleKeyFrame?> =
        arrayOfNulls<ISplineDoubleKeyFrame_Impl>(size) as Array<ISplineDoubleKeyFrame?>
  }
}
