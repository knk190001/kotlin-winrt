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

@ABIMarker(IContactManagerStatics4.ABI::class)
@Signature("{24982272-347b-46dc-8d95-51bd41e15aaf}")
@Guid("24982272347b46dc8d9551bd41e15aaf")
@WinRTInterface("24982272347b46dc8d9551bd41e15aaf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactManagerStatics4.ByReference::class)
public interface IContactManagerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): ContactManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactManagerStatics4> {
    public override fun getValue() = ABI.makeIContactManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: IContactManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactManagerStatics4 {
    public val __847014792_Ptr: Pointer?

    public val _847014792_VtblPtr: Pointer?
      get() = __847014792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): ContactManagerForUser? {
      val fnPtr = _847014792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__847014792_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class IContactManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __847014792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24982272347b46dc8d9551bd41e15aaf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactManagerStatics4(ptr: Pointer?): WithDefault =
        IContactManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeIContactManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IContactManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__847014792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactManagerStatics4): Array<IContactManagerStatics4?>
        = (elements as
        Array<IContactManagerStatics4?>).castToImpl<IContactManagerStatics4,IContactManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactManagerStatics4?> =
        arrayOfNulls<IContactManagerStatics4_Impl>(size) as Array<IContactManagerStatics4?>
  }
}
