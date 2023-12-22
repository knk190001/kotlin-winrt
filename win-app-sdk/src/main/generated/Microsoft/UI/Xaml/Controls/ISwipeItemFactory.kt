package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ISwipeItemFactory.ABI::class)
@Signature("{011513e1-1adc-5a69-a74f-623fcc18a51c}")
@Guid("011513e11adc5a69a74f623fcc18a51c")
@WinRTInterface("011513e11adc5a69a74f623fcc18a51c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeItemFactory.ByReference::class)
public interface ISwipeItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SwipeItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeItemFactory> {
    public override fun getValue() = ABI.makeISwipeItemFactory(pointer.getPointer(0))

    public fun setValue(value: ISwipeItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeItemFactory {
    public val __2038357340_Ptr: Pointer?

    public val _2038357340_VtblPtr: Pointer?
      get() = __2038357340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SwipeItem? {
      val fnPtr = _2038357340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeItem>()
      val hr = fn.invokeHR(arrayOf(__2038357340_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeItem>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2038357340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("011513e11adc5a69a74f623fcc18a51c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeItemFactory(ptr: Pointer?): WithDefault = ISwipeItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeItemFactory {
      val address = segment.toRawLongValue()
      return makeISwipeItemFactory(Pointer(address))
    }

    public override fun toNative(obj: ISwipeItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2038357340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeItemFactory): Array<ISwipeItemFactory?> = (elements
        as Array<ISwipeItemFactory?>).castToImpl<ISwipeItemFactory,ISwipeItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeItemFactory?> =
        arrayOfNulls<ISwipeItemFactory_Impl>(size) as Array<ISwipeItemFactory?>
  }
}
