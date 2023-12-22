package Windows.ApplicationModel.DataTransfer.DragDrop.Core

import Windows.ApplicationModel.DataTransfer.DataPackage
import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Point
import Windows.Graphics.Imaging.SoftwareBitmap
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICoreDragOperation.ABI::class)
@Signature("{cc06de4f-6db0-4e62-ab1b-a74a02dc6d85}")
@Guid("cc06de4f6db04e62ab1ba74a02dc6d85")
@WinRTInterface("cc06de4f6db04e62ab1ba74a02dc6d85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreDragOperation.ByReference::class)
public interface ICoreDragOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): DataPackage?

  @InterfaceMethod(1)
  public fun SetPointerId(pointerId: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun SetDragUIContentFromSoftwareBitmap(softwareBitmap: SoftwareBitmap?): Unit

  @InterfaceMethod(3)
  public fun SetDragUIContentFromSoftwareBitmap(softwareBitmap: SoftwareBitmap?,
      anchorPoint: Point?): Unit

  @InterfaceMethod(4)
  public fun get_DragUIContentMode(): CoreDragUIContentMode?

  @InterfaceMethod(5)
  public fun put_DragUIContentMode(value: CoreDragUIContentMode?): Unit

  @InterfaceMethod(6)
  public fun StartAsync(): IAsyncOperation<DataPackageOperation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreDragOperation> {
    public override fun getValue() = ABI.makeICoreDragOperation(pointer.getPointer(0))

    public fun setValue(value: ICoreDragOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreDragOperation {
    public val __943998822_Ptr: Pointer?

    public val _943998822_VtblPtr: Pointer?
      get() = __943998822_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): DataPackage? {
      val fnPtr = _943998822_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__943998822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetPointerId(pointerId: WinDef.UINT): Unit {
      val fnPtr = _943998822_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__943998822_Ptr, pointerId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetDragUIContentFromSoftwareBitmap(softwareBitmap: SoftwareBitmap?): Unit {
      val fnPtr = _943998822_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__943998822_Ptr, marshalToNative(softwareBitmap),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetDragUIContentFromSoftwareBitmap(softwareBitmap: SoftwareBitmap?,
        anchorPoint: Point?): Unit {
      val fnPtr = _943998822_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__943998822_Ptr, marshalToNative(softwareBitmap),
          marshalToNative(anchorPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DragUIContentMode(): CoreDragUIContentMode? {
      val fnPtr = _943998822_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDragUIContentMode>()
      val hr = fn.invokeHR(arrayOf(__943998822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDragUIContentMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_DragUIContentMode(value: CoreDragUIContentMode?): Unit {
      val fnPtr = _943998822_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__943998822_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun StartAsync(): IAsyncOperation<DataPackageOperation?>? {
      val fnPtr = _943998822_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackageOperation?>>()
      val hr = fn.invokeHR(arrayOf(__943998822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackageOperation?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreDragOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __943998822_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreDragOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc06de4f6db04e62ab1ba74a02dc6d85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreDragOperation(ptr: Pointer?): WithDefault = ICoreDragOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreDragOperation {
      val address = segment.toRawLongValue()
      return makeICoreDragOperation(Pointer(address))
    }

    public override fun toNative(obj: ICoreDragOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__943998822_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreDragOperation): Array<ICoreDragOperation?> =
        (elements as
        Array<ICoreDragOperation?>).castToImpl<ICoreDragOperation,ICoreDragOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreDragOperation?> =
        arrayOfNulls<ICoreDragOperation_Impl>(size) as Array<ICoreDragOperation?>
  }
}
