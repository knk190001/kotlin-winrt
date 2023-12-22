package Windows.UI.Xaml.Input

import Windows.System.VirtualKey
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

@ABIMarker(IKeyRoutedEventArgs2.ABI::class)
@Signature("{1b02d57a-9634-4f14-91b2-133e42fdb3cd}")
@Guid("1b02d57a96344f1491b2133e42fdb3cd")
@WinRTInterface("1b02d57a96344f1491b2133e42fdb3cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyRoutedEventArgs2.ByReference::class)
public interface IKeyRoutedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OriginalKey(): VirtualKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyRoutedEventArgs2> {
    public override fun getValue() = ABI.makeIKeyRoutedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IKeyRoutedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyRoutedEventArgs2 {
    public val __116461569_Ptr: Pointer?

    public val _116461569_VtblPtr: Pointer?
      get() = __116461569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OriginalKey(): VirtualKey? {
      val fnPtr = _116461569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__116461569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }
  }

  public class IKeyRoutedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __116461569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyRoutedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b02d57a96344f1491b2133e42fdb3cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyRoutedEventArgs2(ptr: Pointer?): WithDefault = IKeyRoutedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyRoutedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIKeyRoutedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IKeyRoutedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__116461569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyRoutedEventArgs2): Array<IKeyRoutedEventArgs2?> =
        (elements as
        Array<IKeyRoutedEventArgs2?>).castToImpl<IKeyRoutedEventArgs2,IKeyRoutedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyRoutedEventArgs2?> =
        arrayOfNulls<IKeyRoutedEventArgs2_Impl>(size) as Array<IKeyRoutedEventArgs2?>
  }
}
