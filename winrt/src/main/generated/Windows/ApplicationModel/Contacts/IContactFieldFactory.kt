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

@ABIMarker(IContactFieldFactory.ABI::class)
@Signature("{85e2913f-0e4a-4a3e-8994-406ae7ed646e}")
@Guid("85e2913f0e4a4a3e8994406ae7ed646e")
@WinRTInterface("85e2913f0e4a4a3e8994406ae7ed646e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactFieldFactory.ByReference::class)
public interface IContactFieldFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateField(value: String?, type: ContactFieldType?): ContactField?

  @InterfaceMethod(1)
  public fun CreateField(
    value: String?,
    type: ContactFieldType?,
    category: ContactFieldCategory?
  ): ContactField?

  @InterfaceMethod(2)
  public fun CreateField(
    name: String?,
    value: String?,
    type: ContactFieldType?,
    category: ContactFieldCategory?
  ): ContactField?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactFieldFactory> {
    public override fun getValue() = ABI.makeIContactFieldFactory(pointer.getPointer(0))

    public fun setValue(value: IContactFieldFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactFieldFactory {
    public val __152076668_Ptr: Pointer?

    public val _152076668_VtblPtr: Pointer?
      get() = __152076668_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateField(value: String?, type: ContactFieldType?): ContactField? {
      val fnPtr = _152076668_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactField>()
      val hr = fn.invokeHR(arrayOf(__152076668_Ptr, marshalToNative(value), marshalToNative(type),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactField>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateField(
      value: String?,
      type: ContactFieldType?,
      category: ContactFieldCategory?
    ): ContactField? {
      val fnPtr = _152076668_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactField>()
      val hr = fn.invokeHR(arrayOf(__152076668_Ptr, marshalToNative(value), marshalToNative(type),
          marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactField>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateField(
      name: String?,
      value: String?,
      type: ContactFieldType?,
      category: ContactFieldCategory?
    ): ContactField? {
      val fnPtr = _152076668_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactField>()
      val hr = fn.invokeHR(arrayOf(__152076668_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(type), marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactField>(result.getValue())
      return resultValue
    }
  }

  public class IContactFieldFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __152076668_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactFieldFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85e2913f0e4a4a3e8994406ae7ed646e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactFieldFactory(ptr: Pointer?): WithDefault = IContactFieldFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactFieldFactory {
      val address = segment.toRawLongValue()
      return makeIContactFieldFactory(Pointer(address))
    }

    public override fun toNative(obj: IContactFieldFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__152076668_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactFieldFactory): Array<IContactFieldFactory?> =
        (elements as
        Array<IContactFieldFactory?>).castToImpl<IContactFieldFactory,IContactFieldFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactFieldFactory?> =
        arrayOfNulls<IContactFieldFactory_Impl>(size) as Array<IContactFieldFactory?>
  }
}
