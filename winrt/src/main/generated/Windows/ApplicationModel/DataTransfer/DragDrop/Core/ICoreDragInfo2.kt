package Windows.ApplicationModel.DataTransfer.DragDrop.Core

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.ApplicationModel.DataTransfer.DragDrop.Core.ICoreDragInfo.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ICoreDragInfo2.ABI::class)
@Signature("{c54691e5-e6fb-4d74-b4b1-8a3c17f25e9e}")
@Guid("c54691e5e6fb4d74b4b18a3c17f25e9e")
@WinRTInterface("c54691e5e6fb4d74b4b18a3c17f25e9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreDragInfo2.ByReference::class)
public interface ICoreDragInfo2 : NativeMapped, IWinRTInterface, ICoreDragInfo {
  @InterfaceMethod(0)
  public fun get_AllowedOperations(): DataPackageOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreDragInfo2>
      {
    public override fun getValue() = ABI.makeICoreDragInfo2(pointer.getPointer(0))

    public fun setValue(value: ICoreDragInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreDragInfo2, ICoreDragInfo.WithDefault {
    public val __1265859267_Ptr: Pointer?

    public val _1265859267_VtblPtr: Pointer?
      get() = __1265859267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowedOperations(): DataPackageOperation? {
      val fnPtr = _1265859267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1265859267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }
  }

  public class ICoreDragInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreDragInfo {
    public override val __1344639153_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1265859267_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1265859267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreDragInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c54691e5e6fb4d74b4b18a3c17f25e9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreDragInfo2(ptr: Pointer?): WithDefault = ICoreDragInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreDragInfo2 {
      val address = segment.toRawLongValue()
      return makeICoreDragInfo2(Pointer(address))
    }

    public override fun toNative(obj: ICoreDragInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1265859267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreDragInfo2): Array<ICoreDragInfo2?> = (elements as
        Array<ICoreDragInfo2?>).castToImpl<ICoreDragInfo2,ICoreDragInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreDragInfo2?> =
        arrayOfNulls<ICoreDragInfo2_Impl>(size) as Array<ICoreDragInfo2?>
  }
}
