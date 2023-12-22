package Windows.UI.Xaml

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

@ABIMarker(IWindow2.ABI::class)
@Signature("{d384759f-34f6-4482-8435-f552f9b24cc8}")
@Guid("d384759f34f644828435f552f9b24cc8")
@WinRTInterface("d384759f34f644828435f552f9b24cc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindow2.ByReference::class)
public interface IWindow2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetTitleBar(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWindow2> {
    public override fun getValue() = ABI.makeIWindow2(pointer.getPointer(0))

    public fun setValue(value: IWindow2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindow2 {
    public val __1506182224_Ptr: Pointer?

    public val _1506182224_VtblPtr: Pointer?
      get() = __1506182224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetTitleBar(value: UIElement?): Unit {
      val fnPtr = _1506182224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1506182224_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWindow2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1506182224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindow2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d384759f34f644828435f552f9b24cc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindow2(ptr: Pointer?): WithDefault = IWindow2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindow2 {
      val address = segment.toRawLongValue()
      return makeIWindow2(Pointer(address))
    }

    public override fun toNative(obj: IWindow2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1506182224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindow2): Array<IWindow2?> = (elements as
        Array<IWindow2?>).castToImpl<IWindow2,IWindow2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindow2?> = arrayOfNulls<IWindow2_Impl>(size) as
        Array<IWindow2?>
  }
}
