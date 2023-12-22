package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactField.ABI.IID
import Windows.Foundation.Uri
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

@ABIMarker(IContactInstantMessageField.ABI::class)
@Signature("{cce33b37-0d85-41fa-b43d-da599c3eb009}")
@Guid("cce33b370d8541fab43dda599c3eb009")
@WinRTInterface("cce33b370d8541fab43dda599c3eb009")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactInstantMessageField.ByReference::class)
public interface IContactInstantMessageField : NativeMapped, IWinRTInterface, IContactField {
  @InterfaceMethod(0)
  public fun get_UserName(): String?

  @InterfaceMethod(1)
  public fun get_Service(): String?

  @InterfaceMethod(2)
  public fun get_DisplayText(): String?

  @InterfaceMethod(3)
  public fun get_LaunchUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactInstantMessageField> {
    public override fun getValue() = ABI.makeIContactInstantMessageField(pointer.getPointer(0))

    public fun setValue(value: IContactInstantMessageField_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactInstantMessageField, IContactField.WithDefault {
    public val __2005701472_Ptr: Pointer?

    public val _2005701472_VtblPtr: Pointer?
      get() = __2005701472_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserName(): String? {
      val fnPtr = _2005701472_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2005701472_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Service(): String? {
      val fnPtr = _2005701472_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2005701472_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisplayText(): String? {
      val fnPtr = _2005701472_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2005701472_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LaunchUri(): Uri? {
      val fnPtr = _2005701472_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2005701472_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IContactInstantMessageField_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactField {
    public override val __1325530202_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2005701472_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2005701472_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactInstantMessageField, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cce33b370d8541fab43dda599c3eb009")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactInstantMessageField(ptr: Pointer?): WithDefault =
        IContactInstantMessageField_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactInstantMessageField {
      val address = segment.toRawLongValue()
      return makeIContactInstantMessageField(Pointer(address))
    }

    public override fun toNative(obj: IContactInstantMessageField): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2005701472_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactInstantMessageField):
        Array<IContactInstantMessageField?> = (elements as
        Array<IContactInstantMessageField?>).castToImpl<IContactInstantMessageField,IContactInstantMessageField_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactInstantMessageField?> =
        arrayOfNulls<IContactInstantMessageField_Impl>(size) as Array<IContactInstantMessageField?>
  }
}
