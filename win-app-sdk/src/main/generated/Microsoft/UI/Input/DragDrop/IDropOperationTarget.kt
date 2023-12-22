package Microsoft.UI.Input.DragDrop

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDropOperationTarget.ABI::class)
@Signature("{1c2707d9-0065-53c7-bbfb-50850378caf3}")
@Guid("1c2707d9006553c7bbfb50850378caf3")
@WinRTInterface("1c2707d9006553c7bbfb50850378caf3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropOperationTarget.ByReference::class)
public interface IDropOperationTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DropAsync(dragInfo: DragInfo?): IAsyncOperation<DataPackageOperation?>?

  @InterfaceMethod(1)
  public fun EnterAsync(dragInfo: DragInfo?, dragUIOverride: DragUIOverride?):
      IAsyncOperation<DataPackageOperation?>?

  @InterfaceMethod(2)
  public fun LeaveAsync(dragInfo: DragInfo?): IAsyncAction?

  @InterfaceMethod(3)
  public fun OverAsync(dragInfo: DragInfo?, dragUIOverride: DragUIOverride?):
      IAsyncOperation<DataPackageOperation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropOperationTarget> {
    public override fun getValue() = ABI.makeIDropOperationTarget(pointer.getPointer(0))

    public fun setValue(value: IDropOperationTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropOperationTarget {
    public val __303515903_Ptr: Pointer?

    public val _303515903_VtblPtr: Pointer?
      get() = __303515903_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DropAsync(dragInfo: DragInfo?): IAsyncOperation<DataPackageOperation?>? {
      val fnPtr = _303515903_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackageOperation?>>()
      val hr = fn.invokeHR(arrayOf(__303515903_Ptr, marshalToNative(dragInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackageOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun EnterAsync(dragInfo: DragInfo?, dragUIOverride: DragUIOverride?):
        IAsyncOperation<DataPackageOperation?>? {
      val fnPtr = _303515903_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackageOperation?>>()
      val hr = fn.invokeHR(arrayOf(__303515903_Ptr, marshalToNative(dragInfo),
          marshalToNative(dragUIOverride), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackageOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun LeaveAsync(dragInfo: DragInfo?): IAsyncAction? {
      val fnPtr = _303515903_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__303515903_Ptr, marshalToNative(dragInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun OverAsync(dragInfo: DragInfo?, dragUIOverride: DragUIOverride?):
        IAsyncOperation<DataPackageOperation?>? {
      val fnPtr = _303515903_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackageOperation?>>()
      val hr = fn.invokeHR(arrayOf(__303515903_Ptr, marshalToNative(dragInfo),
          marshalToNative(dragUIOverride), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackageOperation?>>(result.getValue())
      return resultValue
    }
  }

  public class IDropOperationTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __303515903_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropOperationTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c2707d9006553c7bbfb50850378caf3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropOperationTarget(ptr: Pointer?): WithDefault = IDropOperationTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropOperationTarget {
      val address = segment.toRawLongValue()
      return makeIDropOperationTarget(Pointer(address))
    }

    public override fun toNative(obj: IDropOperationTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__303515903_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropOperationTarget): Array<IDropOperationTarget?> =
        (elements as
        Array<IDropOperationTarget?>).castToImpl<IDropOperationTarget,IDropOperationTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropOperationTarget?> =
        arrayOfNulls<IDropOperationTarget_Impl>(size) as Array<IDropOperationTarget?>
  }
}
