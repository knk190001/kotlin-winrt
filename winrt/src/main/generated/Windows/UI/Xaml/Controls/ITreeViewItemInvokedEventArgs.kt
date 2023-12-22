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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITreeViewItemInvokedEventArgs.ABI::class)
@Signature("{472ab521-0242-4290-9363-ab4fe704527f}")
@Guid("472ab521024242909363ab4fe704527f")
@WinRTInterface("472ab521024242909363ab4fe704527f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItemInvokedEventArgs.ByReference::class)
public interface ITreeViewItemInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InvokedItem(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewItemInvokedEventArgs> {
    public override fun getValue() = ABI.makeITreeViewItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItemInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItemInvokedEventArgs {
    public val __1538550691_Ptr: Pointer?

    public val _1538550691_VtblPtr: Pointer?
      get() = __1538550691_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InvokedItem(): IUnknown? {
      val fnPtr = _1538550691_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1538550691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1538550691_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1538550691_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1538550691_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1538550691_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ITreeViewItemInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1538550691_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItemInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("472ab521024242909363ab4fe704527f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItemInvokedEventArgs(ptr: Pointer?): WithDefault =
        ITreeViewItemInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeITreeViewItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1538550691_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItemInvokedEventArgs):
        Array<ITreeViewItemInvokedEventArgs?> = (elements as
        Array<ITreeViewItemInvokedEventArgs?>).castToImpl<ITreeViewItemInvokedEventArgs,ITreeViewItemInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItemInvokedEventArgs?> =
        arrayOfNulls<ITreeViewItemInvokedEventArgs_Impl>(size) as
        Array<ITreeViewItemInvokedEventArgs?>
  }
}
