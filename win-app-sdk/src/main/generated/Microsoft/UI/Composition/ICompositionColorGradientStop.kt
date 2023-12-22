package Microsoft.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionColorGradientStop.ABI::class)
@Signature("{868030d8-c5c0-5dd8-a765-e32cd3497aa9}")
@Guid("868030d8c5c05dd8a765e32cd3497aa9")
@WinRTInterface("868030d8c5c05dd8a765e32cd3497aa9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionColorGradientStop.ByReference::class)
public interface ICompositionColorGradientStop : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_Offset(): Float

  @InterfaceMethod(3)
  public fun put_Offset(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionColorGradientStop> {
    public override fun getValue() = ABI.makeICompositionColorGradientStop(pointer.getPointer(0))

    public fun setValue(value: ICompositionColorGradientStop_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionColorGradientStop {
    public val __1570342300_Ptr: Pointer?

    public val _1570342300_VtblPtr: Pointer?
      get() = __1570342300_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _1570342300_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1570342300_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _1570342300_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1570342300_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Offset(): Float {
      val fnPtr = _1570342300_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1570342300_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Offset(value: Float): Unit {
      val fnPtr = _1570342300_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1570342300_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionColorGradientStop_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1570342300_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionColorGradientStop, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("868030d8c5c05dd8a765e32cd3497aa9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionColorGradientStop(ptr: Pointer?): WithDefault =
        ICompositionColorGradientStop_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionColorGradientStop {
      val address = segment.toRawLongValue()
      return makeICompositionColorGradientStop(Pointer(address))
    }

    public override fun toNative(obj: ICompositionColorGradientStop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1570342300_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionColorGradientStop):
        Array<ICompositionColorGradientStop?> = (elements as
        Array<ICompositionColorGradientStop?>).castToImpl<ICompositionColorGradientStop,ICompositionColorGradientStop_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionColorGradientStop?> =
        arrayOfNulls<ICompositionColorGradientStop_Impl>(size) as
        Array<ICompositionColorGradientStop?>
  }
}
