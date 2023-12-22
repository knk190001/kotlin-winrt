package Microsoft.UI.Xaml

import Windows.ApplicationModel.DataTransfer.DataPackage
import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.ApplicationModel.DataTransfer.DataPackageView
import Windows.ApplicationModel.DataTransfer.DragDrop.DragDropModifiers
import Windows.Foundation.Point
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

@ABIMarker(IDragEventArgs.ABI::class)
@Signature("{47ac5757-e4bc-52ba-8ab9-1bf81aad7900}")
@Guid("47ac5757e4bc52ba8ab91bf81aad7900")
@WinRTInterface("47ac5757e4bc52ba8ab91bf81aad7900")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragEventArgs.ByReference::class)
public interface IDragEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Data(): DataPackage?

  @InterfaceMethod(3)
  public fun put_Data(value: DataPackage?): Unit

  @InterfaceMethod(4)
  public fun get_DataView(): DataPackageView?

  @InterfaceMethod(5)
  public fun get_DragUIOverride(): DragUIOverride?

  @InterfaceMethod(6)
  public fun get_Modifiers(): DragDropModifiers?

  @InterfaceMethod(7)
  public fun get_AcceptedOperation(): DataPackageOperation?

  @InterfaceMethod(8)
  public fun put_AcceptedOperation(value: DataPackageOperation?): Unit

  @InterfaceMethod(9)
  public fun get_AllowedOperations(): DataPackageOperation?

  @InterfaceMethod(10)
  public fun GetDeferral(): DragOperationDeferral?

  @InterfaceMethod(11)
  public fun GetPosition(relativeTo: UIElement?): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDragEventArgs>
      {
    public override fun getValue() = ABI.makeIDragEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDragEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragEventArgs {
    public val __1626694948_Ptr: Pointer?

    public val _1626694948_VtblPtr: Pointer?
      get() = __1626694948_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Data(): DataPackage? {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Data(value: DataPackage?): Unit {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DataView(): DataPackageView? {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DragUIOverride(): DragUIOverride? {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragUIOverride>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragUIOverride>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Modifiers(): DragDropModifiers? {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragDropModifiers>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragDropModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AcceptedOperation(): DataPackageOperation? {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_AcceptedOperation(value: DataPackageOperation?): Unit {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_AllowedOperations(): DataPackageOperation? {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetDeferral(): DragOperationDeferral? {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragOperationDeferral>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragOperationDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetPosition(relativeTo: UIElement?): Point? {
      val fnPtr = _1626694948_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1626694948_Ptr, marshalToNative(relativeTo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IDragEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1626694948_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47ac5757e4bc52ba8ab91bf81aad7900")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragEventArgs(ptr: Pointer?): WithDefault = IDragEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragEventArgs {
      val address = segment.toRawLongValue()
      return makeIDragEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDragEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1626694948_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragEventArgs): Array<IDragEventArgs?> = (elements as
        Array<IDragEventArgs?>).castToImpl<IDragEventArgs,IDragEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragEventArgs?> =
        arrayOfNulls<IDragEventArgs_Impl>(size) as Array<IDragEventArgs?>
  }
}
