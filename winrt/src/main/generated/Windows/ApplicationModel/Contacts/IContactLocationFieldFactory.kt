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

@ABIMarker(IContactLocationFieldFactory.ABI::class)
@Signature("{f79932d7-2fdf-43fe-8f18-41897390bcfe}")
@Guid("f79932d72fdf43fe8f1841897390bcfe")
@WinRTInterface("f79932d72fdf43fe8f1841897390bcfe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactLocationFieldFactory.ByReference::class)
public interface IContactLocationFieldFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateLocation(unstructuredAddress: String?): ContactLocationField?

  @InterfaceMethod(1)
  public fun CreateLocation(unstructuredAddress: String?, category: ContactFieldCategory?):
      ContactLocationField?

  @InterfaceMethod(2)
  public fun CreateLocation(
    unstructuredAddress: String?,
    category: ContactFieldCategory?,
    street: String?,
    city: String?,
    region: String?,
    country: String?,
    postalCode: String?
  ): ContactLocationField?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactLocationFieldFactory> {
    public override fun getValue() = ABI.makeIContactLocationFieldFactory(pointer.getPointer(0))

    public fun setValue(value: IContactLocationFieldFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactLocationFieldFactory {
    public val __592415015_Ptr: Pointer?

    public val _592415015_VtblPtr: Pointer?
      get() = __592415015_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateLocation(unstructuredAddress: String?): ContactLocationField? {
      val fnPtr = _592415015_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactLocationField>()
      val hr = fn.invokeHR(arrayOf(__592415015_Ptr, marshalToNative(unstructuredAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactLocationField>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateLocation(unstructuredAddress: String?,
        category: ContactFieldCategory?): ContactLocationField? {
      val fnPtr = _592415015_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactLocationField>()
      val hr = fn.invokeHR(arrayOf(__592415015_Ptr, marshalToNative(unstructuredAddress),
          marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactLocationField>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateLocation(
      unstructuredAddress: String?,
      category: ContactFieldCategory?,
      street: String?,
      city: String?,
      region: String?,
      country: String?,
      postalCode: String?
    ): ContactLocationField? {
      val fnPtr = _592415015_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactLocationField>()
      val hr = fn.invokeHR(arrayOf(__592415015_Ptr, marshalToNative(unstructuredAddress),
          marshalToNative(category), marshalToNative(street), marshalToNative(city),
          marshalToNative(region), marshalToNative(country), marshalToNative(postalCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactLocationField>(result.getValue())
      return resultValue
    }
  }

  public class IContactLocationFieldFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __592415015_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactLocationFieldFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f79932d72fdf43fe8f1841897390bcfe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactLocationFieldFactory(ptr: Pointer?): WithDefault =
        IContactLocationFieldFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactLocationFieldFactory {
      val address = segment.toRawLongValue()
      return makeIContactLocationFieldFactory(Pointer(address))
    }

    public override fun toNative(obj: IContactLocationFieldFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__592415015_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactLocationFieldFactory):
        Array<IContactLocationFieldFactory?> = (elements as
        Array<IContactLocationFieldFactory?>).castToImpl<IContactLocationFieldFactory,IContactLocationFieldFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactLocationFieldFactory?> =
        arrayOfNulls<IContactLocationFieldFactory_Impl>(size) as
        Array<IContactLocationFieldFactory?>
  }
}
