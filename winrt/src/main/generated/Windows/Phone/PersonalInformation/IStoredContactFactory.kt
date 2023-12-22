package Windows.Phone.PersonalInformation

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

@ABIMarker(IStoredContactFactory.ABI::class)
@Signature("{49ede921-c225-4fd9-89c5-cecc2c8a4b79}")
@Guid("49ede921c2254fd989c5cecc2c8a4b79")
@WinRTInterface("49ede921c2254fd989c5cecc2c8a4b79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoredContactFactory.ByReference::class)
public interface IStoredContactFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateStoredContact(store: ContactStore?): StoredContact?

  @InterfaceMethod(1)
  public fun CreateStoredContactFromInformation(store: ContactStore?, contact: ContactInformation?):
      StoredContact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoredContactFactory> {
    public override fun getValue() = ABI.makeIStoredContactFactory(pointer.getPointer(0))

    public fun setValue(value: IStoredContactFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoredContactFactory {
    public val __708531605_Ptr: Pointer?

    public val _708531605_VtblPtr: Pointer?
      get() = __708531605_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateStoredContact(store: ContactStore?): StoredContact? {
      val fnPtr = _708531605_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoredContact>()
      val hr = fn.invokeHR(arrayOf(__708531605_Ptr, marshalToNative(store), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoredContact>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateStoredContactFromInformation(store: ContactStore?,
        contact: ContactInformation?): StoredContact? {
      val fnPtr = _708531605_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoredContact>()
      val hr = fn.invokeHR(arrayOf(__708531605_Ptr, marshalToNative(store),
          marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoredContact>(result.getValue())
      return resultValue
    }
  }

  public class IStoredContactFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __708531605_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoredContactFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49ede921c2254fd989c5cecc2c8a4b79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoredContactFactory(ptr: Pointer?): WithDefault =
        IStoredContactFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoredContactFactory {
      val address = segment.toRawLongValue()
      return makeIStoredContactFactory(Pointer(address))
    }

    public override fun toNative(obj: IStoredContactFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__708531605_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoredContactFactory): Array<IStoredContactFactory?> =
        (elements as
        Array<IStoredContactFactory?>).castToImpl<IStoredContactFactory,IStoredContactFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoredContactFactory?> =
        arrayOfNulls<IStoredContactFactory_Impl>(size) as Array<IStoredContactFactory?>
  }
}
