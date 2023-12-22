package Windows.Phone.PersonalInformation

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IContactInformationStatics.ABI::class)
@Signature("{0f67bb29-03d0-4be6-b2a5-fb13859f1202}")
@Guid("0f67bb2903d04be6b2a5fb13859f1202")
@WinRTInterface("0f67bb2903d04be6b2a5fb13859f1202")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactInformationStatics.ByReference::class)
public interface IContactInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ParseVcardAsync(vcard: IInputStream?): IAsyncOperation<ContactInformation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactInformationStatics> {
    public override fun getValue() = ABI.makeIContactInformationStatics(pointer.getPointer(0))

    public fun setValue(value: IContactInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactInformationStatics {
    public val __547700751_Ptr: Pointer?

    public val _547700751_VtblPtr: Pointer?
      get() = __547700751_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ParseVcardAsync(vcard: IInputStream?):
        IAsyncOperation<ContactInformation?>? {
      val fnPtr = _547700751_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactInformation?>>()
      val hr = fn.invokeHR(arrayOf(__547700751_Ptr, marshalToNative(vcard), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactInformation?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __547700751_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f67bb2903d04be6b2a5fb13859f1202")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactInformationStatics(ptr: Pointer?): WithDefault =
        IContactInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactInformationStatics {
      val address = segment.toRawLongValue()
      return makeIContactInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: IContactInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__547700751_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactInformationStatics):
        Array<IContactInformationStatics?> = (elements as
        Array<IContactInformationStatics?>).castToImpl<IContactInformationStatics,IContactInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactInformationStatics?> =
        arrayOfNulls<IContactInformationStatics_Impl>(size) as Array<IContactInformationStatics?>
  }
}
