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

@ABIMarker(ISymbolIcon.ABI::class)
@Signature("{7a4774c9-a6a3-4b30-8ff1-9081d70e9a5c}")
@Guid("7a4774c9a6a34b308ff19081d70e9a5c")
@WinRTInterface("7a4774c9a6a34b308ff19081d70e9a5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymbolIcon.ByReference::class)
public interface ISymbolIcon : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Symbol(): Symbol?

  @InterfaceMethod(1)
  public fun put_Symbol(value: Symbol?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISymbolIcon> {
    public override fun getValue() = ABI.makeISymbolIcon(pointer.getPointer(0))

    public fun setValue(value: ISymbolIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymbolIcon {
    public val __1256815795_Ptr: Pointer?

    public val _1256815795_VtblPtr: Pointer?
      get() = __1256815795_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Symbol(): Symbol? {
      val fnPtr = _1256815795_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Symbol>()
      val hr = fn.invokeHR(arrayOf(__1256815795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Symbol>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Symbol(value: Symbol?): Unit {
      val fnPtr = _1256815795_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1256815795_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISymbolIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1256815795_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymbolIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a4774c9a6a34b308ff19081d70e9a5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymbolIcon(ptr: Pointer?): WithDefault = ISymbolIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymbolIcon {
      val address = segment.toRawLongValue()
      return makeISymbolIcon(Pointer(address))
    }

    public override fun toNative(obj: ISymbolIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1256815795_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymbolIcon): Array<ISymbolIcon?> = (elements as
        Array<ISymbolIcon?>).castToImpl<ISymbolIcon,ISymbolIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymbolIcon?> =
        arrayOfNulls<ISymbolIcon_Impl>(size) as Array<ISymbolIcon?>
  }
}
