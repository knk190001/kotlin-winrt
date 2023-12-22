package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ISwipeItemsFactory.ABI::class)
@Signature("{47c460ee-d5aa-445f-b31e-50c076c011b9}")
@Guid("47c460eed5aa445fb31e50c076c011b9")
@WinRTInterface("47c460eed5aa445fb31e50c076c011b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeItemsFactory.ByReference::class)
public interface ISwipeItemsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SwipeItems?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeItemsFactory> {
    public override fun getValue() = ABI.makeISwipeItemsFactory(pointer.getPointer(0))

    public fun setValue(value: ISwipeItemsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeItemsFactory {
    public val __1140845336_Ptr: Pointer?

    public val _1140845336_VtblPtr: Pointer?
      get() = __1140845336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SwipeItems? {
      val fnPtr = _1140845336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeItems>()
      val hr = fn.invokeHR(arrayOf(__1140845336_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeItems>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeItemsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1140845336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeItemsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47c460eed5aa445fb31e50c076c011b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeItemsFactory(ptr: Pointer?): WithDefault = ISwipeItemsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeItemsFactory {
      val address = segment.toRawLongValue()
      return makeISwipeItemsFactory(Pointer(address))
    }

    public override fun toNative(obj: ISwipeItemsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1140845336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeItemsFactory): Array<ISwipeItemsFactory?> =
        (elements as
        Array<ISwipeItemsFactory?>).castToImpl<ISwipeItemsFactory,ISwipeItemsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeItemsFactory?> =
        arrayOfNulls<ISwipeItemsFactory_Impl>(size) as Array<ISwipeItemsFactory?>
  }
}
