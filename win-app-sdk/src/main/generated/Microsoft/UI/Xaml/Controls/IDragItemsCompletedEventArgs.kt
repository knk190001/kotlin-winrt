package Microsoft.UI.Xaml.Controls

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IDragItemsCompletedEventArgs.ABI::class)
@Signature("{c0138552-f467-5c3e-8af4-593607762844}")
@Guid("c0138552f4675c3e8af4593607762844")
@WinRTInterface("c0138552f4675c3e8af4593607762844")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragItemsCompletedEventArgs.ByReference::class)
public interface IDragItemsCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Items(): IVectorView<IUnknown?>?

  @InterfaceMethod(1)
  public fun get_DropResult(): DataPackageOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragItemsCompletedEventArgs> {
    public override fun getValue() = ABI.makeIDragItemsCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDragItemsCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragItemsCompletedEventArgs {
    public val __1049164401_Ptr: Pointer?

    public val _1049164401_VtblPtr: Pointer?
      get() = __1049164401_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IVectorView<IUnknown?>? {
      val fnPtr = _1049164401_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1049164401_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DropResult(): DataPackageOperation? {
      val fnPtr = _1049164401_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1049164401_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }
  }

  public class IDragItemsCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1049164401_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragItemsCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0138552f4675c3e8af4593607762844")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragItemsCompletedEventArgs(ptr: Pointer?): WithDefault =
        IDragItemsCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragItemsCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDragItemsCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDragItemsCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1049164401_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragItemsCompletedEventArgs):
        Array<IDragItemsCompletedEventArgs?> = (elements as
        Array<IDragItemsCompletedEventArgs?>).castToImpl<IDragItemsCompletedEventArgs,IDragItemsCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragItemsCompletedEventArgs?> =
        arrayOfNulls<IDragItemsCompletedEventArgs_Impl>(size) as
        Array<IDragItemsCompletedEventArgs?>
  }
}
