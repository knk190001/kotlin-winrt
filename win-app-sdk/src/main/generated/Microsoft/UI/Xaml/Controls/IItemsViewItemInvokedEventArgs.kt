package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IItemsViewItemInvokedEventArgs.ABI::class)
@Signature("{5a2386e8-15b8-5f25-874b-7912f633ce21}")
@Guid("5a2386e815b85f25874b7912f633ce21")
@WinRTInterface("5a2386e815b85f25874b7912f633ce21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsViewItemInvokedEventArgs.ByReference::class)
public interface IItemsViewItemInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InvokedItem(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsViewItemInvokedEventArgs> {
    public override fun getValue() = ABI.makeIItemsViewItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemsViewItemInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsViewItemInvokedEventArgs {
    public val __13149180_Ptr: Pointer?

    public val _13149180_VtblPtr: Pointer?
      get() = __13149180_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InvokedItem(): IUnknown? {
      val fnPtr = _13149180_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__13149180_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IItemsViewItemInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __13149180_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsViewItemInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a2386e815b85f25874b7912f633ce21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsViewItemInvokedEventArgs(ptr: Pointer?): WithDefault =
        IItemsViewItemInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsViewItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemsViewItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemsViewItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__13149180_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsViewItemInvokedEventArgs):
        Array<IItemsViewItemInvokedEventArgs?> = (elements as
        Array<IItemsViewItemInvokedEventArgs?>).castToImpl<IItemsViewItemInvokedEventArgs,IItemsViewItemInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsViewItemInvokedEventArgs?> =
        arrayOfNulls<IItemsViewItemInvokedEventArgs_Impl>(size) as
        Array<IItemsViewItemInvokedEventArgs?>
  }
}
