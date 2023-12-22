package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IBorderStatics2.ABI::class)
@Signature("{a26d4476-803f-5040-a0f3-e66db3733166}")
@Guid("a26d4476803f5040a0f3e66db3733166")
@WinRTInterface("a26d4476803f5040a0f3e66db3733166")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBorderStatics2.ByReference::class)
public interface IBorderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundSizingProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBorderStatics2> {
    public override fun getValue() = ABI.makeIBorderStatics2(pointer.getPointer(0))

    public fun setValue(value: IBorderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBorderStatics2 {
    public val __583606155_Ptr: Pointer?

    public val _583606155_VtblPtr: Pointer?
      get() = __583606155_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundSizingProperty(): DependencyProperty? {
      val fnPtr = _583606155_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__583606155_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBorderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __583606155_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBorderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a26d4476803f5040a0f3e66db3733166")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBorderStatics2(ptr: Pointer?): WithDefault = IBorderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBorderStatics2 {
      val address = segment.toRawLongValue()
      return makeIBorderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBorderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__583606155_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBorderStatics2): Array<IBorderStatics2?> = (elements as
        Array<IBorderStatics2?>).castToImpl<IBorderStatics2,IBorderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBorderStatics2?> =
        arrayOfNulls<IBorderStatics2_Impl>(size) as Array<IBorderStatics2?>
  }
}
