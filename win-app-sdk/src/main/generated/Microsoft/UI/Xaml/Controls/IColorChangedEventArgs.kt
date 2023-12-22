package Microsoft.UI.Xaml.Controls

import Windows.UI.Color
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

@ABIMarker(IColorChangedEventArgs.ABI::class)
@Signature("{148d57a2-b1cb-5f5d-b6b5-512805d71761}")
@Guid("148d57a2b1cb5f5db6b5512805d71761")
@WinRTInterface("148d57a2b1cb5f5db6b5512805d71761")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorChangedEventArgs.ByReference::class)
public interface IColorChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldColor(): Color?

  @InterfaceMethod(1)
  public fun get_NewColor(): Color?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorChangedEventArgs> {
    public override fun getValue() = ABI.makeIColorChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IColorChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorChangedEventArgs {
    public val __1156322399_Ptr: Pointer?

    public val _1156322399_VtblPtr: Pointer?
      get() = __1156322399_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldColor(): Color? {
      val fnPtr = _1156322399_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1156322399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewColor(): Color? {
      val fnPtr = _1156322399_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1156322399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }
  }

  public class IColorChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1156322399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("148d57a2b1cb5f5db6b5512805d71761")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorChangedEventArgs(ptr: Pointer?): WithDefault =
        IColorChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIColorChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IColorChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1156322399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorChangedEventArgs): Array<IColorChangedEventArgs?> =
        (elements as
        Array<IColorChangedEventArgs?>).castToImpl<IColorChangedEventArgs,IColorChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorChangedEventArgs?> =
        arrayOfNulls<IColorChangedEventArgs_Impl>(size) as Array<IColorChangedEventArgs?>
  }
}
