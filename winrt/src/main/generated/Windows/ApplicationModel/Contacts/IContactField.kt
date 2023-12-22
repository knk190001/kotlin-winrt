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

@ABIMarker(IContactField.ABI::class)
@Signature("{b176486a-d293-492c-a058-db575b3e3c0f}")
@Guid("b176486ad293492ca058db575b3e3c0f")
@WinRTInterface("b176486ad293492ca058db575b3e3c0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactField.ByReference::class)
public interface IContactField : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): ContactFieldType?

  @InterfaceMethod(1)
  public fun get_Category(): ContactFieldCategory?

  @InterfaceMethod(2)
  public fun get_Name(): String?

  @InterfaceMethod(3)
  public fun get_Value(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactField>
      {
    public override fun getValue() = ABI.makeIContactField(pointer.getPointer(0))

    public fun setValue(value: IContactField_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactField {
    public val __1325530202_Ptr: Pointer?

    public val _1325530202_VtblPtr: Pointer?
      get() = __1325530202_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): ContactFieldType? {
      val fnPtr = _1325530202_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactFieldType>()
      val hr = fn.invokeHR(arrayOf(__1325530202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactFieldType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Category(): ContactFieldCategory? {
      val fnPtr = _1325530202_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactFieldCategory>()
      val hr = fn.invokeHR(arrayOf(__1325530202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactFieldCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Name(): String? {
      val fnPtr = _1325530202_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1325530202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Value(): String? {
      val fnPtr = _1325530202_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1325530202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContactField_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1325530202_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactField, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b176486ad293492ca058db575b3e3c0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactField(ptr: Pointer?): WithDefault = IContactField_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactField {
      val address = segment.toRawLongValue()
      return makeIContactField(Pointer(address))
    }

    public override fun toNative(obj: IContactField): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1325530202_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactField): Array<IContactField?> = (elements as
        Array<IContactField?>).castToImpl<IContactField,IContactField_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactField?> =
        arrayOfNulls<IContactField_Impl>(size) as Array<IContactField?>
  }
}
