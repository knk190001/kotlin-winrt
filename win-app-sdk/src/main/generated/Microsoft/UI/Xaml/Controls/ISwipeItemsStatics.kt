package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ISwipeItemsStatics.ABI::class)
@Signature("{db32c3b0-a93f-5797-a18d-d946b0615906}")
@Guid("db32c3b0a93f5797a18dd946b0615906")
@WinRTInterface("db32c3b0a93f5797a18dd946b0615906")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeItemsStatics.ByReference::class)
public interface ISwipeItemsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeItemsStatics> {
    public override fun getValue() = ABI.makeISwipeItemsStatics(pointer.getPointer(0))

    public fun setValue(value: ISwipeItemsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeItemsStatics {
    public val __1013342888_Ptr: Pointer?

    public val _1013342888_VtblPtr: Pointer?
      get() = __1013342888_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ModeProperty(): DependencyProperty? {
      val fnPtr = _1013342888_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1013342888_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeItemsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1013342888_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeItemsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db32c3b0a93f5797a18dd946b0615906")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeItemsStatics(ptr: Pointer?): WithDefault = ISwipeItemsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeItemsStatics {
      val address = segment.toRawLongValue()
      return makeISwipeItemsStatics(Pointer(address))
    }

    public override fun toNative(obj: ISwipeItemsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1013342888_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeItemsStatics): Array<ISwipeItemsStatics?> =
        (elements as
        Array<ISwipeItemsStatics?>).castToImpl<ISwipeItemsStatics,ISwipeItemsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeItemsStatics?> =
        arrayOfNulls<ISwipeItemsStatics_Impl>(size) as Array<ISwipeItemsStatics?>
  }
}
