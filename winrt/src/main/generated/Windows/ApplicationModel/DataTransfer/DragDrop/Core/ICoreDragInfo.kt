package Windows.ApplicationModel.DataTransfer.DragDrop.Core

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreDragInfo.ABI::class)
@Signature("{48353a8b-cb50-464e-9575-cd4e3a7ab028}")
@Guid("48353a8bcb50464e9575cd4e3a7ab028")
@WinRTInterface("48353a8bcb50464e9575cd4e3a7ab028")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreDragInfo.ByReference::class)
public interface ICoreDragInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): DataPackageView?

  @InterfaceMethod(1)
  public fun get_Modifiers(): DragDropModifiers?

  @InterfaceMethod(2)
  public fun get_Position(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreDragInfo>
      {
    public override fun getValue() = ABI.makeICoreDragInfo(pointer.getPointer(0))

    public fun setValue(value: ICoreDragInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreDragInfo {
    public val __1344639153_Ptr: Pointer?

    public val _1344639153_VtblPtr: Pointer?
      get() = __1344639153_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): DataPackageView? {
      val fnPtr = _1344639153_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__1344639153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Modifiers(): DragDropModifiers? {
      val fnPtr = _1344639153_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DragDropModifiers>()
      val hr = fn.invokeHR(arrayOf(__1344639153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DragDropModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Position(): Point? {
      val fnPtr = _1344639153_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1344639153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class ICoreDragInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1344639153_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreDragInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48353a8bcb50464e9575cd4e3a7ab028")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreDragInfo(ptr: Pointer?): WithDefault = ICoreDragInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreDragInfo {
      val address = segment.toRawLongValue()
      return makeICoreDragInfo(Pointer(address))
    }

    public override fun toNative(obj: ICoreDragInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1344639153_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreDragInfo): Array<ICoreDragInfo?> = (elements as
        Array<ICoreDragInfo?>).castToImpl<ICoreDragInfo,ICoreDragInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreDragInfo?> =
        arrayOfNulls<ICoreDragInfo_Impl>(size) as Array<ICoreDragInfo?>
  }
}
