package Windows.UI.Xaml

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

@ABIMarker(ISetter.ABI::class)
@Signature("{a73ded29-b4ae-4a81-be85-e690ba0d3b6e}")
@Guid("a73ded29b4ae4a81be85e690ba0d3b6e")
@WinRTInterface("a73ded29b4ae4a81be85e690ba0d3b6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISetter.ByReference::class)
public interface ISetter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Property(): DependencyProperty?

  @InterfaceMethod(1)
  public fun put_Property(value: DependencyProperty?): Unit

  @InterfaceMethod(2)
  public fun get_Value(): IUnknown?

  @InterfaceMethod(3)
  public fun put_Value(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISetter> {
    public override fun getValue() = ABI.makeISetter(pointer.getPointer(0))

    public fun setValue(value: ISetter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISetter {
    public val __1274982063_Ptr: Pointer?

    public val _1274982063_VtblPtr: Pointer?
      get() = __1274982063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Property(): DependencyProperty? {
      val fnPtr = _1274982063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1274982063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Property(value: DependencyProperty?): Unit {
      val fnPtr = _1274982063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1274982063_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _1274982063_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1274982063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: IUnknown?): Unit {
      val fnPtr = _1274982063_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1274982063_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISetter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1274982063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a73ded29b4ae4a81be85e690ba0d3b6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetter(ptr: Pointer?): WithDefault = ISetter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetter {
      val address = segment.toRawLongValue()
      return makeISetter(Pointer(address))
    }

    public override fun toNative(obj: ISetter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1274982063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetter): Array<ISetter?> = (elements as
        Array<ISetter?>).castToImpl<ISetter,ISetter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetter?> = arrayOfNulls<ISetter_Impl>(size) as
        Array<ISetter?>
  }
}
