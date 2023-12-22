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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactChange.ABI::class)
@Signature("{951d4b10-6a59-4720-a4e1-363d98c135d5}")
@Guid("951d4b106a594720a4e1363d98c135d5")
@WinRTInterface("951d4b106a594720a4e1363d98c135d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactChange.ByReference::class)
public interface IContactChange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeType(): ContactChangeType?

  @InterfaceMethod(1)
  public fun get_Contact(): Contact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactChange>
      {
    public override fun getValue() = ABI.makeIContactChange(pointer.getPointer(0))

    public fun setValue(value: IContactChange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactChange {
    public val __1771308676_Ptr: Pointer?

    public val _1771308676_VtblPtr: Pointer?
      get() = __1771308676_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeType(): ContactChangeType? {
      val fnPtr = _1771308676_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactChangeType>()
      val hr = fn.invokeHR(arrayOf(__1771308676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactChangeType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Contact(): Contact? {
      val fnPtr = _1771308676_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Contact>()
      val hr = fn.invokeHR(arrayOf(__1771308676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Contact>(result.getValue())
      return resultValue
    }
  }

  public class IContactChange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1771308676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactChange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("951d4b106a594720a4e1363d98c135d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactChange(ptr: Pointer?): WithDefault = IContactChange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactChange {
      val address = segment.toRawLongValue()
      return makeIContactChange(Pointer(address))
    }

    public override fun toNative(obj: IContactChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1771308676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactChange): Array<IContactChange?> = (elements as
        Array<IContactChange?>).castToImpl<IContactChange,IContactChange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactChange?> =
        arrayOfNulls<IContactChange_Impl>(size) as Array<IContactChange?>
  }
}
