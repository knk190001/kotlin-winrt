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

@ABIMarker(IContactPhone.ABI::class)
@Signature("{467dab65-2712-4f52-b783-9ea8111c63cd}")
@Guid("467dab6527124f52b7839ea8111c63cd")
@WinRTInterface("467dab6527124f52b7839ea8111c63cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPhone.ByReference::class)
public interface IContactPhone : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Number(): String?

  @InterfaceMethod(1)
  public fun put_Number(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Kind(): ContactPhoneKind?

  @InterfaceMethod(3)
  public fun put_Kind(value: ContactPhoneKind?): Unit

  @InterfaceMethod(4)
  public fun get_Description(): String?

  @InterfaceMethod(5)
  public fun put_Description(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactPhone>
      {
    public override fun getValue() = ABI.makeIContactPhone(pointer.getPointer(0))

    public fun setValue(value: IContactPhone_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPhone {
    public val __1316315110_Ptr: Pointer?

    public val _1316315110_VtblPtr: Pointer?
      get() = __1316315110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Number(): String? {
      val fnPtr = _1316315110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1316315110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Number(value: String?): Unit {
      val fnPtr = _1316315110_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316315110_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Kind(): ContactPhoneKind? {
      val fnPtr = _1316315110_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactPhoneKind>()
      val hr = fn.invokeHR(arrayOf(__1316315110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactPhoneKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Kind(value: ContactPhoneKind?): Unit {
      val fnPtr = _1316315110_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316315110_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Description(): String? {
      val fnPtr = _1316315110_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1316315110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1316315110_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316315110_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactPhone_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1316315110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPhone, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("467dab6527124f52b7839ea8111c63cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPhone(ptr: Pointer?): WithDefault = IContactPhone_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPhone {
      val address = segment.toRawLongValue()
      return makeIContactPhone(Pointer(address))
    }

    public override fun toNative(obj: IContactPhone): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1316315110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPhone): Array<IContactPhone?> = (elements as
        Array<IContactPhone?>).castToImpl<IContactPhone,IContactPhone_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPhone?> =
        arrayOfNulls<IContactPhone_Impl>(size) as Array<IContactPhone?>
  }
}
