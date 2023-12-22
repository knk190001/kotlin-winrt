package Windows.ApplicationModel.Email

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailMailbox5.ABI::class)
@Signature("{39967087-0092-49be-bd0e-5d4dc9d96d90}")
@Guid("39967087009249bebd0e5d4dc9d96d90")
@WinRTInterface("39967087009249bebd0e5d4dc9d96d90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailbox5.ByReference::class)
public interface IEmailMailbox5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetChangeTracker(identity: String?): EmailMailboxChangeTracker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMailbox5>
      {
    public override fun getValue() = ABI.makeIEmailMailbox5(pointer.getPointer(0))

    public fun setValue(value: IEmailMailbox5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailbox5 {
    public val __817367674_Ptr: Pointer?

    public val _817367674_VtblPtr: Pointer?
      get() = __817367674_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetChangeTracker(identity: String?): EmailMailboxChangeTracker? {
      val fnPtr = _817367674_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__817367674_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxChangeTracker>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailbox5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __817367674_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailbox5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39967087009249bebd0e5d4dc9d96d90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailbox5(ptr: Pointer?): WithDefault = IEmailMailbox5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailbox5 {
      val address = segment.toRawLongValue()
      return makeIEmailMailbox5(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailbox5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__817367674_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailbox5): Array<IEmailMailbox5?> = (elements as
        Array<IEmailMailbox5?>).castToImpl<IEmailMailbox5,IEmailMailbox5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailbox5?> =
        arrayOfNulls<IEmailMailbox5_Impl>(size) as Array<IEmailMailbox5?>
  }
}
