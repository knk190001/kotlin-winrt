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

@ABIMarker(IItemClickEventArgs.ABI::class)
@Signature("{9c314242-f29a-494d-a3a5-d4c7b2a46852}")
@Guid("9c314242f29a494da3a5d4c7b2a46852")
@WinRTInterface("9c314242f29a494da3a5d4c7b2a46852")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemClickEventArgs.ByReference::class)
public interface IItemClickEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClickedItem(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemClickEventArgs> {
    public override fun getValue() = ABI.makeIItemClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemClickEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemClickEventArgs {
    public val __2111511298_Ptr: Pointer?

    public val _2111511298_VtblPtr: Pointer?
      get() = __2111511298_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClickedItem(): IUnknown? {
      val fnPtr = _2111511298_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2111511298_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IItemClickEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2111511298_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemClickEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c314242f29a494da3a5d4c7b2a46852")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemClickEventArgs(ptr: Pointer?): WithDefault = IItemClickEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemClickEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2111511298_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemClickEventArgs): Array<IItemClickEventArgs?> =
        (elements as
        Array<IItemClickEventArgs?>).castToImpl<IItemClickEventArgs,IItemClickEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemClickEventArgs?> =
        arrayOfNulls<IItemClickEventArgs_Impl>(size) as Array<IItemClickEventArgs?>
  }
}
