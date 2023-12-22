package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactField.ABI.IID
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

@ABIMarker(IContactLocationField.ABI::class)
@Signature("{9ec00f82-ab6e-4b36-89e3-b23bc0a1dacc}")
@Guid("9ec00f82ab6e4b3689e3b23bc0a1dacc")
@WinRTInterface("9ec00f82ab6e4b3689e3b23bc0a1dacc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactLocationField.ByReference::class)
public interface IContactLocationField : NativeMapped, IWinRTInterface, IContactField {
  @InterfaceMethod(0)
  public fun get_UnstructuredAddress(): String?

  @InterfaceMethod(1)
  public fun get_Street(): String?

  @InterfaceMethod(2)
  public fun get_City(): String?

  @InterfaceMethod(3)
  public fun get_Region(): String?

  @InterfaceMethod(4)
  public fun get_Country(): String?

  @InterfaceMethod(5)
  public fun get_PostalCode(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactLocationField> {
    public override fun getValue() = ABI.makeIContactLocationField(pointer.getPointer(0))

    public fun setValue(value: IContactLocationField_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactLocationField, IContactField.WithDefault {
    public val __1881968881_Ptr: Pointer?

    public val _1881968881_VtblPtr: Pointer?
      get() = __1881968881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnstructuredAddress(): String? {
      val fnPtr = _1881968881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881968881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Street(): String? {
      val fnPtr = _1881968881_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881968881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_City(): String? {
      val fnPtr = _1881968881_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881968881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Region(): String? {
      val fnPtr = _1881968881_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881968881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Country(): String? {
      val fnPtr = _1881968881_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881968881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PostalCode(): String? {
      val fnPtr = _1881968881_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881968881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContactLocationField_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactField {
    public override val __1325530202_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1881968881_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1881968881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactLocationField, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ec00f82ab6e4b3689e3b23bc0a1dacc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactLocationField(ptr: Pointer?): WithDefault =
        IContactLocationField_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactLocationField {
      val address = segment.toRawLongValue()
      return makeIContactLocationField(Pointer(address))
    }

    public override fun toNative(obj: IContactLocationField): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1881968881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactLocationField): Array<IContactLocationField?> =
        (elements as
        Array<IContactLocationField?>).castToImpl<IContactLocationField,IContactLocationField_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactLocationField?> =
        arrayOfNulls<IContactLocationField_Impl>(size) as Array<IContactLocationField?>
  }
}
