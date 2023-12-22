package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IItemsPickedEventArgs.ABI::class)
@Signature("{c6e93908-e20d-5614-988a-362d7937d276}")
@Guid("c6e93908e20d5614988a362d7937d276")
@WinRTInterface("c6e93908e20d5614988a362d7937d276")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsPickedEventArgs.ByReference::class)
public interface IItemsPickedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AddedItems(): IVector<IUnknown?>?

  @InterfaceMethod(1)
  public fun get_RemovedItems(): IVector<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsPickedEventArgs> {
    public override fun getValue() = ABI.makeIItemsPickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemsPickedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsPickedEventArgs {
    public val __854326878_Ptr: Pointer?

    public val _854326878_VtblPtr: Pointer?
      get() = __854326878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AddedItems(): IVector<IUnknown?>? {
      val fnPtr = _854326878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__854326878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemovedItems(): IVector<IUnknown?>? {
      val fnPtr = _854326878_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__854326878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IItemsPickedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __854326878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsPickedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6e93908e20d5614988a362d7937d276")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsPickedEventArgs(ptr: Pointer?): WithDefault =
        IItemsPickedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsPickedEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemsPickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemsPickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__854326878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsPickedEventArgs): Array<IItemsPickedEventArgs?> =
        (elements as
        Array<IItemsPickedEventArgs?>).castToImpl<IItemsPickedEventArgs,IItemsPickedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsPickedEventArgs?> =
        arrayOfNulls<IItemsPickedEventArgs_Impl>(size) as Array<IItemsPickedEventArgs?>
  }
}
