package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IContactActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Contacts.Contact
import Windows.ApplicationModel.Contacts.ContactAddress
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactMapActivatedEventArgs.ABI::class)
@Signature("{b32bf870-eee7-4ad2-aaf1-a87effcf00a4}")
@Guid("b32bf870eee74ad2aaf1a87effcf00a4")
@WinRTInterface("b32bf870eee74ad2aaf1a87effcf00a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactMapActivatedEventArgs.ByReference::class)
public interface IContactMapActivatedEventArgs : NativeMapped, IWinRTInterface,
    IContactActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Address(): ContactAddress?

  @InterfaceMethod(1)
  public fun get_Contact(): Contact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactMapActivatedEventArgs> {
    public override fun getValue() = ABI.makeIContactMapActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactMapActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactMapActivatedEventArgs,
      IContactActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __716213643_Ptr: Pointer?

    public val _716213643_VtblPtr: Pointer?
      get() = __716213643_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Address(): ContactAddress? {
      val fnPtr = _716213643_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactAddress>()
      val hr = fn.invokeHR(arrayOf(__716213643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Contact(): Contact? {
      val fnPtr = _716213643_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Contact>()
      val hr = fn.invokeHR(arrayOf(__716213643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Contact>(result.getValue())
      return resultValue
    }
  }

  public class IContactMapActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactActivatedEventArgs,
      IActivatedEventArgs {
    public override val __90994973_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_716213643_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_716213643_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __716213643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactMapActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b32bf870eee74ad2aaf1a87effcf00a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactMapActivatedEventArgs(ptr: Pointer?): WithDefault =
        IContactMapActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactMapActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactMapActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactMapActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__716213643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactMapActivatedEventArgs):
        Array<IContactMapActivatedEventArgs?> = (elements as
        Array<IContactMapActivatedEventArgs?>).castToImpl<IContactMapActivatedEventArgs,IContactMapActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactMapActivatedEventArgs?> =
        arrayOfNulls<IContactMapActivatedEventArgs_Impl>(size) as
        Array<IContactMapActivatedEventArgs?>
  }
}
