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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextControlPasteEventArgs.ABI::class)
@Signature("{4bd1d625-221a-477e-bb2c-ad0c1ed125e7}")
@Guid("4bd1d625221a477ebb2cad0c1ed125e7")
@WinRTInterface("4bd1d625221a477ebb2cad0c1ed125e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextControlPasteEventArgs.ByReference::class)
public interface ITextControlPasteEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextControlPasteEventArgs> {
    public override fun getValue() = ABI.makeITextControlPasteEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextControlPasteEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextControlPasteEventArgs {
    public val __2128465976_Ptr: Pointer?

    public val _2128465976_VtblPtr: Pointer?
      get() = __2128465976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _2128465976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2128465976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _2128465976_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2128465976_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextControlPasteEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2128465976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextControlPasteEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bd1d625221a477ebb2cad0c1ed125e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextControlPasteEventArgs(ptr: Pointer?): WithDefault =
        ITextControlPasteEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextControlPasteEventArgs {
      val address = segment.toRawLongValue()
      return makeITextControlPasteEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextControlPasteEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2128465976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextControlPasteEventArgs):
        Array<ITextControlPasteEventArgs?> = (elements as
        Array<ITextControlPasteEventArgs?>).castToImpl<ITextControlPasteEventArgs,ITextControlPasteEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextControlPasteEventArgs?> =
        arrayOfNulls<ITextControlPasteEventArgs_Impl>(size) as Array<ITextControlPasteEventArgs?>
  }
}
