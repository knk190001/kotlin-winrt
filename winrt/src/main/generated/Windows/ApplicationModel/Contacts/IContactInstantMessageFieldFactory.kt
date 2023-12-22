package Windows.ApplicationModel.Contacts

import Windows.Foundation.Uri
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

@ABIMarker(IContactInstantMessageFieldFactory.ABI::class)
@Signature("{ba0b6794-91a3-4bb2-b1b9-69a5dff0ba09}")
@Guid("ba0b679491a34bb2b1b969a5dff0ba09")
@WinRTInterface("ba0b679491a34bb2b1b969a5dff0ba09")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactInstantMessageFieldFactory.ByReference::class)
public interface IContactInstantMessageFieldFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstantMessage(userName: String?): ContactInstantMessageField?

  @InterfaceMethod(1)
  public fun CreateInstantMessage(userName: String?, category: ContactFieldCategory?):
      ContactInstantMessageField?

  @InterfaceMethod(2)
  public fun CreateInstantMessage(
    userName: String?,
    category: ContactFieldCategory?,
    service: String?,
    displayText: String?,
    verb: Uri?
  ): ContactInstantMessageField?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactInstantMessageFieldFactory> {
    public override fun getValue() =
        ABI.makeIContactInstantMessageFieldFactory(pointer.getPointer(0))

    public fun setValue(value: IContactInstantMessageFieldFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactInstantMessageFieldFactory {
    public val __1773360758_Ptr: Pointer?

    public val _1773360758_VtblPtr: Pointer?
      get() = __1773360758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstantMessage(userName: String?): ContactInstantMessageField? {
      val fnPtr = _1773360758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactInstantMessageField>()
      val hr = fn.invokeHR(arrayOf(__1773360758_Ptr, marshalToNative(userName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactInstantMessageField>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstantMessage(userName: String?, category: ContactFieldCategory?):
        ContactInstantMessageField? {
      val fnPtr = _1773360758_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactInstantMessageField>()
      val hr = fn.invokeHR(arrayOf(__1773360758_Ptr, marshalToNative(userName),
          marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactInstantMessageField>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateInstantMessage(
      userName: String?,
      category: ContactFieldCategory?,
      service: String?,
      displayText: String?,
      verb: Uri?
    ): ContactInstantMessageField? {
      val fnPtr = _1773360758_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactInstantMessageField>()
      val hr = fn.invokeHR(arrayOf(__1773360758_Ptr, marshalToNative(userName),
          marshalToNative(category), marshalToNative(service), marshalToNative(displayText),
          marshalToNative(verb), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactInstantMessageField>(result.getValue())
      return resultValue
    }
  }

  public class IContactInstantMessageFieldFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1773360758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactInstantMessageFieldFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba0b679491a34bb2b1b969a5dff0ba09")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactInstantMessageFieldFactory(ptr: Pointer?): WithDefault =
        IContactInstantMessageFieldFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactInstantMessageFieldFactory {
      val address = segment.toRawLongValue()
      return makeIContactInstantMessageFieldFactory(Pointer(address))
    }

    public override fun toNative(obj: IContactInstantMessageFieldFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1773360758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactInstantMessageFieldFactory):
        Array<IContactInstantMessageFieldFactory?> = (elements as
        Array<IContactInstantMessageFieldFactory?>).castToImpl<IContactInstantMessageFieldFactory,IContactInstantMessageFieldFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactInstantMessageFieldFactory?> =
        arrayOfNulls<IContactInstantMessageFieldFactory_Impl>(size) as
        Array<IContactInstantMessageFieldFactory?>
  }
}
