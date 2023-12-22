package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactStore3.ABI::class)
@Signature("{cb882c6c-004e-4050-87f0-840407ee6818}")
@Guid("cb882c6c004e405087f0840407ee6818")
@WinRTInterface("cb882c6c004e405087f0840407ee6818")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactStore3.ByReference::class)
public interface IContactStore3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetChangeTracker(identity: String?): ContactChangeTracker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactStore3>
      {
    public override fun getValue() = ABI.makeIContactStore3(pointer.getPointer(0))

    public fun setValue(value: IContactStore3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactStore3 {
    public val __2054089146_Ptr: Pointer?

    public val _2054089146_VtblPtr: Pointer?
      get() = __2054089146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetChangeTracker(identity: String?): ContactChangeTracker? {
      val fnPtr = _2054089146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__2054089146_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactChangeTracker>(result.getValue())
      return resultValue
    }
  }

  public class IContactStore3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2054089146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactStore3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb882c6c004e405087f0840407ee6818")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactStore3(ptr: Pointer?): WithDefault = IContactStore3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactStore3 {
      val address = segment.toRawLongValue()
      return makeIContactStore3(Pointer(address))
    }

    public override fun toNative(obj: IContactStore3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2054089146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactStore3): Array<IContactStore3?> = (elements as
        Array<IContactStore3?>).castToImpl<IContactStore3,IContactStore3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactStore3?> =
        arrayOfNulls<IContactStore3_Impl>(size) as Array<IContactStore3?>
  }
}
