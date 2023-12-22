package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ITextBoxSelectionChangingEventArgs.ABI::class)
@Signature("{6dce20db-894e-5ff6-825b-f9891af79516}")
@Guid("6dce20db894e5ff6825bf9891af79516")
@WinRTInterface("6dce20db894e5ff6825bf9891af79516")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxSelectionChangingEventArgs.ByReference::class)
public interface ITextBoxSelectionChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionStart(): Int

  @InterfaceMethod(1)
  public fun get_SelectionLength(): Int

  @InterfaceMethod(2)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(3)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxSelectionChangingEventArgs> {
    public override fun getValue() =
        ABI.makeITextBoxSelectionChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextBoxSelectionChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxSelectionChangingEventArgs {
    public val __1480791957_Ptr: Pointer?

    public val _1480791957_VtblPtr: Pointer?
      get() = __1480791957_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionStart(): Int {
      val fnPtr = _1480791957_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1480791957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SelectionLength(): Int {
      val fnPtr = _1480791957_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1480791957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1480791957_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1480791957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1480791957_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1480791957_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBoxSelectionChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1480791957_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxSelectionChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6dce20db894e5ff6825bf9891af79516")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxSelectionChangingEventArgs(ptr: Pointer?): WithDefault =
        ITextBoxSelectionChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxSelectionChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeITextBoxSelectionChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxSelectionChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1480791957_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxSelectionChangingEventArgs):
        Array<ITextBoxSelectionChangingEventArgs?> = (elements as
        Array<ITextBoxSelectionChangingEventArgs?>).castToImpl<ITextBoxSelectionChangingEventArgs,ITextBoxSelectionChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxSelectionChangingEventArgs?> =
        arrayOfNulls<ITextBoxSelectionChangingEventArgs_Impl>(size) as
        Array<ITextBoxSelectionChangingEventArgs?>
  }
}
