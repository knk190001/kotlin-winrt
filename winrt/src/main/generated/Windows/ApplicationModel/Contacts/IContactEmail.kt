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

@ABIMarker(IContactEmail.ABI::class)
@Signature("{90a219a9-e3d3-4d63-993b-05b9a5393abf}")
@Guid("90a219a9e3d34d63993b05b9a5393abf")
@WinRTInterface("90a219a9e3d34d63993b05b9a5393abf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactEmail.ByReference::class)
public interface IContactEmail : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Address(): String?

  @InterfaceMethod(1)
  public fun put_Address(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Kind(): ContactEmailKind?

  @InterfaceMethod(3)
  public fun put_Kind(value: ContactEmailKind?): Unit

  @InterfaceMethod(4)
  public fun get_Description(): String?

  @InterfaceMethod(5)
  public fun put_Description(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactEmail>
      {
    public override fun getValue() = ABI.makeIContactEmail(pointer.getPointer(0))

    public fun setValue(value: IContactEmail_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactEmail {
    public val __1326338488_Ptr: Pointer?

    public val _1326338488_VtblPtr: Pointer?
      get() = __1326338488_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Address(): String? {
      val fnPtr = _1326338488_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1326338488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Address(value: String?): Unit {
      val fnPtr = _1326338488_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1326338488_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Kind(): ContactEmailKind? {
      val fnPtr = _1326338488_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactEmailKind>()
      val hr = fn.invokeHR(arrayOf(__1326338488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactEmailKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Kind(value: ContactEmailKind?): Unit {
      val fnPtr = _1326338488_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1326338488_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Description(): String? {
      val fnPtr = _1326338488_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1326338488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1326338488_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1326338488_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactEmail_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1326338488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactEmail, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90a219a9e3d34d63993b05b9a5393abf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactEmail(ptr: Pointer?): WithDefault = IContactEmail_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactEmail {
      val address = segment.toRawLongValue()
      return makeIContactEmail(Pointer(address))
    }

    public override fun toNative(obj: IContactEmail): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1326338488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactEmail): Array<IContactEmail?> = (elements as
        Array<IContactEmail?>).castToImpl<IContactEmail,IContactEmail_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactEmail?> =
        arrayOfNulls<IContactEmail_Impl>(size) as Array<IContactEmail?>
  }
}
