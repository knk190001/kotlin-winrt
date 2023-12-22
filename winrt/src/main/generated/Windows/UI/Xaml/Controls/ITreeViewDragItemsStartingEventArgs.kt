package Windows.UI.Xaml.Controls

import Windows.ApplicationModel.DataTransfer.DataPackage
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITreeViewDragItemsStartingEventArgs.ABI::class)
@Signature("{7bdb7ec4-e125-5773-9a3f-6695233d6250}")
@Guid("7bdb7ec4e12557739a3f6695233d6250")
@WinRTInterface("7bdb7ec4e12557739a3f6695233d6250")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewDragItemsStartingEventArgs.ByReference::class)
public interface ITreeViewDragItemsStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Data(): DataPackage?

  @InterfaceMethod(3)
  public fun get_Items(): IVector<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewDragItemsStartingEventArgs> {
    public override fun getValue() =
        ABI.makeITreeViewDragItemsStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITreeViewDragItemsStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewDragItemsStartingEventArgs {
    public val __1013988234_Ptr: Pointer?

    public val _1013988234_VtblPtr: Pointer?
      get() = __1013988234_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1013988234_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1013988234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1013988234_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1013988234_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Data(): DataPackage? {
      val fnPtr = _1013988234_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__1013988234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Items(): IVector<IUnknown?>? {
      val fnPtr = _1013988234_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1013988234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewDragItemsStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1013988234_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewDragItemsStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7bdb7ec4e12557739a3f6695233d6250")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewDragItemsStartingEventArgs(ptr: Pointer?): WithDefault =
        ITreeViewDragItemsStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewDragItemsStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeITreeViewDragItemsStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewDragItemsStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1013988234_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewDragItemsStartingEventArgs):
        Array<ITreeViewDragItemsStartingEventArgs?> = (elements as
        Array<ITreeViewDragItemsStartingEventArgs?>).castToImpl<ITreeViewDragItemsStartingEventArgs,ITreeViewDragItemsStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewDragItemsStartingEventArgs?> =
        arrayOfNulls<ITreeViewDragItemsStartingEventArgs_Impl>(size) as
        Array<ITreeViewDragItemsStartingEventArgs?>
  }
}
