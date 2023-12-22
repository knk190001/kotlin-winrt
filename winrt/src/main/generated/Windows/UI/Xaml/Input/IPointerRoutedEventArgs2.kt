package Windows.UI.Xaml.Input

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPointerRoutedEventArgs2.ABI::class)
@Signature("{0821f294-1de6-4711-ba7c-8d4b8b0911d0}")
@Guid("0821f2941de64711ba7c8d4b8b0911d0")
@WinRTInterface("0821f2941de64711ba7c8d4b8b0911d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerRoutedEventArgs2.ByReference::class)
public interface IPointerRoutedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsGenerated(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerRoutedEventArgs2> {
    public override fun getValue() = ABI.makeIPointerRoutedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IPointerRoutedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerRoutedEventArgs2 {
    public val __600067805_Ptr: Pointer?

    public val _600067805_VtblPtr: Pointer?
      get() = __600067805_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsGenerated(): Boolean {
      val fnPtr = _600067805_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__600067805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPointerRoutedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __600067805_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerRoutedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0821f2941de64711ba7c8d4b8b0911d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerRoutedEventArgs2(ptr: Pointer?): WithDefault =
        IPointerRoutedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerRoutedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIPointerRoutedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IPointerRoutedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__600067805_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerRoutedEventArgs2):
        Array<IPointerRoutedEventArgs2?> = (elements as
        Array<IPointerRoutedEventArgs2?>).castToImpl<IPointerRoutedEventArgs2,IPointerRoutedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerRoutedEventArgs2?> =
        arrayOfNulls<IPointerRoutedEventArgs2_Impl>(size) as Array<IPointerRoutedEventArgs2?>
  }
}
