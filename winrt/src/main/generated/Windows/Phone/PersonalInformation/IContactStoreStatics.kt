package Windows.Phone.PersonalInformation

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IContactStoreStatics.ABI::class)
@Signature("{a804fe22-4beb-44cc-a572-67a5b92e8567}")
@Guid("a804fe224beb44cca57267a5b92e8567")
@WinRTInterface("a804fe224beb44cca57267a5b92e8567")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactStoreStatics.ByReference::class)
public interface IContactStoreStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateOrOpenAsync(): IAsyncOperation<ContactStore?>?

  @InterfaceMethod(1)
  public fun CreateOrOpenAsync(access: ContactStoreSystemAccessMode?,
      sharing: ContactStoreApplicationAccessMode?): IAsyncOperation<ContactStore?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactStoreStatics> {
    public override fun getValue() = ABI.makeIContactStoreStatics(pointer.getPointer(0))

    public fun setValue(value: IContactStoreStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactStoreStatics {
    public val __1860161380_Ptr: Pointer?

    public val _1860161380_VtblPtr: Pointer?
      get() = __1860161380_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateOrOpenAsync(): IAsyncOperation<ContactStore?>? {
      val fnPtr = _1860161380_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactStore?>>()
      val hr = fn.invokeHR(arrayOf(__1860161380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateOrOpenAsync(access: ContactStoreSystemAccessMode?,
        sharing: ContactStoreApplicationAccessMode?): IAsyncOperation<ContactStore?>? {
      val fnPtr = _1860161380_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactStore?>>()
      val hr = fn.invokeHR(arrayOf(__1860161380_Ptr, marshalToNative(access),
          marshalToNative(sharing), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactStore?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactStoreStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1860161380_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactStoreStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a804fe224beb44cca57267a5b92e8567")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactStoreStatics(ptr: Pointer?): WithDefault = IContactStoreStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactStoreStatics {
      val address = segment.toRawLongValue()
      return makeIContactStoreStatics(Pointer(address))
    }

    public override fun toNative(obj: IContactStoreStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1860161380_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactStoreStatics): Array<IContactStoreStatics?> =
        (elements as
        Array<IContactStoreStatics?>).castToImpl<IContactStoreStatics,IContactStoreStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactStoreStatics?> =
        arrayOfNulls<IContactStoreStatics_Impl>(size) as Array<IContactStoreStatics?>
  }
}
