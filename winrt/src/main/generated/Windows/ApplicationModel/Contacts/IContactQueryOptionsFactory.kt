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

@ABIMarker(IContactQueryOptionsFactory.ABI::class)
@Signature("{543fba47-8ce7-46cb-9dac-9aa42a1bc8e2}")
@Guid("543fba478ce746cb9dac9aa42a1bc8e2")
@WinRTInterface("543fba478ce746cb9dac9aa42a1bc8e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactQueryOptionsFactory.ByReference::class)
public interface IContactQueryOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithText(text: String?): ContactQueryOptions?

  @InterfaceMethod(1)
  public fun CreateWithTextAndFields(text: String?, fields: ContactQuerySearchFields?):
      ContactQueryOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactQueryOptionsFactory> {
    public override fun getValue() = ABI.makeIContactQueryOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IContactQueryOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactQueryOptionsFactory {
    public val __1322098400_Ptr: Pointer?

    public val _1322098400_VtblPtr: Pointer?
      get() = __1322098400_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithText(text: String?): ContactQueryOptions? {
      val fnPtr = _1322098400_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryOptions>()
      val hr = fn.invokeHR(arrayOf(__1322098400_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithTextAndFields(text: String?, fields: ContactQuerySearchFields?):
        ContactQueryOptions? {
      val fnPtr = _1322098400_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryOptions>()
      val hr = fn.invokeHR(arrayOf(__1322098400_Ptr, marshalToNative(text), marshalToNative(fields),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryOptions>(result.getValue())
      return resultValue
    }
  }

  public class IContactQueryOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1322098400_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactQueryOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("543fba478ce746cb9dac9aa42a1bc8e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactQueryOptionsFactory(ptr: Pointer?): WithDefault =
        IContactQueryOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactQueryOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIContactQueryOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IContactQueryOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1322098400_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactQueryOptionsFactory):
        Array<IContactQueryOptionsFactory?> = (elements as
        Array<IContactQueryOptionsFactory?>).castToImpl<IContactQueryOptionsFactory,IContactQueryOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactQueryOptionsFactory?> =
        arrayOfNulls<IContactQueryOptionsFactory_Impl>(size) as Array<IContactQueryOptionsFactory?>
  }
}
