package Microsoft.UI.Input.DragDrop

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.ApplicationModel.DataTransfer.DataPackageView
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDragInfo.ABI::class)
@Signature("{7507d891-62a8-5a79-a880-ac7353d001ec}")
@Guid("7507d89162a85a79a880ac7353d001ec")
@WinRTInterface("7507d89162a85a79a880ac7353d001ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragInfo.ByReference::class)
public interface IDragInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowedOperations(): DataPackageOperation?

  @InterfaceMethod(1)
  public fun get_Data(): DataPackageView?

  @InterfaceMethod(2)
  public fun get_Modifiers(): DragDropModifiers?

  @InterfaceMethod(3)
  public fun get_Position(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDragInfo> {
    public override fun getValue() = ABI.makeIDragInfo(pointer.getPointer(0))

    public fun setValue(value: IDragInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragInfo {
    public val __38606102_Ptr: Pointer?

    public val _38606102_VtblPtr: Pointer?
      get() = __38606102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowedOperations(): DataPackageOperation? {
      val fnPtr = _38606102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__38606102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Data(): DataPackageView? {
      val fnPtr = _38606102_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__38606102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Modifiers(): DragDropModifiers? {
      val fnPtr = _38606102_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragDropModifiers>()
      val hr = fn.invokeHR(arrayOf(__38606102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragDropModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Position(): Point? {
      val fnPtr = _38606102_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__38606102_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IDragInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __38606102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7507d89162a85a79a880ac7353d001ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragInfo(ptr: Pointer?): WithDefault = IDragInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragInfo {
      val address = segment.toRawLongValue()
      return makeIDragInfo(Pointer(address))
    }

    public override fun toNative(obj: IDragInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__38606102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragInfo): Array<IDragInfo?> = (elements as
        Array<IDragInfo?>).castToImpl<IDragInfo,IDragInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragInfo?> = arrayOfNulls<IDragInfo_Impl>(size)
        as Array<IDragInfo?>
  }
}
