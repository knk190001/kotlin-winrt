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

@ABIMarker(IRichEditBoxSelectionChangingEventArgs.ABI::class)
@Signature("{5dbadbe1-0515-5045-9a6f-6859237301ac}")
@Guid("5dbadbe1051550459a6f6859237301ac")
@WinRTInterface("5dbadbe1051550459a6f6859237301ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxSelectionChangingEventArgs.ByReference::class)
public interface IRichEditBoxSelectionChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionStart(): Int

  @InterfaceMethod(1)
  public fun get_SelectionLength(): Int

  @InterfaceMethod(2)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(3)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxSelectionChangingEventArgs> {
    public override fun getValue() =
        ABI.makeIRichEditBoxSelectionChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxSelectionChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxSelectionChangingEventArgs {
    public val __342063652_Ptr: Pointer?

    public val _342063652_VtblPtr: Pointer?
      get() = __342063652_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionStart(): Int {
      val fnPtr = _342063652_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__342063652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SelectionLength(): Int {
      val fnPtr = _342063652_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__342063652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _342063652_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__342063652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _342063652_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__342063652_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichEditBoxSelectionChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __342063652_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxSelectionChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5dbadbe1051550459a6f6859237301ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxSelectionChangingEventArgs(ptr: Pointer?): WithDefault =
        IRichEditBoxSelectionChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxSelectionChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxSelectionChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxSelectionChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__342063652_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxSelectionChangingEventArgs):
        Array<IRichEditBoxSelectionChangingEventArgs?> = (elements as
        Array<IRichEditBoxSelectionChangingEventArgs?>).castToImpl<IRichEditBoxSelectionChangingEventArgs,IRichEditBoxSelectionChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxSelectionChangingEventArgs?> =
        arrayOfNulls<IRichEditBoxSelectionChangingEventArgs_Impl>(size) as
        Array<IRichEditBoxSelectionChangingEventArgs?>
  }
}
