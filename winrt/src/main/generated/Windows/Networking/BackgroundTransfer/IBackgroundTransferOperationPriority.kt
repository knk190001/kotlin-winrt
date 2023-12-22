package Windows.Networking.BackgroundTransfer

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

@ABIMarker(IBackgroundTransferOperationPriority.ABI::class)
@Signature("{04854327-5254-4b3a-915e-0aa49275c0f9}")
@Guid("0485432752544b3a915e0aa49275c0f9")
@WinRTInterface("0485432752544b3a915e0aa49275c0f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferOperationPriority.ByReference::class)
public interface IBackgroundTransferOperationPriority : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Priority(): BackgroundTransferPriority?

  @InterfaceMethod(1)
  public fun put_Priority(value: BackgroundTransferPriority?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferOperationPriority> {
    public override fun getValue() =
        ABI.makeIBackgroundTransferOperationPriority(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferOperationPriority_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferOperationPriority {
    public val __2067785489_Ptr: Pointer?

    public val _2067785489_VtblPtr: Pointer?
      get() = __2067785489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Priority(): BackgroundTransferPriority? {
      val fnPtr = _2067785489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferPriority>()
      val hr = fn.invokeHR(arrayOf(__2067785489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferPriority>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Priority(value: BackgroundTransferPriority?): Unit {
      val fnPtr = _2067785489_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067785489_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTransferOperationPriority_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067785489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferOperationPriority, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0485432752544b3a915e0aa49275c0f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferOperationPriority(ptr: Pointer?): WithDefault =
        IBackgroundTransferOperationPriority_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferOperationPriority {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferOperationPriority(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferOperationPriority): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067785489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferOperationPriority):
        Array<IBackgroundTransferOperationPriority?> = (elements as
        Array<IBackgroundTransferOperationPriority?>).castToImpl<IBackgroundTransferOperationPriority,IBackgroundTransferOperationPriority_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferOperationPriority?> =
        arrayOfNulls<IBackgroundTransferOperationPriority_Impl>(size) as
        Array<IBackgroundTransferOperationPriority?>
  }
}
