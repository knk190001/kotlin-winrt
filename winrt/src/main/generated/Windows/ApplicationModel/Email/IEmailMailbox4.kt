package Windows.ApplicationModel.Email

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IEmailMailbox4.ABI::class)
@Signature("{5d1f301b-f222-48a7-b7b6-716356cd26a1}")
@Guid("5d1f301bf22248a7b7b6716356cd26a1")
@WinRTInterface("5d1f301bf22248a7b7b6716356cd26a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailbox4.ByReference::class)
public interface IEmailMailbox4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterSyncManagerAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMailbox4>
      {
    public override fun getValue() = ABI.makeIEmailMailbox4(pointer.getPointer(0))

    public fun setValue(value: IEmailMailbox4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailbox4 {
    public val __817367675_Ptr: Pointer?

    public val _817367675_VtblPtr: Pointer?
      get() = __817367675_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterSyncManagerAsync(): IAsyncAction? {
      val fnPtr = _817367675_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__817367675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailbox4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __817367675_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailbox4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d1f301bf22248a7b7b6716356cd26a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailbox4(ptr: Pointer?): WithDefault = IEmailMailbox4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailbox4 {
      val address = segment.toRawLongValue()
      return makeIEmailMailbox4(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailbox4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__817367675_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailbox4): Array<IEmailMailbox4?> = (elements as
        Array<IEmailMailbox4?>).castToImpl<IEmailMailbox4,IEmailMailbox4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailbox4?> =
        arrayOfNulls<IEmailMailbox4_Impl>(size) as Array<IEmailMailbox4?>
  }
}
