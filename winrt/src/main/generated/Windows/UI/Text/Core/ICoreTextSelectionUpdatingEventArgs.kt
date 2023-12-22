package Windows.UI.Text.Core

import Windows.Foundation.Deferral
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

@ABIMarker(ICoreTextSelectionUpdatingEventArgs.ABI::class)
@Signature("{d445839f-fe7f-4bd5-8a26-0922c1b3e639}")
@Guid("d445839ffe7f4bd58a260922c1b3e639")
@WinRTInterface("d445839ffe7f4bd58a260922c1b3e639")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextSelectionUpdatingEventArgs.ByReference::class)
public interface ICoreTextSelectionUpdatingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Selection(): CoreTextRange?

  @InterfaceMethod(1)
  public fun get_Result(): CoreTextSelectionUpdatingResult?

  @InterfaceMethod(2)
  public fun put_Result(value: CoreTextSelectionUpdatingResult?): Unit

  @InterfaceMethod(3)
  public fun get_IsCanceled(): Boolean

  @InterfaceMethod(4)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextSelectionUpdatingEventArgs> {
    public override fun getValue() =
        ABI.makeICoreTextSelectionUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreTextSelectionUpdatingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextSelectionUpdatingEventArgs {
    public val __2099320393_Ptr: Pointer?

    public val _2099320393_VtblPtr: Pointer?
      get() = __2099320393_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Selection(): CoreTextRange? {
      val fnPtr = _2099320393_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextRange>()
      val hr = fn.invokeHR(arrayOf(__2099320393_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Result(): CoreTextSelectionUpdatingResult? {
      val fnPtr = _2099320393_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextSelectionUpdatingResult>()
      val hr = fn.invokeHR(arrayOf(__2099320393_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextSelectionUpdatingResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Result(value: CoreTextSelectionUpdatingResult?): Unit {
      val fnPtr = _2099320393_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2099320393_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _2099320393_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2099320393_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _2099320393_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__2099320393_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextSelectionUpdatingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2099320393_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextSelectionUpdatingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d445839ffe7f4bd58a260922c1b3e639")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextSelectionUpdatingEventArgs(ptr: Pointer?): WithDefault =
        ICoreTextSelectionUpdatingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextSelectionUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreTextSelectionUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextSelectionUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2099320393_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextSelectionUpdatingEventArgs):
        Array<ICoreTextSelectionUpdatingEventArgs?> = (elements as
        Array<ICoreTextSelectionUpdatingEventArgs?>).castToImpl<ICoreTextSelectionUpdatingEventArgs,ICoreTextSelectionUpdatingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextSelectionUpdatingEventArgs?> =
        arrayOfNulls<ICoreTextSelectionUpdatingEventArgs_Impl>(size) as
        Array<ICoreTextSelectionUpdatingEventArgs?>
  }
}
