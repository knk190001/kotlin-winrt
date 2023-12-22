package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.BrushTransition
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

@ABIMarker(IBorder2.ABI::class)
@Signature("{a1efbd9d-cb8b-56b5-878d-3a7f43bc9730}")
@Guid("a1efbd9dcb8b56b5878d3a7f43bc9730")
@WinRTInterface("a1efbd9dcb8b56b5878d3a7f43bc9730")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBorder2.ByReference::class)
public interface IBorder2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizing(): BackgroundSizing?

  @InterfaceMethod(1)
  public fun put_BackgroundSizing(value: BackgroundSizing?): Unit

  @InterfaceMethod(2)
  public fun get_BackgroundTransition(): BrushTransition?

  @InterfaceMethod(3)
  public fun put_BackgroundTransition(value: BrushTransition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBorder2> {
    public override fun getValue() = ABI.makeIBorder2(pointer.getPointer(0))

    public fun setValue(value: IBorder2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBorder2 {
    public val __779805206_Ptr: Pointer?

    public val _779805206_VtblPtr: Pointer?
      get() = __779805206_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizing(): BackgroundSizing? {
      val fnPtr = _779805206_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundSizing>()
      val hr = fn.invokeHR(arrayOf(__779805206_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundSizing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundSizing(value: BackgroundSizing?): Unit {
      val fnPtr = _779805206_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__779805206_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundTransition(): BrushTransition? {
      val fnPtr = _779805206_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushTransition>()
      val hr = fn.invokeHR(arrayOf(__779805206_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BackgroundTransition(value: BrushTransition?): Unit {
      val fnPtr = _779805206_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__779805206_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBorder2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __779805206_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBorder2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1efbd9dcb8b56b5878d3a7f43bc9730")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBorder2(ptr: Pointer?): WithDefault = IBorder2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBorder2 {
      val address = segment.toRawLongValue()
      return makeIBorder2(Pointer(address))
    }

    public override fun toNative(obj: IBorder2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__779805206_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBorder2): Array<IBorder2?> = (elements as
        Array<IBorder2?>).castToImpl<IBorder2,IBorder2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBorder2?> = arrayOfNulls<IBorder2_Impl>(size) as
        Array<IBorder2?>
  }
}
