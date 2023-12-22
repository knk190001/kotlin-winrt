package Windows.UI.WebUI

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

@ABIMarker(IActivatedOperation.ABI::class)
@Signature("{b6a0b4bc-c6ca-42fd-9818-71904e45fed7}")
@Guid("b6a0b4bcc6ca42fd981871904e45fed7")
@WinRTInterface("b6a0b4bcc6ca42fd981871904e45fed7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivatedOperation.ByReference::class)
public interface IActivatedOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): ActivatedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivatedOperation> {
    public override fun getValue() = ABI.makeIActivatedOperation(pointer.getPointer(0))

    public fun setValue(value: IActivatedOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivatedOperation {
    public val __1156342278_Ptr: Pointer?

    public val _1156342278_VtblPtr: Pointer?
      get() = __1156342278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): ActivatedDeferral? {
      val fnPtr = _1156342278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivatedDeferral>()
      val hr = fn.invokeHR(arrayOf(__1156342278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivatedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IActivatedOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1156342278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivatedOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6a0b4bcc6ca42fd981871904e45fed7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivatedOperation(ptr: Pointer?): WithDefault = IActivatedOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivatedOperation {
      val address = segment.toRawLongValue()
      return makeIActivatedOperation(Pointer(address))
    }

    public override fun toNative(obj: IActivatedOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1156342278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivatedOperation): Array<IActivatedOperation?> =
        (elements as
        Array<IActivatedOperation?>).castToImpl<IActivatedOperation,IActivatedOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivatedOperation?> =
        arrayOfNulls<IActivatedOperation_Impl>(size) as Array<IActivatedOperation?>
  }
}
