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

@ABIMarker(IContactVideoCallActivatedEventArgs.ABI::class)
@Signature("{61079db8-e3e7-4b4f-858d-5c63a96ef684}")
@Guid("61079db8e3e74b4f858d5c63a96ef684")
@WinRTInterface("61079db8e3e74b4f858d5c63a96ef684")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactVideoCallActivatedEventArgs.ByReference::class)
public interface IContactVideoCallActivatedEventArgs : NativeMapped, IWinRTInterface,
    IContactActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ServiceId(): String?

  @InterfaceMethod(1)
  public fun get_ServiceUserId(): String?

  @InterfaceMethod(2)
  public fun get_Contact(): Contact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactVideoCallActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIContactVideoCallActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactVideoCallActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactVideoCallActivatedEventArgs,
      IContactActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __1426124200_Ptr: Pointer?

    public val _1426124200_VtblPtr: Pointer?
      get() = __1426124200_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServiceId(): String? {
      val fnPtr = _1426124200_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1426124200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServiceUserId(): String? {
      val fnPtr = _1426124200_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1426124200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Contact(): Contact? {
      val fnPtr = _1426124200_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Contact>()
      val hr = fn.invokeHR(arrayOf(__1426124200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Contact>(result.getValue())
      return resultValue
    }
  }

  public class IContactVideoCallActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactActivatedEventArgs,
      IActivatedEventArgs {
    public override val __90994973_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1426124200_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1426124200_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1426124200_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactVideoCallActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61079db8e3e74b4f858d5c63a96ef684")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactVideoCallActivatedEventArgs(ptr: Pointer?): WithDefault =
        IContactVideoCallActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactVideoCallActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactVideoCallActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactVideoCallActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1426124200_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactVideoCallActivatedEventArgs):
        Array<IContactVideoCallActivatedEventArgs?> = (elements as
        Array<IContactVideoCallActivatedEventArgs?>).castToImpl<IContactVideoCallActivatedEventArgs,IContactVideoCallActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactVideoCallActivatedEventArgs?> =
        arrayOfNulls<IContactVideoCallActivatedEventArgs_Impl>(size) as
        Array<IContactVideoCallActivatedEventArgs?>
  }
}
