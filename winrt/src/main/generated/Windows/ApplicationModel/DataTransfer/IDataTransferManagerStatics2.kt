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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDataTransferManagerStatics2.ABI::class)
@Signature("{c54ec2ec-9f97-4d63-9868-395e271ad8f5}")
@Guid("c54ec2ec9f974d639868395e271ad8f5")
@WinRTInterface("c54ec2ec9f974d639868395e271ad8f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTransferManagerStatics2.ByReference::class)
public interface IDataTransferManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTransferManagerStatics2> {
    public override fun getValue() = ABI.makeIDataTransferManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IDataTransferManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTransferManagerStatics2 {
    public val __1187122597_Ptr: Pointer?

    public val _1187122597_VtblPtr: Pointer?
      get() = __1187122597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1187122597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1187122597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDataTransferManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187122597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTransferManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c54ec2ec9f974d639868395e271ad8f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTransferManagerStatics2(ptr: Pointer?): WithDefault =
        IDataTransferManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTransferManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIDataTransferManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDataTransferManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187122597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTransferManagerStatics2):
        Array<IDataTransferManagerStatics2?> = (elements as
        Array<IDataTransferManagerStatics2?>).castToImpl<IDataTransferManagerStatics2,IDataTransferManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTransferManagerStatics2?> =
        arrayOfNulls<IDataTransferManagerStatics2_Impl>(size) as
        Array<IDataTransferManagerStatics2?>
  }
}
