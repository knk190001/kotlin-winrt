package Windows.UI.Xaml.Controls

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

@ABIMarker(ISwipeItems.ABI::class)
@Signature("{b01726ff-969a-40d0-9f04-76084ce6d7b7}")
@Guid("b01726ff969a40d09f0476084ce6d7b7")
@WinRTInterface("b01726ff969a40d09f0476084ce6d7b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeItems.ByReference::class)
public interface ISwipeItems : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): SwipeMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: SwipeMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISwipeItems> {
    public override fun getValue() = ABI.makeISwipeItems(pointer.getPointer(0))

    public fun setValue(value: ISwipeItems_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeItems {
    public val __1095363134_Ptr: Pointer?

    public val _1095363134_VtblPtr: Pointer?
      get() = __1095363134_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): SwipeMode? {
      val fnPtr = _1095363134_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeMode>()
      val hr = fn.invokeHR(arrayOf(__1095363134_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: SwipeMode?): Unit {
      val fnPtr = _1095363134_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1095363134_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISwipeItems_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1095363134_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeItems, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b01726ff969a40d09f0476084ce6d7b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeItems(ptr: Pointer?): WithDefault = ISwipeItems_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeItems {
      val address = segment.toRawLongValue()
      return makeISwipeItems(Pointer(address))
    }

    public override fun toNative(obj: ISwipeItems): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1095363134_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeItems): Array<ISwipeItems?> = (elements as
        Array<ISwipeItems?>).castToImpl<ISwipeItems,ISwipeItems_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeItems?> =
        arrayOfNulls<ISwipeItems_Impl>(size) as Array<ISwipeItems?>
  }
}
