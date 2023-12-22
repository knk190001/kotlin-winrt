package Windows.ApplicationModel

import Windows.Foundation.DateTime
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

@ABIMarker(ISuspendingOperation.ABI::class)
@Signature("{9da4ca41-20e1-4e9b-9f65-a9f435340c3a}")
@Guid("9da4ca4120e14e9b9f65a9f435340c3a")
@WinRTInterface("9da4ca4120e14e9b9f65a9f435340c3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISuspendingOperation.ByReference::class)
public interface ISuspendingOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): SuspendingDeferral?

  @InterfaceMethod(1)
  public fun get_Deadline(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISuspendingOperation> {
    public override fun getValue() = ABI.makeISuspendingOperation(pointer.getPointer(0))

    public fun setValue(value: ISuspendingOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISuspendingOperation {
    public val __1556248796_Ptr: Pointer?

    public val _1556248796_VtblPtr: Pointer?
      get() = __1556248796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): SuspendingDeferral? {
      val fnPtr = _1556248796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SuspendingDeferral>()
      val hr = fn.invokeHR(arrayOf(__1556248796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SuspendingDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _1556248796_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1556248796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class ISuspendingOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1556248796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISuspendingOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9da4ca4120e14e9b9f65a9f435340c3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISuspendingOperation(ptr: Pointer?): WithDefault = ISuspendingOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISuspendingOperation {
      val address = segment.toRawLongValue()
      return makeISuspendingOperation(Pointer(address))
    }

    public override fun toNative(obj: ISuspendingOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1556248796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISuspendingOperation): Array<ISuspendingOperation?> =
        (elements as
        Array<ISuspendingOperation?>).castToImpl<ISuspendingOperation,ISuspendingOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISuspendingOperation?> =
        arrayOfNulls<ISuspendingOperation_Impl>(size) as Array<ISuspendingOperation?>
  }
}
