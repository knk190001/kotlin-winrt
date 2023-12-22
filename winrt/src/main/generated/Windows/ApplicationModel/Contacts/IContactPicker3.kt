package Windows.ApplicationModel.Contacts

import Windows.System.User
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

@ABIMarker(IContactPicker3.ABI::class)
@Signature("{0e723315-b243-4bed-8516-22b1a7ac0ace}")
@Guid("0e723315b2434bed851622b1a7ac0ace")
@WinRTInterface("0e723315b2434bed851622b1a7ac0ace")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPicker3.ByReference::class)
public interface IContactPicker3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPicker3> {
    public override fun getValue() = ABI.makeIContactPicker3(pointer.getPointer(0))

    public fun setValue(value: IContactPicker3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPicker3 {
    public val __2053992721_Ptr: Pointer?

    public val _2053992721_VtblPtr: Pointer?
      get() = __2053992721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _2053992721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__2053992721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IContactPicker3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2053992721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPicker3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e723315b2434bed851622b1a7ac0ace")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPicker3(ptr: Pointer?): WithDefault = IContactPicker3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPicker3 {
      val address = segment.toRawLongValue()
      return makeIContactPicker3(Pointer(address))
    }

    public override fun toNative(obj: IContactPicker3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2053992721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPicker3): Array<IContactPicker3?> = (elements as
        Array<IContactPicker3?>).castToImpl<IContactPicker3,IContactPicker3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPicker3?> =
        arrayOfNulls<IContactPicker3_Impl>(size) as Array<IContactPicker3?>
  }
}
