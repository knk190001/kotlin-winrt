package Windows.UI.Xaml

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.ApplicationModel.DataTransfer.DataPackageView
import Windows.ApplicationModel.DataTransfer.DragDrop.DragDropModifiers
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

@ABIMarker(IDragEventArgs2.ABI::class)
@Signature("{26336658-2917-411d-bfc3-2f22471cbbe7}")
@Guid("263366582917411dbfc32f22471cbbe7")
@WinRTInterface("263366582917411dbfc32f22471cbbe7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragEventArgs2.ByReference::class)
public interface IDragEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataView(): DataPackageView?

  @InterfaceMethod(1)
  public fun get_DragUIOverride(): DragUIOverride?

  @InterfaceMethod(2)
  public fun get_Modifiers(): DragDropModifiers?

  @InterfaceMethod(3)
  public fun get_AcceptedOperation(): DataPackageOperation?

  @InterfaceMethod(4)
  public fun put_AcceptedOperation(value: DataPackageOperation?): Unit

  @InterfaceMethod(5)
  public fun GetDeferral(): DragOperationDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragEventArgs2> {
    public override fun getValue() = ABI.makeIDragEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IDragEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragEventArgs2 {
    public val __1157177439_Ptr: Pointer?

    public val _1157177439_VtblPtr: Pointer?
      get() = __1157177439_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataView(): DataPackageView? {
      val fnPtr = _1157177439_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__1157177439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DragUIOverride(): DragUIOverride? {
      val fnPtr = _1157177439_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragUIOverride>()
      val hr = fn.invokeHR(arrayOf(__1157177439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragUIOverride>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Modifiers(): DragDropModifiers? {
      val fnPtr = _1157177439_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragDropModifiers>()
      val hr = fn.invokeHR(arrayOf(__1157177439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragDropModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AcceptedOperation(): DataPackageOperation? {
      val fnPtr = _1157177439_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1157177439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_AcceptedOperation(value: DataPackageOperation?): Unit {
      val fnPtr = _1157177439_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1157177439_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetDeferral(): DragOperationDeferral? {
      val fnPtr = _1157177439_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragOperationDeferral>()
      val hr = fn.invokeHR(arrayOf(__1157177439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragOperationDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IDragEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1157177439_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("263366582917411dbfc32f22471cbbe7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragEventArgs2(ptr: Pointer?): WithDefault = IDragEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIDragEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IDragEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1157177439_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragEventArgs2): Array<IDragEventArgs2?> = (elements as
        Array<IDragEventArgs2?>).castToImpl<IDragEventArgs2,IDragEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragEventArgs2?> =
        arrayOfNulls<IDragEventArgs2_Impl>(size) as Array<IDragEventArgs2?>
  }
}
