package Microsoft.UI.Xaml

import Windows.ApplicationModel.DataTransfer.DataPackage
import Windows.ApplicationModel.DataTransfer.DataPackageOperation
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

@ABIMarker(IDragStartingEventArgs.ABI::class)
@Signature("{ad17bace-9613-5666-a31b-79a73fba77cf}")
@Guid("ad17bace96135666a31b79a73fba77cf")
@WinRTInterface("ad17bace96135666a31b79a73fba77cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragStartingEventArgs.ByReference::class)
public interface IDragStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Data(): DataPackage?

  @InterfaceMethod(3)
  public fun get_DragUI(): DragUI?

  @InterfaceMethod(4)
  public fun get_AllowedOperations(): DataPackageOperation?

  @InterfaceMethod(5)
  public fun put_AllowedOperations(value: DataPackageOperation?): Unit

  @InterfaceMethod(6)
  public fun GetDeferral(): DragOperationDeferral?

  @InterfaceMethod(7)
  public fun GetPosition(relativeTo: UIElement?): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragStartingEventArgs> {
    public override fun getValue() = ABI.makeIDragStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDragStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragStartingEventArgs {
    public val __260705660_Ptr: Pointer?

    public val _260705660_VtblPtr: Pointer?
      get() = __260705660_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _260705660_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__260705660_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _260705660_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__260705660_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Data(): DataPackage? {
      val fnPtr = _260705660_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__260705660_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DragUI(): DragUI? {
      val fnPtr = _260705660_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragUI>()
      val hr = fn.invokeHR(arrayOf(__260705660_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragUI>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AllowedOperations(): DataPackageOperation? {
      val fnPtr = _260705660_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__260705660_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_AllowedOperations(value: DataPackageOperation?): Unit {
      val fnPtr = _260705660_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__260705660_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetDeferral(): DragOperationDeferral? {
      val fnPtr = _260705660_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragOperationDeferral>()
      val hr = fn.invokeHR(arrayOf(__260705660_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragOperationDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetPosition(relativeTo: UIElement?): Point? {
      val fnPtr = _260705660_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__260705660_Ptr, marshalToNative(relativeTo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IDragStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __260705660_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad17bace96135666a31b79a73fba77cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragStartingEventArgs(ptr: Pointer?): WithDefault =
        IDragStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeIDragStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDragStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__260705660_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragStartingEventArgs): Array<IDragStartingEventArgs?> =
        (elements as
        Array<IDragStartingEventArgs?>).castToImpl<IDragStartingEventArgs,IDragStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragStartingEventArgs?> =
        arrayOfNulls<IDragStartingEventArgs_Impl>(size) as Array<IDragStartingEventArgs?>
  }
}
