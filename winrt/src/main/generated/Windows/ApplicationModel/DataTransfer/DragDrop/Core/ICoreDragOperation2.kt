package Windows.ApplicationModel.DataTransfer.DragDrop.Core

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.ApplicationModel.DataTransfer.DragDrop.Core.ICoreDragOperation.ABI.IID
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

@ABIMarker(ICoreDragOperation2.ABI::class)
@Signature("{824b1e2c-d99a-4fc3-8507-6c182f33b46a}")
@Guid("824b1e2cd99a4fc385076c182f33b46a")
@WinRTInterface("824b1e2cd99a4fc385076c182f33b46a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreDragOperation2.ByReference::class)
public interface ICoreDragOperation2 : NativeMapped, IWinRTInterface, ICoreDragOperation {
  @InterfaceMethod(0)
  public fun get_AllowedOperations(): DataPackageOperation?

  @InterfaceMethod(1)
  public fun put_AllowedOperations(value: DataPackageOperation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreDragOperation2> {
    public override fun getValue() = ABI.makeICoreDragOperation2(pointer.getPointer(0))

    public fun setValue(value: ICoreDragOperation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreDragOperation2, ICoreDragOperation.WithDefault {
    public val __800807540_Ptr: Pointer?

    public val _800807540_VtblPtr: Pointer?
      get() = __800807540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowedOperations(): DataPackageOperation? {
      val fnPtr = _800807540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__800807540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AllowedOperations(value: DataPackageOperation?): Unit {
      val fnPtr = _800807540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800807540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreDragOperation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreDragOperation {
    public override val __943998822_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_800807540_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __800807540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreDragOperation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("824b1e2cd99a4fc385076c182f33b46a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreDragOperation2(ptr: Pointer?): WithDefault = ICoreDragOperation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreDragOperation2 {
      val address = segment.toRawLongValue()
      return makeICoreDragOperation2(Pointer(address))
    }

    public override fun toNative(obj: ICoreDragOperation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__800807540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreDragOperation2): Array<ICoreDragOperation2?> =
        (elements as
        Array<ICoreDragOperation2?>).castToImpl<ICoreDragOperation2,ICoreDragOperation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreDragOperation2?> =
        arrayOfNulls<ICoreDragOperation2_Impl>(size) as Array<ICoreDragOperation2?>
  }
}
