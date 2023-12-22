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

@ABIMarker(IBitmapIconStatics2.ABI::class)
@Signature("{9745026b-b742-4a89-a5d7-a0e5fb809af1}")
@Guid("9745026bb7424a89a5d7a0e5fb809af1")
@WinRTInterface("9745026bb7424a89a5d7a0e5fb809af1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapIconStatics2.ByReference::class)
public interface IBitmapIconStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShowAsMonochromeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapIconStatics2> {
    public override fun getValue() = ABI.makeIBitmapIconStatics2(pointer.getPointer(0))

    public fun setValue(value: IBitmapIconStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapIconStatics2 {
    public val __2112820369_Ptr: Pointer?

    public val _2112820369_VtblPtr: Pointer?
      get() = __2112820369_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShowAsMonochromeProperty(): DependencyProperty? {
      val fnPtr = _2112820369_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2112820369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapIconStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2112820369_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapIconStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9745026bb7424a89a5d7a0e5fb809af1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapIconStatics2(ptr: Pointer?): WithDefault = IBitmapIconStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapIconStatics2 {
      val address = segment.toRawLongValue()
      return makeIBitmapIconStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBitmapIconStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2112820369_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapIconStatics2): Array<IBitmapIconStatics2?> =
        (elements as
        Array<IBitmapIconStatics2?>).castToImpl<IBitmapIconStatics2,IBitmapIconStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapIconStatics2?> =
        arrayOfNulls<IBitmapIconStatics2_Impl>(size) as Array<IBitmapIconStatics2?>
  }
}
