package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IDataTransferManagerStatics3.ABI::class)
@Signature("{05845473-6c82-4f5c-ac23-62e458361fac}")
@Guid("058454736c824f5cac2362e458361fac")
@WinRTInterface("058454736c824f5cac2362e458361fac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTransferManagerStatics3.ByReference::class)
public interface IDataTransferManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowShareUI(options: ShareUIOptions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTransferManagerStatics3> {
    public override fun getValue() = ABI.makeIDataTransferManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IDataTransferManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTransferManagerStatics3 {
    public val __1187122596_Ptr: Pointer?

    public val _1187122596_VtblPtr: Pointer?
      get() = __1187122596_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowShareUI(options: ShareUIOptions?): Unit {
      val fnPtr = _1187122596_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1187122596_Ptr, marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataTransferManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187122596_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTransferManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("058454736c824f5cac2362e458361fac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTransferManagerStatics3(ptr: Pointer?): WithDefault =
        IDataTransferManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTransferManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIDataTransferManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IDataTransferManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187122596_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTransferManagerStatics3):
        Array<IDataTransferManagerStatics3?> = (elements as
        Array<IDataTransferManagerStatics3?>).castToImpl<IDataTransferManagerStatics3,IDataTransferManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTransferManagerStatics3?> =
        arrayOfNulls<IDataTransferManagerStatics3_Impl>(size) as
        Array<IDataTransferManagerStatics3?>
  }
}
