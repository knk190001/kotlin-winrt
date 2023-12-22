package Microsoft.UI.Input.DragDrop

import Microsoft.UI.Input.PointerPoint
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

@ABIMarker(IDragOperation.ABI::class)
@Signature("{ef122288-7984-53d3-8488-133dcd3de793}")
@Guid("ef122288798453d38488133dcd3de793")
@WinRTInterface("ef122288798453d38488133dcd3de793")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragOperation.ByReference::class)
public interface IDragOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowedOperations(): DataPackageOperation?

  @InterfaceMethod(1)
  public fun put_AllowedOperations(value: DataPackageOperation?): Unit

  @InterfaceMethod(2)
  public fun get_Data(): DataPackage?

  @InterfaceMethod(3)
  public fun get_DragUIContentMode(): DragUIContentMode?

  @InterfaceMethod(4)
  public fun put_DragUIContentMode(value: DragUIContentMode?): Unit

  @InterfaceMethod(5)
  public fun SetDragUIContentFromSoftwareBitmap(bitmap: SoftwareBitmap?): Unit

  @InterfaceMethod(6)
  public fun SetDragUIContentFromSoftwareBitmap(bitmap: SoftwareBitmap?, anchorPoint: Point?): Unit

  @InterfaceMethod(7)
  public fun StartAsync(initialTarget: DragDropManager?, initialPointerPoint: PointerPoint?):
      IAsyncOperation<DataPackageOperation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDragOperation>
      {
    public override fun getValue() = ABI.makeIDragOperation(pointer.getPointer(0))

    public fun setValue(value: IDragOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragOperation {
    public val __1107307349_Ptr: Pointer?

    public val _1107307349_VtblPtr: Pointer?
      get() = __1107307349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowedOperations(): DataPackageOperation? {
      val fnPtr = _1107307349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1107307349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AllowedOperations(value: DataPackageOperation?): Unit {
      val fnPtr = _1107307349_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1107307349_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Data(): DataPackage? {
      val fnPtr = _1107307349_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__1107307349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DragUIContentMode(): DragUIContentMode? {
      val fnPtr = _1107307349_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragUIContentMode>()
      val hr = fn.invokeHR(arrayOf(__1107307349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragUIContentMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_DragUIContentMode(value: DragUIContentMode?): Unit {
      val fnPtr = _1107307349_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1107307349_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetDragUIContentFromSoftwareBitmap(bitmap: SoftwareBitmap?): Unit {
      val fnPtr = _1107307349_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1107307349_Ptr, marshalToNative(bitmap),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetDragUIContentFromSoftwareBitmap(bitmap: SoftwareBitmap?,
        anchorPoint: Point?): Unit {
      val fnPtr = _1107307349_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1107307349_Ptr, marshalToNative(bitmap),
          marshalToNative(anchorPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun StartAsync(initialTarget: DragDropManager?,
        initialPointerPoint: PointerPoint?): IAsyncOperation<DataPackageOperation?>? {
      val fnPtr = _1107307349_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackageOperation?>>()
      val hr = fn.invokeHR(arrayOf(__1107307349_Ptr, marshalToNative(initialTarget),
          marshalToNative(initialPointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackageOperation?>>(result.getValue())
      return resultValue
    }
  }

  public class IDragOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1107307349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef122288798453d38488133dcd3de793")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragOperation(ptr: Pointer?): WithDefault = IDragOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragOperation {
      val address = segment.toRawLongValue()
      return makeIDragOperation(Pointer(address))
    }

    public override fun toNative(obj: IDragOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1107307349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragOperation): Array<IDragOperation?> = (elements as
        Array<IDragOperation?>).castToImpl<IDragOperation,IDragOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragOperation?> =
        arrayOfNulls<IDragOperation_Impl>(size) as Array<IDragOperation?>
  }
}
