package Windows.UI.Xaml.Interop

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

@ABIMarker(IBindableIterable.ABI::class)
@Signature("{036d2c08-df29-41af-8aa2-d774be62ba6f}")
@Guid("036d2c08df2941af8aa2d774be62ba6f")
@WinRTInterface("036d2c08df2941af8aa2d774be62ba6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindableIterable.ByReference::class)
public interface IBindableIterable : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun First(): IBindableIterator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindableIterable> {
    public override fun getValue() = ABI.makeIBindableIterable(pointer.getPointer(0))

    public fun setValue(value: IBindableIterable_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindableIterable {
    public val __2130116140_Ptr: Pointer?

    public val _2130116140_VtblPtr: Pointer?
      get() = __2130116140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun First(): IBindableIterator? {
      val fnPtr = _2130116140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBindableIterator>()
      val hr = fn.invokeHR(arrayOf(__2130116140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBindableIterator>(result.getValue())
      return resultValue
    }
  }

  public class IBindableIterable_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2130116140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindableIterable, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("036d2c08df2941af8aa2d774be62ba6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindableIterable(ptr: Pointer?): WithDefault = IBindableIterable_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindableIterable {
      val address = segment.toRawLongValue()
      return makeIBindableIterable(Pointer(address))
    }

    public override fun toNative(obj: IBindableIterable): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2130116140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindableIterable): Array<IBindableIterable?> = (elements
        as Array<IBindableIterable?>).castToImpl<IBindableIterable,IBindableIterable_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindableIterable?> =
        arrayOfNulls<IBindableIterable_Impl>(size) as Array<IBindableIterable?>
  }
}
