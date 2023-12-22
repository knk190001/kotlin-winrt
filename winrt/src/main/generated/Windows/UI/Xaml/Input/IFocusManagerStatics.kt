package Windows.UI.Xaml.Input

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

@ABIMarker(IFocusManagerStatics.ABI::class)
@Signature("{1eccd326-8182-4482-826a-0918e9ed9af7}")
@Guid("1eccd32681824482826a0918e9ed9af7")
@WinRTInterface("1eccd32681824482826a0918e9ed9af7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManagerStatics.ByReference::class)
public interface IFocusManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFocusedElement(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusManagerStatics> {
    public override fun getValue() = ABI.makeIFocusManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IFocusManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManagerStatics {
    public val __947646534_Ptr: Pointer?

    public val _947646534_VtblPtr: Pointer?
      get() = __947646534_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFocusedElement(): IUnknown? {
      val fnPtr = _947646534_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__947646534_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IFocusManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __947646534_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1eccd32681824482826a0918e9ed9af7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManagerStatics(ptr: Pointer?): WithDefault = IFocusManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManagerStatics {
      val address = segment.toRawLongValue()
      return makeIFocusManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFocusManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__947646534_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManagerStatics): Array<IFocusManagerStatics?> =
        (elements as
        Array<IFocusManagerStatics?>).castToImpl<IFocusManagerStatics,IFocusManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManagerStatics?> =
        arrayOfNulls<IFocusManagerStatics_Impl>(size) as Array<IFocusManagerStatics?>
  }
}
