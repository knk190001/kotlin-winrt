package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
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

@ABIMarker(ISelectionChangedEventArgs.ABI::class)
@Signature("{c972d2dc-b609-4758-851e-a799c21de97d}")
@Guid("c972d2dcb6094758851ea799c21de97d")
@WinRTInterface("c972d2dcb6094758851ea799c21de97d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionChangedEventArgs.ByReference::class)
public interface ISelectionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AddedItems(): IVector<IUnknown?>?

  @InterfaceMethod(1)
  public fun get_RemovedItems(): IVector<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectionChangedEventArgs> {
    public override fun getValue() = ABI.makeISelectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISelectionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionChangedEventArgs {
    public val __2144713555_Ptr: Pointer?

    public val _2144713555_VtblPtr: Pointer?
      get() = __2144713555_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AddedItems(): IVector<IUnknown?>? {
      val fnPtr = _2144713555_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__2144713555_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemovedItems(): IVector<IUnknown?>? {
      val fnPtr = _2144713555_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__2144713555_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ISelectionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2144713555_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c972d2dcb6094758851ea799c21de97d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionChangedEventArgs(ptr: Pointer?): WithDefault =
        ISelectionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISelectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISelectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2144713555_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionChangedEventArgs):
        Array<ISelectionChangedEventArgs?> = (elements as
        Array<ISelectionChangedEventArgs?>).castToImpl<ISelectionChangedEventArgs,ISelectionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionChangedEventArgs?> =
        arrayOfNulls<ISelectionChangedEventArgs_Impl>(size) as Array<ISelectionChangedEventArgs?>
  }
}
