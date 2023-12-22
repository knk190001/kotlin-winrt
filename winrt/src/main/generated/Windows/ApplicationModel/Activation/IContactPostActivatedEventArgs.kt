package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IContactActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Contacts.Contact
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IContactPostActivatedEventArgs.ABI::class)
@Signature("{b35a3c67-f1e7-4655-ad6e-4857588f552f}")
@Guid("b35a3c67f1e74655ad6e4857588f552f")
@WinRTInterface("b35a3c67f1e74655ad6e4857588f552f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPostActivatedEventArgs.ByReference::class)
public interface IContactPostActivatedEventArgs : NativeMapped, IWinRTInterface,
    IContactActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ServiceId(): String?

  @InterfaceMethod(1)
  public fun get_ServiceUserId(): String?

  @InterfaceMethod(2)
  public fun get_Contact(): Contact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPostActivatedEventArgs> {
    public override fun getValue() = ABI.makeIContactPostActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactPostActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPostActivatedEventArgs,
      IContactActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __611884451_Ptr: Pointer?

    public val _611884451_VtblPtr: Pointer?
      get() = __611884451_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServiceId(): String? {
      val fnPtr = _611884451_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__611884451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServiceUserId(): String? {
      val fnPtr = _611884451_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__611884451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Contact(): Contact? {
      val fnPtr = _611884451_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Contact>()
      val hr = fn.invokeHR(arrayOf(__611884451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Contact>(result.getValue())
      return resultValue
    }
  }

  public class IContactPostActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactActivatedEventArgs,
      IActivatedEventArgs {
    public override val __90994973_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_611884451_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_611884451_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __611884451_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPostActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b35a3c67f1e74655ad6e4857588f552f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPostActivatedEventArgs(ptr: Pointer?): WithDefault =
        IContactPostActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPostActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactPostActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactPostActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__611884451_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPostActivatedEventArgs):
        Array<IContactPostActivatedEventArgs?> = (elements as
        Array<IContactPostActivatedEventArgs?>).castToImpl<IContactPostActivatedEventArgs,IContactPostActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPostActivatedEventArgs?> =
        arrayOfNulls<IContactPostActivatedEventArgs_Impl>(size) as
        Array<IContactPostActivatedEventArgs?>
  }
}
